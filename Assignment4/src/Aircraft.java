import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String name;
    private int maxPassengers;
    private Airport airport;
    private List<Passenger> passengers;

    public Aircraft(String name, int maxPassengers) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Airport getAirport() {
        return airport;
    }
    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (getPassengers().size() < getMaxPassengers()) {
            getPassengers().add(passenger);
            passenger.setAircraft(this);
        } else {
            System.out.println("Aircraft is full! Cant add more passengers");
        }
    }

    public void removePassenger(Passenger passenger) {
        getPassengers().remove(passenger);
        passenger.setAircraft(null);
    }

    @Override
    public String toString() {
        return "Aircraft: " + getName() + " Max Passengers: " + getPassengers();
    }
}
