package structural.composite;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DeveloperLeaf implements EmployeeComponent{
    private final long id;
    private final String name;
    private final String position;
    private final BigDecimal salary;

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Developer: " + name + ", id: " + id+ ", position: " + position + ", salary: " + salary);
    }


    @Override
    public BigDecimal showSalary() {
        return this.salary;
    }
}

