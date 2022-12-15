
package FinalWork;

import java.util.Scanner;

public class Notebook {
    static Scanner scanner = new Scanner(System.in);
    
    protected Integer id; // Индетификационный номер
    protected String model; // Модель
    protected Integer ram; // ОЗУ
    protected Integer capacityHardDisk; // Объем ЖД
    protected String operationSystem; // Операционная система
    protected String color; // Цвет корпуса

    public Notebook(int id, String model, int ram, int capacityHardDisk, String operationSystem, String color){
        this.id = id;
        this.model = model;
        this.ram = ram;
        this.capacityHardDisk = capacityHardDisk;
        this.operationSystem = operationSystem;
        this.color = color;

    }

    ///++++///
    public Integer getId(){
        return id;
    }
    public String getModel(){
        return model;
    }
    public Integer getRam(){
        return ram;
    }
    public Integer getCapacityHardDisk(){
        return capacityHardDisk;
    }
    public String getOperationSystem(){
        return operationSystem;
    }
    public String getColor(){
        return color;
    }
    ///++++///
    public void setId(Integer id){
        this.id = id;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setRam(Integer ram){
        this.ram = ram;
    }
    public void setCapacityHardDisk(Integer capacityHardDisk){
        this.capacityHardDisk = capacityHardDisk;
    }
    public void setOperationSystem(String operationSystem){
        this.operationSystem = operationSystem;
    }
    public void setColor(String color){
        this.color = color;
    }
    ///++++///

    public String getInfo() {
        return String.format("ID: %s, Model: %s, RAM: %s,  HDD: %d Gb,  OS: %s, Color: %s.", this.id, this.model, this.ram, this.capacityHardDisk, this.operationSystem, this.color, this.getClass().getSimpleName());
    }
}
