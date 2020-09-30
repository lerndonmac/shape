package ru.sapteh;
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
        String err="";
            if (person.getName()==""){
                err += "имени нету ";
            } if (person.getAge()==0){
                err+="возроста нету ";
            } if (person.getDate()==0){
                err+="даты нету ";
            }
            if (err.equals("")){
            return err;}
        return "";
    }

}
