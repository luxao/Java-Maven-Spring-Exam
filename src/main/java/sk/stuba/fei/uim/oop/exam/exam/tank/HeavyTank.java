package sk.stuba.fei.uim.oop.exam.exam.tank;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.cannon.HeavyCannon;
import sk.stuba.fei.uim.oop.exam.exam.chassis.Chassis;
import sk.stuba.fei.uim.oop.exam.exam.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;

@Data
public class HeavyTank extends Tank {

    private CrawlerChassis crawlerChassis;
    private Tower<HeavyCannon> heavyCannonTower;
    private HeavyCannon heavyCannon;


    public HeavyTank(long id, String name, Nationality nationality, double price, CrawlerChassis crawlerChassis,HeavyCannon heavyCannon,Tower<HeavyCannon> heavyCannonTower) {
        super(id, name, nationality, price, crawlerChassis, heavyCannon);
        setHeavyCannonTower(heavyCannonTower);

    }
}
