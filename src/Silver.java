public class Silver extends Card {
    Silver(cardHolder cardHolder) {
        super(cardType.SILVER, cardHolder, 2);
    }

    @Override
    public double currentDiscountRate() {
        if(getTurnover()<300){
            return getDiscountRate();
        }
        return 3.5;

    }
}
