package com.day7;

import java.io.*;
 
class Flight implements Serializable {

	private int flightId;
    private String name;
    private String source;
    private String destination;
 
    public Flight(int flightId, String name, String source, String destination) {
        this.flightId = flightId;
        this.name = name;
        this.source = source;
        this.destination = destination;
    }
 
    public int getFlightId() {
        return flightId;
    }
 
    public String getName() {
        return name;
    }
 
    public String getSource() {
        return source;
    }
 
    public String getDestination() {
        return destination;
    }
}
 
public class FlightSerializationDemo {
 
    public static void main(String[] args) {
 
        try {
 
            
            Flight f1 = new Flight(101, "Indigo", "Delhi", "Mumbai");
 
           
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("Flight.dat"));
 
            oos.writeObject(f1);
            oos.close();
 
            
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("Flight.dat"));
 
            Flight f2 = (Flight) ois.readObject();
            ois.close();
 
            
            System.out.println("Flight Details:");
            System.out.println("Flight ID: " + f2.getFlightId());
            System.out.println("Name: " + f2.getName());
            System.out.println("Source: " + f2.getSource());
            System.out.println("Destination: " + f2.getDestination());
 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred");
        }
    }
}
