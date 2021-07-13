package jp.techacademy.yuuki.ishii.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("yuki", 18, hobby = "読書") //インスタンス1
        human.say()
        human.think()

        val human2 = Human("Bob", 28, hobby = "スポーツ")//インスタンス2
        human2.say()
        human2.think()
    }

}