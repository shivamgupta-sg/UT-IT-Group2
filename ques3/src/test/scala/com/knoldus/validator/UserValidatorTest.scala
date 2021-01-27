package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {

  "User" should "be valid as company exists and email is valid" in {
    val userValidator = new UserValidator()

    val userInputUser: User = User("Shivam",
      "shivam@knoldus.com",
      "Knoldus")

    val result = userValidator.isValid(userInputUser)

    assert(result)
  }

  it should "not be valid as email is not valid" in {
    val userValidator = new UserValidator()

    val userInputUser: User = User("Shivam",
      "shivam$123@sony.com",
      "Philips")

    val result = userValidator.isValid(userInputUser)

    assert(!result)
  }

  it should "not be valid as company doesn't exists" in {
    val userValidator = new UserValidator()

    val userInputUser: User = User("Shivam",
      "shivam.123@sony.com",
      "Sony")

    val result = userValidator.isValid(userInputUser)

    assert(!result)
  }

  it should "not be valid as email is not valid and company doesn't exists" in {
    val userValidator = new UserValidator()

    val userInputUser: User = User("Shivam",
      "shivam$123@sony.com",
      "Sony")

    val result = userValidator.isValid(userInputUser)

    assert(!result)
  }

}
