package sk.stuba.fei.uim.oop.exam.exam.component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public abstract class Component {

    private long id;
    private String name;

    public Component(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
