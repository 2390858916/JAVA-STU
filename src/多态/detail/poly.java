package ��̬.detail;

public class poly {
    public static void main(String[] args) {
        animal animal = new cat();
        animal animal1 = new dog();
        animal.eat();
        animal.show();

        //��̬����ת��
        //cat �������� ��������cat
        cat cat = (cat) animal;
        dog dog = (dog) animal1;
        cat.eat();
        //�ɷ���������з���
        //Ҫ��������ñ�����ǵ�ǰĿ�����͵Ķ���
        cat.catchmos();


    }
}
