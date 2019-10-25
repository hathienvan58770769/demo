package tent;

import accommodation.AccommodationAbstract;
import accommodation.AccommodationInterface;

public class Tent extends AccommodationAbstract implements AccommodationInterface {
    public Tent(String name) {
        this.setName(name);
    }

    @Override
    public float getCostFinal() {
        return 0;
    }

    @Override
    public int getNumberDate(int money) {
        return 0;
    }

    @Override
    public void paymentMoneyByVisaCard() {
        System.out.println("Hello. You chooses payment by Visa Card.");

    }

    @Override
    public void paymentMoneyByMasterCard() {
        System.out.println("Hello. You chooses payment by Master Card.");

    }
}
