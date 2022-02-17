package controller;

import model.Employee;

public class Method {
    public static void displayEmployee(Employee[] employees){
        for (Employee e: employees
             ) {
            System.out.println(e);
        }
    }

    public static Employee[] addNewEmployee(Employee[] employees,
                                            Employee newEmployee){
        // khai bao mang moi
        Employee[] newEmployeeList = new Employee[employees.length+1];
        // copy mang cu sang mang moi
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        // gan nv moi vao phan tu cuoi
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }
}
