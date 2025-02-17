import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat bean3 = (Cat) applicationContext.getBean("newcat");
        System.out.println(bean3.getMessage());
        Cat bean4 = (Cat) applicationContext.getBean("newcat");
        System.out.println(bean4.getMessage());

        Boolean resultHW = bean1 == bean2;
        Boolean resultCat = bean3 == bean4;
        System.out.println(resultHW);
        System.out.println(resultCat);
    }
}