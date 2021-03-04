public class Cashier {
    public static double discountRate(Card card) {
        if (card == null) {
            return 0;
        }

        return card.currentDiscountRate();
    }

    public static double discount(double purchaseValue, Card card) {
        return discountRate(card) / 100 * purchaseValue; //calulates discount eg. if discount rate is 2.5 , then 2.5/100=0.025 * $200 =5
    }

    public static double total(double purchaseValue, Card card) {
        return purchaseValue - discount(purchaseValue, card); //calculates the total with the discount, so 200-5= 195
    }

}
