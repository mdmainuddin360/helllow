package com.rihan.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.rihan.bean.Employee;

public class TestEmployee {
public static void main(String[] args) {
	ApplicationContext  context= new ClassPathXmlApplicationContext("Start.xml");
	Employee emp=(Employee)context.getBean("empBean");
	
	System.out.println(emp.getEmpName());
}
}
