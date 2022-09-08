name := "hello-java"

version := "0.2"

compile / javacOptions += "-Xlint:all"

javaOptions += "-enableassertions"

libraryDependencies ++= Seq(
 "com.novocode"   %  "junit-interface" % "0.11"   % Test
)

jacocoReportSettings := JacocoReportSettings()
  .withThresholds(
    JacocoThresholds(
      instruction = 80,
      method = 100,
      branch = 100,
      complexity = 100,
      line = 90,
      clazz = 100)
  )
  .withFormats(JacocoReportFormats.HTML)

enablePlugins(JavaAppPackaging)


