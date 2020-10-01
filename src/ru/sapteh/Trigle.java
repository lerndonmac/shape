package ru.sapteh;

import ru.sapteh.Shape;

public class Trigle extends Shape {
    private double linea;
    private double lineb;
    private double linec;
    private double hi;

    public Trigle(int x,int y,  String color , double linea , double lineb, double linec, double hi){
        super(x,y,color);
        this.linea = linea;
        this.lineb = lineb;
        this.linec = linec;
        this.hi = hi;

    }

    @Override
    public String drow(){
        return "Drow tringle";
    }

    @Override
    public double area() {
        return (linea/2 * hi);
    }
    @Override
    public String toString(){
        return "цвет: "+super.getColor()+"\n"+
                "координаты: "+super.getX()+","+super.getY()+"\n"+
                "площадь: "+area();

    }
}
