package com.springmvc.dao;

import com.springmvc.entity.Classification;
import com.springmvc.entity.ClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationMapper {
    int countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(Integer classificationinfoId);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(Integer classificationinfoId);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}