name := "template-scala-parallel-similarproduct"

parallelExecution in Test := false
test in assembly := {}

scalaVersion := "2.12.6"
libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.16.0" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "3.0.3" % "provided",
  "org.scalatest"           %% "scalatest"                % "3.1.0-M2" % "test")
