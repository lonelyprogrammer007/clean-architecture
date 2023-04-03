package co.com.lgfh.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route(GET("/api/hero/{id}"), handler::getHero)
                .andRoute(GET("/api/hero/{name}"), handler::searchHeroes)
                .andRoute(GET("/api/hero"), handler::getHeroes)
                .and(route(POST("/api/hero"), handler::addHero))
                .and(route(PUT("/api/hero"), handler::updateHero))
                .and(route(DELETE("/api/hero"), handler::deleteHero));
    }
}
