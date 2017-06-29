package com.bean;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.owner_usr
     *
     * @mbg.generated
     */
    private Integer ownerUsr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.creater
     *
     * @mbg.generated
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.updater
     *
     * @mbg.generated
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.updateTime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.order_date
     *
     * @mbg.generated
     */
    private Date orderDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_id
     *
     * @mbg.generated
     */
    private Integer cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_name
     *
     * @mbg.generated
     */
    private String cName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_type
     *
     * @mbg.generated
     */
    private String cType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.linkman
     *
     * @mbg.generated
     */
    private String linkman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.seller
     *
     * @mbg.generated
     */
    private String seller;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.total
     *
     * @mbg.generated
     */
    private Double total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.agio
     *
     * @mbg.generated
     */
    private Double agio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.agio_total
     *
     * @mbg.generated
     */
    private Double agioTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.auditor
     *
     * @mbg.generated
     */
    private String auditor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.audit_date
     *
     * @mbg.generated
     */
    private Date auditDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.status_id
     *
     * @mbg.generated
     */
    private String statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom1
     *
     * @mbg.generated
     */
    private String custom1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom2
     *
     * @mbg.generated
     */
    private String custom2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom3
     *
     * @mbg.generated
     */
    private String custom3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom4
     *
     * @mbg.generated
     */
    private String custom4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice1
     *
     * @mbg.generated
     */
    private String choice1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice2
     *
     * @mbg.generated
     */
    private String choice2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice3
     *
     * @mbg.generated
     */
    private String choice3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice4
     *
     * @mbg.generated
     */
    private String choice4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.time1
     *
     * @mbg.generated
     */
    private Date time1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.time2
     *
     * @mbg.generated
     */
    private Date time2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.share_flag
     *
     * @mbg.generated
     */
    private String shareFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.id
     *
     * @return the value of b_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.id
     *
     * @param id the value for b_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.owner_usr
     *
     * @return the value of b_order.owner_usr
     *
     * @mbg.generated
     */
    public Integer getOwnerUsr() {
        return ownerUsr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.owner_usr
     *
     * @param ownerUsr the value for b_order.owner_usr
     *
     * @mbg.generated
     */
    public void setOwnerUsr(Integer ownerUsr) {
        this.ownerUsr = ownerUsr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.creater
     *
     * @return the value of b_order.creater
     *
     * @mbg.generated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.creater
     *
     * @param creater the value for b_order.creater
     *
     * @mbg.generated
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.createTime
     *
     * @return the value of b_order.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.createTime
     *
     * @param createtime the value for b_order.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.updater
     *
     * @return the value of b_order.updater
     *
     * @mbg.generated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.updater
     *
     * @param updater the value for b_order.updater
     *
     * @mbg.generated
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.updateTime
     *
     * @return the value of b_order.updateTime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.updateTime
     *
     * @param updatetime the value for b_order.updateTime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.code
     *
     * @return the value of b_order.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.code
     *
     * @param code the value for b_order.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.order_date
     *
     * @return the value of b_order.order_date
     *
     * @mbg.generated
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.order_date
     *
     * @param orderDate the value for b_order.order_date
     *
     * @mbg.generated
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.c_id
     *
     * @return the value of b_order.c_id
     *
     * @mbg.generated
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.c_id
     *
     * @param cId the value for b_order.c_id
     *
     * @mbg.generated
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.c_name
     *
     * @return the value of b_order.c_name
     *
     * @mbg.generated
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.c_name
     *
     * @param cName the value for b_order.c_name
     *
     * @mbg.generated
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.c_type
     *
     * @return the value of b_order.c_type
     *
     * @mbg.generated
     */
    public String getcType() {
        return cType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.c_type
     *
     * @param cType the value for b_order.c_type
     *
     * @mbg.generated
     */
    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.linkman
     *
     * @return the value of b_order.linkman
     *
     * @mbg.generated
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.linkman
     *
     * @param linkman the value for b_order.linkman
     *
     * @mbg.generated
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.telephone
     *
     * @return the value of b_order.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.telephone
     *
     * @param telephone the value for b_order.telephone
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.address
     *
     * @return the value of b_order.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.address
     *
     * @param address the value for b_order.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.seller
     *
     * @return the value of b_order.seller
     *
     * @mbg.generated
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.seller
     *
     * @param seller the value for b_order.seller
     *
     * @mbg.generated
     */
    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.total
     *
     * @return the value of b_order.total
     *
     * @mbg.generated
     */
    public Double getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.total
     *
     * @param total the value for b_order.total
     *
     * @mbg.generated
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.agio
     *
     * @return the value of b_order.agio
     *
     * @mbg.generated
     */
    public Double getAgio() {
        return agio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.agio
     *
     * @param agio the value for b_order.agio
     *
     * @mbg.generated
     */
    public void setAgio(Double agio) {
        this.agio = agio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.agio_total
     *
     * @return the value of b_order.agio_total
     *
     * @mbg.generated
     */
    public Double getAgioTotal() {
        return agioTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.agio_total
     *
     * @param agioTotal the value for b_order.agio_total
     *
     * @mbg.generated
     */
    public void setAgioTotal(Double agioTotal) {
        this.agioTotal = agioTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.auditor
     *
     * @return the value of b_order.auditor
     *
     * @mbg.generated
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.auditor
     *
     * @param auditor the value for b_order.auditor
     *
     * @mbg.generated
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.audit_date
     *
     * @return the value of b_order.audit_date
     *
     * @mbg.generated
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.audit_date
     *
     * @param auditDate the value for b_order.audit_date
     *
     * @mbg.generated
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.status_id
     *
     * @return the value of b_order.status_id
     *
     * @mbg.generated
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.status_id
     *
     * @param statusId the value for b_order.status_id
     *
     * @mbg.generated
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.status
     *
     * @return the value of b_order.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.status
     *
     * @param status the value for b_order.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.custom1
     *
     * @return the value of b_order.custom1
     *
     * @mbg.generated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.custom1
     *
     * @param custom1 the value for b_order.custom1
     *
     * @mbg.generated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.custom2
     *
     * @return the value of b_order.custom2
     *
     * @mbg.generated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.custom2
     *
     * @param custom2 the value for b_order.custom2
     *
     * @mbg.generated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.custom3
     *
     * @return the value of b_order.custom3
     *
     * @mbg.generated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.custom3
     *
     * @param custom3 the value for b_order.custom3
     *
     * @mbg.generated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.custom4
     *
     * @return the value of b_order.custom4
     *
     * @mbg.generated
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.custom4
     *
     * @param custom4 the value for b_order.custom4
     *
     * @mbg.generated
     */
    public void setCustom4(String custom4) {
        this.custom4 = custom4 == null ? null : custom4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.choice1
     *
     * @return the value of b_order.choice1
     *
     * @mbg.generated
     */
    public String getChoice1() {
        return choice1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.choice1
     *
     * @param choice1 the value for b_order.choice1
     *
     * @mbg.generated
     */
    public void setChoice1(String choice1) {
        this.choice1 = choice1 == null ? null : choice1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.choice2
     *
     * @return the value of b_order.choice2
     *
     * @mbg.generated
     */
    public String getChoice2() {
        return choice2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.choice2
     *
     * @param choice2 the value for b_order.choice2
     *
     * @mbg.generated
     */
    public void setChoice2(String choice2) {
        this.choice2 = choice2 == null ? null : choice2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.choice3
     *
     * @return the value of b_order.choice3
     *
     * @mbg.generated
     */
    public String getChoice3() {
        return choice3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.choice3
     *
     * @param choice3 the value for b_order.choice3
     *
     * @mbg.generated
     */
    public void setChoice3(String choice3) {
        this.choice3 = choice3 == null ? null : choice3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.choice4
     *
     * @return the value of b_order.choice4
     *
     * @mbg.generated
     */
    public String getChoice4() {
        return choice4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.choice4
     *
     * @param choice4 the value for b_order.choice4
     *
     * @mbg.generated
     */
    public void setChoice4(String choice4) {
        this.choice4 = choice4 == null ? null : choice4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.time1
     *
     * @return the value of b_order.time1
     *
     * @mbg.generated
     */
    public Date getTime1() {
        return time1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.time1
     *
     * @param time1 the value for b_order.time1
     *
     * @mbg.generated
     */
    public void setTime1(Date time1) {
        this.time1 = time1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.time2
     *
     * @return the value of b_order.time2
     *
     * @mbg.generated
     */
    public Date getTime2() {
        return time2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.time2
     *
     * @param time2 the value for b_order.time2
     *
     * @mbg.generated
     */
    public void setTime2(Date time2) {
        this.time2 = time2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_order.share_flag
     *
     * @return the value of b_order.share_flag
     *
     * @mbg.generated
     */
    public String getShareFlag() {
        return shareFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_order.share_flag
     *
     * @param shareFlag the value for b_order.share_flag
     *
     * @mbg.generated
     */
    public void setShareFlag(String shareFlag) {
        this.shareFlag = shareFlag == null ? null : shareFlag.trim();
    }
}