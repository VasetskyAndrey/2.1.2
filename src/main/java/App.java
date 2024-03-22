import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld HelloBean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HelloBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(HelloBean1.equals(HelloBean2));

        var catBean1 = applicationContext.getBean("cat", Cat.class);
        var catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(catBean1.equals(catBean2));





    }
}