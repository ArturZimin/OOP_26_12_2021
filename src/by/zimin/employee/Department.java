package by.zimin.employee;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employee = new Employee[5];
    private int temp = 0;


    public Department(String name, Employee employee) {
        this.name = name;
        this.employee[temp] = employee;
        temp++;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void addEmployee(Employee employee) {

        if (temp <= 4) {
            this.employee[temp] = employee;
            temp++;
        }
    }

    public void getEmployees(Employee name) {
        for (int i = 0; i < this.employee.length; i++) {
            System.out.println(this.employee[i]);
        }
    }

    public void removeEmployee(Employee name) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].equals(name)) {
                this.employee[i] = null;
            }
        }
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employee=" + Arrays.toString(employee) +
                '}';
    }
}
