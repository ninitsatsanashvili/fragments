package com.example.tsk4

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment


class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()


    }
}