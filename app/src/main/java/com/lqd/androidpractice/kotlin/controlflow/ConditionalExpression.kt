package com.lqd.androidpractice.kotlin.controlflow


fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}