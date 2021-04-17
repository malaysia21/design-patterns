package structural.composite;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        EmployeeComponent developer100 = new DeveloperLeaf(100, "Tom", "Senior Developer", new BigDecimal(2000.));
        EmployeeComponent developer101 = new DeveloperLeaf(101, "Kate", "Developer", new BigDecimal(1000.));

        DirectorComposite devDirector = new DirectorComposite(1000, "Matt", "Dev Director", new BigDecimal(20000.));
        devDirector.addEmployee(developer100);
        devDirector.addEmployee(developer101);

        EmployeeComponent manager200 = new ManagerLeaf(200, "Tom", "Manager", new BigDecimal(5000.));
        EmployeeComponent manager201 = new ManagerLeaf(201, "Kate", "Senior Manager", new BigDecimal(10000.));

        DirectorComposite manDirector = new  DirectorComposite(1001, "John", "Manager Director", new BigDecimal(20000.));
        manDirector.addEmployee(manager200);
        manDirector.addEmployee(manager201);

        DirectorComposite mainDirector = new DirectorComposite(1, "John", "Director", new BigDecimal(30000.));
        mainDirector.addEmployee(devDirector);
        mainDirector.addEmployee(manDirector);


        mainDirector.showEmployeeDetails();
        System.out.println("Total salary for employee " + mainDirector.showSalary());
    }
}
