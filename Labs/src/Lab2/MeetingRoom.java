package Lab2;
import java.util.List;
import java.util.ArrayList;


public class MeetingRoom {

        private String id;
        private int capacity;
        private int floor;

        public MeetingRoom(String id, int capacity, int floor) {
            this.id = id;
            this.capacity = capacity;
            this.floor = floor;
        }

        public String getId() {
            return id;
        }

        public int getCapacity() {
            return capacity;
        }

        public int getFloor() {
            return floor;
        }

        public boolean hasZoom() {
            return false;
        }
    }










