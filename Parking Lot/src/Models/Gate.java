package Models;

public class Gate {
    private Long id;
    private int number;
    private ParkingStatus parkingStatus;
    private GateType gateType;

    public Gate(Long id, int number) {
        this.id = id;
        this.number = number;
        this.parkingStatus = ParkingStatus.EMPTY;
        this.gateType = GateType.ENTRY;
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

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
