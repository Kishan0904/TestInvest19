package kishan.com.testinvest19;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    private static LinearLayout linearView ;
    @SuppressLint("StaticFieldLeak")
    private static Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearView = findViewById(R.id.linearView) ;
        context = MainActivity.this ;
        /*
           Setting User Data in list
         */
        setUpData() ;
    }

    private void setUpData() {
        ArrayList<UserDetails> userDetailsArrayList = new ArrayList<>();
        userDetailsArrayList.add(new UserDetails("Kishan Singh", 28, "Gorakhpur", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Shikha Singh", 24, "Ganesh Nagar", "New Delhi")) ;
        userDetailsArrayList.add(new UserDetails("Ayush Singh", 22, "Anand Nagar", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Neha Singh", 20, "AksharDham", "New Delhi")) ;
        userDetailsArrayList.add(new UserDetails("Sudha Singh", 45, "Anand Nagar", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Ajay Singh", 52, "Gorakhpur", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Srinika Singh", 10, "Anand Nagar", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Aman Kumar", 23, "Meerut", "Uttar Pradesh")) ;
        userDetailsArrayList.add(new UserDetails("Vicky Kumar", 26, "BhagalPur", "Bihar")) ;
        userDetailsArrayList.add(new UserDetails("Shubham Verma", 29, "Haryana", "Gurugram")) ;
        userDetailsArrayList.add(new UserDetails("Lalit Kumar", 24, "Shastri Nagar", "New Delhi")) ;
        userDetailsArrayList.add(new UserDetails("Satendra Kumar", 23, "Shastri Park", "New Delhi")) ;
        userDetailsArrayList.add(new UserDetails("Nitesh", 60, "SoniPat", "Gurugram")) ;
        userDetailsArrayList.add(new UserDetails("Gaurav Sharma", 25, "Alighar", "New Delhi")) ;


        /*
            Get Filtered Data From List
         */
        getFilteredData(userDetailsArrayList) ;
    }

    public static boolean getFilteredData(ArrayList<UserDetails> userDetailsArrayList) {
        if (userDetailsArrayList.size()>0){
            boolean ageValue = false;
            for (int i = 0; i< userDetailsArrayList.size(); i++){
                int userAge = userDetailsArrayList.get(i).getAge() ;

                if (userAge>15 && userAge<25){
                    String userNameValue = userDetailsArrayList.get(i).getName() ;
                    int userAgeValue = userDetailsArrayList.get(i).getAge() ;
                    String userAddValue = userDetailsArrayList.get(i).getAddress() ;
                    String userStateValue = userDetailsArrayList.get(i).getState() ;

                    String finalValue = "Name: " + userNameValue + ", Age: " + String.valueOf(userAgeValue) + ", Address: " + userAddValue + ", State " + userStateValue + "\n";
                    /*TextView textView = new TextView(context) ;
                    textView.setText(finalValue);
                    textView.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));
                    linearView.addView(textView);*/

                    ageValue = true ;
                   // Log.v("UserName", finalValue) ;
                }else {
                    ageValue = false ;
                }
            }
            return ageValue ;
        }

        return false ;
    }
}
