package com.github.illiaderhun;

import com.github.illiaderhun.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
        Coach yetAnotherCricketCoach = context.getBean("myCricketCoach", Coach.class);

        System.out.println(cricketCoach == yetAnotherCricketCoach);
        System.out.println(cricketCoach.equals(yetAnotherCricketCoach));

    }

}
