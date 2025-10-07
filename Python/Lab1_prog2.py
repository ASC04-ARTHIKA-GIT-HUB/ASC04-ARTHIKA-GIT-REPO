class Student:
    def __init__(self):
        self._student_id = None
        self._student_name = None
        self._city = None
        self._marks1 = None
        self._marks2 = None
        self._marks3 = None
        self._fee_per_month = None
        self._is_eligible_for_scholarship = None

    # Setter methods
    def set_student_id(self, student_id): self._student_id = student_id
    def set_student_name(self, student_name): self._student_name = student_name
    def set_city(self, city): self._city = city
    def set_marks1(self, marks1): self._marks1 = marks1
    def set_marks2(self, marks2): self._marks2 = marks2
    def set_marks3(self, marks3): self._marks3 = marks3
    def set_fee_per_month(self, fee_per_month): self._fee_per_month = fee_per_month
    def set_is_eligible_for_scholarship(self, is_eligible): self._is_eligible_for_scholarship = is_eligible

    # Getter methods
    def get_student_id(self): return self._student_id
    def get_student_name(self): return self._student_name
    def get_city(self): return self._city
    def get_marks1(self): return self._marks1
    def get_marks2(self): return self._marks2
    def get_marks3(self): return self._marks3
    def get_fee_per_month(self): return self._fee_per_month
    def get_is_eligible_for_scholarship(self): return self._is_eligible_for_scholarship

    # Other methods
    def get_annual_fee(self):
        return self._fee_per_month * 12

    def get_total_marks(self):
        return self._marks1 + self._marks2 + self._marks3

    def get_average(self):
        return self.get_total_marks() / 3

    def get_result(self):
        if self._marks1 > 60 and self._marks2 > 60 and self._marks3 > 60:
            return "pass"
        else:
            return "fail"

# Test Script
students = []

# Student 1
s1 = Student()
s1.set_student_id(1)
s1.set_student_name("Alice")
s1.set_city("Delhi")
s1.set_marks1(85)
s1.set_marks2(90)
s1.set_marks3(88)
s1.set_fee_per_month(2000.0)
s1.set_is_eligible_for_scholarship(True)
students.append(s1)

# Student 2
s2 = Student()
s2.set_student_id(2)
s2.set_student_name("Bob")
s2.set_city("Mumbai")
s2.set_marks1(70)
s2.set_marks2(65)
s2.set_marks3(60)
s2.set_fee_per_month(1800.0)
s2.set_is_eligible_for_scholarship(False)
students.append(s2)

# Student 3
s3 = Student()
s3.set_student_id(3)
s3.set_student_name("Charlie")
s3.set_city("Chennai")
s3.set_marks1(55)
s3.set_marks2(75)
s3.set_marks3(80)
s3.set_fee_per_month(2200.0)
s3.set_is_eligible_for_scholarship(True)
students.append(s3)

# Name of student with highest total marks
highest = max(students, key=lambda s: s.get_total_marks())
print("Student with highest total marks:", highest.get_student_name())

# Name and monthly fee of student with lowest fee
lowest_fee = min(students, key=lambda s: s.get_fee_per_month())
print("Student with lowest monthly fee:", lowest_fee.get_student_name(), lowest_fee.get_fee_per_month())

# Print details for each student
for s in students:
    print(f"Name: {s.get_student_name()}, Total Marks: {s.get_total_marks()}, Average: {s.get_average():.2f}, Result: {s.get_result()}, Scholarship: {s.get_is_eligible_for_scholarship()}")