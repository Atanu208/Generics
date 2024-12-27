import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void deleteBike(List<? extends Bike> b1, Bike b2)
    {
        b1.remove(b2);
        System.out.println("Bike removed");
    }
    public static void addBike(List <? super Bullet> b1)
    {
        b1.add(new Bullet("Classic"));
        System.out.println("Bike added");
    }
    public static void printItem(List<?>list)
    {
        for (Object i:list) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
       List<Vehicle> v1=new ArrayList<Vehicle>();
       List<Bullet> b1=new ArrayList<Bullet>();
       addBike(v1);
       addBike(b1);
        printItem(v1);
        printItem(b1);
        Bullet bullet=b1.get(0);
        deleteBike(b1,bullet);
    }
}

//base class
class Vehicle {
    String name;
    Vehicle(String name)
    {
        this.name=name;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}

//subclass
class Bike extends Vehicle
{
    String name;
    Bike(String name) {
        super(name);
    }
}
//subclass
class Car extends Vehicle
{
    String name;
    Car(String name) {
        super(name);
    }
}
//subclass
class Bullet extends Bike{

    Bullet(String name) {
        super(name);
    }
}