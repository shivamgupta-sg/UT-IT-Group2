package com.knoldus.validator

class PasswordValidator {
  def isValid(password: String): Boolean = {

    // password length should be between 8 to 15 characters
    if (!((password.length() >= 8)
      && (password.length() <= 15)))
      return false;

    // password should not contain any space
    if (password.contains(" ")) return false

    // password should contain at least one digit(0-9)
    if (true) {
      var count = 0
      // check digits from 0 to 9
      for (number <- 0 to 9) { // to convert int to string
        val digit = Integer.toString(number)
        if (password.contains(digit)) count = 1
      }
      if (count == 0) return false
    }

    // password should contain at least one lowercase letter(a-z)
    if (true) {
      var count = 0
      // checking small letters
      for (ascii <- 97 to 122) {
        val alphabet = ascii.toChar
        val alphabetStr = Character.toString(alphabet)
        if (password.contains(alphabetStr)) count = 1
      }
      if (count == 0) return false
    }

    // password should contain at least one uppercase letter(A-Z)
    if (true) {
      var count = 0
      // checking for capital letters
      for (ascii <- 65 to 90) {
        val alphabet = ascii.toChar
        val alphabetStr = Character.toString(alphabet)
        if (password.contains(alphabetStr)) count = 1
      }
      if (count == 0) return false
    }

    // password should contain at least one special character(@,#,%,$,etc.)
    if (!(password.contains("`") || password.contains("~")
      || password.contains("!") || password.contains("@")
      || password.contains("#") || password.contains("$")
      || password.contains("%") || password.contains("^")
      || password.contains("&") || password.contains("*")
      || password.contains("(") || password.contains(")")
      || password.contains("-") || password.contains("_")
      || password.contains("+") || password.contains("=")
      || password.contains("{") || password.contains("}")
      || password.contains("[") || password.contains("]")
      || password.contains("|") || password.contains("\\")
      || password.contains(":") || password.contains(";")
      || password.contains("'") || password.contains("\"")
      || password.contains("<") || password.contains(">")
      || password.contains(",") || password.contains(".")
      || password.contains("/") || password.contains("?"))) {
      return false;
    }

    return true;
  }
}
