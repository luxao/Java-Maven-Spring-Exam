package sk.stuba.fei.uim.oop.exam.exam.service;

import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.exam.exam.component.Component;
import sk.stuba.fei.uim.oop.exam.exam.tank.Tank;

import java.util.Map;
import java.util.Optional;

@Service
public interface ApiService {

    void addVehicle(Tank tank);

    void addComponentToVehicle(long id, Component component);

    Optional<Tank> findTankById(long id);

    Map<Long,Component> getAllVehicleComponents(long id);

    Map<Long,Tank> getAllVehicles();

    void addComponent(Component component);

    Optional<Component> findTankByComponentId(long id,long idComponent);

    Map<Long,Component> getAllComponents();

}
