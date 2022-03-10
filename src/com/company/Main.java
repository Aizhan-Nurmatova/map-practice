package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Client> clients = new LinkedList<>(List.of(new Client("Maks", "Samsung", 4),
                new Client("Jeny", "Toshiba", 15),
                new Client("Tom", "Panasonic", 8),
                new Client("Frenk", "MacBook", 3),
                new Client("Battery", "Lenovo", 1),
                new Client("Henks", "Acer", 7),
                new Client("Aleksei", "Hp", 18),
                new Client("Sasha", "Sony", 4)));

        LinkedList<Client> startsABC = new LinkedList<>();
        for (Client client : clients) {
            if (client.getName().startsWith("A") || client.getName().startsWith("B") || client.getName().startsWith("C")) {
                startsABC.add(client);
            }
        }
        LinkedList<Client> clients1 = new LinkedList<>();
        for (Client client : clients) {
           if (client.getAmountOfItem() > 5){
               clients1.add(client);
           }
        }

          test(clients1);
 //       test(startsABC);
    }
    public static void test (List<Client> clients){
        for (Client a : clients){
            System.out.println(a);
        }


    }

}



