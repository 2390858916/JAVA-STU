package ��̬;

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

    //ʹ�ö�̬����ͳһιʳ
    // animal ����������animal ����ָ�����animal����Ķ���
    // food ����������food ����ָ�����food����Ķ���
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
