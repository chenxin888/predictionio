name := "predictionio-scheduler"

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "mysql" % "mysql-connector-java" % "5.1.22",
  "org.clapper" %% "scalasti" % "1.0.0",
  "org.quartz-scheduler" % "quartz" % "2.1.7",
  "org.specs2" %% "specs2" % "1.14" % "test")

play.Project.playScalaSettings