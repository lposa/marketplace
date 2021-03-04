public class Gold extends Card{
    Gold(cardHolder cardHolder) {
        super(cardType.GOLD, cardHolder, 2);
    }

    @Override
    public double currentDiscountRate() {
        if(getTurnover()<100){
            return getDiscountRate();
        }

        double startingRate=1;
        double capRate=10;
        double startingTurnover=100;




//couldnt figure out the logic behind the gold card

return 1;
    }
}
