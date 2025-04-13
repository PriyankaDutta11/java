package main.java.employee.menagement.module;

public class Department {

    private  Integer id;

    private String department_name;

    private String department_category;

    private  Integer max_salary;

    private  Integer min_salary;

    public Department() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_category() {
        return department_category;
    }

    public void setDepartment_category(String department_category) {
        this.department_category = department_category;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Department(Integer id, String department_name, String department_category, Integer max_salary, Integer min_salary) {
        this.id = id;
        this.department_name = department_name;
        this.department_category = department_category;
        this.max_salary = max_salary;
        this.min_salary = min_salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", department_category='" + department_category + '\'' +
                ", max_salary=" + max_salary +
                ", min_salary=" + min_salary +
                '}';
    }
}
