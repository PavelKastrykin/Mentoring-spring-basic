package main;

import bean.BeanLyfecycleExample;
import bean.SayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");

		System.out.println(context.getBean("firstDeveloper"));

		System.out.println(context.getBean("teamLead"));

		System.out.println("SupportStaff1 - " + context.getBean("supportStaff"));
		System.out.println("SupportStaff2 - " + context.getBean("supportStaff"));

		SayHello sayHello = (SayHello)context.getBean("sayHello");
		sayHello.greeting();

		System.out.println("Bean Lifecycle Example ===================");
		BeanLyfecycleExample example = (BeanLyfecycleExample)context.getBean("beanLifecycleExample");
		context.close();
	}
}
