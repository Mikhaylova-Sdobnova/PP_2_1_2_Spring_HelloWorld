import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="newcat")
    @Scope("prototype")
    public Cat getCat() {
        Cat newCat = new Cat();
        newCat.setMessage("A new Cat has been created!");
        return newCat;
    }
}