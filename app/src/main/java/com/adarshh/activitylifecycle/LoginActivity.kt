package com.adarshh.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
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
    val validPassword= arrayOf("baby","meow","kant","dev","other")
    var nameOfAvenger="Avenger"
    lateinit var sharedPreferences: SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_avengers)
        title="Log in"

        sharedPreferences=getSharedPreferences(getString(R.string.preferences_file_name), Context.MODE_PRIVATE)

        val isLoggedin=sharedPreferences.getBoolean("isLoggedin",false)

        if(isLoggedin)
        {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)

        }
        else
        {
            setContentView(R.layout.login_avengers)
        }

        etMobileNum=findViewById(R.id.editText1)
        etMobilePass=findViewById(R.id.editText2)
        btnLogin=findViewById(R.id.btnlogin)
        txtForgotPass=findViewById(R.id.forgotPass)
        txtRegister=findViewById(R.id.registerYou)

        val intent = Intent(this@LoginActivity, MainActivity::class.java)


        btnLogin.setOnClickListener {

            val mobileNumber=etMobileNum.text.toString()
            val password=etMobilePass.text.toString()

            if(mobileNumber==validMobileNum) {
                if (password == validPassword[0]) {
                    nameOfAvenger = "Spruha"
                    startActivity(intent)

                }
                else if (password == validPassword[1]) {
                    nameOfAvenger = "Annie"
                    savePreferences(nameOfAvenger)
                    startActivity(intent)
                }
                else if (password == validPassword[2]) {
                    nameOfAvenger = "Somo"
                    savePreferences(nameOfAvenger)
                    startActivity(intent)
                }
                else if (password == validPassword[3]) {
                    nameOfAvenger = "God"
                    savePreferences(nameOfAvenger)
                    startActivity(intent)
                }
                else if (password == validPassword[4]) {
                    savePreferences(nameOfAvenger)
                    startActivity(intent)
                }


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

    fun savePreferences(title:String)
    {
        sharedPreferences.edit().putBoolean("isLoggedin",true).apply()
        sharedPreferences.edit().putString("Title",title).apply()
    }


}