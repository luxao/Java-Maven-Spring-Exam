package sk.stuba.fei.uim.oop.exam.exam.tank;

import lombok.Getter;

@Getter
public enum Nationality {
    USA(1,"USA"),
    ZSSR(2,"ZSSR"),
    GERMANY(3,"GERMANY"),
    GREAT_BRITAIN(4,"GREAT BRITAIN");


    private int id;
    private String name;

    Nationality(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
