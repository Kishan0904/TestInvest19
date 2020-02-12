package kishan.com.testinvest19;

public class UserDetails {

    private String name ;
    private int age ;
    private String address ;
    private String state ;


    public UserDetails(String name, int age, String address, String state) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }
}
