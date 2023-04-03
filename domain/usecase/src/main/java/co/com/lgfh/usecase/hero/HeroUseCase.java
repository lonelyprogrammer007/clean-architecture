package co.com.lgfh.usecase.hero;

import co.com.lgfh.model.hero.Hero;
import co.com.lgfh.model.hero.gateways.HeroGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class HeroUseCase {

    final HeroGateway heroGateway;

    public List<Hero> getHeroes() {
        return heroGateway.getHeroes();
    }
    public Hero getHero(int id) {
        return heroGateway.getHero(id);
    }
    public Hero addHero(Hero hero) {
        return heroGateway.addHero(hero);
    }
    public Hero deleteHero(int id) {
        return heroGateway.deleteHero(id);
    }
    public Hero updateHero(Hero hero) {
        return heroGateway.updateHero(hero);
    }
    public List<Hero> searchHeroes(String term) {
        return heroGateway.searchHeroes(term);
    }
}
