public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String literatureType, int copies, int pages) {
        super(literatureType, copies);
        this.pages = pages;
    }


    @Override
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }
}