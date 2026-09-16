package org.example;

import java.util.Scanner;

public class RoomBookSystemTest {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        RoomBookSystem  bookRoom1 = new RoomBookSystem(101, " Single ", 10000.0, true);
        RoomBookSystem  bookRoom2 = new RoomBookSystem(102, " Double ", 15000.0, true);
        RoomBookSystem  bookRoom3 = new RoomBookSystem(201, " Deluxe ", 25000.0, true);
        RoomBookSystem  bookRoom4 = new RoomBookSystem(202, " Suite ",  40000.0, true);


        int hotelMenuChoice = 0;
        int roomNo = 0;

        while (hotelMenuChoice != 5){

            System.out.println("\n====HOTEL MENU====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Room Details");
            System.out.println("5. Exit Hotel Menu");

            System.out.println("Enter your Menu choice: ");
            hotelMenuChoice = scanner.nextInt();


            switch (hotelMenuChoice){
                case 1:
                    bookRoom1.checkIsAvaliable();
                    bookRoom2.checkIsAvaliable();
                    bookRoom3.checkIsAvaliable();
                    bookRoom4.checkIsAvaliable();

                    System.out.println(bookRoom1.getRoomType() + bookRoom2.getRoomType() + bookRoom3.getRoomType() + bookRoom4.getRoomType() + " Is Available");
                break;


                case 2:
                    System.out.println("Enter room number: ");
                     roomNo = scanner.nextInt();

                    switch (roomNo){
                        case 101:
                            bookRoom1.bookARoom(roomNo);
                        break;

                        case 102:
                            bookRoom2.bookARoom(roomNo);
                        break;

                        case 201:
                            bookRoom3.bookARoom(roomNo);
                        break;

                        case 202:
                            bookRoom4.bookARoom(roomNo);
                        break;

                        default:
                            System.out.println("Invalid room number");
                        break;
                    }
                break;


                case 3:
                    System.out.println("Enter your room number: ");
                    roomNo = scanner.nextInt();

                        switch (roomNo){
                            case 101:
                                bookRoom1.cancelBooking(roomNo);
                                break;

                            case 102:
                                bookRoom2.cancelBooking(roomNo);
                                break;

                            case 201:
                                bookRoom3.cancelBooking(roomNo);
                                break;

                            case 202:
                                bookRoom4.cancelBooking(roomNo);
                                break;

                            default:
                                System.out.println("Invalid room number");
                                break;
                        }
                break;


                case 4:
                    System.out.println("Enter your room number: ");
                    roomNo = scanner.nextInt();

                    switch (roomNo) {
                        case 101:
                            bookRoom1.viewRoom();
                        break;

                        case 102:
                            bookRoom2.viewRoom();
                        break;

                        case 201:
                            bookRoom3.viewRoom();
                         break;

                        case 202:
                            bookRoom4.viewRoom();
                         break;

                        default:
                            System.out.println("Invalid room number");
                            break;
                    }

                break;


                case 5:
                    System.out.println("Exiting Hotel Menu");
                break;


                default:
                    System.out.println("Invalid Menu option");
                break;
            }
        }
    }
}
