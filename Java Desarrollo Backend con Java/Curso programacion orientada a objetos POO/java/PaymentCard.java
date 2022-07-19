public class Card extends Payment {

    Integer numberCard;
    String dateCard;
    String cvv;

    public Card(Integer id, Integer numberCard, String dateCard, String cvv) {
        super(id, numberCard, dateCard, cvv);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }
}