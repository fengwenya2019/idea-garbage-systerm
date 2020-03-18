package com.springmvc.dao;

import com.springmvc.entity.Classificationguide;
import com.springmvc.entity.ClassificationguideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationguideMapper {
    int countByExample(ClassificationguideExample example);

    int deleteByExample(ClassificationguideExample example);

    int deleteByPrimaryKey(Integer classificationguideinfoId);

    int insert(Classificationguide record);

    int insertSelective(Classificationguide record);

    List<Classificationguide> selectByExample(ClassificationguideExample example);

    Classificationguide selectByPrimaryKey(Integer classificationguideinfoId);

    int updateByExampleSelective(@Param("record") Classificationguide record, @Param("example") ClassificationguideExample example);

    int updateByExample(@Param("record") Classificationguide record, @Param("example") ClassificationguideExample example);

    int updateByPrimaryKeySelective(Classificationguide record);

    int updateByPrimaryKey(Classificationguide record);
}