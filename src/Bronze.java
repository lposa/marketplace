public class Bronze extends Card {
   Bronze(cardHolder cardHolder) {
        super(cardType.BRONZE, cardHolder, 0);
    }

    @Override
    public double currentDiscountRate() {
        if(getTurnover()<100){
            return 0;
        }
        if(getTurnover()<300){
            return 1;
        }

        return 2.5;  //this covers all the other cases, no need for an if statement
    }
}
