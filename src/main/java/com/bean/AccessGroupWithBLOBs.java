package com.bean;

import lombok.Data;

@Data
public class AccessGroupWithBLOBs extends AccessGroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_access_group.dpte
     *
     * @mbg.generated
     */
    private String dpte;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_access_group.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_access_group.dpte
     *
     * @param dpte the value for s_access_group.dpte
     *
     * @mbg.generated
     */
    public void setDpte(String dpte) {
        this.dpte = dpte == null ? null : dpte.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_access_group.remark
     *
     * @param remark the value for s_access_group.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}