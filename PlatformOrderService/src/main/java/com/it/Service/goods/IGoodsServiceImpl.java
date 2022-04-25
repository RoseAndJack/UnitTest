/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.goods;

import com.it.mapper.order.GoodsMapper;
import com.it.resultentity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: IGoodsServiceImpl
 * Package: com.it.Service.goods
 * Description:
 *
 * @create: 2022-04-24 11:40
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class IGoodsServiceImpl implements IGoodsService{

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<GoodsEntity> getGoodsList() {
        return goodsMapper.getGoodsList();
    }
}
