import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        DataSource dataSource =applicationContext.getBean(DataSource.class);
        Connection connection =dataSource.getConnection();
        System.out.println(connection);
    }
}
