package Bank;

public class Employee extends User {
    private String employeeId;
    private String name;
    private double basicSalary;

    public Employee(String username, String password, String employeeId, String name, double basicSalary) {
        super(username, password);
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public String calculateSalary(double perHour, String anyBonusesOrDeductions) {
        double perMonth = perHour * 160;

        double withBounuses = toggleOvertime(anyBonusesOrDeductions, perMonth);
     return "your monthly salary is: " + perMonth+ " including bonuses/deductions: "+ withBounuses;
    }
    // full philosifization
    public double toggleOvertime(String type, double amount){
        if (type.toLowerCase() == "overtime" ){
            return (amount) * 1.5;
        } else if (type.toLowerCase() == "bonus") {
            return amount * 3;
        } else if (type.toLowerCase() == "deduction") {
            return amount - 20;

        } else {
            return amount;
        }
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary ;
    }
}
