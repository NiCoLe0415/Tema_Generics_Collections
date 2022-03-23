package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //creare studenti
        Student student1=new Student("student1", 9.45);
        Student student2=new Student("student2", 6.45);
        Student student3=new Student("student3", 8.93);
        Student student4=new Student("student4", 2.35);
        Student student5=new Student("student5", 4.50);
        Student student6=new Student("Ionel", 8.49);
        Student student7=new Student("Vasile", 7.5);

        //adaugare in lista a studentilor
        List<Student> listOfStudents=new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);
        listOfStudents.add(student7);
        //adaugare studenti in hashmap si treeset
        addStudentsAfterGrade(listOfStudents);
        //afisare studenti
        listStudentsAfterGrade();
        System.out.println("\n");
        System.out.println("======Partea a doua======");

        int length = 5;
        //lista de stringuri
        MyList<String> strArray = new MyList(length);
        try{
            strArray.add("Buna ziua");
            strArray.add("Buna ziua");
            strArray.add("Buna ziua");
            strArray.add("hello");
            strArray.add("hello");
            strArray.add("hello");
        }catch(ArrayIndexOutOfBoundsException e){
            //daca exista prea multe adaugari, fata de dimensiunea vectorului, se va afisa mesajul:
            System.out.println("Sunt mult prea multe elemente de introdus!");
        }
        strArray.print();

        //lista de studenti
        System.out.println("Adaugare studenti in lista");
        MyList<Student> objStudents = new MyList(length);
        try{
            objStudents.add(student1);
            objStudents.add(student2);
            objStudents.add(student3);
            objStudents.add(student4);
            objStudents.add(student5);
            objStudents.print();
        }catch(ArrayIndexOutOfBoundsException e){
            //daca exista prea multe adaugari, fata de dimensiunea vectorului, se va afisa mesajul:
            System.out.println("Sunt mult prea multe elemente de introdus!");
        }

        //cautare element
        if(strArray.lookup("Buna ziua")){
            System.out.println("Exista elementul cautat!");
        }else {
            System.out.println("Nu exista elementul cautat!");
        }


        if(objStudents.lookup(student1)){
            System.out.println("Obiectul cautat a fost gasit!");
        }else {
            System.out.println("Obiectul cautat NU a fost gasit!");
        }



    }
    static Map<Integer, TreeSet<Student>> studentsFilter=new HashMap<>();
    //adaugare studenti in hashmap si treeset
    public static void addStudentsAfterGrade(List<Student>listOfStudents)
    {


        for(double i=10.5;i>=0.5;--i){
            TreeSet<Student>studentsTreeSet=new TreeSet<>();
            for(Student students:listOfStudents){
                if(students.getGrade()<i&& students.getGrade()>=i-1){
                    studentsTreeSet.add(students);

                }
            }
            studentsFilter.put((int) (i-0.5), studentsTreeSet);
        }


    }
    //afisare hashmap Studenti
    public static void listStudentsAfterGrade(){
        for(var x:studentsFilter.entrySet()){
            System.out.print(x.getKey()+" [");
            int nr=0;
            for(var y : x.getValue()){
                nr++;
                if(nr<=x.getValue().size()-1){
                    System.out.print(y.getName()+": "+y.getGrade()+", ");
                }
                else{
                    System.out.print(y.getName()+": "+y.getGrade());
                }
            }
            System.out.println("] ");
        }
    }


}
