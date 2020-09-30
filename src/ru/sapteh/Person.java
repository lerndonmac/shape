package ru.sapteh;

public class Person {
    private String name;
    private int age;
    private int date;
    public Person (String name, int age, int date){
        this .name = name;
        this .age = age;
        this .date = date;
    }
    public Person (String name){
        this .name = name;
    }
    public Person (String name, int age){
        this .name = name;
        this .age = age;
    }
    public void setName (String name){
      this.name = name;
    }
    public void setAge (int age){
        this.age=age;
    }
    public void setDate (int date){
        this.date=date;
    }
    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }
    public int getDate (){
        return date;
    }
    @Override
    public String toString (){
        return "name: "+getName()+"\n"+
                "age: "+getAge()+"\n"+
                "date: "+getDate();
    }
}