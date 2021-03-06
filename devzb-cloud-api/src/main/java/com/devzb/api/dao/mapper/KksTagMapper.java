package com.devzb.api.dao.mapper;

import com.devzb.api.dao.model.KksTag;
import com.devzb.api.dao.model.KksTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KksTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    long countByExample(KksTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int deleteByExample(KksTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int insertSelective(KksTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    List<KksTag> selectByExample(KksTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    KksTag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") KksTag record, @Param("example") KksTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int updateByExample(@Param("record") KksTag record, @Param("example") KksTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kks_tag
     *
     * @mbg.generated Thu Mar 30 09:05:52 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(KksTag record);
}