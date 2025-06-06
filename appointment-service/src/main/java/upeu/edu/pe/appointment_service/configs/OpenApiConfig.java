package upeu.edu.pe.appointment_service.configs;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Citas Médicas")
                        .version("1.0")
                        .description("Documentación del microservicio de agendamiento de citas médicas"));
    }
}
