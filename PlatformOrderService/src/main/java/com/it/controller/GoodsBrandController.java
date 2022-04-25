/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.goodsbrand.IGoodsBrandService;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = {"/goodsbrand"})
public class GoodsBrandController {

    @Autowired
    private IGoodsBrandService goodsBrandService;

    @RequestMapping(value = {"/list"},method = RequestMethod.GET)
    public ResultEntity<List<GoodsBrandEntity>> getBrandList(){
        List<GoodsBrandEntity> brandList = goodsBrandService.getBrandList();
        return ResultEntityUtils.returnSuccess(brandList);
    }
}
