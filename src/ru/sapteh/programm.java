package ru.sapteh;

<<<<<<< HEAD
public class programm {
    public static void main(String[] args) {
        System.out.println("hellow world");
=======
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("введите имя");
        String name = scan.nextLine();
        System.out.println("введите возраст");
        int age = scan.nextInt();
        System.out.println("введите дату");
        int date = scan.nextInt();
        Person person = new Person(name, age, date);
        String s ="";
        if (personIsEmpti(person).equals(s)) {
            System.out.println("объект:" + person.getClass() + "инициализирован");
            System.out.println(person.toString());
        } else {
            System.out.println(personIsEmpti(person));
        }
    }
    public static String personIsEmpti (Person person){
        String nE="";
        String aE="";
        String dE="";
        String err;
        if ((person.getName()+person.getDate()+person.getAge())!=null){

            if (person.getName()==""){
                nE="имени нету ";
            } if (person.getAge()==0){
                aE="возроста нету ";
            } if (person.getDate()==0){
                dE="даты нету ";
            }
            err = nE+aE+dE ;
            return err;
        }



        return "";
>>>>>>> 0f34933... create class
    }

}
