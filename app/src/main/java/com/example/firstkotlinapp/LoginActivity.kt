package com.example.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtnId.setOnClickListener{
            var email:String = emailEtId.text.toString()
            var password:String = passwordEtId.text.toString()

            var intent:Intent = Intent(this,
                MainActivity::class.java);

            intent.putExtra("email", email)
            intent.putExtra("password", password)
            startActivity(intent)
        }

    }
}
