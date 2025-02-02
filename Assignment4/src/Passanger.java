public class Passanger {
    private String passengerName;
    String On_which_aircraft;

    public Passanger(String passengerName) {
        this.passengerName = passengerName;
        this.On_which_aircraft = null;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public String toString() {
        return "Passenger" + passengerName + " is assigned to " + On_which_aircraft;
    }

    public void assingAircraft(Aircraft aircraft) {
        if (this.On_which_aircraft == null) {
            On_which_aircraft = aircraft.getName();
            aircraft.add_Passenger(this);
            System.out.println(getPassengerName() + " is assigned to " + On_which_aircraft + "aircraft.");
        }else{
            System.out.println(getPassengerName()+ " is already assigned to " + On_which_aircraft + "aircraft.");
        }
    }
    public void removeAircraft(Aircraft aircraft) {
        if (On_which_aircraft != null) {
            On_which_aircraft = null;
            aircraft.remove_Passenger(this);
            System.out.println(getPassengerName() + " is left " + On_which_aircraft + "aircraft.");
        }else{
            System.out.println(getPassengerName()+ " is not assigned to aircraft.");
        }
    }
}
