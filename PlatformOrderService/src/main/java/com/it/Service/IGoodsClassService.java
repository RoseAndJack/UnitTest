/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service;

import com.it.resultentity.GoodsClassEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: IGoodsClassService
 * Package: com.it.Service
 * Description:
 *
 * @create: 2022-04-25 09:01
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

public interface IGoodsClassService {
    List<GoodsClassEntity> getClassListById(Integer id);
}
