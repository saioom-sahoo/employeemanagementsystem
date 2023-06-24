import java.util.Scanner;

public class EmployeeView {
    private final EmployeeService employeeService;
    private Scanner scanner;

    public EmployeeView() {
        employeeService = new EmployeeService();
        scanner = new Scanner(System.in);
    }

    public void home() {
        int choice;
        do {
            System.out.println("Welcome to the employee Page");
            System.out.println("Press 1>> Add Employee");
            System.out.println("Press 2>> View Employee");
            System.out.println("Press 3>> For Exit");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showEmployee();
                    break;
                case 3:
                    System.out.println("Thanks For Using app");
                    continue;

                default:
                    System.out.println("Invalid Option !!!");
                    continue;
            }
        } while (choice != 3);
    }

    private void addEmployee() {
        System.out.println("Enter Employee Name");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Employee id");
        int employeeId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Employee Salary");
        double employeeSalary = Double.parseDouble(scanner.nextLine());

        var employee = new Employee(employeeId, employeeName, employeeSalary);
        employeeService.addEmployee(employee);
    }

    private void showEmployee() {
        var employees = employeeService.getEmployees();
        for (var e : employees) {
            System.out.println("Id: " + e.getEmployeeId());
            System.out.println("Name: " + e.getEmployeeName());
            System.out.println("Name: " + e.getEmployeeSalary());
        }
    }
}
