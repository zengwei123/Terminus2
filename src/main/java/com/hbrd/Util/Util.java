package com.hbrd.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    private static double X(String x){
        try {
            double du=Double.parseDouble(x.substring(0,2));
            double fen=Double.parseDouble(x.substring(2,4))/60;
            double miao=Double.parseDouble(x.substring(4,8))/10000/60;
            return du+fen+miao;
        }catch (Exception e){
            return 0;
        }
    }
    private static double Y(String y){
        try {
            double du=Double.parseDouble(y.substring(0,3));
            double fen=Double.parseDouble(y.substring(3,5))/60;
            double miao=Double.parseDouble(y.substring(5,9))/10000/60;
            return du+fen+miao;
        }catch (Exception e){
            return 0;
        }
    }

    /**
     * 经纬度转换
     */
    public static double[] getxy(String x,String y){
        double[] s=GPSUtil.gps84_To_Gcj02(Util.X(x), Util.Y(y));
        return GPSUtil.gps84_To_Gcj02(Util.X(x), Util.Y(y));
    }

    /**
     * 时间格式
     * @param string
     * @return
     */
    public static String[] getDate(String string){
        String[] s=new String[2];
        if(string.length()<12){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYYMMdd");
            s[0]= simpleDateFormat.format(date);
            simpleDateFormat=new SimpleDateFormat("YYYYMMdd hh:mm:ss");
            s[1]= simpleDateFormat.format(date);
        }else{
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("20"+string.substring(4,6));
            stringBuffer.append(string.substring(2,4));
            stringBuffer.append(string.substring(0,2));
            s[0]=stringBuffer.toString();
            stringBuffer.append(" "+string.substring(6,8)+":");
            stringBuffer.append(string.substring(8,10)+":");
            stringBuffer.append(string.substring(10,12));
            s[1]=stringBuffer.toString();
        }
        return s;
    }

    public static String[] thisDate(){
        String[] s=new String[2];
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYYMMdd");
        s[0]= simpleDateFormat.format(date);
        simpleDateFormat=new SimpleDateFormat("YYYYMMdd hhmmss");
        s[1]= simpleDateFormat.format(date);
        return s;
    }
    /**
     * bit位置获取
     * @return
     */
    public static long  GetTcpData(byte sourceByte[],int startByte,int Length){
        long Ret;
        Ret = 0xff&sourceByte[startByte];
        for(int i=1;i<Length;i++){
            Ret <<= 8;
            Ret |=(0xff&sourceByte[startByte+i]);
        }
        return Ret;
    }

//    public static void main(String[] a){
//        System.out.println(37|2<<36);
//    }
}
