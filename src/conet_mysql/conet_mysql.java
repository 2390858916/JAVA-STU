package conet_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conet_mysql {
    Connection con; //��������
    public static String url = "jdbc:mysql://localhost:3306/sales";
    public static String user = "root";
    public static String password = "root";
    public Connection getConnection(){ //��������ֵΪConnection �ķ���
        try { //�������ݿ�����
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("���ݿ��������سɹ�");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try { // ͨ���������ݿ��URL��ȡ���ݿ����Ӷ���
            con = DriverManager.getConnection(url, user, password);
            System.out.println("���ݿ����ӳɹ�");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // ������Ҫ�󷵻�һ��Connection����
    }
}
