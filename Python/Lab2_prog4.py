def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(number):
        print(words[int(digit)])

class MeetingRoom:
    def __init__(self, room_id, capacity, floor):
        self.room_id = room_id
        self.capacity = capacity
        self.floor = floor
        self.bookings = []

    def add_booking(self, employee_id, meeting_date):
        self.bookings.append({'employee_id': employee_id, 'meeting_date': meeting_date})

class ZoomRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

class RegularRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor):
        super().__init__(room_id, capacity, floor)

class RoomManager:
    def __init__(self):
        self.rooms = []

    def add_room(self, room):
        self.rooms.append(room)

    def find_room_by_id(self, room_id):
        for room in self.rooms:
            if room.room_id == room_id:
                return room
        return None

    def get_bookings_by_date(self, meeting_date):
        bookings = []
        for room in self.rooms:
            for booking in room.bookings:
                if booking['meeting_date'] == meeting_date:
                    bookings.append({'room_id': room.room_id, 'employee_id': booking['employee_id']})
        return bookings

print_digits_in_words(375)

manager = RoomManager()

zoom_room = ZoomRoom('Z001', 15, '1st Floor', 'ZD001', 'ZA001')
regular_room = RegularRoom('R001', 10, '2nd Floor')

manager.add_room(zoom_room)
manager.add_room(regular_room)

zoom_room.add_booking('EMP100', '2025-10-07')
regular_room.add_booking('EMP101', '2025-10-07')

print(manager.get_bookings_by_date('2025-10-07'))
