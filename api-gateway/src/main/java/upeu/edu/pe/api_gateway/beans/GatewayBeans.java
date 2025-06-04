package upeu.edu.pe.api_gateway.beans;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GatewayBeans {

    @Bean
    @Profile("eureka-off")
    public RouteLocator routeLocatorEurekaOff(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(route -> route
                        .path("/api/appointment/**")
                        .filters(f -> f.stripPrefix(2)) // /api/appointment/citas -> /citas
                        .uri("http://localhost:8081"))
                .route(route -> route
                        .path("/api/report/**")
                        .filters(f -> f.stripPrefix(2)) // /api/report/resumen -> /resumen
                        .uri("http://localhost:7070"))
                .route(route -> route
                        .path("/api/companies/**")
                        .filters(f -> f.stripPrefix(2)) // /api/companies/company -> /company
                        .uri("http://localhost:8082"))
                .build();
    }

    @Bean
    @Profile("eureka-on")
    public RouteLocator routeLocatorEurekaOn(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(route -> route
                        .path("/api/appointment/**")
                        .filters(f -> f.stripPrefix(2))
                        .uri("lb://appointment-service"))
                .route(route -> route
                        .path("/api/report/**")
                        .filters(f -> f.stripPrefix(2))
                        .uri("lb://report-ms"))
                .route(route -> route
                        .path("/api/companies/**")
                        .filters(f -> f.stripPrefix(2))
                        .uri("lb://companies-crud"))
                .build();
    }
}
