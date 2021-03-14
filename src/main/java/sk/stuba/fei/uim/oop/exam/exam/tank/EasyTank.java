package sk.stuba.fei.uim.oop.exam.exam.tank;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.cannon.EasyCannon;
import sk.stuba.fei.uim.oop.exam.exam.chassis.Chassis;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;
import sk.stuba.fei.uim.oop.exam.exam.chassis.WheelChassis;

@Data
public class EasyTank extends Tank {

    private WheelChassis wheelChassis;
    private Tower<EasyCannon> easyCannonTower;


    public EasyTank(long id, String name, Nationality nationality, double price, WheelChassis wheelChassis, EasyCannon easyCannon,Tower<EasyCannon> easyCannonTower ) {
        super(id, name, nationality, price, wheelChassis, easyCannon);
    setEasyCannonTower(easyCannonTower);
    }
}
