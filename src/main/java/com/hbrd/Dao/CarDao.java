package com.hbrd.Dao;

import com.hbrd.Model.Car;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao {
    /**查询车辆**/
    Car IsCar(String CarId);
    /**修改车辆上下线车辆**/  //执行insert update delete的时候 返回值是一个int 表示受影响行数如果行数大于0 就说明成功了
    int IsOnLine(String CarId,int i);
}
