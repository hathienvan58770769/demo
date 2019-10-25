package accommodation;

public interface AccommodationInterface {
    public static int BED = 1;
    public static int PRICE_1DATE = 10;

    public float getCostFinal();
    public int getNumberDate(int money);
    public void paymentMoneyByVisaCard();
    public void paymentMoneyByMasterCard();
}
