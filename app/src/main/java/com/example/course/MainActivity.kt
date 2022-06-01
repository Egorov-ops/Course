package com.example.course

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest
import android.support.v4.app.Fragment
import android.support.v4.app.LoaderManager
import android.widget.AdapterView


 val i :Int = 5
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}