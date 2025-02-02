import java.util.ArrayList;
import java.util.List;

public class Aircraft{
    private String name;
    private int max_number_of_passengers;
    String In_which_airport;
    ArrayList<Passanger> Passangers=new ArrayList<Passanger>();

    public Aircraft(String name, Integer max_number_of_passengers) {
        this.name = name;
        this.max_number_of_passengers = max_number_of_passengers;
    }

    public String getName(){
        return name;
    }
    public void setName(String newname) {
        this.name = newname;
    }
    public int getMax_number_of_passengers(){
        return max_number_of_passengers;
    }
    public void setMax_number_of_passengers(int newmax_number_of_passengers) {
        max_number_of_passengers = newmax_number_of_passengers;
    }
    public void add_Passenger(Passanger passanger) {
        if (!Passangers.contains(passanger)) {
            Passangers.add(passanger);
            System.out.println(passanger.getPassengerName() + "added to the " + this.getName());
            passanger.On_which_aircraft = this.getName();
        }else{
            System.out.println(passanger.getPassengerName() + " is already in the " + this.getName());
        }
    }
    public void remove_Passenger(Passanger passanger){
        if(Passangers.contains(passanger)) {
            Passangers.remove(passanger);
            System.out.println(passanger.getPassengerName() + "removed from the " + getName());
            passanger.On_which_aircraft = null;
        }else{
            System.out.println(passanger.getPassengerName() + " is not in the " + getName());
        }
    }
    @Override
    public String toString(){
        List<String> name_passengers =new ArrayList<>();
        for(Passanger passanger : Passangers){
            name_passengers.add(passanger.getPassengerName());
        }
        return "Aircraft: "+ getName()+ ", Max. number of passengers: "+ max_number_of_passengers + ", Location: " + In_which_airport + ", Passengers: " + name_passengers;
    }
}

