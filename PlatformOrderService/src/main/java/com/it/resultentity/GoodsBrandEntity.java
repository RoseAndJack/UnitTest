/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: GoodsBrandEntity
 * Package: com.it.resultentity
 * Description:
 *
 * @create: 2022-04-24 15:35
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Setter
@Getter
public class GoodsBrandEntity {
    private Integer goodsBrandId;
    private String goodsBrandName;
    private String area;
}
