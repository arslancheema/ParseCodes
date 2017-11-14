
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /*
    // Saving Data in Parse Server
    ParseObject parseObject = new ParseObject("Score");
    parseObject.put("username", "Arslan");
    parseObject.put("score", 85);

    parseObject.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if (e==null){
          Log.i("saveInBackground", "Successfully Placed Object");
        } else{
          Log.i("saveInBackground", "Failed " + e.toString());
        }
      }
    });
    */

  /*
  // Retrieving data from Parse server
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.getInBackground("sYW6HjDrRg", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e==null && object!=null){

          // To update the score
          object.put("score",95);
          object.saveInBackground();

          Log.i("ObjectValue", "UserName " + object.getString("username") );
          Log.i("ObjectValue", "Score " + Integer.toString(object.getInt("score") ) );



        }
      }
    });
    */



  //Find something on Parse Server

    /*
    ParseQuery<ParseObject> findQuery = ParseQuery.getQuery("Score");

    //findQuery.whereEqualTo("username", "Arslan");


    findQuery.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {

        if (e == null  )

          Log.i("findInBackground", "Retrieved " + objects.size() + " Objects");

        if (objects.size() > 0 ){
          for (ParseObject object : objects){
            Log.i("findInBackgroundResult" , object.getString("username") + " : " + object.getInt("score") );

            // Increase score if < 50
            if (object.getInt("score") < 50){
              Log.i("findInBackground", "Score: " + object.getInt("score"));
              object.put("score", object.getInt("score") + 50 );
              object.saveInBackground();
            }

          }
        }

      }
    });
    */

    /*
    // Signing up Users

    ParseUser user = new ParseUser();
    user.setUsername("Cheema");
    user.setPassword("Password");


    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e) {
        if (e==null){
          Log.i("signUpInBackground", "SignUp Succesful ");
        }
      }
    });

    */


    ParseAnalytics.trackAppOpenedInBackground(getIntent());



  }

}
