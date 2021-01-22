package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "Password" should "be valid" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("Abcd@1234")

    assert(result == true)
  }

  it should "not be valid" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("abcd@1234")
    assert(result == false)
  }
}
