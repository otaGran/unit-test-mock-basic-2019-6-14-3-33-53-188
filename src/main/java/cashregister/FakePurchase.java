package cashregister;

public class FakePurchase extends Purchase{

    public FakePurchase(Item[] items) {
        super(items);
    }

    @Override
    public String asString() {

        return "TEST";
    }

}
