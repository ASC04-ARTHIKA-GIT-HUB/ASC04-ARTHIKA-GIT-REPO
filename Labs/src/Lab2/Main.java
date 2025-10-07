package Lab2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        MeetingRoom r1 = new MeetingRoom("R101", 10, 1);
        ZoomMeetingRoom r2 = new ZoomMeetingRoom("R102", 20, 2, "ZD001", "ZA001");

        company.addRoom(r1);
        company.addRoom(r2);

        Booking b1 = new Booking("E001", "R101", "2025-09-26", "10:00", 60);
        Booking b2 = new Booking("E002", "R102", "2025-09-26", "11:00", 30);

        company.addBooking(b1);
        company.addBooking(b2);

        company.showBookingsByDate("2025-09-26");
    }
}