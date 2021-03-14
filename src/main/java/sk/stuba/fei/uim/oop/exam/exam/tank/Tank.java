package sk.stuba.fei.uim.oop.exam.exam.tank;

import lombok.Data;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.chassis.Chassis;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;

import java.util.HashMap;
import java.util.Map;

@Data
public abstract class Tank {
    private long id;
    private String name;
    private Nationality nationality;
    private double price;
    private Chassis chassis;

    private Cannon cannon;
    private Map<Long,Component> components = new HashMap<>();

    public Tank(long id, String name, Nationality nationality, double price, Chassis chassis, Cannon cannon) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.price = price;
        setChassis(chassis);
        setCannon(cannon);

    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name of tank is null");
        }
        this.name = name;
    }

    public void addComponent(Component component) {
        components.put(component.getId(), component);
    }

    public Map<Long, Component> getComponents() {
        return components;
    }
}
