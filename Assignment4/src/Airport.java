import java.util.ArrayList;
import java.util.List;

public class Airport{
    private String name;
    ArrayList<Aircraft> aircraft_vehicles= new ArrayList<Aircraft>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String newname) {
        this.name = newname;
    }

    @Override
    public String toString() {
        List<String> name_aircrafts= new ArrayList<>();
        for (Aircraft aircraft : aircraft_vehicles) {
            name_aircrafts.add(aircraft.getName());
        }
        return "Airoport: "+this.name + ", Aircrafts: " + name_aircrafts;
    }

    public void add_aircraft( Aircraft aircraft){
        aircraft_vehicles.add(aircraft);
        System.out.println(aircraft.getName() + " added to the " + getName());
        aircraft.In_which_airport=getName();
    }
    public void remove_aircraft(Aircraft aircraft){
        if (aircraft_vehicles.remove(aircraft)){
            System.out.println(aircraft.getName() + " removed from the " + getName());
        }else{
            System.out.println(aircraft.getName() + " is not founded in " + getName());
        }
        aircraft.In_which_airport=null;
    }
}
