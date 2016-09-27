package com.android.vicky.opencontact;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ImplicitContactOpen extends AppCompatActivity {
    Button btnOpenContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_contact_open);
        btnOpenContact = (Button)findViewById(R.id.openContact);
        btnOpenContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImplicitContactOpen.this,"Opening Contacts...",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivity(intent);
            }
        });
    }
}
