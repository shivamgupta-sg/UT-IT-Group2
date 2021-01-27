package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {

  "Password" should "be valid" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("Abcd@1234")

    assert(result)
  }

  it should "not be valid as it contains a blank space" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("abcd @1234A")

    assert(!result)
  }


  it should "not be valid as it does not have atleast one digit(0-9)" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("abcdXYZ@L")

    assert(!result)
  }

  it should "not be valid as length should be between 8-15 character" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("ab@12")

    assert(!result)
  }

  it should "not be valid as does not have atleast one lowercase letter" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("ABC@1234")

    assert(!result)
  }


  it should "not be valid as does not have atleast one uppercase letter" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("abcd@1234")

    assert(!result)
  }

  it should "not be valid as it does not have atleast one special character" in {
    val passwordValidator = new PasswordValidator()

    val result = passwordValidator.isValid("abcd @1234A")
    assert(!result)
  }

}
