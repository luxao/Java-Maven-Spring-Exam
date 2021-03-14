package sk.stuba.fei.uim.oop.exam.exam.cannon;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;

@Data
public abstract class Cannon extends Component {

    private double caliber;
    private int cadence;
    private double spread;


    public Cannon(long id, String name, double caliber, int cadence, double spread) {
        super(id, name);
        setCaliber(caliber);
        setCadence(cadence);
        setSpread(spread);
    }
}
