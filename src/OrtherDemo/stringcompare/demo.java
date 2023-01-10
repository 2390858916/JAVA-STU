//package OrtherDemo.stringcompare;
//
//public class OrtherDemo.demo {
//
////本程序演示字符串操作的基本方法
//
//
//    public static void main(String[] args) {
//        String str1,str2;
//        str1="440822200005060069";
//        str2="students should study hard.";
//
//        //1.字符串长度方法：int length();
//        //System.out.println(str1.length());
//
//        //2.返回字符串中指定字符的方法：charAt(int index)
//        //System.out.println(str2.charAt(10));//返回字符串str2中第5个字符(注意：下标从0开始)
//
//        //3.返回字符串中指定字符的第一次出现的位置的方法：indexOf(int ch)
//        //System.out.println(str2.indexOf('s'));//返回字符串str2中第一次出现字符'u'的位置(注意：没有字符则返回-1)
//
//        //4.返回字符串中指定字符子串的从指定位置开始第一次出现的位置的方法：indexOf(String str,int index)
//        //System.out.println(str2.indexOf("su",0));//返回字符串str2中从指定位置开始出现字符子串"stu"的位置(注意：没有字符则返回-1)
//
//        //5.返回字符串中指定位置的子串的方法：substring(int index1,int index2):取子串从index1开始到index2-1
//        //System.out.println(str2.substring(2, 6));
//        System.out.println("出生年月："+str1.substring(6, 10)+"年"+str1.substring(10,12)+"月"+str1.substring(12,14)+"日" );//返回字符串str2中，从第5字符开始到第15-1个字符的子串
//        //system.out.println(str1.substring(16, 17));//字符型数据，没有办法判断奇偶性
//        if(Integer.parseInt(str1.substring(16, 17))%2==0)
//            System.out.println("性别：女");
//        else
//            System.out.println("性别：男");
//    }
//}