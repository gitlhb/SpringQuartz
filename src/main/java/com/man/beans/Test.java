package com.man.beans;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuhongbing on 2018/3/19.
 */

@Component
public class Test {
    public  void  testQuartz()
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = simpleDateFormat.format(new Date());
        System.out.println(now);
    }
}
