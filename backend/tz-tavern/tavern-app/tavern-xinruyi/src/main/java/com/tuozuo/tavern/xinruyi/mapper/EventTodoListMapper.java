package com.tuozuo.tavern.xinruyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tuozuo.tavern.xinruyi.model.EventTodoList;
import com.tuozuo.tavern.xinruyi.model.ProjectEventInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EventTodoListMapper extends BaseMapper<EventTodoList> {
    IPage<ProjectEventInfo> selectProjects(Page page,
                                           @Param("companyId")String companyId,
                                           @Param("projectId")String projectId,
                                           @Param("status")String status,
                                           @Param("beginDate")String beginDate,
                                           @Param("endDate")String endDate);

}