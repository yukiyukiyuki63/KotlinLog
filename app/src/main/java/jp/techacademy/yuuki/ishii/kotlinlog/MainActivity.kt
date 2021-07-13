package jp.techacademy.yuuki.ishii.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val dog = Dog("ポチ", 3)
        dog.move()
*/
        val human = Human("yuki", 18,"読書")
        human.say()
        human.think()
    }
}