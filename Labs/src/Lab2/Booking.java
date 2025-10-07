package Lab2;

public class Booking {

        private String employeeId;
        private String roomId;
        private String date;
        private String time;
        private int duration;

        public Booking(String employeeId, String roomId, String date, String time, int duration) {
            this.employeeId = employeeId;
            this.roomId = roomId;
            this.date = date;
            this.time = time;
            this.duration = duration;
        }

        public String getDate() {
            return date;
        }

        public String getRoomId() {
            return roomId;
        }

        public String toString() {
            return "Employee: " + employeeId + ", Room: " + roomId + ", Date: " + date + ", Time: " + time + ", Duration: " + duration + " mins";
        }
    }
