package com.example.fragmentcalculator

import android.os.Bundle
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment: Fragment() {
    private lateinit var expression: TextView
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object{
        fun newInstance(): FragmentPad{
            return FragmentPad()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstance: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_result_view, container, false)
        result=view.findViewById(R.id.result);
        expression=view.findViewById(R.id.expression);

        return view
    }

}