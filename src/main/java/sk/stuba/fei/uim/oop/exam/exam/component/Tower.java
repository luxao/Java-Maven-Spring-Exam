package sk.stuba.fei.uim.oop.exam.exam.component;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;

@Data
public class Tower<T extends Cannon> extends Component {

    private int rotationSpeed;
    private int oversight;
    private T cannon;

    public Tower(long id, String name, int rotationSpeed, int oversight, T cannon) {
        super(id, name);
       setRotationSpeed(rotationSpeed);
       setOversight(oversight);
       setCannon(cannon);
    }
}
