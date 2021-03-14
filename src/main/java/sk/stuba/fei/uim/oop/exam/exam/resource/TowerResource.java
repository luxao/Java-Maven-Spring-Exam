package sk.stuba.fei.uim.oop.exam.exam.resource;

import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;

public class TowerResource {
    private long id;
    private String name;

    private int rotationSpeed;
    private int oversight;

    private Tower<Cannon> tower;

    public TowerResource() {
        this.id = tower.getId();
        this.name = tower.getName();
        this.rotationSpeed = tower.getRotationSpeed();
        this.oversight = tower.getOversight();

    }
}
