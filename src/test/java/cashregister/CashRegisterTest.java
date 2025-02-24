package cashregister;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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
        assertTrue(printer.isPrinted());


    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        FakePrinter printer = new FakePrinter();
        CashRegister cashRegister = new CashRegister(printer);
        Item[] items = {new Item("pen",1.5),new Item("water",0.6)};


        //when
        FakePurchase purchase = new FakePurchase(items);
        cashRegister.process(purchase);

        //then
        assertEquals(purchase.asString(),printer.getTestString());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        Printer printer = mock(Printer.class);
        Purchase purchase = mock(Purchase.class);

        when(purchase.asString()).thenReturn("TEST");
        CashRegister cashRegister = new CashRegister(printer);
        //when
        cashRegister.process(purchase);
        //then
        verify(printer).print("TEST");
    }

}
