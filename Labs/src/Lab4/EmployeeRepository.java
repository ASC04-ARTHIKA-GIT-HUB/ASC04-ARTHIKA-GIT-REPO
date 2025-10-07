package Lab4;

import java.util.*;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.empNo == id) return e;
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        return employees.removeIf(e -> e.empNo == id);
    }
}
