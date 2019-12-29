package com.intertalk.common.constant;

/**
 * @author caozheng
 * Created time on 2019-12-29
 * description:
 */
public class NotificationType {

    /* ------------------------------------ p2p notification --------------------------------*/
    /** 取消授权管理员（废弃） */
    public static final int P2P_NOTIFICATION_SUB_ACTIVE_CANCEL = 0;
    /** 授权管理员（废弃） */
    public static final int P2P_NOTIFICATION_SUB_REQUEST = 1;
    /** 同意管理员授权请求（废弃） */
    public static final int P2P_NOTIFICATION_SUB_AGREE = 2;
    /** 拒绝授权管理员请亲（废弃） */
    public static final int P2P_NOTIFICATION_SUB_REFUSE = 3;
    /** 极速厨品设置群组（废弃） */
    public static final int P2P_NOTIFICATION_KIT_SET_GROUP = 4;
    /** 极速厨品设置群组成功（废弃） */
    public static final int P2P_NOTIFICATION_KIT_SET_GROUP_DONE = 5;
    /** 设置信道（废弃） */
    public static final int P2P_NOTIFICATION_KIT_INTERCOM_ENABLE = 6;
    /** 基站设置 */
    public static final int P2P_NOTIFICATION_STATION_SETTING = 7;
    /** 授权评价 */
    public static final int P2P_NOTIFICATION_STATION_EVALUATE = 8;
    /** 授权管理员状态更新（废弃） */
    public static final int P2P_NOTIFICATION_SUB_UPDATE = 9;
    /** 店铺更新 */
    public static final int P2P_NOTIFICATION_STORE_UPDATE = 10;
    /** 服务中心设置群组（废弃） */
    public static final int P2P_NOTIFICATION_ORDER_SET_GROUP = 11;
    /** 服务中心设置群组成功（废弃） */
    public static final int P2P_NOTIFICATION_ORDER_SET_GROUP_DONE = 12;
    /** 服务中心远程按键 */
    public static final int P2P_NOTIFICATION_ORDER_SET_TABLE = 13;
    /** 获取基站log */
    public static final int P2P_NOTIFICATION_GET_COMMAND_LOG = 14;
    /** 申请加入组织架构 */
    public static final int P2P_NOTIFICATION_APPLY_JOIN_ORGANIZATION = 15;
    /** 体验app登录通知 */
    public static final int P2P_NOTIFICATION_EXPERIENCE_LOGIN = 16;


    /* ------------------------------------ team notification --------------------------------*/

    /** 群成员在线状态 */
    public static final int TEAM_NOTIFICATION_MEMBER_STATUS = 100;
    /** 请求在线状态 */
    public static final int TEAM_NOTIFICATION_REQUEST_MEMBER_STATUS = 101;

    /** 桌位呼叫消息 */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_REQUEST = 1000;
    /** 桌位计时消息 */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_FOOD = 1001;
    /** 桌位评价消息 */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_EVALUATE = 1002;
    /** 点菜下单推送 */
    public static final int TEAM_NOTIFICATION_PUSH_ORDER = 1003;
    /** 菜品状态发生改变时的推送 */
    public static final int TEAM_NOTIFICATION_PUSH_DISHES_SERVED = 1004;
    /** 信号强度的推送 */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_SIGNAL = 1005;
    /** 系统设置的推送 */
    public static final int TEAM_NOTIFICATION_PUSH_SYSTEM_SETTING = 1006;
    /** 电池电量的推送 */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_ELECTRIC = 1007;
    /** 桌位计时消息(新) */
    public static final int TEAM_NOTIFICATION_PUSH_NEW_TABLE_FOOD = 1009;
    /** 桌位呼叫消息(新) */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_REQUEST_NEW = 1010;
    /** 桌位评价消息(新) */
    public static final int TEAM_NOTIFICATION_PUSH_TABLE_EVALUATE_NEW = 1011;
    /** 工作通知推送 */
    public static final int TEAM_NOTIFICATION_PUSH_WORK_NOTIFICATION = 1012;

    //直拨服务推送通知消息类型
    /** 添加直拨服务信息 */
    public static final int TEAM_NOTIFICATION_PUSH_DIRECT_SERVICE_ADD = 2001;
    /** 修改状态直拨服务信息 */
    public static final int TEAM_NOTIFICATION_PUSH_DIRECT_SERVICE_MODIFY_STATUS = 2002;
    /** 修改备注直拨服务信息 */
    public static final int TEAM_NOTIFICATION_PUSH_DIRECT_SERVICE_MODIFY_REMARK = 2003;
    /** 修改设置直拨服务信息 */
    public static final int TEAM_NOTIFICATION_PUSH_DIRECT_SERVICE_MODIFY_SETTING = 2004;

    /** 工作群添加广播通知 */
    public static final int TEAM_NOTIFICATION_NEW_WORK_NOTIFICATION = 3001;
}
