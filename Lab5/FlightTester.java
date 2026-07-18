import java.util.Vector;

class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String toString() {
        return hour + ":" + minute;
    }
}

class Passenger {

    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Flight {

    private String id;
    private String destination;
    private Time depart;
    private Time arrival;
    private Vector<Passenger> passengerList;

    public Flight(String id, String destination, Time depart, Time arrival) {
        this.id = id;
        this.destination = destination;
        this.depart = depart;
        this.arrival = arrival;
        passengerList = new Vector<>();
    }

    public void addPassenger(Passenger p) {
        passengerList.add(p);
    }

    public void printInfo() {

        System.out.println("Flight No : " + id);
        System.out.println("Destination : " + destination);
        System.out.println("Departure : " + depart.getHour() + ":" + depart.getMinute());
        System.out.println("Arrival : " + arrival.getHour() + ":" + arrival.getMinute());
        System.out.println("Number of Passengers : " + passengerList.size());
    }
}

public class FlightTester {

    public static void main(String[] args) {

        Time dep = new Time(8, 10);
        Time arr = new Time(9, 00);

        Flight f = new Flight("PK-303", "Lahore", dep, arr);

        Passenger psg1 = new Passenger("Aariz", 30);
        Passenger psg2 = new Passenger("Arsham", 44);

        f.addPassenger(psg1);
        f.addPassenger(psg2);

        f.printInfo();
    }
}