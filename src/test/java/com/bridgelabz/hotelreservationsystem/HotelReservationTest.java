package com.bridgelabz.hotelreservationsystem;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import org.junit.Assert;


public class HotelReservationTest {

    @Test
    public void hotelNameAndRateTest1() {
        Hotel hotel = new Hotel("Lakewood", 110);
        HotelReservation  hotelReservation = new HotelReservation();
        hotelReservation.add(hotel);
        hotelReservation.getHotelList();
        Assert.assertEquals("Lakewood", hotel.getName());
        Assert.assertEquals(110, hotel.getRate());
    }
    @Test
    public void hotelNameAndRateTest2() {

        Hotel hotel = new Hotel("Bridgewood", 160);
        HotelReservation  hotelReservation = new HotelReservation();
        hotelReservation.add(hotel);
        hotelReservation.getHotelList();
        Assert.assertEquals("Bridgewood", hotel.getName());
        Assert.assertEquals(160, hotel.getRate());
    }
    @Test
    public void hotelNameAndRateTest3() {

        Hotel hotel = new Hotel("Ridgewood", 220);
        HotelReservation  hotelReservation = new HotelReservation();
        hotelReservation.add(hotel);
        hotelReservation.getHotelList();
        Assert.assertEquals("Ridgewood", hotel.getName());
        Assert.assertEquals(220, hotel.getRate());
    }


}
