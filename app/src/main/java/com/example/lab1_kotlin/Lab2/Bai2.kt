package com.example.lab1_kotlin.Lab2

fun main() {
    //Bài 2: Nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm. Biết
    //rằng tháng 1, 2, 3 là quý 1; tháng 4, 5, 6 là quý 2; tháng 7, 8, 9 là quý 3; tháng 10,
    //11, 12 là quý 4
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}