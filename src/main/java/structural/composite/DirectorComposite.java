package structural.composite;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class DirectorComposite implements EmployeeComponent {

    private final long id;
    private final String name;
    private final String position;
    private final BigDecimal salary;

    private List<EmployeeComponent> childEmployeeList = new ArrayList<>();


    @Override
    public void showEmployeeDetails() {
        System.out.println("Director: " + name + ", id: " + id+ ", position: " + position + ", salary: " + salary);

        for (EmployeeComponent employeeComponent : childEmployeeList) {
            employeeComponent.showEmployeeDetails();
        }
    }

    @Override
    public BigDecimal showSalary() {
        BigDecimal totalSalary = this.salary;
        for (EmployeeComponent employeeComponent : childEmployeeList) {
            totalSalary = totalSalary.add(employeeComponent.showSalary());
        };
       return totalSalary;
    }

    public void addEmployee(EmployeeComponent emp)
    {
        childEmployeeList.add(emp);
    }

    public void removeEmployee(EmployeeComponent emp)
    {
        childEmployeeList.remove(emp);
    }
}
