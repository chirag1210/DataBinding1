package com.anushka.bindingdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivitySecondBinding
import com.anushka.bindingdemo3.Student

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_second)

        binding.student=getStudent()

    }

    private fun getStudent():Student{
       return Student(1,"chirag","chirag@gmail.com")
    }
}