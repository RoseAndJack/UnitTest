/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.ResultContant;

/**
 * ClassName: ResultContant
 * Package: ResultContant
 * Description:
 *
 * @create: 2022-03-22 14:07
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public interface ResultConstant {

    //"success"
    public static final int SUCCESS = 0;
    //"服务端异常"
    public static int SERVER_EXCEPTION = 500100;
    //"输入参数为空"
    public static int PARAMETER_ISNULL = 500101;


    // 业务异常
    //"用户不存在"
    public static int USER_NOT_EXSIST = 500102;
    //"在线用户数超出允许登录的最大用户限制"
    public static int ONLINE_USER_OVER = 500103;
    //"不存在离线session数据"
    public static int SESSION_NOT_EXSIST = 500104;
    //"查找不到对应数据"
    public static int NOT_FIND_DATA = 500105;
}
