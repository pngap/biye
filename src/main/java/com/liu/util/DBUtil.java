package com.liu.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

    public static void main(String[] args) throws Exception {
//	        //声明Connection对象
//	         Connection con;
//	         //驱动程序名
//	        String driver = "com.mysql.cj.jdbc.Driver";
//	         //URL指向要访问的数据库名mydata
//	         String url = "jdbc:mysql://localhost:3306/system?useUnicode=true&characterEncoding=utf8&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//	    
//	         //MySQL配置时的用户名
//	         String user = "root";
//	         //MySQL配置时的密码
//	         String password = "123456";     
//	         //要执行的SQL语句    
//	         String sql = "select * from stu";
//	         //遍历查询结果集
//	             //加载驱动程序
//	             Class.forName(driver);
//	             //1.getConnection()方法，连接MySQL数据库！！
//	             con = DriverManager.getConnection(url,user,password);
//	             //2.创建statement类对象，用来执行SQL语句！！
//	             Statement statement = con.createStatement();
//	      	             //3.ResultSet类，用来存放获取的结果集！！
//	             ResultSet rs = statement.executeQuery(sql);
//	             while(rs.next()){
//	                 System.out.println("SNo="+rs.getInt("number"));
//	                 System.out.println("SName="+rs.getString("Name"));
//	                 System.out.println("Birth="+rs.getString("xueyan"));
//	                 System.out.println("SPNo="+rs.getString("zhany"));
//	                 System.out.println("Major="+rs.getInt("nianji"));
//	                 System.out.println("Grade="+rs.getInt("pwd"));
//	                
//	             }
//	             statement.close();
//	            rs.close();
//	             con.close();
//	             
//	        
//	        

    }

    public static Connection getConnetion() throws Exception {

        //驱动程序名
        Properties pop = new Properties();
        pop.load(new FileInputStream("src/main/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pop);

        //1.getConnection()方法，连接MySQL数据库！！
        Connection con = dataSource.getConnection();
        //2.创建statement类对象，用来执行SQL语句！！
        return con;
    }

    public static void close(Object object, PreparedStatement preparedStatement, Connection connection) {


        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }


    }


}
