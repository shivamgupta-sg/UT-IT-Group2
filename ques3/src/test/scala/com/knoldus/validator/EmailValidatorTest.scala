package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  "Email" should "be valid" in {
    val emailValidator = new EmailValidator()

    val result = emailValidator.emailIdIsValid("abc.123@example.com")

    assert(result)
  }

  it should "not be valid" in {
    val emailValidator = new EmailValidator()

    val result = emailValidator.emailIdIsValid("sony$123@sony.com")

    assert(!result)
  }
}
