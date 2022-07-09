/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.resultentity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
@TableName(value = "goods_brand")
public class GoodsBrandEntity implements Serializable {
    @TableId(value = "goodsbrandid",type = IdType.AUTO)
    private Integer goodsBrandId;
    @TableField(value = "goodsbrandname")
    private String goodsBrandName;
    //private String area;



}
