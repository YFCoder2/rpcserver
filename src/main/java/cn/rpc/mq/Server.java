package cn.rpc.mq;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Server {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Server.class);
		System.out.println("server startup");
		TimeUnit.SECONDS.sleep(120);
		context.close();
	}
}
