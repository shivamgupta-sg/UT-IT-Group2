package com.knoldus.impl

import com.knoldus.traits.NumberFunctions

class NumberFunctionsImpl extends NumberFunctions {
  override def isPalindrome(inputNumber: Int): Boolean = {
    val inputNumberToStr = inputNumber.toString
    val lenOfNumberStr = inputNumberToStr.length

    for (counter <- 0 until lenOfNumberStr / 2) {
      if (inputNumberToStr(counter) != inputNumberToStr(lenOfNumberStr - counter - 1))
        return false
    }
    true
  }

  override def factorial(inputNumber: Int): Int = {
    var factorial = 1
    for (number <- 1 to inputNumber) {
      factorial = factorial * number
    }
    factorial
  }
}
