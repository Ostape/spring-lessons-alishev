package com.robosh;

        import com.robosh.entity.Person;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("aplictionContextResources.xml");
        Person testBean =  applicationContext.getBean("person", Person.class);


        Person person2 = applicationContext.getBean("person",Person.class);
        System.out.println(testBean.getName());
        testBean.setName("vaisa");
        System.out.println(person2.getName());
    }
}
