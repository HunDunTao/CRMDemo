package com.dao;

import com.bean.DictionaryClass;

/**
 * @version 2017/6/29.
 * @auther CrazyBunQnQ
 */
public interface DictionaryClassDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int insert(DictionaryClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int insertSelective(DictionaryClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    DictionaryClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictionaryClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DictionaryClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dictionary_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictionaryClass record);
}