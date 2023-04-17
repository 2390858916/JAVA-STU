package 多态;

public class master {
    private String name;
    public master(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制统一喂食
    // animal 编译类型是animal 可以指向接受animal子类的对象
    // food 编译类型是food 可以指向接受food子类的对象
    public void feed(animal animal,food food){
        System.out.println("master" + name + "give the" + animal.getName() +  "eat"  + food.getName());
    }

//    public void feed(dog dog,bone bone){
//        System.out.println("master" + name + "give the" + dog.getName() +  "eat"  + bone.getName());
//    }
//    public void feed(cat cat,fish fish){
//        System.out.println("master" + name + "give the" + cat.getName() +  "eat"  + fish.getName());
//    }
}
