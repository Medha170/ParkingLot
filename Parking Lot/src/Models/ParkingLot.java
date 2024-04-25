package Models;

import java.util.List;

public class ParkingLot {
    private Long id;
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingStatus status;

    public ParkingLot(Long id, List<ParkingFloor> floors, List<Gate> gates) {
        this.id = id;
        this.floors = floors;
        this.gates = gates;
        this.status = ParkingStatus.EMPTY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }
}
