package testmain;

import com.learning.beanfactorypostprocessor.TestBeanFactoryPostProcessor;
import com.learning.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learning.service.ServiceImpl;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.getEnvironment().setActiveProfiles("staging");
        context.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
        context.refresh();
        ServiceImpl service = (ServiceImpl) context.getBean("serviceImpl");
        service.print();
//        IndexDao indexDao = (IndexDao) context.getBean("indexDao");
//        indexDao.insert();s
    }
}
