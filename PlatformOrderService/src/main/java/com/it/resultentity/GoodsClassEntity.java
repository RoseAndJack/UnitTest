/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: GoodsClassEntity
 * Package: com.it.resultentity
 * Description:
 *
 * @create: 2022-04-25 08:53
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Getter
@Setter
public class GoodsClassEntity {
    private Integer goodsClassId;
    private String goodsClassName;
    private Integer goodsBrandId;
}
