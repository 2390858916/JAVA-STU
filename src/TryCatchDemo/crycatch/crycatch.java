package TryCatchDemo.crycatch;

public class crycatch {
    public static void main(String[] args) {
       // ArrauIndexOutOfBoundsException ����Խ��
        //���쳣����
        try {
            //ArrauIndexOutOfBoundsException ����Խ��
            int[] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length; i++) System.out.println(arr[i]);
            // ArithmeticException:���������쳣
            System.out.println(1/0);
            // NullPointerException ��ָ���쳣
            String c  = null;
            System.out.println(c.toLowerCase());
//            ClassCastException ǿ��ת������ʧ��
//            Student s = (student)obj;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException �����쳣");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException �����쳣");
        }catch (NullPointerException e){
            System.out.println("NullPointerException ��ָ�����");
        }catch (ClassCastException e){
            System.out.println("ClassCastException ǿ��ת������ʧ��");
        }
    }
}
