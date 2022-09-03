package main.mvc;

import java.util.*;

public class EmployeeStaticDetails {


    public ArrayList<EmployeeModel> getEmployeeStaticDetails() {
        ArrayList<EmployeeModel> employeeList = new ArrayList<>();

        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName("Elon Musk");
        employeeModel.setEmpId("007");
        employeeModel.setDesignation("Founder and CEO");

        EmployeeModel employeeModel2 = new EmployeeModel();
        employeeModel2.setName("Larry Page");
        employeeModel2.setEmpId("123");
        employeeModel2.setDesignation("Founder");

        employeeList.add(employeeModel);
        employeeList.add(employeeModel2);

        return employeeList;
    }
}
