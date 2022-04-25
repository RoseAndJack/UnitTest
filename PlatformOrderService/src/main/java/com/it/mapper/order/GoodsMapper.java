/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order;

import com.it.resultentity.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: GoodsMapper
 * Package: com.it.mapper.order
 * Description:
 *
 * @create: 2022-04-24 11:34
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Mapper
public interface GoodsMapper {
    @Select("SELECT * FROM GOODS_INFO")
    List<GoodsEntity> getGoodsList();
}
