public class BuddyInfo {

    private final String name;
    private final int phoneNumber;
    private final String address;

    public BuddyInfo(String name, int phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public BuddyInfo() {
        this("Empty", 0, "Empty");
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", 613, "Carleton");
        System.out.println("Hello " + buddy.getName());

        System.out.println("hello");
    }
}
