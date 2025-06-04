package upeu.edu.pe.report_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReportMsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReportMsApplication.class, args);
	}
}
