import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {
    public Car (String brand, String model, float engineVolume) {
        super (brand, model, engineVolume);
    }
    @Override
    public void startMovement() {
        System.out.printf("Car %s %s started moving",
                this.getBrand(),
                this.getModel());

        @Override
        public void stopMovement() {
            System.out.printf("Car %s %s stopped moving",
                    this.getBrand(),
                    this.getModel());

            @Override
            public void pitStop() {
                System.out.printf("Car %s performed pit-stop",
                        this.getBrand(),
                        this.getModel());

                @Override
                public int getBestLapTime() {
                    return ThreadLocalRandom.current().nextInt(1, 100);

                    @Override
                    public int getMaxSpeed () {
                        return ThreadLocalRandom.current().nextInt(1, 400);
                    }
                }