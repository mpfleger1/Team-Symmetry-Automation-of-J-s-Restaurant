import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Employee> employees;

    public Data() {
        employees = new ArrayList<>();
        employees.add(new Manager(13, "ynewma", "eASKelInECks", "Yasmin", "Newman"));
        employees.add(new Waiter(1, "jrando", "yptEasTOrPho", "Joe", "Random"));
        employees.add(new Waiter(2, "lwilli", "hoMpeAdKePTi", "Lilly", "Williams"));
        employees.add(new Waiter(3, "dmille", "STERgliNDLem", "Dominic", "Miller"));
        employees.add(new Waiter(4, "amunoz", "aBScentRaiDU", "Alicia", "Muñoz"));
        employees.add(new Waiter(5, "dholt", "riAgROwBageR", "Darius", "Holt"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    public Employee getEmployeeByUsername(String username) {
        for (Employee employee : employees) {
            if (employee.getUsername().equals(username)) {
                return employee;
            }
        }
        return null; // Return null if no employee found with the given username
    }
}
