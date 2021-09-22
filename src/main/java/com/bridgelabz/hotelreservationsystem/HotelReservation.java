package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

    public static void main(String args[]) {

        System.out.println("Welcome to hotel reservation system ");
    }


   private List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<Hotel>();
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);
        if (hotels.contains(hotel)) {
            System.out.println("Hotel already exists");
        }
        else {
            hotels.add(hotel);
            System.out.println("Hotel " + hotel.getName() + " added successfully");
        }
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}

