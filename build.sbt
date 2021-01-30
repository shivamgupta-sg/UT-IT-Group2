name := "group2"

version := "1.0"

scalaVersion := "2.12.12"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
lazy val mockitoScala = "org.mockito" %% "mockito-scala" % "1.16.15" % Test

lazy val ques1and2 = project.in(file("ques1&2"))
  .settings(
    libraryDependencies += scalaTest
  )

lazy val ques3 = project.in(file("ques3"))
  .settings(
    libraryDependencies ++= Seq(
      scalaTest,
      mockitoScala
    )
  )

lazy val root = project.in(file(".")).aggregate(ques1and2, ques3)
