package day5;

public class Car {
    private String model;
    private String color;
    private int yearOfRelease;

    public void setModel (String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYearOfRelease (int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
}
