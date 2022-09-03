package main.mvc;

import java.util.*;

public class MVCMainController {
    public static void main(String[] args) {
        EmployeeStaticDetails employeeStaticDetails = new EmployeeStaticDetails();

        ArrayList<EmployeeModel> empList = employeeStaticDetails.getEmployeeStaticDetails();
        int i = 1;
        for (EmployeeModel x : empList) {

            EmployeeView employeeView = new EmployeeView();
            EmployeeController employeeController = new EmployeeController(employeeView, x);
            employeeController.getEmployeeDetails(i);
            i++;

        }


    }
}
