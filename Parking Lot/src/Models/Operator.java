package Models;

public class Operator {
    private Long emp_id;
    private int number;
    private String phoneNumber;
    private String Name;
    private String address;

    public Operator(Long emp_id, int number, String phoneNumber, String name, String address) {
        this.emp_id = emp_id;
        this.number = number;
        this.phoneNumber = phoneNumber;
        Name = name;
        this.address = address;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
