package structural.composite;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ManagerLeaf implements EmployeeComponent{
    private final long id;
    private final String name;
    private final String position;
    private final BigDecimal salary;

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Manager: " + name + ", id: " + id+ ", position: " + position + ", salary: " + salary);
    }


    @Override
    public BigDecimal showSalary() {
        return this.salary;
    }
}

