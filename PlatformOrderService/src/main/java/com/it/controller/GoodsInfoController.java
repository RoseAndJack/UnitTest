/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.goods.IGoodsService;
import com.it.resultentity.GoodsEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: GoodsInfoController
 * Package: com.it.controller
 * Description:goodsinfo
 *
 * @create: 2022-04-24 11:28
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

@Controller
@RequestMapping(value = {"/goodsinfo"})
public class GoodsInfoController {
    @Autowired
    private IGoodsService goodsService;

    @ResponseBody
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public ResultEntity<List<GoodsEntity>> getGoodsList() {
        List<GoodsEntity> goodsList = goodsService.getGoodsList();
        return ResultEntityUtils.returnSuccess(goodsList);

    }
}
