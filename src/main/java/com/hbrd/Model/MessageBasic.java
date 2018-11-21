package com.hbrd.Model;

public class MessageBasic {
    private int Message_Basic_Id;
    private int Message_Basic_IsPositioning; //是否定位
    private String Message_Basic_X;  //经度
    private String Message_Basic_Y;   //纬度
    private int Message_Basic_Real;  //实时数据
    private int Message_Basic_CarState;   //车辆状态
    private int Message_Basic_ChargingState;  //充电状态
    private int Message_Basic_RunModel;   //运行模式
    private double Message_Basic_Speed;  //车速
    private int Message_Basic_Mileage;  //里程
    private double Message_Basic_Voltage;  //总电压
    private double Message_Basic_Current;   //电流
    private int Message_Basic_SOC;
    private int Message_Basic_DCDC;
    private int Message_Basic_Gear;   //挡位
    private int Message_Basic_SpeedUp;  //加速踏板
    private int Message_Basic_Brake;  //制动踏板
    private int Message_Basic_MaxDCDC; //高压dcdc
    private int Message_Basic_Resistance; //绝缘电阻
    private int Message_Basic_EngineState;  //发动机状态
    private int Message_Basic_EngineTurnSpeed;  //发动机转速
    private String Time;
    private Car car;

    public int getMessage_Basic_Id() {
        return Message_Basic_Id;
    }

    public void setMessage_Basic_Id(int message_Basic_Id) {
        Message_Basic_Id = message_Basic_Id;
    }

    public int getMessage_Basic_IsPositioning() {
        return Message_Basic_IsPositioning;
    }

    public void setMessage_Basic_IsPositioning(int message_Basic_IsPositioning) {
        Message_Basic_IsPositioning = message_Basic_IsPositioning;
    }

    public String getMessage_Basic_X() {
        return Message_Basic_X;
    }

    public void setMessage_Basic_X(String message_Basic_X) {
        Message_Basic_X = message_Basic_X;
    }

    public String getMessage_Basic_Y() {
        return Message_Basic_Y;
    }

    public void setMessage_Basic_Y(String message_Basic_Y) {
        Message_Basic_Y = message_Basic_Y;
    }

    public int getMessage_Basic_Real() {
        return Message_Basic_Real;
    }

    public void setMessage_Basic_Real(int message_Basic_Real) {
        Message_Basic_Real = message_Basic_Real;
    }

    public int getMessage_Basic_CarState() {
        return Message_Basic_CarState;
    }

    public void setMessage_Basic_CarState(int message_Basic_CarState) {
        Message_Basic_CarState = message_Basic_CarState;
    }

    public int getMessage_Basic_ChargingState() {
        return Message_Basic_ChargingState;
    }

    public void setMessage_Basic_ChargingState(int message_Basic_ChargingState) {
        Message_Basic_ChargingState = message_Basic_ChargingState;
    }

    public int getMessage_Basic_RunModel() {
        return Message_Basic_RunModel;
    }

    public void setMessage_Basic_RunModel(int message_Basic_RunModel) {
        Message_Basic_RunModel = message_Basic_RunModel;
    }

    public double getMessage_Basic_Speed() {
        return Message_Basic_Speed;
    }

    public void setMessage_Basic_Speed(double message_Basic_Speed) {
        Message_Basic_Speed = message_Basic_Speed;
    }

    public int getMessage_Basic_Mileage() {
        return Message_Basic_Mileage;
    }

    public void setMessage_Basic_Mileage(int message_Basic_Mileage) {
        Message_Basic_Mileage = message_Basic_Mileage;
    }

    public double getMessage_Basic_Voltage() {
        return Message_Basic_Voltage;
    }

    public void setMessage_Basic_Voltage(double message_Basic_Voltage) {
        Message_Basic_Voltage = message_Basic_Voltage;
    }

    public double getMessage_Basic_Current() {
        return Message_Basic_Current;
    }

    public void setMessage_Basic_Current(double message_Basic_Current) {
        Message_Basic_Current = message_Basic_Current;
    }

    public int getMessage_Basic_SOC() {
        return Message_Basic_SOC;
    }

    public void setMessage_Basic_SOC(int message_Basic_SOC) {
        Message_Basic_SOC = message_Basic_SOC;
    }

    public int getMessage_Basic_DCDC() {
        return Message_Basic_DCDC;
    }

    public void setMessage_Basic_DCDC(int message_Basic_DCDC) {
        Message_Basic_DCDC = message_Basic_DCDC;
    }

    public int getMessage_Basic_Gear() {
        return Message_Basic_Gear;
    }

    public void setMessage_Basic_Gear(int message_Basic_Gear) {
        Message_Basic_Gear = message_Basic_Gear;
    }

    public int getMessage_Basic_SpeedUp() {
        return Message_Basic_SpeedUp;
    }

    public void setMessage_Basic_SpeedUp(int message_Basic_SpeedUp) {
        Message_Basic_SpeedUp = message_Basic_SpeedUp;
    }

    public int getMessage_Basic_Brake() {
        return Message_Basic_Brake;
    }

    public void setMessage_Basic_Brake(int message_Basic_Brake) {
        Message_Basic_Brake = message_Basic_Brake;
    }

    public int getMessage_Basic_MaxDCDC() {
        return Message_Basic_MaxDCDC;
    }

    public void setMessage_Basic_MaxDCDC(int message_Basic_MaxDCDC) {
        Message_Basic_MaxDCDC = message_Basic_MaxDCDC;
    }

    public int getMessage_Basic_Resistance() {
        return Message_Basic_Resistance;
    }

    public void setMessage_Basic_Resistance(int message_Basic_Resistance) {
        Message_Basic_Resistance = message_Basic_Resistance;
    }

    public int getMessage_Basic_EngineState() {
        return Message_Basic_EngineState;
    }

    public void setMessage_Basic_EngineState(int message_Basic_EngineState) {
        Message_Basic_EngineState = message_Basic_EngineState;
    }

    public int getMessage_Basic_EngineTurnSpeed() {
        return Message_Basic_EngineTurnSpeed;
    }

    public void setMessage_Basic_EngineTurnSpeed(int message_Basic_EngineTurnSpeed) {
        Message_Basic_EngineTurnSpeed = message_Basic_EngineTurnSpeed;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
