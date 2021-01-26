package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  behavior of "EmailValidatorTest"

  it should "be valid" in {
    val emailValidator = new EmailValidator()

    val result = emailValidator.emailIdIsValid("abc.123@example.com")

    assert(result)
  }

  it should "not be valid" in {
    val emailValidator = new EmailValidator()

    val result = emailValidator.emailIdIsValid("xyz$98765#@example.com")

    assert(!result)
  }
}
