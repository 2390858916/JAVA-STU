package DONGTAIdEMO;

public class animalDemo {
    public static void main(String[] args) {
        // 创建对象 调用方法·1、
        animalopreator ao = new animalopreator();
        Cat c = new Cat();
        Dog d = new Dog();
        ao.useAnimal(d);
        ao.useAnimal(c);
    }
}
