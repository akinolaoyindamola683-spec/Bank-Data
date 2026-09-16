package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomBookSystemTest {
    RoomBookSystem roomSystem =  new RoomBookSystem(101, "Singel", 10000.0, true);

    @Test
    void checkIsAvaliable() {
        assertEquals(true, roomSystem.isAvaliable());

    }

    @Test
    void bookARoom() {
        roomSystem.bookARoom(101,2);
        roomSystem.checkIsAvaliable();
        assertEquals(false, roomSystem.isAvaliable());
        assertEquals(101, roomSystem.getRoomNumber());

    }

    @Test
    void cancelBooking() {
        roomSystem.cancelBooking(101);
        assertEquals(true, roomSystem.isAvaliable());
    }

}