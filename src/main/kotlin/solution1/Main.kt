package solution1

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader


fun main(args: Array<String>) {
    //read string array from txt
    val tt =
        BufferedReader(InputStreamReader(FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled1\\src\\main\\kotlin\\input.txt")))
    val sum = tt.readLines().map {
        val chars = it.filter {
            it.isDigit()
        }
        chars[0].digitToInt() * 10 + chars[chars.length-1].digitToInt()
    }.sum()
    println(sum)
}