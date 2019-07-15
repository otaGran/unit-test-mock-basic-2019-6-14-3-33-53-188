package cashregister;

public class FakePrinter extends Printer{
    private boolean isPrinted = false;
    private String testString = "";
    @Override
    public void print(String printThis) {
        isPrinted = true;
        testString = printThis;
    }

    public boolean isPrinted(){
        return isPrinted;
    }
    public String getTestString(){
        return testString;
    }
}
