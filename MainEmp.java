package com.springcore.autowire;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp {
     public static void main(String [] args) {
    	 
    	                  ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/auto.xml");
    	                         
    	                   Emp emp=(Emp)context.getBean("emp1");
    	                    System.out.print(emp);
    	 
     }
}
