package Service;

import Exceptions.InvalidGateException;
import Models.Gate;
import Models.Ticket;
import Models.VehicleType;
import Repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException{
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()){
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        return ticket;
    }
}
