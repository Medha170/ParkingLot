package Models;

import java.util.List;

public class ParkingFloor {
    private Long id;
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingStatus status;

    public ParkingFloor(Long id, int number, List<ParkingSpot> parkingSpots) {
        this.id = id;
        this.number = number;
        this.parkingSpots = parkingSpots;
        this.status = ParkingStatus.EMPTY;
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

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }
}
