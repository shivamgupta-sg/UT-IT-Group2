package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {

  behavior of "CompanyValidatorTest"

  it should "be valid" in {
    val companyValidator = new CompanyValidator()

    val userInputComapny: Company = Company("Sony",
      "sony@sony.com",
      "Noida")

    val result = companyValidator.companyIsValid(userInputComapny)

    assert(result)
  }

  it should "not be valid" in {
    val companyValidator = new CompanyValidator()

    val userInputComapny: Company = Company("Sony",
      "sony$123@sony.com",
      "Noida")

    val result = companyValidator.companyIsValid(userInputComapny)

    assert(!result)
  }

}
