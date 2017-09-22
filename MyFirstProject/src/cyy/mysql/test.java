package cyy.mysql;

import javax.xml.transform.Result;
import java.sql.*;
public class test {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";

    static final String USER ="root";
    static final String PASS = "'";
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //执行查询
            System.out.println("实例化Statement对...");
            stmt = conn.createStatement();
            String sql;
            sql="SELECT id,name,url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);
            //rs得到的是一条数据
            //展开结果集数据库
            while(rs.next()) {
                //通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                //输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点URL: " + url);
                System.out.print("\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    }

