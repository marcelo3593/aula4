package com.androidtc.contactsselectionaplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ContactIntentActivity extends Activity {
    private List<ContactObject> contactList;
    private int RUNTIME_PERMISSION_CODE = 2;

    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_contact_intent);
        ListView intentListView = (ListView) findViewById(R.id.listview1);
        contactList = new ArrayList<>();
        contactList.add(new ContactObject("Android One","111-111-1111", "www.androidATC.com"));
        contactList.add(new ContactObject("Android Two","222-222-2222", "www.androidATC.com"));
        contactList.add(new ContactObject("Android Three","333-333-3333", "www.androidATC.com"));
        contactList.add(new ContactObject("Android Four","444-444-4444", "www.androidATC.com"));

        List<String> listName = new ArrayList<>();

        for (int i=0; i < contactList.size(); i++){
        listName.add(contactList.get(i).getName());
        }

        ArrayAdapter<String> adapter =new ArrayAdapter<String>
                (ContactIntentActivity.this, android.R.layout.simple_list_item_1,listName);
        intentListView.setAdapter(adapter);
    }
}
