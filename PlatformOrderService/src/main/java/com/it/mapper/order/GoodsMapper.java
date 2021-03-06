/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order;

import com.it.resultentity.GoodsEntity;
import com.it.resultentity.order.GoodsWithSoldAmountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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
@Repository
public interface GoodsMapper {
    @Select("SELECT * FROM GOODS_INFO")
    List<GoodsEntity> getGoodsList();


    @Select("SELECT A.*, CASE WHEN SUM(B.AMOUNT) IS NULL  THEN 0 ELSE SUM(B.amount) END  AMOUNT  FROM GOODS_INFO A LEFT JOIN GOODS_ORDER B ON A.GID " +
            "=B.GID " +
            " WHERE A.GOODSCLASSID =#{ID} GROUP BY A.GID\tORDER BY A.GID ASC" +
            " LIMIT #{CUR},#{SIZE}")
    List<GoodsWithSoldAmountEntity> getGoodsPageInfo(@Param("CUR") Integer cur, @Param("SIZE") Integer size, @Param("ID")Integer id);
}
