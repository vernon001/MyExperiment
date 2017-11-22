package cn.com.zhanghb.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import cn.com.zhanghb.SpringBoot.DataBase.Service.DBSimulator;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application
{
	// private static DBSimulator dbSimulator = new DBSimulator();

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		/*
		 * try { dbSimulator.run("args0"); } catch (Exception e) {
		 * System.out.println(e.getMessage().toString()); }
		 */
	}
}
