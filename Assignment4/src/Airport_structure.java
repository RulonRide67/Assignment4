public class Airport_structure {
    public static void main(String[] args) {
        Airport Dubai = new Airport("Dubai");
        Aircraft M16 = new Aircraft("M16", 500);
        Dubai.add_aircraft(M16);
        Passanger Madiyar = new Passanger("Madiyar");
        System.out.println(Dubai.toString());
        System.out.println(M16.toString());
    }
}

