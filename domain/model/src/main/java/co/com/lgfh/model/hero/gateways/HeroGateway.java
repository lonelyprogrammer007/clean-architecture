package co.com.lgfh.model.hero.gateways;

import co.com.lgfh.model.hero.Hero;

import java.util.List;

public interface HeroGateway {
    List<Hero> getHeroes();
    Hero getHero(int id);
    Hero updateHero(Hero hero);
    Hero addHero(Hero hero);
    Hero deleteHero(int id);
    List<Hero> searchHeroes(String term);
}
