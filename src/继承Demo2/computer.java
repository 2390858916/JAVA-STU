package 继承Demo2;

public class computer {

//        3. 编写computer类，包含cpu,内存 硬盘,getDetails方法用于返回Cumputer的详细信息。
//        编写pc子类，继承computer类，添加特有属性【品牌brand】
//        编写NotePad子类，继承computer类，添加特有属性【演示color】
//        编写test类，在main方法中创建pc和notepad对象，分别给对象中特有的属性赋值，以及从computer类继承的属性赋值，并使用方法并打印输出信息。
    private String cpu;
    private int memory;
    private int disk;

    public computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetails(){
        return "cpu= " + cpu + " memory= " + memory +" disk= " + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
