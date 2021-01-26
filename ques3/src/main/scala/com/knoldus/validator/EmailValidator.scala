package com.knoldus.validator

class EmailValidator {
  def emailIdIsValid(emailId: String): Boolean = {
    val emailIdRegex = "/[\w._%+-]+@[\w.-]+\.[a-zA-Z]{2,4}"

    if (!emailId.matches(emailIdRegex))
      return false

    true
  }
}
