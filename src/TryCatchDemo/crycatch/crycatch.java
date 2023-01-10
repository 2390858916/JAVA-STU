package TryCatchDemo.crycatch;

public class crycatch {
    public static void main(String[] args) {
       // ArrauIndexOutOfBoundsException 数组越界
        //多异常捕获
        try {
            //ArrauIndexOutOfBoundsException 数组越界
            int[] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length; i++) System.out.println(arr[i]);
            // ArithmeticException:算术运算异常
            System.out.println(1/0);
            // NullPointerException 空指针异常
            String c  = null;
            System.out.println(c.toLowerCase());
//            ClassCastException 强制转换类型失败
//            Student s = (student)obj;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 数组异常");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException 算术异常");
        }catch (NullPointerException e){
            System.out.println("NullPointerException 空指针错误");
        }catch (ClassCastException e){
            System.out.println("ClassCastException 强制转换类型失败");
        }
    }
}
