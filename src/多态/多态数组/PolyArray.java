package ��̬.��̬����;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("01",20);
        person[1] = new Student("02",30,100);
        person[2] = new Teach("03",40,6000);

        for (int i = 0; i < person.length; i++) {
            //��̬��
            if (person[i] instanceof Student){
                //ǿת����
                ((Student)person[i]).student();
                System.out.println(person[i].say());
            }else if (person[i] instanceof Teach){
                ((Teach)person[i]).teach();
                System.out.println(person[i].say());
            }else if (person[i] != null){

            }else {
                //����������Person ���������Ǹ���ʵ�������ж�
                System.out.println(person[i].say());
            }

        }
    }
}
