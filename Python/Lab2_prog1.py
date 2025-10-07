class MeetingRoom:
    def __init__(self, room_id, name, capacity):
        self.room_id = room_id
        self.name = name
        self.capacity = capacity
        self.is_booked = False

    def book_room(self):
        if not self.is_booked:
            self.is_booked = True
            return True
        return False

    def release_room(self):
        if self.is_booked:
            self.is_booked = False
            return True
        return False

class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, name, capacity, zoom_link):
        super().__init__(room_id, name, capacity)
        self.zoom_link = zoom_link

    def get_zoom_link(self):
        return self.zoom_link

class RegularMeetingRoom(MeetingRoom):
    def __init__(self, room_id, name, capacity):
        super().__init__(room_id, name, capacity)

class RoomManager:
    def __init__(self):
        self.rooms = []

    def add_room(self, room):
        self.rooms.append(room)

    def list_available_rooms(self):
        return [room for room in self.rooms if not room.is_booked]

    def find_room_by_id(self, room_id):
        for room in self.rooms:
            if room.room_id == room_id:
                return room
        return None
