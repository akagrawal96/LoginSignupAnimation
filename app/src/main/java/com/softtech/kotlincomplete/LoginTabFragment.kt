package com.softtech.kotlincomplete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class LoginTabFragment : Fragment() {

    lateinit var mobile:EditText
    lateinit var pass:EditText
    lateinit var forgotPass:TextView
    lateinit var btnLogin:Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root =  inflater.inflate(R.layout.login_tab_fragment, container, false) as ViewGroup

        mobile = root.findViewById(R.id.mobile)
        pass = root.findViewById(R.id.pass)
        forgotPass = root.findViewById(R.id.forgotPass)
        btnLogin = root.findViewById(R.id.login)


        mobile.translationX = 800f
        pass.translationX = 800f
        forgotPass.translationX = 800f
        btnLogin.translationX = 800f


        mobile.alpha = 0f
        pass.alpha = 0f
        forgotPass.alpha = 0f
        btnLogin.alpha = 0f


        mobile.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(300).start()
        pass.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(500).start()
        forgotPass.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(500).start()
        btnLogin.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(700).start()


        return  root
    }
}