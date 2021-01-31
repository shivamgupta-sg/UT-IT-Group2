package com.knoldus.impl

import org.scalatest.flatspec.AnyFlatSpec

class NumberFunctionsImplTest extends AnyFlatSpec {

  val numberFunctionsImpl: NumberFunctionsImpl = new NumberFunctionsImpl()

  "Number" should "isPalindrome" in {

    val result: Boolean = numberFunctionsImpl.isPalindrome(12321)

    assert(result)

  }

  it should "is not palindrome" in {

    val result: Boolean = numberFunctionsImpl.isPalindrome(1321)

    assert(!result)

  }

  it should "factorial" in {

    val result: Int = numberFunctionsImpl.factorial(5)

    assert(result == 120)

  }

}
