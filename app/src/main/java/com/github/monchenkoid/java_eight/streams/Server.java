package com.github.monchenkoid.java_eight.streams;

import android.support.annotation.NonNull;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ward: 2015-12-09
 * https://bitbucket.org/t_eric_ward/javaadventlambdasstreamsaggregates
 */
public class Server {

    private static final String TAG = Server.class.getSimpleName();
    public static final String HP = "HP";
    public static final String DELL = "Dell";
    public static final String IBM = "IBM";
    private String name;
    private String manufacturer;
    private Date purchaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getServerAge() {
        Date now = new Date(System.currentTimeMillis());
        return now.getYear() - purchaseDate.getYear();
    }

    public static void serverListExample() throws ParseException {

        List<Server> servers = createServersList();

        // First Example: Print the names of all the Dell servers in inventory
        String manufacturer = DELL;
        Log.i(TAG, "Here are the names of the servers made by " + manufacturer + " currently in inventory:");
        servers.stream()
                .filter(s -> s.getManufacturer().equalsIgnoreCase(manufacturer))
                .forEach(server -> Log.i(TAG, server.getName()));

        // Second Example: Print the names of all the servers older than 3 years old in inventory
        long age = 3;
        Log.i(TAG, "Here are the names of the servers older than " + age + " years in inventory:");
        servers.stream()
                .filter(s -> s.getServerAge() > age)
                .forEach(s -> Log.i(TAG, s.getName()));

        // Third Example:  Put all of the servers older than 3 years into a new List and print the names of the servers
        //                 in the new List:
        Log.i(TAG, "Here are the names of the servers older than " + age + " years in inventory again.");
        Log.i(TAG, "This time we extracted them into a separate list and then printed the names.");
        Log.i(TAG, "Same result as the previous example but with a different approach.");
        List<Server> oldServers = servers
                .stream()
                .filter(s -> s.getServerAge() > age)
                .collect(Collectors.toList());

        oldServers.stream()
                .forEach(s -> Log.i(TAG, s.getName()));

        // Fourth Example:  Calculate the average age of the servers in inventory:
        Log.i(TAG, "The average age of the servers in inventory (in years) is:");
        double averageAge = servers.stream()
                .mapToLong(Server::getServerAge)
                .average()
                .getAsDouble();
        Log.i(TAG, String.valueOf(averageAge));
    }

    @NonNull
    private static List<Server> createServersList() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // we'll keep servers in an ArrayList
        List<Server> servers = new ArrayList<>();
        // create several Servers to manipulate
        Server one = new Server();
        one.setName("web01");
        one.setManufacturer(DELL);
        one.setPurchaseDate(sdf.parse("2010-01-01"));
        servers.add(one);

        one = new Server();
        one.setName("db01");
        one.setManufacturer(HP);
        one.setPurchaseDate(sdf.parse("2013-01-01"));
        servers.add(one);

        one = new Server();
        one.setName("hr124");
        one.setManufacturer(IBM);
        one.setPurchaseDate(sdf.parse("2014-01-01"));
        servers.add(one);

        one = new Server();
        one.setName("eng16");
        one.setManufacturer(HP);
        one.setPurchaseDate(sdf.parse("2001-01-01"));
        servers.add(one);

        one = new Server();
        one.setName("eng64");
        one.setManufacturer(HP);
        one.setPurchaseDate(sdf.parse("2001-01-01"));
        servers.add(one);
        return servers;
    }
}
