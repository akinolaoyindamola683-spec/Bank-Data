package org.example;

public class RoomBookSystem {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvaliable;

    public RoomBookSystem(int roomNumber, String roomType, double price, boolean isAvaliable){
        this.isAvaliable = isAvaliable;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }

    public double getPrice(){
        return price;
    }

    public boolean isAvaliable(){
        return isAvaliable;
    }

    public void checkIsAvaliable(){
        if(isAvaliable == true){
            System.out.println(roomNumber + " Is Available");
        }
        else{
            System.out.println( roomNumber + " Is Not Available");
        }
    }

    public void bookARoom(int roomNo){
        checkIsAvaliable();
        if(isAvaliable != true) {
            System.out.println("This room as already been booked");
            isAvaliable = false;
        }

        else {
            if (roomNo == 101 || roomNo == 102 || roomNo == 201 || roomNo == 202 ) {
                System.out.println("This room was booked successfully");
                isAvaliable = false;
            }
        }

    }

    public void cancelBooking(int cancel){
        if( isAvaliable == false){
            isAvaliable = true;
            System.out.println("This room is currently available");
        } else {
            System.out.println("You did not book this room so this room is still available");
            System.out.println("You need to book to be able to cancel your booking");
        }
    }

    public void viewRoom(){
        System.out.print("Room Number: " + getRoomNumber() +" Room Type: " + getRoomType() + " Price: " + getPrice());
    }
}
