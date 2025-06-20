import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

void main () {
    var modifiers = getClass().getModifiers() ;
    if (Modifier.isFinal( modifiers)) {
        System.out.println("it's final!");
    }

    SpringApplication.run(MyConfig.class) ;

}

@Configuration (proxyBeanMethods = false)
final class MyConfig  {

    @Bean
    ApplicationRunner runner (){
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("runner..");
            }
        } ;
    }
}