organization  := "com.goticks"
name := """goticks"""
version       := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion  := "2.12.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

herokuAppName in Compile := """goticks"""

herokuIncludePaths in Compile := Seq(
  "src/main/resources"
)

libraryDependencies ++= {
  val akkaV = "2.5.22"
  Seq(
    guice, 
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka" %% "akka-slf4j"      % akkaV,
    "ch.qos.logback"    %  "logback-classic" % "1.1.3",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.8",
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "4.5.1" % "test",
    "org.scalatest"     %% "scalatest"       % "3.0.7"       % "test"
  )
}

//Revolver.settings

