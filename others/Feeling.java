package others;

public enum Feeling {
    CAREFUL("Осторожный"),
    CONFIDENT("Уверенный"),
    CALM("Спокойный");

    private final String feel;

    Feeling(String feel){
        this.feel = feel;
    }

    public String getFeel(){
        return feel;
    }

}