import java.util.ArrayList;

public class AddressBook {

    private  ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", 613,  "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
