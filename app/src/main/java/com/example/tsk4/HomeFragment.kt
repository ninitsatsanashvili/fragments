package com.example.tsk4

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import java.time.temporal.TemporalAmount

class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var amountEditText: EditText
    private lateinit var sendbutton: Button
    private lateinit var picture: ImageButton


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        amountEditText = view.findViewById(R.id.editTextTAmount)
        sendbutton = view.findViewById(R.id.buttonSend)


        val NavController = Navigation.findNavController(view)

        sendbutton.setOnClickListener {

            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

             NavController.navigate(action)
        }

    }
}