package sk.stuba.fei.uim.oop.exam.exam.service;

import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;
import sk.stuba.fei.uim.oop.exam.exam.tank.Tank;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service implements ApiService {

    private Map<Long, Tank> vehicles;
    private Map<Long,Component> components;

    public Service() {
       vehicles = new HashMap<>();
       components = new HashMap<>();
    }

    @Override
    public void addVehicle(Tank tank) {
        vehicles.put(tank.getId(),tank);

    }

    @Override
    public void addComponentToVehicle(long id, Component component) {
        vehicles.get(id).addComponent(component);
    }



    @Override
    public Optional<Tank> findTankById(long id) {
        return Optional.ofNullable(vehicles.get(id));
    }

    @Override
    public Map<Long, Component> getAllVehicleComponents(long id) {
        return null;
    }


    @Override
    public Map<Long, Tank> getAllVehicles() {
        return vehicles;
    }

    @Override
    public void addComponent(Component component) {
        components.put(component.getId(),component);
    }

    @Override
    public Optional<Component> findTankByComponentId(long id, long idComponent) {
        return Optional.empty();
    }


    @Override
    public Map<Long, Component> getAllComponents() {
        return components;
    }
}
