 package com.project;


 import android.content.Intent;
 import android.graphics.Typeface;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.TextView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

  Button btnSignIn, btnSignUp;
  TextView txtSlogan;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);

   setContentView(R.layout.activity_main);

   btnSignIn = (Button) findViewById(R.id.btnSignIn);
   btnSignUp = (Button) findViewById(R.id.btnSignUp);

   txtSlogan = (TextView) findViewById(R.id.txtSlogan);


//   Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Nabila.tff");
//   txtSlogan.setTypeface(face);

   btnSignIn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
   });

     btnSignUp.setOnClickListener (new View.OnClickListener() {
     @Override
     public void onClick(View view) {
      Intent signUp = new Intent(MainActivity.this, SignUp .class);
      startActivity(signUp);

     }
   });

     btnSignIn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       Intent signIn = new Intent(MainActivity.this, SignIn.class);
       startActivity(signIn);
      }
     });
  }

}
