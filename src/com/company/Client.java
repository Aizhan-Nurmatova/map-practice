package com.company;

public class Client {

    private String name;
    private String peakItemClient;
    private int amount;

    public Client(String name, String peakItemClient, int amount) {
        this.name = name;
        this.peakItemClient = peakItemClient;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeakItemClient() {
        return peakItemClient;
    }

    public void setPeakItemClient(String peakItemClient) {
        this.peakItemClient = peakItemClient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", peakItemClient='" + peakItemClient + '\'' +
                ", amount=" + amount +
                '}';
    }
}
