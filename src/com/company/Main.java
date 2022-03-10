package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> arrayList = new ArrayList<>(List.of(new Student("Barchynai ", 29, "Java-5"),
                new Student("Chunara ", 33, "Java-5"),
                new Student("Aichurok", 28, "Java-4"),
                new Student("Kunzaada", 25, "Java-5"),
                new Student("Aziza", 28, "Java-5"),
                new Student("Tologon", 26, "Java-5"),
                new Student("Klara", 30, "Java-4"),
                new Student("Dauvali", 30, "Java-4"),
                new Student("Makast", 31, "JS"),
                new Student("Kubat", 16, "JS"),
                new Student("Nurullo", 19, "JS3"),
                new Student("Muhamed", 25, "JS3"),
                new Student("Jamal apa", 65, "Java-5"),
                new Student("Nurgazy", 19, "JS2"),
                new Student("Dilbara", 19, "Java-5"),
                new Student("Ulanskie", 27, "JS2"),
                new Student("Almaz", 20, "JS2"),
                new Student("Dinara", 15, "JS"),
                new Student("Kanat", 23, "JS"),
                new Student("Kurmanbek", 23, "JS")));

        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();
        ArrayList<Student> ageFilter = new ArrayList<>();
        ArrayList<Student> nameFilter = new ArrayList<>();
        ArrayList<Student> moreThanThirty = new ArrayList<>();
        ArrayList<Student> studentsNameWithK = new ArrayList<>();


        for (Student student : arrayList) {
            if (student.getGroup().contains("Java")){
                java.add(student);
            }else {
                js.add(student);
            }
        }

        for (Student student : arrayList) {
            if (student.getAge() > 18 && student.getAge() < 25) {
                ageFilter.add(student);
            }
        }

        for (Student student : arrayList) {
            if (student.getName().startsWith("A")){
                nameFilter.add(student);
            }

        }

        for (Student student : arrayList) {
            if (student.getGroup().contains("Java") && student.getAge() > 30) {
                moreThanThirty.add(student);
            }
        }

        for (Student student : arrayList) {
            if (student.getGroup().contains("JS") && student.getName().contains("K")){
                studentsNameWithK.add(student);
            }
        }

        arrayList.removeIf(x ->x.getAge()<18);
//        soutList((ArrayList<Student>) arrayList);

        for (Student student : arrayList) {
            System.out.println(student);
        }


//        soutList(java);
//        soutList(js);
//        soutList(studentsNameWithK);

    }

    public static void soutList(ArrayList<Student> students){
        for (Student student : students) {
            System.out.println(student);
        }


        }
    }



