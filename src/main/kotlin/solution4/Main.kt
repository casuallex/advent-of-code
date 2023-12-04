package solution4

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader


fun main(args: Array<String>) {
    //read string array from txt
    val tt =
        BufferedReader(InputStreamReader(FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled1\\src\\main\\kotlin\\solution4\\input.txt")))
    val sum = tt.readLines().map {
        val item = it.split(":")
        val split = item[1].split("|")
        val answers = split[0]
        val answersArr = arrayListOf<Int>()
        for (i in 0 until answers.length-1 step 3) {
            val digit = if(answers[i+1].isDigit()){
                answers[i+1].digitToInt()
            }else{
                0
            }
            answersArr.add(digit * 10 + answers[2 + i].digitToInt())
        }
        println(answersArr)
        val tries = split[1]
        val triesArr = arrayListOf<Int>()
        for (i in 0 until tries.length-1 step 3) {
            val digit = if(tries[i+1].isDigit()){
                tries[i+1].digitToInt()
            }else{
                0
            }
            triesArr.add(digit * 10 + tries[2 + i].digitToInt())
        }
        println(triesArr)
        var count = 0
        triesArr.forEach {
            if (answersArr.contains(it)) {
                count += 1
            }
        }
        if (count == 0) {
            0
        } else {
            Math.pow(2.0, count - 1.0).toInt()
        }
    }.sum()
    println(sum)
}