package sk.stuba.fei.uim.oop.exam.exam.chassis;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;

@Data
public abstract class Chassis  extends Component {

    private double capacity;
    private int rotationSpeed;
    private int maxSpeed;

    public Chassis(long id, String name,double capacity, int rotationSpeed, int maxSpeed) {
        super(id,name);
        setCapacity(capacity);
        setRotationSpeed(rotationSpeed);
        setMaxSpeed(maxSpeed);
    }

}
