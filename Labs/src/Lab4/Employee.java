package Lab4;

public class Employee {
        int empNo;
        String firstName;
        String lastName;
        String city;
        double salary;

        public Employee(int empNo, String firstName, String lastName, String city, double salary) {
            this.empNo = empNo;
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.salary = salary;
        }

        public void displayEmployee() {
            System.out.println("EmpNo: " + empNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("City: " + city);
            System.out.println("Salary: $" + salary);
        }
    }


