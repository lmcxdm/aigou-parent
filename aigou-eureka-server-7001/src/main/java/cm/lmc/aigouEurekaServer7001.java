package cm.lmc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class aigouEurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(aigouEurekaServer7001.class);
    }
}
