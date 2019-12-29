package com.intertalk.common.constant;

/**
 * @author caozheng
 * Created time on 2017/12/21
 * description: 群类型
 */

public enum ItkTeamTypeEnum {

    /**
     * 普通群
     */
    TEAM_TYPE_COMMON(0),
    /**
     * 基站群
     */
    TEAM_TYPE_STATION(1),
    /**
     * 工作群
     */
    TEAM_TYPE_WORK(2);

    private int value;

    ItkTeamTypeEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static ItkTeamTypeEnum typeOfValue(int var){
        for(ItkTeamTypeEnum teamTypeEnum : values()){
            if(teamTypeEnum.getValue() == var){
                return teamTypeEnum;
            }
        }

        return TEAM_TYPE_COMMON;
    }
}
