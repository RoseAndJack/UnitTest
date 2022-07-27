/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.IGoodsClassService;
import com.it.resultentity.GoodsClassEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: GoodsClassController
 * Package: com.it.controller
 * Description:
 *
 * @create: 2022-04-25 09:04
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@RestController
@RequestMapping(value = "/goodsclass")
public class GoodsClassController {

    @Autowired
    private IGoodsClassService goodsClassService;


    @RequestMapping(value = "getList/{id}", method = RequestMethod.GET)
    public ResultEntity<List<GoodsClassEntity>> getList(@PathVariable("id") Integer id) {
        Assert.notNull(id);
        List<GoodsClassEntity> list = goodsClassService.getClassListById(id);
        return ResultEntityUtils.returnSuccess(list);
    }
}
