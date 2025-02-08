import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private List<Aircraft> aircraftVehicles;

    public Airport(String name) {
        this.name = name;
        this.aircraftVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircraftVehicles() {
        return aircraftVehicles;
    }

    public void addAircraft(Aircraft aircraft) {
        getAircraftVehicles().add(aircraft);
        aircraft.setAirport(this);
    }

    public void removeAircraft(Aircraft aircraft) {
        getAircraftVehicles().remove(aircraft);
        aircraft.setAirport(null);
    }

    @Override
    public String toString() {
        return "Airport: " + getName() + ", Aircrafts: " + getAircraftVehicles();
    }

    public Passenger searchPassenger(String aircraftName, int seatNumber) {
        for (Aircraft aircraft : getAircraftVehicles()) {
            if (aircraft.getName().equalsIgnoreCase(aircraftName)) {
                for (Passenger passenger : aircraft.getPassengers()) {
                    if (passenger.getSeatNumber() == seatNumber) {
                        return passenger;
                    }
                }
            }
        }
        return null;
    }
}
