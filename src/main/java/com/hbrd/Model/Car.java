package com.hbrd.Model;

/**
 * 车辆表
 */
public class Car {
    private String CarId;
    private String CarVIN;  //VIN码
    private String CarLicense;  //车牌号
    private String CarSIM;  //SIM卡号
    private Model model;  //型号
    private Grouping grouping;   //分组
    private Enterprise enterprise;   //所属企业
    private int CarIsOnLine;   //是否在线

    @Override
    public String toString() {
        return "Car{" +
                "CarId='" + CarId + '\'' +
                ", CarVIN='" + CarVIN + '\'' +
                ", CarLicense='" + CarLicense + '\'' +
                ", CarSIM='" + CarSIM + '\'' +
                ", model=" + model.toString()+
                ", grouping=" + grouping +
                ", enterprise=" + enterprise +
                ", CarIsOnLine=" + CarIsOnLine +
                '}';
    }

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String carId) {
        CarId = carId;
    }

    public String getCarVIN() {
        return CarVIN;
    }

    public void setCarVIN(String carVIN) {
        CarVIN = carVIN;
    }

    public String getCarLicense() {
        return CarLicense;
    }

    public void setCarLicense(String carLicense) {
        CarLicense = carLicense;
    }

    public String getCarSIM() {
        return CarSIM;
    }

    public void setCarSIM(String carSIM) {
        CarSIM = carSIM;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Grouping getGrouping() {
        return grouping;
    }

    public void setGrouping(Grouping grouping) {
        this.grouping = grouping;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getCarIsOnLine() {
        return CarIsOnLine;
    }

    public void setCarIsOnLine(int carIsOnLine) {
        CarIsOnLine = carIsOnLine;
    }
}
