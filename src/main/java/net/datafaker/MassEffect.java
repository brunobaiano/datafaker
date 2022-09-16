package net.datafaker;

/**
 * Mass Effect is a military science fiction media franchise.
 *
 * @since 1.6.0
 */
public class MassEffect extends AbstractProvider {
    protected MassEffect(Faker faker) {
        super(faker);
    }

    public String character() {
        return resolve("mass_effect.characters");
    }

    public String specie() {
        return resolve("mass_effect.species");
    }

    public String cluster() {
        return resolve("mass_effect.cluster");
    }

    public String planet() {
        return resolve("mass_effect.planets");
    }

    public String quote(){
        return resolve("mass_effect.quotes");
    }

}
