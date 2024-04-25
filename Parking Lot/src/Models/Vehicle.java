package Models;

public class Vehicle {
    private Long id;
    private int number;
    private VehicleType vehicleType;
    private  User user;

    public Vehicle(Long id, int number, VehicleType vehicleType, User user) {
        this.id = id;
        this.number = number;
        this.vehicleType = vehicleType;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
