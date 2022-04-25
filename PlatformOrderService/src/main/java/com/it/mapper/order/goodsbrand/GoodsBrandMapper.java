/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order.goodsbrand;

import com.it.resultentity.GoodsBrandEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: GoodsBrandMapper
 * Package: com.it.mapper.order.goodsbrand
 * Description:
 *
 * @create: 2022-04-24 15:40
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Mapper
public interface GoodsBrandMapper {
    @Select(value = {"SELECT * FROM GOODS_BRAND"})
    List<GoodsBrandEntity> getBrandList();
}
