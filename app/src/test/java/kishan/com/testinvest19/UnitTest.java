package kishan.com.testinvest19;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;

public class UnitTest {

    @Test
    public void checkUserAge(){

        ArrayList<UserDetails> userDetailsArrayList = new ArrayList<>();
        userDetailsArrayList.add(new UserDetails("Kishan Singh", 28, "Gorakhpur", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Shikha Singh", 24, "Ganesh Nagar", "New Delhi")) ;
        userDetailsArrayList.add(new UserDetails("Ayush Singh", 22, "Anand Nagar", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Neha Singh", 29, "AksharDham", "New Delhi")) ;

        Assert.assertThat(String.format("User of the correct age %s ", userDetailsArrayList), MainActivity.getFilteredData(userDetailsArrayList), is(false));
    }
}
