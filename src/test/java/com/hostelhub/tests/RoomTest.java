package com.hostelhub.tests;

import org.testng.annotations.Test;

import com.hostelhub.base.BaseClass;
import com.hostelhub.pages.RoomPage;

public class RoomTest extends BaseClass {

    @Test
    public void createRoomTest() {

        // Create RoomPage object
        RoomPage rp = new RoomPage(driver);

        // Login as Admin
        rp.adminLogin("admin1@stayease.com", "Test@1234");

        // Navigate to Room Page
        rp.navigateToRoomPage();

        // Create Room
        rp.createRoom(
                "203",
                "2",
                "Single (2 bed)",
                "2",
                "300",
                "7500",
                "2000",
                "12x10 ft"
        );

        System.out.println("Room Created Successfully");

        // Create Bed
        rp.createBeds("203", 2);

        System.out.println("Beds Created Successfully");
    }  
}