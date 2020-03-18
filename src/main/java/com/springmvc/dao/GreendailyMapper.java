package com.springmvc.dao;

import com.springmvc.entity.Greendaily;
import com.springmvc.entity.GreendailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GreendailyMapper {
    int countByExample(GreendailyExample example);

    int deleteByExample(GreendailyExample example);

    int deleteByPrimaryKey(Integer greendailyinfoId);

    int insert(Greendaily record);

    int insertSelective(Greendaily record);

    List<Greendaily> selectByExampleWithBLOBs(GreendailyExample example);

    List<Greendaily> selectByExample(GreendailyExample example);

    Greendaily selectByPrimaryKey(Integer greendailyinfoId);

    int updateByExampleSelective(@Param("record") Greendaily record, @Param("example") GreendailyExample example);

    int updateByExampleWithBLOBs(@Param("record") Greendaily record, @Param("example") GreendailyExample example);

    int updateByExample(@Param("record") Greendaily record, @Param("example") GreendailyExample example);

    int updateByPrimaryKeySelective(Greendaily record);

    int updateByPrimaryKeyWithBLOBs(Greendaily record);

    int updateByPrimaryKey(Greendaily record);
}