/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * ClassName: GoodsEntity
 * Package: com.it.resultentity
 * Description:
 *
 * @create: 2022-04-24 11:31
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Getter
@Setter
public class GoodsEntity {
    private Integer gid;
    private String goodsCompany;
    private String goodsType;
    private String goodsName;
    private String goodsPic;
    private BigDecimal price;
}
