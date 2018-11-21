package com.hbrd.Service;

import com.hbrd.Model.Car;

public interface CarService {
    /**判断车辆是否存在**/
    Car IsCar(String CarId);
    /**修改车辆上下线车辆**/  //执行insert update delete的时候 返回值是一个int 表示受影响行数如果行数大于0 就说明成功了
    boolean IsOnLine(String CarId,int i);
}
