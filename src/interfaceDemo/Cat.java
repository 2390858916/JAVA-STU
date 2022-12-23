package interfaceDemo;


/// 调用接口 使用implement
public class Cat implements Jumping{
    @Override
    public void jump() {
        System.out.println("jump");
    }
}
