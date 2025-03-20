public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author = new Author("Olga Ravn");


        author.addTitle(new PrintedBook("TE", 140, 72));
        author.addTitle(new PrintedBook("SKØN", 50, 300));
        author.addTitle(new AudioBook("SKØN", 10, 400) {
            @Override
            public double calculatePoints() {
                return 0;
            }
        });


        double totalPay = author.calculateTotalPay();


        System.out.printf("%s: %.2fkr%n", author.getName(), totalPay);
    }
}