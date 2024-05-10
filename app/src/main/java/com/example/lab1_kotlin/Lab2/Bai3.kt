package com.example.lab1_kotlin.Lab2

fun main() {
    //Bài 3: Viết chương trình kiểm tra 1 năm bất kỳ có phải năm nhuần hay không
    //(Năm nhuần là năm chia hết cho 4 nhưng không chia hết cho 100 hoặc chia hết
    //cho 400). Chương trình bắt buộc phải nhập năm >=0, nếu nhập sai bắt nhập lại
    //cho tới khi nào nhập đúng, kết thúc chương trình cho phép người dùng lựa chọn
    //tiếp tục hay không?
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}