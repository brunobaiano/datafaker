package net.datafaker;

/**
 * @since 1.5.0
 */
public class BigBangTheory extends AbstractProvider {

    protected BigBangTheory(Faker faker) {
        super(faker);
    }

    /**
     * This method generates a random Big Bang Theory's character's name.
     *
     * @return a string of Big Bang Theory's character's name.
     */
    public String character() {
        return resolve("big_bang_theory.characters");
    }

    /**
     * This method generates a random Big Bang Theory's character's quote.
     *
     * @return a string of Big Bang Theory's character's quote.
     */
    public String quote() {
        return resolve("big_bang_theory.quotes");
    }
}
