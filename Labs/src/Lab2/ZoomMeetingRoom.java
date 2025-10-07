package Lab2;

public class ZoomMeetingRoom extends MeetingRoom {

        private String zoomDeviceId;
        private String zoomAccountId;

        public ZoomMeetingRoom(String id, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
            super(id, capacity, floor);
            this.zoomDeviceId = zoomDeviceId;
            this.zoomAccountId = zoomAccountId;
        }

        @Override
        public boolean hasZoom() {
            return true;
        }

        public String getZoomDeviceId() {
            return zoomDeviceId;
        }

        public String getZoomAccountId() {
            return zoomAccountId;
        }
    }

