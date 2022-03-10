package com.company;

public class Client {
    private String name;
    private String peacItemClient;
    private int amountOfItem;


    private Client (){

    }


    public Client(String name, String peacItemClient, int amountOfItem){
        this.name = name;
        this.peacItemClient = peacItemClient;
        this.amountOfItem = amountOfItem;

    }

    public String getName (){
        return name;
    }
    public void setName ( String name){
        this.name = name;
    }
    public String getPeacItemClient (){
        return peacItemClient;
    }
    public void setPeacItemClient(String peacItemClient){
        this.peacItemClient = peacItemClient;
    }
    public int getAmountOfItem (){
        return amountOfItem;
    }
    public void setAmountOfItem(int amountOfItem){
        this.amountOfItem = amountOfItem;
    }
    @Override
    public String toString (){
        return "name: " + name +
                ", купил: " + peacItemClient +
                ", кол-во: " + amountOfItem;
    }


}
