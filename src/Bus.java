package ooo.part4.transport;

import java.util.concurrent.ThreadLocalRandom;
public class Bus extends Transport implements Compating {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
        {

            @Override
            public void startMovement () {
            System.out.printf("Bus %s %s started moving",
                    this.getBrand(),
                    this.getModel());
        }

            @Override
            public void stopMovement () {
            System.out.printf("Bus %s %s started moving",
                    this.getBrand(),
                    this.getModel());
        }

            @Override
            public void pitStop () {
            System.out.printf("Bus %s %s performed pit-stop",
                    this.getBrand(),
                    this.getModel());
        }

            @Override
            public int getBestLapTime () {
            retutn ThreadLocal (Random.current().nextInt(origin:1, bound:100));{

                public int getMaxSpeed () {
                retutn ThreadLocal (Random.current().nextInt(origin:1, bound:400)); {
                }
            }
            }