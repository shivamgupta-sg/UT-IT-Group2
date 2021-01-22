name := "group2"

version := "1.0"

scalaVersion := "2.12.12"

idePackagePrefix := Some("com.knoldus")

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

lazy val ques1 = project.in(file("ques1"))
  .settings(
    libraryDependencies += scalaTest
  )

lazy val ques2 = project.in(file("ques2"))
  .settings(
    libraryDependencies += scalaTest
  )