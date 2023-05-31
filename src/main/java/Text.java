//import java.applet.AppletContext;

import org.apache.ibatis.io.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.liu.pojo.Stu;
import com.liu.service.Stuservice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
//@Component
public class Text {
//   @Autowired
//   Stuservice stuservice;
    public void main(String[] args) throws Exception {

//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
//StuDao studao=(StuDao) app.getBean("StuDao");
//        Stuservice stuservice = app.getBean(Stuservice.class);
//        String number = "2019";
//        List<Stu> stu = stuservice.selectAll();
//        List<Stu> stu1 = stuservice.selectone(number);
//        System.out.println(stu);
//        System.out.println(stu1);
        //mybatis
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//获取sqlsession
//		SqlSession sqlSession= sqlSessionFactory.openSession();
//		//执行语句
//       List<Stu> stu= sqlSession.selectList("StuMapper.stuseletall");
//		System.out.println(stu);
//		//关闭资源
// 		sqlSession.close();

        //mybatis代理
//		InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
//		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession=sqlSessionFactory.openSession();
//		StuMapper mapper=sqlSession.getMapper(StuMapper.class);
//		List<Stu> all=mapper.stuselectall();
//		System.out.println(all);


        List<Stu> params = new ArrayList<Stu>();
//        Stuservice stuservice= new Stuservicelmpl();
//        params = stuservice.selectAll();
        System.out.println(params);
    }
}