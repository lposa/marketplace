public abstract class Card {
    private cardHolder cardHolder;
    private cardType cardType;
    private double turnover;
    private double discountRate;

    Card(cardType cardType, cardHolder cardHolder, double discountRate){
        this.cardType=cardType;
        this.cardHolder=cardHolder;
        this.discountRate=discountRate;
    }

    public abstract double currentDiscountRate();

    public cardType getCardType(){
        return cardType;
    }

    double getDiscountRate(){
        return discountRate;
    }

    double getTurnover(){
        return turnover;
    }

    public void setTurnover(double turnover){
        this.turnover=turnover;
}


}
