package com.cn.lc.springboot.service;

import com.cn.lc.springboot.model.entity.TestUser;
import java.util.List;

public interface TestUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated
     */
    int insert(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated
     */
    TestUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated
     */
    List<TestUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TestUser record);
}