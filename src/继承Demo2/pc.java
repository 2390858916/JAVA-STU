package ºÃ≥–Demo2;

public class pc extends computer{
    private String brand;
    public pc(String cpu, int memory, int disk,String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printinfo(){
        System.out.println("pc–≈œ¢ = ");
        System.out.println(getDetails() + "brand= " + brand);
    }
}
