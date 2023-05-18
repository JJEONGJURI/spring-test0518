package test0518;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
		User user1 = ctx.getBean("user1", User.class);
		System.out.println(user1.getId());
		System.out.println(user1.getContact().getTel());
		System.out.println(user1.getContact().getFax());
		
		User user2 = ctx.getBean("user2", User.class);
		System.out.println(user2.getId());
		System.out.println(user2.getContact().getTel());
		System.out.println(user2.getContact().getFax());
		
	}

}
