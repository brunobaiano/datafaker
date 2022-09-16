package net.datafaker;

/**
 * @since 0.8.0
 */
public class RickAndMorty extends AbstractProvider {

    protected RickAndMorty(final Faker faker) {
        super(faker);
    }

    public String character() {
        return resolve("rick_and_morty.characters");
    }

    public String location() {
        return resolve("rick_and_morty.locations");
    }

    public String quote() {
        return resolve("rick_and_morty.quotes");
    }
}
