package ��̬.polyoverr;

public class poly {
    public static void main(String[] args) {

        //animal �������;���animal����������dog
        animal animal = new dog();
        //��Ϊ����ʱ��ִ�е�����ʱ��animal����������DOG������cry����dog��cry
        animal.cry();

        //animal ��������animal ����������cat
        animal = new cat();
        animal.cry();
    }
}
