package sk.stuba.fei.uim.oop.exam.exam.chassis;

import lombok.Data;

@Data
public class CrawlerChassis extends Chassis {

    private double width;


    public CrawlerChassis(long id, String name, double capacity, int rotationSpeed, int maxSpeed,double width) {
        super(id, name, capacity, rotationSpeed, maxSpeed);
        setWidth(width);
    }
}
