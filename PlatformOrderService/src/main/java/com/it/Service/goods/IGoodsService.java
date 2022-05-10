/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.goods;

import com.it.resultentity.GoodsEntity;
import com.it.resultentity.order.GoodsWithSoldAmountEntity;

import java.util.List;

/**
 * ClassName: IGoodsService
 * Package: com.it.Service.goods
 * Description:
 *
 * @create: 2022-04-24 11:39
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public interface IGoodsService {
    List<GoodsEntity> getGoodsList();
    List<GoodsWithSoldAmountEntity> getGoodsPageInfo(Integer CUR, Integer SIZE, Integer ID);
}
