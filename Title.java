public abstract class Title {
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574;

    public Title(String literatureType, int copies) {
        this.literatureType = literatureType;
        this.copies = copies;
    }


    public double calculateRoyalties() {
        double points = calculatePoints();
        return points * RATE;
    }


    protected abstract double calculatePoints();


    protected double calculateLiteraturePoints() {
        return switch (literatureType) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
    }
}