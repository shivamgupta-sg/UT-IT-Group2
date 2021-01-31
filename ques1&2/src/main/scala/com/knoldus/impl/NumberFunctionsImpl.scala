package com.knoldus.impl

import com.knoldus.traits.NumberFunctions

class NumberFunctionsImpl extends NumberFunctions {

  /* checking if number is palindrome by checking first digit with last, second with second last and so on */
  override def isPalindrome(inputNumber: Int): Boolean = {
    val inputNumberToStr:String = inputNumber.toString
    val lenOfNumberStr:Int = inputNumberToStr.length

    for (counterForNumberStr <- 0 until lenOfNumberStr / 2) {
      if (inputNumberToStr(counterForNumberStr) != inputNumberToStr(lenOfNumberStr - counterForNumberStr - 1))
        return false
    }
    true
  }

  /* calculate factorial multiply number from 1 to input number */
  override def factorial(inputNumber: Int): Int = {
    var factorial:Int = 1
    for (number <- 1 to inputNumber) {
      factorial = factorial * number
    }
    factorial
  }

}
