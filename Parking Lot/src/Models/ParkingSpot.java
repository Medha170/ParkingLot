package Models;

import java.util.List;

public class ParkingSpot {
    private Long id;
    private int number;
    private List<VehicleType> vehicleTypes;
    private ParkingStatus status;
    private ParkingFloor parkingFloor;

    public ParkingSpot(Long id, int number, List<VehicleType> vehicleTypes, ParkingFloor parkingFloor) {
        this.id = id;
        this.number = number;
        this.vehicleTypes = vehicleTypes;
        this.status = ParkingStatus.EMPTY;
        this.parkingFloor = parkingFloor;
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

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
