package sk.stuba.fei.uim.oop.exam.exam.cannon;

import lombok.Data;

@Data
public class EasyCannon extends Cannon {

    private int numberOfRounds;

    public EasyCannon(long id, String name, double caliber, int cadence, double spread,int numberOfRounds) {
        super(id, name, caliber, cadence, spread);
        setNumberOfRounds(numberOfRounds);
    }


}
