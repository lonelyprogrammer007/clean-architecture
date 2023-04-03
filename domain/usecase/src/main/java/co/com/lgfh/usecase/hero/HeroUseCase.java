package co.com.lgfh.usecase.hero;

import co.com.lgfh.model.hero.Hero;
import co.com.lgfh.model.hero.gateways.HeroGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class HeroUseCase {

    final HeroGateway heroGateway;

    public List<Hero> listHeroes() {
        return heroGateway.getHeroes();
    }
    public Hero obtainHero(int id) {
        return heroGateway.getHero(id);
    }
    public Hero createHero(Hero hero) {
        return heroGateway.addHero(hero);
    }
    public Hero removeHero(int id) {
        return heroGateway.deleteHero(id);
    }
    public Hero refreshHero(Hero hero) {
        return heroGateway.updateHero(hero);
    }
    public List<Hero> listHeroes(String term) {
        return heroGateway.searchHeroes(term);
    }
}
