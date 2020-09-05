package com.tuozuo.tavern.xinruyi.service.impl;

import com.tuozuo.tavern.xinruyi.convert.ModelConverterFactory;
import com.tuozuo.tavern.xinruyi.dao.CompanyInfoDao;
import com.tuozuo.tavern.xinruyi.model.CompanyInfo;
import com.tuozuo.tavern.xinruyi.model.CompanyInfoExt;
import com.tuozuo.tavern.xinruyi.service.CompanyInfoService;
import com.tuozuo.tavern.xinruyi.utils.FileUtils;
import com.tuozuo.tavern.xinruyi.vo.CompanyAuthInfoVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2020/9/4 <br>
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyInfoServiceImpl.class);

    @Value("${xinruyi.file.url.path:http://119.3.19.171/xinruyi/file/company/file/}")
    private String fileUrlPath;
    @Value("${xinruyi.company.file.path:/mnt/file/xinruyi/company/file/}")
    private String filePath;

    @Autowired
    private CompanyInfoDao companyInfoDao;


    @Override
    public CompanyInfo queryCompanyInfo(String companyId) {
        return this.companyInfoDao.selectCompanyInfo(companyId);
    }

    @Transactional
    @Override
    public void applyForCompanyAuth(CompanyAuthInfoVO companyAuthInfoVO) throws Exception {
        //1、companyInfoExt表
        //TODO 2、发出事件
        CompanyInfoExt companyInfoExt = ModelConverterFactory.authVOToCompanyInfoExt(companyAuthInfoVO);
        this.setCompanyInfoFiles(companyAuthInfoVO.getBusinessLicense(),
                companyAuthInfoVO.getBossIdPicUp(),
                companyAuthInfoVO.getBossIdPicBack(),
                companyInfoExt);
        this.companyInfoDao.insertCompanyAuthInfo(companyInfoExt);
    }

    @Override
    public CompanyInfoExt queryCompanyDetailInfo(String companyId) {
        return this.companyInfoDao.selectCompanyDetailInfo(companyId);
    }

    @Override
    public List<CompanyInfo> queryCompanyList(String companyName, int queryCnt) {
        return this.companyInfoDao.selectCompanyList(companyName, queryCnt);
    }


    private void setCompanyInfoFiles(MultipartFile businessLicense,
                                     MultipartFile bossIdPicUp,
                                     MultipartFile bossIdPicBack,
                                     CompanyInfoExt companyInfoExt) throws Exception {
        if (businessLicense != null) {
            String businessLicenseUrl = this.storeProjectFile(companyInfoExt.getCompanyId(), businessLicense);
            LOGGER.info("businessLicenseUrl: {}", businessLicenseUrl);
            companyInfoExt.setFileBizLicense(businessLicenseUrl);
        }
        if (bossIdPicUp != null) {
            String bossIdPicUpUrl = this.storeProjectFile(companyInfoExt.getCompanyId(), bossIdPicUp);
            LOGGER.info("bossIdPicUpUrl: {}", bossIdPicUpUrl);
            companyInfoExt.setFileLegalPersonIdcardUp(bossIdPicUpUrl);
        }
        if (bossIdPicBack != null) {
            String bossIdPicBackUrl = this.storeProjectFile(companyInfoExt.getCompanyId(), bossIdPicBack);
            LOGGER.info("bossIdPicBackUrl: {}", bossIdPicBackUrl);
            companyInfoExt.setFileLegalPersonIdcardBack(bossIdPicBackUrl);
        }

    }

    //path + companyId + file
    private String storeProjectFile(String companyId, MultipartFile file) throws Exception {

        String pathLocation = StringUtils.join(filePath, companyId,
                "/");
        String fileName = FileUtils.multiPartFileWriter(file, pathLocation);
        return StringUtils.join(fileUrlPath, companyId,
                "/", fileName);

    }
}
