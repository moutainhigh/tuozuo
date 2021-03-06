package com.tuozuo.tavern.xinruyi.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tuozuo.tavern.xinruyi.model.ProjectPayment;
import com.tuozuo.tavern.xinruyi.model.ProjectPaymentDetail;
import com.tuozuo.tavern.xinruyi.model.StaffSalaryInfo;
import com.tuozuo.tavern.xinruyi.vo.*;

import java.util.List;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2020/9/19 <br>
 */
public interface PaymentInfoService {

    IPage<ProjectPayment> queryProjectPaymentList(PaymentListVO vo);

    void uploadVoucher(PaymentVoucherUploadVO voucherUploadVO, String roleGroup, String companyId) throws Exception;
    IPage<ProjectPayment> queryProjectPaymentHisList(PaymentHistoryVO vo);

    IPage<StaffSalaryInfo> queryStaffDetail(StaffSalaryDetailVO vo);

    IPage<StaffSalaryInfo> queryStaffInfo(StaffSalaryInfoVO vo);

    void modifyStaffPayment(StaffPaymentInfoVO vo);

    void staffPaymentConfirm(StaffPaymentConfirmVO vo) throws Exception;

    void staffPaymentAudit(StaffPaymentAuditVO vo) throws Exception;

    void modifyUploadVoucher(PaymentVoucherUploadVO voucherUploadVO) throws Exception;

    List<ProjectPaymentDetail> queryProjectPaymentRecord(String registerId, String projectId, String paymentId, String payDate);


}
