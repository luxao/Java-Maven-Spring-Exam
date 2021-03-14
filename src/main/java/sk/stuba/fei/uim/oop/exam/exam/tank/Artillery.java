package sk.stuba.fei.uim.oop.exam.exam.tank;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.cannon.HeavyCannon;
import sk.stuba.fei.uim.oop.exam.exam.chassis.Chassis;
import sk.stuba.fei.uim.oop.exam.exam.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;

@Data
public class Artillery extends Tank {

    private CrawlerChassis crawlerChassis;
    private HeavyCannon heavyCannon;
    private Tower<HeavyCannon> heavyCannonTower;
    public Artillery(long id, String name, Nationality nationality, double price, CrawlerChassis crawlerChassis, HeavyCannon heavyCannon) {
        super(id, name, nationality, price, crawlerChassis, heavyCannon);

    }
}
