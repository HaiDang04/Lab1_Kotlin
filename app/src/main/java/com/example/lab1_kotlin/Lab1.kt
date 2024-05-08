package com.example.lab1_kotlin

fun main(){
    println("Hello Kotlin - bai1")
    println("----------------------")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")



    val a = 1
    val b = 2
    var c = a + b

    val mess : String = "Tổng 2 số $a và $b là : $c"
    println(mess)

    val soA = 1
    val soB = 3f
    val kq = phepChia(soA,soB)
    println(kq)

    //Khai báo và sử dụng mảng
    var arrX = intArrayOf(1,2,3,4)
    var arrY = arrayOf(1.5f,"A",1)

    println("""Giá trị đầu tiên của mảng X:${arrX[0]}
        | Giá trị đầu tiên của mảng Y : ${arrY[0]}
    """.trimMargin())
}

fun phepChia(soA : Int,soB: Float):String {
    if (soB == 0f){
        return "$soB không được bằng 0!"
    }
    val thuong = soA / soB
    return "Thương 2 số $soA và $soB là $thuong"
}

class Lab1 {

}