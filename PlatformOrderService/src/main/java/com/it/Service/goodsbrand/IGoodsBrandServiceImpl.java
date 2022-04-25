/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.goodsbrand;

import com.it.mapper.order.goodsbrand.GoodsBrandMapper;
import com.it.resultentity.GoodsBrandEntity;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public List<GoodsBrandEntity> getBrandList() {
        return goodsBrandMapper.getBrandList();
    }
}
