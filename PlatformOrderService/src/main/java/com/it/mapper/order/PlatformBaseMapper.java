/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: PlatformBaseMapper
 * Package: com.it.mapper.order
 * Description:
 *
 * @create: 2022-07-19 14:54
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Mapper
@Repository
public interface PlatformBaseMapper<T> extends BaseMapper {

    @Select(value = {"SELECT * FROM ${tableName}"})
    List<T> findTable(@Param(value = "tableName") String tableName);
}
