package org.example.hw1.model;
import java.util.HashMap;
import java.util.Map;

public class Laptop {

    private Integer id;

    private String name;
    private Integer ram;
    private Integer om;
    private String os;
    private String color;

    public Laptop(Integer id,String name, Integer ram, Integer om, String os, String color) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.om = om;
        this.os = os;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static Map<String,Integer> propertiesForFilter(){
        Map<String,Integer> list = new HashMap<>();
        list.put("ram",1);
        list.put("om",2);
        list.put("os",3);
        list.put("color",4);

        return list;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getOm() {
        return om;
    }

    public void setOm(Integer om) {
        this.om = om;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String model) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "Жесткий диск:" + ram +
                ", ОЗУ: " + om + '\'' +
                ", Операционная система: " + os +
                ", Цвет: " + color;
    }
}
