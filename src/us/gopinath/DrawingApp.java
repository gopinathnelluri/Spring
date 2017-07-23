package us.gopinath;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//must to register shutdown hook
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("shape");
		shape.draw();
		
	}

}
