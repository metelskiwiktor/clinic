package pl.sczelej.clinic.model;

import java.util.Date;

public class Animal {
    private Long id;
    private String name;
    private Date born;
    private Type type;
    private String color;

    public Animal(String name, Date born, Type type, String color) {
        this.name = name;
        this.born = born;
        this.type = type;
        this.color = color;
    }

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", born=" + born +
                ", type=" + type +
                ", color='" + color + '\'' +
                '}';
    }
}
