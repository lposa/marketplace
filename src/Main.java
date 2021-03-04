import java.text.DecimalFormat;

public class Main {
    private static void printInvoice(int purchaseValue, Card card) {
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(card.getCardType() + ":\n"
                + "Your total purchase value is $" + df.format(purchaseValue) + "\n"
                + "Your discount rate is " + df.format(Cashier.discountRate(card)) + " %" + "\n"
                + "Discount is $" + df.format(Cashier.discount(purchaseValue, card)) + "\n"
                + "In total, you have to pay $" + df.format(Cashier.total(purchaseValue, card)) + "\n");
    }

    /* Creating an instances of a cardholder and a discount card,
     * updating the turnover and printing an exemplary invoice. */
    public static void main(String[] args) {
        // Bronze
        cardHolder cardholder = new cardHolder("Aleksandar Lilic");
        Card card = new Bronze(cardholder);
        printInvoice(150, card);

        // Silver
        cardholder = new cardHolder("Ognjen Kovacevic");
        card = new Silver(cardholder);
        card.setTurnover(600);
        printInvoice(850, card);

        // Gold
        cardholder = new cardHolder("Leonard Posa");
        card = new Gold(cardholder);
        card.setTurnover(1500);
        printInvoice(1300, card);
    }


}
