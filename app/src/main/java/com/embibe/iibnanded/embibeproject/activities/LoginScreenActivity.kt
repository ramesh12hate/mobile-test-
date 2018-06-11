package com.embibe.iibnanded.embibeproject.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_screen.*
import org.jetbrains.anko.toast
import android.util.Patterns
import android.text.TextUtils
import com.embibe.iibnanded.embibeproject.R
import java.util.regex.Pattern


class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        setViews()
    }

    private fun setViews() {
        tv_forget_password.setOnClickListener {
            toast("Navigate to Forget Password Screen")
        }
        btn_sign_in.setOnClickListener {
            if (et_username.text.isNotEmpty()) {
                if (isValidEmail(et_username.text.toString()) || isValidMobile(et_username.text.toString())) {
                    if (et_password.text.isNotEmpty())
                        toast("Navigate to Home Screen")
                    else
                        toast("Please enter password")

                } else
                    toast("Enter Valid User Name")
            } else {
                toast("Please enter email address or mobile number")
            }
        }
    }

    /**
     * @param target string which we want to validate
     * @return boolean based on validation
     */
    private fun isValidEmail(target: CharSequence): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }

    /**
     * @param phone the string which we ant to validate
     * @return boolean based on validation
     */
    private fun isValidMobile(phone: String): Boolean {
        val check: Boolean
        if (!Pattern.matches("[a-zA-Z]+", phone))
            check = !(phone.length > 10)
        else
            check = false

        return check
    }
}