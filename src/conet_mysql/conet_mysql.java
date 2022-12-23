package conet_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conet_mysql {
    Connection con; //声明对象
    public static String url = "jdbc:mysql://localhost:3306/sales";
    public static String user = "root";
    public static String password = "root";
    public Connection getConnection(){ //建立返回值为Connection 的方法
        try { //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try { // 通过访问数据库的URL获取数据库连接对象
            con = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // 按方法要求返回一个Connection对象
    }
}
