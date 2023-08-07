package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {
    private var textInput: TextView? = null

    // buttons
    private var btnOne: Button? = null
    private var btnTwo: Button? = null
    private var btnThree: Button? = null
    private var btnFour: Button? = null
    private var btnFive: Button? = null
    private var btnSix: Button? = null
    private var btnSeven: Button? = null
    private var btnEight: Button? = null
    private var btnNine: Button? = null
    private var btnZero: Button? = null
    private var btnDecimal: Button? = null
    private var btnClr: Button? = null
    private var btnDivide: Button? = null
    private var btnMultiply: Button? = null
    private var btnSubtract: Button? = null
    private var btnAdd: Button? = null
    private var btnPercentage: Button? = null
    private var btnEqual: Button? = null
    private var btnBackspace: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInput = findViewById(R.id.textInput)

        btnOne = findViewById(R.id.btn1)
        btnTwo = findViewById(R.id.btn2)
        btnThree = findViewById(R.id.btn3)
        btnFour = findViewById(R.id.btn4)
        btnFive = findViewById(R.id.btn5)
        btnSix = findViewById(R.id.btn6)
        btnSeven = findViewById(R.id.btn7)
        btnEight = findViewById(R.id.btn8)
        btnNine = findViewById(R.id.btn9)
        btnZero = findViewById(R.id.btnZero)
        btnDecimal = findViewById(R.id.btnDecimal)
        btnClr = findViewById(R.id.btnClr)
        btnDivide = findViewById(R.id.btnDivide)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnAdd = findViewById(R.id.btnAdd)
        btnPercentage = findViewById(R.id.percentage)
        btnEqual = findViewById(R.id.btnEqual)
        btnBackspace = findViewById(R.id.backspace)

        var lastNumeric = true
        var lastDecimal = false
        var lastOperator = false

        // Numbers
        btnOne?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("1")
            } else {
                textInput?.append("1")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnTwo?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("2")
            } else {
                textInput?.append("2")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnThree?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("3")
            } else {
                textInput?.append("3")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnFour?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("4")
            } else {
                textInput?.append("4")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnFive?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("5")
            } else {
                textInput?.append("5")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnSix?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("6")
            } else {
                textInput?.append("6")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnSeven?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("7")
            } else {
                textInput?.append("7")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnEight?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("8")
            } else {
                textInput?.append("8")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnNine?.setOnClickListener {
            if (textInput?.text.toString() == "0") {
                textInput?.text = ""
                textInput?.append("9")
            } else {
                textInput?.append("9")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }
        btnZero?.setOnClickListener {
            if (textInput?.text.toString() != "0") {
                textInput?.append("0")
            }
            lastNumeric = true
            lastDecimal = false
            lastOperator = false
        }

        // Operators
        btnDecimal?.setOnClickListener {
            if (lastNumeric && !lastDecimal && !lastOperator
                && (textInput?.text?.contains(".") == false )) {
                textInput?.append(".")
                lastDecimal = true
                lastNumeric = false
                lastOperator = false
            }
        }
        btnDivide?.setOnClickListener {
            textInput?.text?.let {
                if (lastNumeric && !lastDecimal
                    && !lastOperator && !isOperatorAdded(it.toString())) {
                    textInput?.append("/")
                }
            }
            lastOperator = true
            lastDecimal = false
            lastNumeric = false
        }
        btnMultiply?.setOnClickListener {
            textInput?.text?.let {
                if (lastNumeric && !lastDecimal
                    && !lastOperator && !isOperatorAdded(it.toString())) {
                    textInput?.append("x")
                }
            }
            lastOperator = true
            lastDecimal = false
            lastNumeric = false
        }
        btnAdd?.setOnClickListener {
            textInput?.text?.let {
                if (lastNumeric && !lastDecimal
                    && !lastOperator && !isOperatorAdded(it.toString())) {
                    textInput?.append("+")
                }
            }
            lastOperator = true
            lastDecimal = false
            lastNumeric = false
        }
        btnSubtract?.setOnClickListener {
            textInput?.text?.let {
                if (lastNumeric && !lastDecimal
                    && !lastOperator && !isOperatorAdded(it.toString())) {
                    textInput?.append("-")
                }
            }
            lastOperator = true
            lastDecimal = false
            lastNumeric = false
        }
        btnPercentage?.setOnClickListener {
            textInput?.text?.let {
                if (lastNumeric && !lastDecimal
                    && !lastOperator && !isOperatorAdded(it.toString())) {
                    textInput?.append("%")
                }
            }
            lastNumeric = false
            lastOperator = true
            lastDecimal = false
        }

        btnEqual?.setOnClickListener {
            if (lastNumeric or (textInput?.text?.contains("%") == true)) {
                var textValue = textInput?.text.toString()
                var prefix = ""

                try {
                    if (textValue.startsWith("-")) {
                        prefix = "-"
                        textValue = textValue.substring(1)
                    }

                    if (textValue.contains("-")) {
                        val splitTextArray = textValue.split("-")
                        val value1 = prefix + splitTextArray[0]
                        val value2 = splitTextArray[1]
                        val result = value1.toDouble() - value2.toDouble()
                        textInput?.text = removeDecimal(result.toString())
                    }
                    else if (textValue.contains("+")) {
                        val splitTextArray = textValue.split("+")
                        val value1 = prefix + splitTextArray[0]
                        val value2 = splitTextArray[1]
                        val result = value1.toDouble() + value2.toDouble()
                        textInput?.text = removeDecimal(result.toString())
                    }
                    else if (textValue.contains("x")) {
                        val splitTextArray = textValue.split("x")
                        val value1 = prefix + splitTextArray[0]
                        val value2 = splitTextArray[1]
                        val result = value1.toDouble() * value2.toDouble()
                        textInput?.text = removeDecimal(result.toString())
                    }
                    else if (textValue.contains("/")) {
                        val splitTextArray = textValue.split("/")
                        val value1 = prefix + splitTextArray[0]
                        val value2 = splitTextArray[1]
                        val result = value1.toDouble() / value2.toDouble()
                        textInput?.text = removeDecimal(result.toString())
                    }
                    else if (textValue.contains("%")) {
                        if (lastOperator && !lastNumeric) {
                            val textSplit = textValue.substring(0, textValue.length-1)
                            val result = textSplit.toDouble() / 100.0
                            textInput?.text = result.toString()
                        }
                        else if (lastNumeric && !lastOperator) {
                            val textSplit = textValue.split("%")
                            val value1 = textSplit[0]
                            val value2 = textSplit[1]
                            val result = (value1.toDouble() * value2.toDouble())/100.0
                            textInput?.text = result.toString()
                        }
                    }
                }
                catch(e: ArithmeticException) {
                    e.printStackTrace()
                }
            }
        }
        btnClr?.setOnClickListener {
            textInput?.text = "0"
            lastOperator = false
            lastNumeric = true
            lastDecimal = false
        }
        btnBackspace?.setOnClickListener {
            val textValue = textInput?.text.toString()
            textInput?.text = textValue.substring(0, textValue.length - 1)
            if (textInput?.text.toString().isEmpty()) {
                textInput?.text = "0"
            }
        }
    }
    private fun removeDecimal(value: String): String {
        var result = value
        if (value.contains(".0")) {
            result = result.substring(0, result.length - 2)
        }
        return result
    }
    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        }
        else {
            value.contains("-")
                    || value.contains("x")
                    || value.contains("/")
                    || value.contains("+")
        }
    }
}