package solution2

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader


fun main(args: Array<String>) {
    //read string array from txt
    val tt =
        BufferedReader(InputStreamReader(FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled1\\src\\main\\kotlin\\solution2\\input.txt")))
    val sum = tt.readLines().map {
        val item = it.split(":")
        val tries = item[1].split(";")
        var i = 0
        tries.forEach {
            var red = 12
            var green = 13
            var blue = 14
            it.split(",").forEach {
                val value = it.filter {
                    it.isDigit()
                }.toInt()
                if (it.contains("green")) {
                    green-=value
                } else if (it.contains("red")) {
                    red-=value
                } else {
                    blue-=value
                }
            }
            if(red<0 || green<0 || blue < 0){

            }else{
                i++
            }
        }
        if(i==tries.size){
            1
        }else{
            0
        }
    }.sum()
    println(sum)
}