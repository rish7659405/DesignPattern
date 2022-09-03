package main.mvc;

public class EmployeeController {
    private EmployeeModel employeeModel;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeView employeeView, EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
        this.employeeView = employeeView;
    }

    public void setEmployeeName(String name) {
        employeeModel.setName(name);
    }

    public String getEmployeeName() {
        return employeeModel.getName();
    }

    public void setEmployeeId(String id) {
        employeeModel.setEmpId(id);
    }

    public String getEmployeeId() {
        return employeeModel.getEmpId();
    }

    public void setEmployeeDesignation(String designation) {
        employeeModel.setDesignation(designation);
    }

    public String getEmployeeDesignation() {
        return employeeModel.getDesignation();
    }

    public void getEmployeeDetails(int x) {
        employeeView.printEmployeeDetails(employeeModel,x);
    }
}
