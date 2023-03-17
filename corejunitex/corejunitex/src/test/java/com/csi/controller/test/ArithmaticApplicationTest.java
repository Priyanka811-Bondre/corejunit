package com.csi.controller.test;

import com.csi.controller.ArithmaticApplication;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArithmaticApplicationTest {
    @Autowired
    ArithmaticApplication arithmaticApplication;

    @Test
    public void addTest(){
        Assert.assertEquals(9,arithmaticApplication.add(4,5));
    }
    @Test
    public void subTest(){
        Assert.assertEquals(2,arithmaticApplication.sub(7,5));
    }
    @Test
    public  void mulTest(){
        Assert.assertEquals(20,arithmaticApplication.mul(4,5));
    }
    @Test
    public  void divTest(){
        Assert.assertEquals(2,arithmaticApplication.div(11,5));
    }
}
