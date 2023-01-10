package OrtherDemo.test61;

public class student {
    private String name;
    private String score;
    public student() {
    }
    public student(String name, String score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public void show(){
        System.out.println("name:"+getName()+"score:"+getScore());
    }
}
