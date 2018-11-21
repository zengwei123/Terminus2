package com.hbrd.Service.impl;

import com.hbrd.Dao.CarDao;
import com.hbrd.Model.Car;
import com.hbrd.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarImpl implements CarService{
    @Autowired
    private CarDao carDao;
    @Override
    public Car IsCar(String CarId) {
        Car car=carDao.IsCar(CarId);
        if(car!=null){
            return car;
        }
        return null;
    }

    @Override
    public boolean IsOnLine(String CarId, int i) {
        try {
            if(carDao.IsOnLine(CarId,i)>0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}
