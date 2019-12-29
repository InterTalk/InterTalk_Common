package com.intertalk.common.constant;

/**
 * Created by caozheng.
 * Created time on 2017/10/11.
 * Description: 呼叫器类型
 */

public enum CallerTypeEnum {

    /**
     * 未知类型呼叫器
     */
    UNKNOWN(0, "未知"),
    /**
     * H1互说通用呼叫器
     */
    DEVICE_TYPE_H1_3(1, "H1互说通用呼叫器"),
    /**
     * T1互说通用呼叫器
     */
    DEVICE_TYPE_T1_3(2, "T1互说通用呼叫器"),
    /**
     * H2互说通用呼叫器
     */
    DEVICE_TYPE_H2_4(3, "H2互说通用呼叫器"),
    /**
     * T4s互说通用呼叫器
     */
    DEVICE_TYPE_T4s(4, "T4s互说通用呼叫器"),
    /**
     * H1互说通用呼叫器
     */
    DEVICE_TYPE_H3(5, "H3互说通用呼叫器"),
    /**
     * H3 Plus互说通用呼叫器
     */
    DEVICE_TYPE_H3_PLUS(6, "H3 Plus互说通用呼叫器"),
    /**
     * H3 Pro互说通用呼叫器
     */
    DEVICE_TYPE_H3_PRO(7, "H3 Pro互说通用呼叫器");

    private Integer key;
    private String value;

    CallerTypeEnum(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }

    public String getValue(){
        return this.value;
    }

    public static CallerTypeEnum typeOfValue(int var){
        for(CallerTypeEnum typeEnum : values()){
            if(typeEnum.getKey() == var){
                return typeEnum;
            }
        }

        return UNKNOWN;
    }
}
