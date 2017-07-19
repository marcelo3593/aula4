package com.androidtc.contactsselectionaplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.TextView;

public class ContactPageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        TextView contactName = (TextView) findViewById(R.id.contactName);
        TextView contactPhone = (TextView) findViewById(R.id.contactPhone);
        TextView contactWebSite = (TextView) findViewById(R.id.contactWebSite);
    }


}
