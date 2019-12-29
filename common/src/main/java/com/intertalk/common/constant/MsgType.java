package com.intertalk.common.constant;

/**
 * @author caozheng
 * Created time on 2019-12-29
 * description: 消息类型
 */
public class MsgType {

    /* =============== team ================*/

    /* ------------------------------------ text --------------------------------*/
    /** 普通群通用消息 */
    public static final int TYPE_TEAM_TEXT_COMMAND = 0;
    /** 普通群呼叫器按键消息 */
    public static final int TYPE_TEAM_TEXT_TABLE = 1;
    /** 普通群升级提示 */
    public static final int TYPE_TEAM_TEXT_UPDATE = 2;
    /** 普通群定时报告 */
    public static final int TYPE_TEAM_TEXT_REPORT = 3;
    /** 普通群授权评价消息 */
    public static final int TYPE_TEAM_TEXT_EVALUATE = 4;
    /** 普通群出菜口取菜消息 */
    public static final int TYPE_TEAM_TEXT_TAKE_FOOD = 5;
    /** 普通群划单消息 */
    public static final int TYPE_TEAM_TEXT_DISHES_SERVED = 6;
    /** 微信直拨服务文字消息 */
    public static final int TYPE_TEAM_TEXT_WX_SERVICE = 7;
    /** 系统设置修改文字消息 */
    public static final int TYPE_TEAM_TEXT_SETTING_UPDATE = 8;
    /** 催具体菜品消息 */
    public static final int TYPE_TEAM_TEXT_URGE_DISHES = 9;


    /** 工作群文字普通消息 */
    public static final int TYPE_TEAM_TEXT_WORK_COMMON = 101;
    /** 工作群文字日报消息 */
    public static final int TYPE_TEAM_TEXT_WORK_REPORT_DAY = 102;
    /** 工作群文字周报消息 */
    public static final int TYPE_TEAM_TEXT_WORK_REPORT_WEEK = 103;
    /** 工作群文字月报消息 */
    public static final int TYPE_TEAM_TEXT_WORK_REPORT_MONTH = 104;


    /* ------------------------------------ audio --------------------------------*/
    /** 通用群组语音消息 */
    public static final int TYPE_TEAM_AUDIO_COMMON = 0;
    /** 基站群组语音消息 */
    public static final int TYPE_TEAM_AUDIO_STATION = 1;
    /** 直拨服务群组语音消息 */
    public static final int TYPE_TEAM_AUDIO_WX_SERVICE = 2;


    /* ------------------------------------ image --------------------------------*/
    /** 工作群图片消息--普通图片 */
    public static final int TYPE_TEAM_IMAGE_WORK_DAY_COMMON = 200;
    /** 工作群图片消息--今日汇总 */
    public static final int TYPE_TEAM_IMAGE_WORK_DAY_COLLECT = 201;
    /** 工作群图片消息--趋势报告 */
    public static final int TYPE_TEAM_IMAGE_WORK_TREND_COLLECT = 202;
    /** 工作群图片消息--卫生检查图片 */
    public static final int TYPE_TEAM_IMAGE_WORK_HYGIENE_MULTIPLE = 203;
    /** 工作群图片消息--多店对比图片 */
    public static final int TYPE_TEAM_IMAGE_WORK_MULTIPLE_CONTRAST = 204;


    /* ====================== p2p =======================*/

    /* ------------------------------------ image --------------------------------*/
    /** 单聊图片消息--普通图片 */
    public static final int TYPE_P2P_IMAGE_WORK_DAY_COMMON = 200;

    /** 普通P2P文字消息 */
    public static final int TYPE_P2P_WHISPER_TEXT = 0;
    /** 客服P2P文字消息 */
    public static final int TYPE_P2P_CUSTOMER_SERVICE_TEXT = 1;
}
