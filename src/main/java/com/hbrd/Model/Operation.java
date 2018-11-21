package com.hbrd.Model;

/**
 * 操作记录表
 */
public class Operation {
    private int OperationId;    //记录id
    private String OperationAdd;   //记录地址
    private String OperationIp;    //记录ip
    private String OperationName;   //记录操作
    private User user;              //所属用户
}
