class MeetingRoom:
    def __init__(self, room_id, capacity, location):
        self.room_id = room_id
        self.capacity = capacity
        self.location = location
        self.is_booked = False

    def book(self):
        self.is_booked = True

    def release(self):
        self.is_booked = False

class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, location, zoom_link):
        super().__init__(room_id, capacity, location)
        self.zoom_link = zoom_link

    def start_zoom_call(self):
        return f"Zoom call started at {self.zoom_link}"
class ArrayStore:
    def __init__(self):
        self.data = []

    def accept_input(self, input_list):
        if len(input_list) != 10:
            raise ValueError("Exactly 10 integers are required.")
        self.data = input_list.copy()

    def display_with_while(self):
        print("Displaying with while loop:")
        i = 0
        while i < len(self.data):
            print(self.data[i], end=' ')
            i += 1
        print()

    def display_with_for(self):
        print("Displaying with for loop:")
        for num in self.data:
            print(num, end=' ')
        print()

    def sort_array(self):
        self.data.sort()

    def count_occurrences(self, number):
        return self.data.count(number)

    def insert_at(self, number, position):
        if position < 0 or position > len(self.data):
            raise IndexError("Invalid position.")
        self.data.insert(position, number)

    def get_unique_elements(self):
        unique = []
        for num in self.data:
            if num not in unique:
                unique.append(num)
        return unique
