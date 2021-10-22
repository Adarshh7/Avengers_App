package com.adarshh.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNum : EditText
    lateinit var etMobilePass : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPass : TextView
    lateinit var txtRegister : TextView
    val validMobileNum="8480278539"
    val validPassword="dev4429"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_avengers)
        title="Log in"

        etMobileNum=findViewById(R.id.editText1)
        etMobilePass=findViewById(R.id.editText2)
        btnLogin=findViewById(R.id.btnlogin)
        txtForgotPass=findViewById(R.id.forgotPass)
        txtRegister=findViewById(R.id.registerYou)




        btnLogin.setOnClickListener {

            val mobileNumber=etMobileNum.text.toString()
            val password=etMobilePass.text.toString()

            if((mobileNumber==validMobileNum)&&(password==validPassword))
           {
               val intent= Intent(this@LoginActivity,MainActivity::class.java)
               startActivity(intent)
           }
           else {
               Toast.makeText(this@LoginActivity, "Incorrect Credentials", Toast.LENGTH_LONG).show()
           }



        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }


}