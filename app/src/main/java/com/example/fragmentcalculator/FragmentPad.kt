package com.example.fragmentcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentPad: Fragment() {


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
        val view = inflater.inflate(R.layout.fragment_button_pad, container, false)

        return view
    }
/**
    fun digit(view: View) {

        if (end) {
            expression.text = (view as Button).text
            end = false
        }
        else {
            expression.append((view as Button).text)


        }
        lastdigit = true
    }
    fun operator(view: View) {
        if (lastdigit && !end) {
            expression.append((view as Button).text)
            lastdigit = false
            dot = false
        }
    }


    fun equal(view: View) {
        if (lastdigit && !end) {
            // Read the expression
            val txt = expression.text.toString()
            try {

                val exp = ExpressionBuilder(txt).build()
                val final = exp.evaluate()
                result.text = txt+"= " +final.toString()
                expression.text = " "
                dot = true
            } catch (ex: ArithmeticException) {
                expression.text = "Error"
                dot = true
                lastdigit = false
            }
        }
    }

    fun clear(view: View) {
        ResultFragment.expression.text = ""
        this.result.text=""
        lastdigit = false
        end = false
        dot = false
    }

    fun decimal(view: View) {
        if (lastdigit && !end && !dot) {
            expression.append(".")
            lastdigit = false
            dot = true
        }
    }
    fun backspace(view: View) {
        val immatureExp = expression.text.toString()
        val secondLastIndex = immatureExp.length
        if (secondLastIndex != 0) {
            expression.text = immatureExp.substring(0, secondLastIndex - 1)

        }
    }
    */
}