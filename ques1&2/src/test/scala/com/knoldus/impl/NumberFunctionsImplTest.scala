package com.knoldus.impl

import org.scalatest.flatspec.AnyFlatSpec

class NumberFunctionsImplTest extends AnyFlatSpec {

  "Number" should "isPalindrome" in {
    val numberFunctionsImpl = new NumberFunctionsImpl()

    val result = numberFunctionsImpl.isPalindrome(12321)

    assert(result)

  }

  it should "is not palindrome" in {
    val numberFunctionsImpl = new NumberFunctionsImpl()

    val result = numberFunctionsImpl.isPalindrome(1321)

    assert(!result)

  }

  it should "factorial" in {
    val numberFunctionsImpl = new NumberFunctionsImpl()

    val result = numberFunctionsImpl.factorial(5)

    assert(result == 120)
  }

}
