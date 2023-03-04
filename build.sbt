name := "sbt-scoverage-samples"

organization := "org.scoverage"

version := "1.6.2"

scalaVersion := "3.3.0-RC3"

crossScalaVersions := Seq("2.13.9", "3.3.0-RC3")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")


coverageHighlighting := true
coverageFailOnMinimum := false
coverageMinimumStmtTotal := 70
coverageMinimumBranchTotal := 70
coverageMinimumStmtPerPackage := 70
coverageMinimumBranchPerPackage := 70
coverageMinimumStmtPerFile := 70
coverageMinimumBranchPerFile := 70

Test / publishArtifact := false
Test / parallelExecution := false
