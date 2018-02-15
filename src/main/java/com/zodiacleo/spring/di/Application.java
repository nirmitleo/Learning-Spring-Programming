package com.zodiacleo.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application
{
    private final static String TITLE = "Forest Gump";
    
    public static void main(String[] a)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        RentalService rentalService = context.getBean("rentalService", RentalService.class);
        List<RentalLocation> locations = rentalService.find(TITLE, "400055", 10);
        
        System.out.println("Following locations have the title: " + TITLE);
        for (RentalLocation location : locations)
        {
            System.out.println(location.getName());
        }
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
