package OOP;


class vehical {
    public void changeGear(int gear) {

    }

}

public class mainvehicle {
    public static void main(String[] args) {
        vehical bicycle = new Bicycle();
        vehical bike = new Bike();
        vehical car = new Car();
        bicycle.changeGear(5);
        bike.changeGear(1);
        car.changeGear(4);


    }

}

class Bicycle extends vehical {
    public static final int MAX_GEAR = 2;
    public int currentGear = 1;
    public void changeGear (int gear) {
        if (gear >= 1 && gear < MAX_GEAR) {
            this.currentGear = gear;
            System.out.println("Car gear changed to " + gear);
        } else {
            System.out.println("Invalid gear for bicycle");
        }

    }
}

class Bike extends vehical {
    public static final int MAX_GEAR = 5;
    public int currentGear = 1;

    public void changeGear(int gear) {
        if (gear >= 1 && gear < MAX_GEAR) {
            this.currentGear = gear;
            System.out.println("Car gear changed to " + gear);
        } else {
            System.out.println("Invalid gear for bike");
        }
    }
}

class Car extends vehical {
    public static final int MAX_GEAR = 7;
    public int currentGear = 1;

    public void changeGear(int gear) {
        if (gear >= 1 && gear < MAX_GEAR) {
            this.currentGear = gear;
            System.out.println("Car gear changed to " + gear);
        } else {
            System.out.println("Invalid gear for Car");
        }

    }


}

