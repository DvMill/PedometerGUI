package kimmternship.pedometergui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapplayout);
        getusernamefromLogin();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
     public void getusernamefromLogin() { Intent intent = getIntent();
        String message = intent.getStringExtra(LoginPage.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.mainlayoutUsernameDisplay);
        textView.setText("Welcome "+message);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar_logout:
                Intent loginscreen = new Intent(getApplication(), LoginPage.class);
                startActivity(loginscreen);
                finish();
            case R.id.toolbar_UserDetails:

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    // TODO: Check if a user has information stored on a seperate database. Connect the databases using a left join
    
    // TODO: Work on and design features for app  using the mainapplayout.xml

    
}
