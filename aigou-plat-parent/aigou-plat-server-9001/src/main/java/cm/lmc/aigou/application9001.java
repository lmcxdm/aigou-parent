package cm.lmc.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class application9001 {
    public static void main(String[] args) {
        SpringApplication.run(application9001.class);
    }
}
