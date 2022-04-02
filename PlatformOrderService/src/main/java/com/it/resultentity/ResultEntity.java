/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * ClassName: ResultEntity
 * Package: com.xxx.ResultEntity
 * Description:返回数据封装类
 *
 * @create: 2022-03-22 08:54
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Data
@Getter
@Setter
public class ResultEntity<T> implements Serializable {

    private int code;
    private  String message;
    private T  data;

}
