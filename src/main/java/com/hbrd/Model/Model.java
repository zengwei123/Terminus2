package com.hbrd.Model;

/**
 * 车辆型号表
 */
public class Model {
    private int ModelId;   //角色id
    private String ModelName;   //角色名
    private Enterprise enterprise;   //所属企业

    @Override
    public String toString() {
        return "Model{" +
                "ModelId=" + ModelId +
                ", ModelName='" + ModelName + '\'' +
                ", enterprise=" + enterprise +
                '}';
    }

    public int getModelId() {
        return ModelId;
    }

    public void setModelId(int modelId) {
        ModelId = modelId;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
