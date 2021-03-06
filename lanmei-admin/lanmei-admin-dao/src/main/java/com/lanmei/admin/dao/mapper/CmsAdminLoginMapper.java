package com.lanmei.admin.dao.mapper;

import com.lanmei.admin.dao.model.CmsAdminLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsAdminLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_login
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer loginId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_login
     *
     * @mbggenerated
     */
    int insert(CmsAdminLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_login
     *
     * @mbggenerated
     */
    CmsAdminLogin selectByPrimaryKey(Integer loginId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_login
     *
     * @mbggenerated
     */
    List<CmsAdminLogin> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CmsAdminLogin record);

    int insertByAdminId(@Param("adminId") Integer adminId, @Param("adminLogin") CmsAdminLogin adminLogin);
}