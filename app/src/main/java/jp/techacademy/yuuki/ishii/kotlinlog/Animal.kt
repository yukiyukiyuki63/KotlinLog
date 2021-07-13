package jp.techacademy.yuuki.ishii.kotlinlog

abstract class Animal {
    var name: String
    var age: Int
    var hobby: String

    constructor(name: String, age: Int, hobby: String){
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()
    abstract fun think()
}