package ∂‡Ã¨;

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

    public void feed(dog dog,bone bone){
        System.out.println("master" + name + "give the" + dog.getName() +  "eat"  + bone.getName());
    }
    public void feed(cat cat,fish fish){
        System.out.println("master" + name + "give the" + cat.getName() +  "eat"  + fish.getName());
    }
}
