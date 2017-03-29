package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLyfecycleExample implements InitializingBean, DisposableBean {

	private String beanName;

	public BeanLyfecycleExample() {
		System.out.println("Inside Constructor");
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		System.out.println("Setting name to value = " + beanName);
		this.beanName = beanName;
	}

	public void init() {
		System.out.println("Inside init method");
	}

	@Override
	public void afterPropertiesSet() throws Exception	{
		System.out.println("Inside after properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
}
