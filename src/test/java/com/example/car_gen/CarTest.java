package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    Honda civic = new Honda( "green",2020,50,500,true,true);
    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(55,civic.accelerateSpeed());
    }
    @Test
    public void testDeclerateSpeed(){

    }
}
