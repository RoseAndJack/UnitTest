/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.resultentity.GoodsClassEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: GoodsClassMapper
 * Package: com.it.mapper.order
 * Description:
 *
 * @create: 2022-04-25 08:56
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Mapper
public interface GoodsClassMapper extends BaseMapper {

    @Select("SELECT * FROM GOODS_CLASS A WHERE A.GOODSBRANDID = #{GOODSBRANDID} ORDER BY A.GOODSCLASSID ASC ")
    List<GoodsClassEntity> getClassListById(@Param("GOODSBRANDID") Integer goodsBrandId);
}
