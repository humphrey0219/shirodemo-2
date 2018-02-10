package info.linianjun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages={"info.linianjun.mapper"})
public class Shirodemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shirodemo2Application.class, args);
	}
}
