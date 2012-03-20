package mspace;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:applicationContext-service.xml"})
public abstract class BaseContextSensitiveTest{

    protected ClassPathXmlApplicationContext classPathXmlApplicationContext = null;

    @Before
    public void setUp(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-service.xml");
    }
}
