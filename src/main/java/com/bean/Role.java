package com.bean;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_role.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_role.id
     *
     * @return the value of s_role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_role.id
     *
     * @param id the value for s_role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_role.name
     *
     * @return the value of s_role.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_role.name
     *
     * @param name the value for s_role.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}