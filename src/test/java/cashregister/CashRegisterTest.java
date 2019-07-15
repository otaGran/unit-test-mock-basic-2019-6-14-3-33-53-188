package cashregister;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        FakePrinter printer = new FakePrinter();
        CashRegister cashRegister = new CashRegister(printer);
        Item[] items = {new Item("pen",1.5),new Item("water",0.6)};


        //when
        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);
        //then

//        Throwable exception  = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
//            cashRegister.process(purchase);;
//        });
        assertEquals(true,printer.isPrinted());


    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
