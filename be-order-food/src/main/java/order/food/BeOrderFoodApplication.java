package order.food;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages = {"order.food"})
@MapperScan("order.food.**.mapper")
public class BeOrderFoodApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BeOrderFoodApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BeOrderFoodApplication.class, args);
    }

}
