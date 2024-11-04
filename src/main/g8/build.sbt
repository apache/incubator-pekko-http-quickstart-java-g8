val pekkoHttpVersion = "$pekko_http_version$"
val pekkoVersion    = "$pekko_version$"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.13.14",
      name := "$name$"
    )),
    name := "TestProject",
    libraryDependencies ++= Seq(
      "org.apache.pekko" %% "pekko-http"            % pekkoHttpVersion,
      "org.apache.pekko" %% "pekko-actor-typed"     % pekkoVersion,
      "org.apache.pekko" %% "pekko-stream"          % pekkoVersion,
      "org.apache.pekko" %% "pekko-http-jackson"    % pekkoHttpVersion,
      "ch.qos.logback"    % "logback-classic"        % "1.3.14",

      "org.apache.pekko" %% "pekko-testkit"                 % pekkoVersion     % Test,
      "org.apache.pekko" %% "pekko-http-testkit"            % pekkoHttpVersion % Test,
      "org.apache.pekko" %% "pekko-actor-testkit-typed"     % pekkoVersion     % Test,
      "junit"             % "junit"                         % "4.13.2"         % Test,
      "com.novocode"      % "junit-interface"               % "0.11"           % Test
    ),

    testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
  )
