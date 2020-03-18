package com.springmvc.dao;

import com.springmvc.entity.Quality;
import com.springmvc.entity.QualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualityMapper {
    int countByExample(QualityExample example);

    int deleteByExample(QualityExample example);

    int deleteByPrimaryKey(Integer qualityinfoId);

    int insert(Quality record);

    int insertSelective(Quality record);

    List<Quality> selectByExample(QualityExample example);

    Quality selectByPrimaryKey(Integer qualityinfoId);

    int updateByExampleSelective(@Param("record") Quality record, @Param("example") QualityExample example);

    int updateByExample(@Param("record") Quality record, @Param("example") QualityExample example);

    int updateByPrimaryKeySelective(Quality record);

    int updateByPrimaryKey(Quality record);
}