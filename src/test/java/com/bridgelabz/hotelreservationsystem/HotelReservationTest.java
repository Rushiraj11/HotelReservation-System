package com.bridgelabz.hotelreservationsystem;

import org.junit.Test;

import org.junit.Assert;


public class HotelReservationTest {
    @Test
    public void hotelNameAndRateTest1() {

        Hotel hotel1 = new Hotel("Bridgewood", 160);

        Assert.assertEquals("Bridgewood", hotel1.getName());
        Assert.assertEquals(160, hotel1.getRate());
    }
    @Test
    public void hotelNameAndRateTest2() {

        Hotel hotel1 = new Hotel("Lakewood", 110);

        Assert.assertEquals("Lakewood", hotel1.getName());
        Assert.assertEquals(110, hotel1.getRate());
    }
    @Test
    public void hotelNameAndRateTest3() {

        Hotel hotel1 = new Hotel("Ridgewood", 220);

        Assert.assertEquals("Ridgewood", hotel1.getName());
        Assert.assertEquals(220, hotel1.getRate());
    }


}
