/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity.order;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * ClassName: Order
 * Package: com.it.resultentity.order
 * Description:
 *
 * @create: 2022-03-23 10:49
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Getter
@Setter
@NoArgsConstructor
public class Order implements Serializable {

    private Integer id;
    private  String orderName;
    private  String version;

}
