package com.yiman.mapper;

import com.yiman.entity.ActivityDetail;
import com.yiman.entity.ActivityDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDetailMapper {
    int countByExample(ActivityDetailExample example);

    int deleteByExample(ActivityDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDetail record);

    int insertSelective(ActivityDetail record);

    List<ActivityDetail> selectByExample(ActivityDetailExample example);

    ActivityDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDetail record, @Param("example") ActivityDetailExample example);

    int updateByExample(@Param("record") ActivityDetail record, @Param("example") ActivityDetailExample example);

    int updateByPrimaryKeySelective(ActivityDetail record);

    int updateByPrimaryKey(ActivityDetail record);
}