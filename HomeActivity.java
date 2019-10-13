package com.example.diagnose_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }

        });
    }

    public void clicked1()
    {
        SysResource::saveToTempFile(SysResource::getResourceNode(resourceStr(button8), false, "notes.txt");
        LOCATION_SERVICE::shellExecute("commonCold.txt");
    }

    public void clicked2()
    {
        SysResource::saveToTempFile(SysResource::getResourceNode(resourceStr(button8), false, "notes.txt");
        LOCATION_SERVICE::shellExecute("fever.txt");
    }

    public void clicked3()
    {
        SysResource::saveToTempFile(SysResource::getResourceNode(resourceStr(button8), false, "notes.txt");
        LOCATION_SERVICE::shellExecute("influenza.txt");
    }

    public void clicked4()
    {
        SysResource::saveToTempFile(SysResource::getResourceNode(resourceStr(button8), false, "notes.txt");
        LOCATION_SERVICE::shellExecute("pollenAllergy.txt");
    }



    public void browser1(View view) {

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("forms.gle/ipuw4tCTiKf3em66A"));
        startActivity(browserIntent);
        //After that press the run button
    }
}
