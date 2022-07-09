/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.goodsbrand;

import com.it.mapper.order.goodsbrand.GoodsBrandMapper;
import com.it.resultentity.GoodsBrandEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: IGoodsBrandServiceImpl
 * Package: com.it.Service.goodsbrand
 * Description:
 *
 * @create: 2022-04-24 15:38
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class IGoodsBrandServiceImpl implements IGoodsBrandService {
    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    private Logger log = LogManager.getLogger(IGoodsBrandServiceImpl.class);

    @Override
    public List<GoodsBrandEntity> getBrandList() {
        return goodsBrandMapper.getBrandList();
    }

    @Async
    @Transactional(rollbackFor = {Exception.class})
    public void test() {
        try {
            System.out.println("async:" + Thread.currentThread().getName());
        } catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }
    }

    @CachePut(cacheNames = "goodsBrand::getCache" ,key = "#goodsBrand.goodsBrandId")
    @Override
    public GoodsBrandEntity testCaching(GoodsBrandEntity goodsBrand) {
        int result = goodsBrandMapper.insert(goodsBrand);
           return goodsBrand;
    }

    @Cacheable(cacheNames = "goodsBrand::getCache",key = "#id")
    @Override
    public GoodsBrandEntity getCache(Integer id){
        return goodsBrandMapper.selectById(id);
    }
}
