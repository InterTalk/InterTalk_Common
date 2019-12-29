package com.intertalk.common.constant;

/**
 * @author caozheng
 * Created time on 2017/12/21
 * description: 员工类型
 */

public enum EmployeeEnum {

    /**
     * 普通员工
     */
    TYPE_EMPLOYEE(0),
    /**
     * 管理员
     */
    TYPE_ADMIN(1),
    /**
     * 店掌柜
     */
    TYPE_BOSS(2);

    private int value;

    EmployeeEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static EmployeeEnum typeOfValue(int var){
        for(EmployeeEnum qrTypeEnum : values()){
            if(qrTypeEnum.getValue() == var){
                return qrTypeEnum;
            }
        }

        return TYPE_EMPLOYEE;
    }
}
