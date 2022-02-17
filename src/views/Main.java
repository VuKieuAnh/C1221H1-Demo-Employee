package views;

import controller.Method;
import model.Employee;
import model.ParttimeEmployee;

import java.util.Scanner;


public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[0];
        Employee hieu = createNewEmployee();
        employees = Method.addNewEmployee(employees, hieu);
        Method.displayEmployee(employees);
    }

    public static Employee createNewEmployee(){
        System.out.println("Moi ban nhap vao so gio lam viec");
        Scanner scanner = new Scanner(System.in);
        double workHour = scanner.nextDouble();
        Employee employee = new ParttimeEmployee(workHour);
        return employee;
    }
}
