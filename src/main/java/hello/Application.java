package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by t945083 on 28.3.2015.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        String[] beans = ctx.getBeanDefinitionNames();
        Arrays.sort(beans);
        System.out.println("Bean names:");
        for (String bean : beans){
            System.out.println(bean);
        }
    }
}
