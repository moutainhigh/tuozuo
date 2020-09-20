package com.tuozuo.tavern.xinruyi.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tuozuo.tavern.xinruyi.model.ProjectPayment;
import com.tuozuo.tavern.xinruyi.model.StaffSalaryInfo;
import com.tuozuo.tavern.xinruyi.vo.PaymentHistoryVO;
import com.tuozuo.tavern.xinruyi.vo.PaymentListVO;
import com.tuozuo.tavern.xinruyi.vo.PaymentVoucherUploadVO;
import com.tuozuo.tavern.xinruyi.vo.StaffSalaryDetailVO;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2020/9/19 <br>
 */
public interface PaymentInfoService {

    IPage<ProjectPayment> queryProjectPaymentList(PaymentListVO vo);

    void uploadVoucher(PaymentVoucherUploadVO voucherUploadVO, String roleGroup, String companyId) throws Exception;

    IPage<ProjectPayment> queryProjectPaymentHisList(PaymentHistoryVO vo);

    IPage<StaffSalaryInfo> queryStaffDetail(StaffSalaryDetailVO vo);


}