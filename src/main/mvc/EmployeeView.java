package main.mvc;

public class EmployeeView {

    public void printEmployeeDetails(EmployeeModel employeeModel, int x)
    {
        System.out.println("EmployeeDetails of employee "+x);
        System.out.println("Employee's name="+employeeModel.getName());
        System.out.println("Employee's id="+employeeModel.getEmpId());
        System.out.println("Employee's designation="+employeeModel.getDesignation());
    }
}
