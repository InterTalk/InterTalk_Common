package com.intertalk.common.constant;

/**
 * @author 曹正
 * Created time on 2018/11/30
 * description: 桌位状态
 */

public class CommandCode {

    /** 空闲 */
    public static final int COMMAND_FREE = 0;
    /** 呼叫服务 */
    public static final int COMMAND_REQUEST = 1;
    /** 服务完成 */
    public static final int COMMAND_FINISH = 3;
    /** 好评 */
    public static final int COMMAND_POSITIVE = 4;
    /** 差评 */
    public static final int COMMAND_NEGATIVE = 5;
    /** 服务加急 */
    public static final int COMMAND_URGENT = 6;
    /** 买单 */
    public static final int COMMAND_BILL = 7;
    /** 服务超时 */
    public static final int COMMAND_FAIL = 8;
    public static final int COMMAND_NUMBER = 9;
    /** 上菜开始 */
    public static final int COMMAND_FOOD_OPEN = 10;
    /** 上菜完成 */
    public static final int COMMAND_FOOD_FINISH = 11;
    /** 上菜超时 */
    public static final int COMMAND_FOOD_TIMEOUT = 12;
    /** 授权评价开始 */
    public static final int COMMAND_EVALUATE_START = 13;
    /** 授权评价超时 */
    public static final int COMMAND_EVALUATE_TIMEOUT = 14;
    /** 催菜 */
    public static final int COMMAND_FOOD_URGENT = 15;
    /** 服务中心催菜 */
    public static final int COMMAND_FOOD_URGENT_BY_ORDER = 16;
    /** 清台 */
    public static final int COMMAND_FOOD_CLEAN = 17;
    /** 长按好评 */
    public static final int COMMAND_LONG_POSITIVE = 18;
    /** 长按差评 */
    public static final int COMMAND_LONG_NEGATIVE = 19;
    /** 加急上菜 */
    public static final int COMMAND_FOOD_FAST = 20;
    /** 放缓上菜 */
    public static final int COMMAND_FOOD_SLOW = 21;
    /** 正常上菜 */
    public static final int COMMAND_FOOD_NORMAL = 22;
    /** 暂停上菜 */
    public static final int COMMAND_FOOD_PAUSE = 23;
    /** 继续上菜 */
    public static final int COMMAND_FOOD_CONTINUE = 24;
    /** 档口二起菜 */
    public static final int COMMAND_FOOD_OPEN_PROCESS2 = 25;
    /** 档口三起菜 */
    public static final int COMMAND_FOOD_OPEN_PROCESS3 = 26;
    /** 上菜超时完成 */
    public static final int COMMAND_FOOD_FINISH_OF_TIMEOUT = 27;
    /** 上菜第一次中途提醒 */
    public static final int COMMAND_FOOD_REMIND = 103;
    /** 上菜第二次中途提醒 */
    public static final int COMMAND_FOOD_REMIND2 = 104;
    /** 上菜第三次中途提醒 */
    public static final int COMMAND_FOOD_REMIND3 = 105;
    /** 直拨服务呼叫 */
    public static final int COMMAND_WX_SERVICE = 106;
    /** 直拨服务超时 */
    public static final int COMMAND_WX_SERVICE_TIMEOUT = 107;
    /** 直拨服务完成 */
    public static final int COMMAND_WX_SERVICE_FINISH = 108;

    /** 评星等级1 */
    public static final int COMMAND_EVALUATE_LEVEL_1 = 201;
    /** 评星等级2 */
    public static final int COMMAND_EVALUATE_LEVEL_2 = 202;
    /** 评星等级3 */
    public static final int COMMAND_EVALUATE_LEVEL_3 = 203;
    /** 评星等级4 */
    public static final int COMMAND_EVALUATE_LEVEL_4 = 204;
    /** 评星等级5 */
    public static final int COMMAND_EVALUATE_LEVEL_5 = 205;

    public static final int COMMAND_DISHES_ORDER = 1001;

    /** 授权评价等待评价 */
    public static final int COMMAND_WAIT_EVALUATE = 2001;
    /** 授权评价等待评价超时 */
    public static final int COMMAND_WAIT_TIMEOUT = 2002;
}
