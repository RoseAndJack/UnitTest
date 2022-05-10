/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity.order;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * ClassName: GoodsWithSoldAmountEntity
 * Package: com.it.resultentity.order
 * Description:
 *
 * @create: 2022-04-26 10:27
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Setter
@Getter
public class GoodsWithSoldAmountEntity {
    private Integer gid;
    private String goodsCompany;
    private String goodsClassId;
    private String goodsName;
    private String goodsPic;
    private BigDecimal price;
    private Integer amount;
}
