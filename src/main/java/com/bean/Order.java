package com.bean;

import lombok.Data;

import java.util.Date;

/**
 * @version 2017/6/29.
 * @auther CrazyBunQnQ
 */
@Data
public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.owner_usr
     *
     * @mbg.generated
     */
    private Integer ownerUsr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.creater
     *
     * @mbg.generated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.updater
     *
     * @mbg.generated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.updateTime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.order_date
     *
     * @mbg.generated
     */
    private Date orderDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_id
     *
     * @mbg.generated
     */
    private Integer cId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_name
     *
     * @mbg.generated
     */
    private String cName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.c_type
     *
     * @mbg.generated
     */
    private String cType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.linkman
     *
     * @mbg.generated
     */
    private String linkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.seller
     *
     * @mbg.generated
     */
    private String seller;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.total
     *
     * @mbg.generated
     */
    private Double total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.agio
     *
     * @mbg.generated
     */
    private Double agio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.agio_total
     *
     * @mbg.generated
     */
    private Double agioTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.auditor
     *
     * @mbg.generated
     */
    private String auditor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.audit_date
     *
     * @mbg.generated
     */
    private Date auditDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.status_id
     *
     * @mbg.generated
     */
    private String statusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom1
     *
     * @mbg.generated
     */
    private String custom1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom2
     *
     * @mbg.generated
     */
    private String custom2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom3
     *
     * @mbg.generated
     */
    private String custom3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.custom4
     *
     * @mbg.generated
     */
    private String custom4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice1
     *
     * @mbg.generated
     */
    private String choice1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice2
     *
     * @mbg.generated
     */
    private String choice2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice3
     *
     * @mbg.generated
     */
    private String choice3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.choice4
     *
     * @mbg.generated
     */
    private String choice4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.time1
     *
     * @mbg.generated
     */
    private Date time1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.time2
     *
     * @mbg.generated
     */
    private Date time2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_order.share_flag
     *
     * @mbg.generated
     */
    private String shareFlag;

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