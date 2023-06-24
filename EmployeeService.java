import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private final ArrayList<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
