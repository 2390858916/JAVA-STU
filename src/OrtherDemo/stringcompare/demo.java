//package OrtherDemo.stringcompare;
//
//public class OrtherDemo.demo {
//
////��������ʾ�ַ��������Ļ�������
//
//
//    public static void main(String[] args) {
//        String str1,str2;
//        str1="440822200005060069";
//        str2="students should study hard.";
//
//        //1.�ַ������ȷ�����int length();
//        //System.out.println(str1.length());
//
//        //2.�����ַ�����ָ���ַ��ķ�����charAt(int index)
//        //System.out.println(str2.charAt(10));//�����ַ���str2�е�5���ַ�(ע�⣺�±��0��ʼ)
//
//        //3.�����ַ�����ָ���ַ��ĵ�һ�γ��ֵ�λ�õķ�����indexOf(int ch)
//        //System.out.println(str2.indexOf('s'));//�����ַ���str2�е�һ�γ����ַ�'u'��λ��(ע�⣺û���ַ��򷵻�-1)
//
//        //4.�����ַ�����ָ���ַ��Ӵ��Ĵ�ָ��λ�ÿ�ʼ��һ�γ��ֵ�λ�õķ�����indexOf(String str,int index)
//        //System.out.println(str2.indexOf("su",0));//�����ַ���str2�д�ָ��λ�ÿ�ʼ�����ַ��Ӵ�"stu"��λ��(ע�⣺û���ַ��򷵻�-1)
//
//        //5.�����ַ�����ָ��λ�õ��Ӵ��ķ�����substring(int index1,int index2):ȡ�Ӵ���index1��ʼ��index2-1
//        //System.out.println(str2.substring(2, 6));
//        System.out.println("�������£�"+str1.substring(6, 10)+"��"+str1.substring(10,12)+"��"+str1.substring(12,14)+"��" );//�����ַ���str2�У��ӵ�5�ַ���ʼ����15-1���ַ����Ӵ�
//        //system.out.println(str1.substring(16, 17));//�ַ������ݣ�û�а취�ж���ż��
//        if(Integer.parseInt(str1.substring(16, 17))%2==0)
//            System.out.println("�Ա�Ů");
//        else
//            System.out.println("�Ա���");
//    }
//}