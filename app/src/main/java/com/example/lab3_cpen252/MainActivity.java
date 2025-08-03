package com.example.lab3_cpen252;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.lab3_cpen252.databinding.ActivityMainBinding;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
        // Class lab3
    }

    // Class lab3

    public static void main(String[] args) {
//        Note note1 = new TextNote();
//        User user1 = new User();

//        note1.title = "Introduction to Java";
//        note1.content = "Java is a high-level programming language developed by Sun Microsystems...";
//        note1.createdDate = "2025-07-17";
//        note1.getSummary();

        TextNote textNote1 = new TextNote();
        textNote1.title = "Introduction to Java";
        //textNote1.content = "Java is a high-level programming language developed by Sun Microsystems...";
        textNote1.setTextContent = "Java is a high-level programming language developed by Sun Microsystems...";
        textNote1.createdDate = "2025-07-17";
        textNote1.getSummary();


//        user1.username = "zero";
//        user1.password = "StrongPass!2025";
//        user1.email = "zero@example.com";
//        user1.information();
//        user1.logout();

        AdminUser admin = new AdminUser();
        admin.setUsername("admin01");
        admin.setPassword("1234");
        admin.setEmail("admin@mail.com");
        admin.information();
        admin.logout();

        CustomerUser customer = new CustomerUser();
        customer.setUsername("zero");
        customer.setPassword("StrongPass!2025");
        customer.setEmail("zero@example.com");
        customer.information();
        customer.logout();
    }
}