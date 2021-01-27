package com.knoldus.impl

import com.knoldus.traits.NumberFunctions

class NumberFunctionsImpl extends NumberFunctions {

  /* checking if number is palindrome by checking first digit with last, second with second last and so on */
  override def isPalindrome(inputNumber: Int): Boolean = {
    val inputNumberToStr = inputNumber.toString
    val lenOfNumberStr = inputNumberToStr.length

    for (counter <- 0 until lenOfNumberStr / 2) {
      if (inputNumberToStr(counter) != inputNumberToStr(lenOfNumberStr - counter - 1))
        return false
    }
    true
  }

  /* calculate factorial multiply number from 1 to input number */
  override def factorial(inputNumber: Int): Int = {
    var factorial = 1
    for (number <- 1 to inputNumber) {
      factorial = factorial * number
    }
    factorial
  }
}
