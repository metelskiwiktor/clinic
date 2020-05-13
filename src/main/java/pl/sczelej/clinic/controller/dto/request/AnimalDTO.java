package pl.sczelej.clinic.controller.dto.request;

import pl.sczelej.clinic.model.Type;

import java.util.Date;

public class AnimalDTO {
    private String name;
    private Date born;
    private Type type;
    private String color;

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
        return "AnimalDTO{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", type=" + type +
                ", color='" + color + '\'' +
                '}';
    }
}
