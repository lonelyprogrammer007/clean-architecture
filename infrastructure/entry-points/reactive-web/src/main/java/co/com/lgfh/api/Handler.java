package co.com.lgfh.api;

import co.com.lgfh.model.hero.Hero;
import co.com.lgfh.usecase.hero.HeroUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
private  final HeroUseCase heroUseCase;
    public Mono<ServerResponse> getHeroes(ServerRequest serverRequest) {
        // usecase.logic();
        heroUseCase.getHeroes();
        return ServerResponse.ok().bodyValue("getHeroes() OK");
    }

    public Mono<ServerResponse> getHero(ServerRequest serverRequest) {
        // useCase2.logic();
        heroUseCase.getHero(-1);
        return ServerResponse.ok().bodyValue("getHero() OK");
    }

    public Mono<ServerResponse> updateHero(ServerRequest serverRequest) {
        // usecase.logic();
        heroUseCase.updateHero(new Hero());
        return ServerResponse.ok().bodyValue("updateHero() OK");
    }

    public Mono<ServerResponse> addHero(ServerRequest serverRequest) {
        // usecase.logic();
        heroUseCase.addHero(new Hero());
        return ServerResponse.ok().bodyValue("addHero() OK");
    }

    public Mono<ServerResponse> deleteHero(ServerRequest serverRequest) {
        // usecase.logic();
        heroUseCase.deleteHero(-1);
        return ServerResponse.ok().bodyValue("deleteHero() OK");
    }

    public Mono<ServerResponse> searchHeroes(ServerRequest serverRequest) {
        // usecase.logic();
        heroUseCase.searchHeroes("");
        return ServerResponse.ok().bodyValue("searchHeroes() OK");
    }
}
