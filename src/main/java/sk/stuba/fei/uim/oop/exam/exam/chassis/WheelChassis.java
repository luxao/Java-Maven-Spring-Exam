package sk.stuba.fei.uim.oop.exam.exam.chassis;

import lombok.Data;

@Data
public class WheelChassis extends Chassis {
    private int numberOfWheels;

    public WheelChassis(long id, String name, double capacity, int rotationSpeed, int maxSpeed, int numberOfWheels) {
        super(id, name, capacity, rotationSpeed, maxSpeed);
        setNumberOfWheels(numberOfWheels);
    }


}
