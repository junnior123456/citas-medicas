package upeu.edu.pe.api_gateway.beans;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import upeu.edu.pe.api_gateway.filters.AuthFilter;

@Configuration
public class GatewayBeans {

    private final AuthFilter authFilter;

    public GatewayBeans(AuthFilter authFilter) {
        this.authFilter = authFilter;
    }

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
    @Bean
    @Profile(value = "oauth2")
    public RouteLocator routeLocatorOauth2(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(route -> route
                        .path("/companies-crud/company/**")
                        .filters(filter -> filter.filter(this.authFilter))
                        .uri("lb://companies-crud")  //load balance = lb = balanceo de carga
                )
                .route(route -> route
                        .path("/report-ms/report/**")
                        .filters(filter -> filter.filter(this.authFilter))
                        .uri("lb://report-ms")
                )
                .route(route -> route
                        .path("/auth-server/auth/**")
                        .uri("lb://auth-server")
                )
                .build();
    }
}
