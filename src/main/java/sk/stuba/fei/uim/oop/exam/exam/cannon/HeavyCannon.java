package sk.stuba.fei.uim.oop.exam.exam.cannon;

import lombok.Data;

@Data
public class HeavyCannon extends Cannon {
    private double radiusOfExplosion;

    public HeavyCannon(long id, String name, double caliber, int cadence, double spread,double radiusOfExplosion) {
        super(id, name, caliber, cadence, spread);
        setRadiusOfExplosion(radiusOfExplosion);
    }
}
