package com.hbrd.Parsing;

import com.hbrd.Model.Car;
import com.hbrd.Model.MessageBasic;
import com.hbrd.Service.impl.CarImpl;
import com.hbrd.Util.Util;
import org.springframework.beans.factory.annotation.Autowired;

public class Parse {
    @Autowired
    protected static CarImpl car;
    private static StringBuffer carid=new StringBuffer();
    private static Object[] objects=new Object[4];
    private static Car cars;
    public static Object[] bytesToHexString(byte[] bArray){
        for(int i=0;i<bArray.length;i++){
            System.out.print(bArray[i]+"-"+i+",");
        }
        System.out.println();
        if(IsHead(bArray)){   //首尾
            if(IsCarOrCheck(bArray)){   //校验
                cars=car.IsCar(carid.toString());
                if(cars!=null){  //是否存在
                    if (IsOnLine(bArray)==1){  //车辆上线
                        car.IsOnLine(carid.toString(),1);
                    }else if (IsOnLine(bArray)==4){  //车辆下线
                        car.IsOnLine(carid.toString(),4);
                    }else if (IsOnLine(bArray)==2){   //实时数据

                    }else if (IsOnLine(bArray)==3){   //补发数据

                    }else if (IsOnLine(bArray)==0){  //???

                    }
                }
            }
        }
        return null;
    }
    /**判断数据的命令单元**/
    private static int IsOnLine(byte[] bArray){
        switch ((0xFF & bArray[0])){
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 4;
            default: return 0;
        }
    }
    /**判断数据是否为完整的一帧**/
    private static boolean IsHead(byte[] bArray){
        if((0xFF & bArray[0])==35&&(0xFF & bArray[1])==35&& ((0xFF & bArray[57])==36||(0xFF & bArray[200])==36)){
            return true;
        }else {
            return false;
        }
    }
    /**校验码判断**/
    private static boolean IsCarOrCheck(byte[] bArray){
        carid.setLength(0);
        int jiaoyanm=0;
        if ((0xFF & bArray[57])==36){
            for (int i=2;i<=55;i++){
                if(i==4||i==5||i==6||i==7||i==8||i==9||i==10||i==11||i==12||i==13){
                    carid.append((char) (0xFF & bArray[i]));
                }
                jiaoyanm=jiaoyanm^(0xFF & bArray[i]);
            }
            if (jiaoyanm==(0xFF & bArray[199])){
                return true;
            }
        }else if((0xFF & bArray[200])==36){
            for (int i=2;i<=198;i++){
                if(i==4||i==5||i==6||i==7||i==8||i==9||i==10||i==11||i==12||i==13){
                    carid.append((char) (0xFF & bArray[i]));
                }
                jiaoyanm=jiaoyanm^(0xFF & bArray[i]);
            }
            if (jiaoyanm==(0xFF & bArray[199])){
                return true;
            }
        }
        return false;
    }
    /**基本数据**/
    private static MessageBasic getBasic(byte[] bArray,int i){
        MessageBasic messageBasic=new MessageBasic();
        messageBasic.setMessage_Basic_Real(i);  //是否为实时数据
        messageBasic.setMessage_Basic_CarState((0xFF & bArray[34]));  //车辆状况
        messageBasic.setMessage_Basic_ChargingState((0xFF & bArray[35]));   //充电状态
        messageBasic.setMessage_Basic_RunModel((0xFF & bArray[36]));   //运行模式
        messageBasic.setMessage_Basic_Speed(Util.GetTcpData(bArray,37,2));
        return null;
    }
}
