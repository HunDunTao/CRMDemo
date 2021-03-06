package com.bean;

import lombok.Data;

/**
 * @version 2017/6/29.
 * @auther CrazyBunQnQ
 */
@Data
public class Popedom {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.istable
     *
     * @mbg.generated
     */
    private String istable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.actionName
     *
     * @mbg.generated
     */
    private String actionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.methodName
     *
     * @mbg.generated
     */
    private String methodname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_popedom.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.code
     *
     * @param code the value for s_popedom.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.name
     *
     * @param name the value for s_popedom.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.istable
     *
     * @param istable the value for s_popedom.istable
     *
     * @mbg.generated
     */
    public void setIstable(String istable) {
        this.istable = istable == null ? null : istable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.actionName
     *
     * @param actionname the value for s_popedom.actionName
     *
     * @mbg.generated
     */
    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.methodName
     *
     * @param methodname the value for s_popedom.methodName
     *
     * @mbg.generated
     */
    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_popedom.remark
     *
     * @param remark the value for s_popedom.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}