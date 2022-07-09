/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.goodsbrand.IGoodsBrandService;
import com.it.mapper.order.goodsbrand.GoodsBrandMapper;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

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
public class GoodsBrandController implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Resource(name = "executorService")
    private ExecutorService executorService;
    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    @Autowired
    private IGoodsBrandService goodsBrandService;

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public ResultEntity<List<GoodsBrandEntity>> getBrandList() throws ExecutionException, InterruptedException {
        GoodsBrandEntity entity = new GoodsBrandEntity();
        entity.setGoodsBrandId(91);
        entity.setGoodsBrandName("sdj");
        goodsBrandService.testCaching(entity);
        GoodsBrandEntity entity1 = goodsBrandMapper.selectById(91);
        System.out.println(entity1.getGoodsBrandName());
        GoodsBrandEntity cache = goodsBrandService.getCache(91);
        System.out.println(cache.getGoodsBrandName());
        List<GoodsBrandEntity> brandList = goodsBrandService.getBrandList();
        return ResultEntityUtils.returnSuccess(brandList);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
