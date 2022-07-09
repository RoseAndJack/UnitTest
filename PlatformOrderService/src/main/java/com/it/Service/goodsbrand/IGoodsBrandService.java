/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.goodsbrand;

import com.it.resultentity.GoodsBrandEntity;

import java.util.List;

/**
 * ClassName: IGoodsBrandService
 * Package: com.it.Service.goodsbrand
 * Description:
 *
 * @create: 2022-04-24 15:37
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public interface IGoodsBrandService {
    List<GoodsBrandEntity> getBrandList();
    void test();


    GoodsBrandEntity  testCaching(GoodsBrandEntity goodsBrand);
    GoodsBrandEntity getCache(Integer id);
}
