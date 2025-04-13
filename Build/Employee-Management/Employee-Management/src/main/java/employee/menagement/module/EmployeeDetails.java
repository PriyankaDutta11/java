package main.java.employee.menagement.module;

public class EmployeeDetails {
    private Integer id;

    private  Integer uid;

    private String address;

    private String  city;

    private String state;

    private Integer pin;

    private String   email;

    public EmployeeDetails(Integer id, Integer uid, String address, String city, Integer pin, String email) {
        this.id = id;
        this.uid = uid;
        this.address = address;
        this.city = city;
        this.pin = pin;
        this.email = email;
    }

    public EmployeeDetails() {
        super();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPin(int department) {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", uid=" + uid +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", pin=" + pin +
                ", email='" + email + '\'' +
                '}';
    }


}
