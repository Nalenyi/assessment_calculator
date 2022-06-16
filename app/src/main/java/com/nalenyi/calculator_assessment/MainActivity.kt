package com.nalenyi.calculator_assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstnumber:TextInputLayout
    lateinit var etFirstnumber:TextInputEditText
    lateinit var tilSecondnumber:TextInputLayout
    lateinit var etSecondnumber:TextInputEditText
    lateinit var tvResults:Button
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }
    fun castViews(){
        tilFirstnumber=findViewById(R.id.tilFirstnumber)
        etFirstnumber=findViewById(R.id.etFirstnumber)
        tilSecondnumber=findViewById(R.id.tilSecondnumber)
        etSecondnumber=findViewById(R.id.etSecondnumber)
        tvResults=findViewById(R.id.tvResults)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)


        btnAdd.setOnClickListener {

            var num1 = etFirstnumber.text.toString().toInt()
            var num2 = etFirstnumber.text.toString().toInt()

            adds(num1, num2)
        }
        btnSubtract.setOnClickListener {
            var num1=etFirstnumber.text.toString().toInt()
            var num2=etSecondnumber.text.toString().toInt()

            sub(num1,num2)
        }
        btnMultiply.setOnClickListener {
            var num1=etFirstnumber.text.toString().toInt()
            var num2=etSecondnumber.text.toString().toInt()

            multi(num1,num2)
        }
        btnModulus.setOnClickListener {
            var num1=etFirstnumber.text.toString().toInt()
            var num2=etSecondnumber.text.toString().toInt()

            mod(num1,num2)
        }
    }
    fun adds(numb1:Int, numb2:Int){
        var res=numb1+numb2
        tvResults.text=res.toString()
    }
    fun sub(numb1: Int,numb2: Int){
        var res=numb1-numb2
        tvResults.text=res.toString()
    }
    fun multi(numb1: Int,numb2:Int){
        var res=numb1*numb2
        tvResults.text=res.toString()
    }
    fun mod(numb1:Int,numb2:Int){
        var res=numb1%numb2
        tvResults.text=res.toString()
    }

}