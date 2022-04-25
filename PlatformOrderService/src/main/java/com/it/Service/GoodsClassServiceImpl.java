/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service;

import com.it.mapper.order.GoodsClassMapper;
import com.it.resultentity.GoodsClassEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: GoodsClassServiceImpl
 * Package: com.it.Service
 * Description:
 *
 * @create: 2022-04-25 09:02
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class GoodsClassServiceImpl implements IGoodsClassService {

    @Autowired
    private GoodsClassMapper goodsClassMapper;

    @Override
    public List<GoodsClassEntity> getClassListById(Integer id) {
        List<GoodsClassEntity> list = goodsClassMapper.getClassListById(id);
        return list;
    }
}
