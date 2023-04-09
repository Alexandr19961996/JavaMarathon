package day5;

public class Car {
    private String model;
    private String color;
    private int yearOfRelease;

    public void SetModel (String model){
        this.model = model;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public void SetYearOfRelease (int yearOfRelease){
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
