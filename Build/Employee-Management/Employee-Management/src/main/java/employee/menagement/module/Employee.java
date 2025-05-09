package main.java.employee.menagement.module;

public class Employee {
    private Integer id;
    private String name;
    private String job_title;
    private Double salary;
    private Integer department;

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Integer id, String name, String job_title, Double salary, Integer department) {
        this.id = id;
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
