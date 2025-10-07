package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Company {
        private List<MeetingRoom> rooms = new ArrayList<>();
        private List<Booking> bookings = new ArrayList<>();

        public void addRoom(MeetingRoom room) {
            rooms.add(room);
        }

        public void addBooking(Booking booking) {
            bookings.add(booking);
        }

        public void showBookingsByDate(String date) {
            System.out.println("Bookings on " + date + ":");
            for (Booking b : bookings) {
                if (b.getDate().equals(date)) {
                    System.out.println(b);
                }
            }
        }

        public List<MeetingRoom> getRooms() {
            return rooms;
        }

}
