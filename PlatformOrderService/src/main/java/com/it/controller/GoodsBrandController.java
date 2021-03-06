/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: GoodsBrandController
 * Package: com.it.controller
 * Description:
 *
 * @create: 2022-04-24 15:46
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

@RestController
@RequestMapping(value = {"/goodsBrand"})
public class GoodsBrandController {

    /**
     * 返回所有商品列表信息
     *
     * @return
     */
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public ResultEntity<List<GoodsBrandEntity>> getBrandList() {

        return ResultEntityUtils.returnFail(400, "查询结果为空");
    }
}
