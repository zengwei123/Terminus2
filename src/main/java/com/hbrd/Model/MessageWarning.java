package com.hbrd.Model;

public class MessageWarning {
    private int Message_Warning_Id;
    private int Message_Warning_Level;  //报警等级
    private String Message_Warning_General;  //通用报警
    private int Message_Warning_ASum;  //可充电储能装置故障总数
    private String Message_Warning_A1;   //可充电储能装置故障代码列表1
    private String Message_Warning_A2;  //可充电储能装置故障代码列表2
    private int Message_Warning_BSum;  //驱动电机故障总数
    private String Message_Warning_B1;   //驱动电机故障代码列表1
    private String Message_Warning_B2;  //驱动电机故障代码列表1
    private int Message_Warning_CSum;   //发动机故障总数
    private String Message_Warning_C;   //发动机故障列表
    private int Message_Warning_DSum;   //其他故障总数
    private String Message_Warning_D;    //其他故障列表
    private String Time;
    private Car car;
}
