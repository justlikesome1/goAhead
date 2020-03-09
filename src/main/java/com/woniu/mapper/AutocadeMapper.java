package com.woniu.mapper;

import com.woniu.pojo.Autocade;
import com.woniu.pojo.AutocadeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutocadeMapper {
    long countByExample(AutocadeExample example);

    int deleteByExample(AutocadeExample example);

    int deleteByPrimaryKey(Integer acid);

    int insert(Autocade record);

    int insertSelective(Autocade record);

    List<Autocade> selectByExample(AutocadeExample example);

    Autocade selectByPrimaryKey(Integer acid);

    int updateByExampleSelective(@Param("record") Autocade record, @Param("example") AutocadeExample example);

    int updateByExample(@Param("record") Autocade record, @Param("example") AutocadeExample example);

    int updateByPrimaryKeySelective(Autocade record);

    int updateByPrimaryKey(Autocade record);
}