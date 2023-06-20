package com.softtech.kotlincomplete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class SignUpTabFragment : Fragment() {

    lateinit var name: EditText
    lateinit var mobile: EditText
    lateinit var pass: EditText
    lateinit var cfm_pass: EditText
    lateinit var btnRegistration: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root =  inflater.inflate(R.layout.signup_tab_fragment, container, false) as ViewGroup

        name = root.findViewById(R.id.name)
        mobile = root.findViewById(R.id.mobile)
        pass = root.findViewById(R.id.pass)
        cfm_pass = root.findViewById(R.id.cfm_pass)
        btnRegistration = root.findViewById(R.id.register)


        name.translationX = 800f
        mobile.translationX = 800f
        pass.translationX = 800f
        cfm_pass.translationX = 800f
        btnRegistration.translationX = 800f


        name.alpha = 0f
        mobile.alpha = 0f
        pass.alpha = 0f
        cfm_pass.alpha = 0f
        btnRegistration.alpha = 0f


        name.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(300).start()
        mobile.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(300).start()
        pass.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(500).start()
        cfm_pass.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(500).start()
        btnRegistration.animate().translationX(0f).alpha(1f).setDuration(800).setStartDelay(700).start()


        return  root

    }
}