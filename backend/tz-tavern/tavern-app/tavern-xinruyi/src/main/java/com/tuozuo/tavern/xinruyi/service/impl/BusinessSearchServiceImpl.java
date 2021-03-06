package com.tuozuo.tavern.xinruyi.service.impl;

import com.tuozuo.tavern.xinruyi.dao.BusinessSearchDao;
import com.tuozuo.tavern.xinruyi.model.AreaInfo;
import com.tuozuo.tavern.xinruyi.model.BankInfo;
import com.tuozuo.tavern.xinruyi.service.BusinessSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2020/8/29 <br>
 */
@Service
public class BusinessSearchServiceImpl implements BusinessSearchService {

    @Autowired
    private BusinessSearchDao businessSearchDao;

    @Override
    public List<AreaInfo> queryAreaInfo(String areaCode, String areaLevel) {
        return this.businessSearchDao.selectAreaInfo(areaCode, areaLevel);
    }

    @Override
    public List<BankInfo> queryBankInfo(String bankCode,String bankName,int queryCnt) {
        return this.businessSearchDao.selectBankInfo(bankCode,bankName,queryCnt);
    }
}
