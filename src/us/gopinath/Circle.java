package us.gopinath;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component; //generic
//import org.springframework.stereotype.Controller; // level of documentation
//import org.springframework.stereotype.Repository; //aspect oriented programming
//import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

//import org.springframework.beans.factory.annotation.Required;

//@Service
//@Repository
//@Controller
@Component
public class Circle implements Shape{

	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(this.messageSource.getMessage("drawing.circle", null,"Default Drawing Circle",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()},"Default Drawing Circle",null));
		//System.out.println(this.messageSource.getMessage("greeting", null,"Default Greeeting",null));
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	}

}
