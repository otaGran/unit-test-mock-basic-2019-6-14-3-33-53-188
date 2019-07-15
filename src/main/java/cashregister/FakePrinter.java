package cashregister;

public class FakePrinter extends Printer{
    private boolean isPrinted = false;
    @Override
    public void print(String printThis) {
        isPrinted = true;
    }

    public boolean isPrinted(){
        return isPrinted;
    }
}
