package com.dao;

import com.bean.OrderDetail;

/**
 * @version 2017/6/29.
 * @auther CrazyBunQnQ
 */
public interface OrderDetailDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_order_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderDetail record);
}