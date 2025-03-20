public class AudioBook extends Title {
    private int durationInMinutes;

    public <String> AudioBook(String literatureType, int copies, int durationInMinutes) {
        super((java.lang.String) literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    // Beregner points for lydbog
    @Override
    protected double calculatePoints() {
        double literaturePoint = switch (literatureType) {
            case "BI", "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0;
        };
        return (durationInMinutes * 0.5) * literaturePoint * copies;
    }
}
