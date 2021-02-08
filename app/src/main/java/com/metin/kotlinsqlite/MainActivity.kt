package com.metin.kotlinsqlite

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        try {
            val myDatabase = this.openOrCreateDatabase("Musician", Context.MODE_PRIVATE, null)
            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musician (id INTEGER  PRIMARY KEY, name VARCHAR, age INT)")

            myDatabase.execSQL("INSERT INTO musician (name, age) VALUES ('John',32)")

            val cursor = myDatabase.rawQuery("SELECT * FROM Musician",null)

            val nameIx = cursor.getColumnIndex("name")
            val ageIx = cursor.getColumnIndex("age")
            val idIx = cursor.getColumnIndex("id")

            while (cursor.moveToNext()) {
                println("Name: "+cursor.getString(nameIx))
                println("Age: "+cursor.getInt(ageIx))
                println("Id: "+cursor.getInt(idIx))
            }

            cursor.close()

        } catch (e: Exception) {
            e.printStackTrace()
        }*/
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater;
        menuInflater.inflate(R.menu.add_art,menu);

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.add_art_item) {
            val intent = Intent(this, MainActivity2::class.java);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item)
    }


}

