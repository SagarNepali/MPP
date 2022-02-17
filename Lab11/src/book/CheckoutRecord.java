package book;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutRecordEntries = new ArrayList<>();

    public List<CheckoutRecordEntry> getCheckoutEntries(){
        return checkoutRecordEntries;
    }

    public CheckoutRecord(){

    }

    public void addEntry(CheckoutRecordEntry entry){
        checkoutRecordEntries.add(entry);
    }

    @Override
    public String toString(){
        return checkoutRecordEntries.toString();
    }
}
