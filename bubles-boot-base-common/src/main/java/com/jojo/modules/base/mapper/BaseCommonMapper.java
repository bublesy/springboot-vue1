package com.jojo.modules.base.mapper;

import com.baomidou.mybatisplus.annotation.SqlParser;
import com.jojo.common.api.dto.LogDTO;
import org.apache.ibatis.annotations.Param;

public interface BaseCommonMapper {

    /**
     * 保存日志
     * @param dto
     */
    @SqlParser(filter=true)
    void saveLog(@Param("dto") LogDTO dto);

}
