package com.woniu.mapper;

import com.woniu.pojo.Dispath;
import com.woniu.pojo.DispathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispathMapper {
    long countByExample(DispathExample example);

    int deleteByExample(DispathExample example);

    int insert(Dispath record);

    int insertSelective(Dispath record);

    List<Dispath> selectByExample(DispathExample example);

    int updateByExampleSelective(@Param("record") Dispath record, @Param("example") DispathExample example);

    int updateByExample(@Param("record") Dispath record, @Param("example") DispathExample example);
    
    Dispath selectOne(String dpid);
}