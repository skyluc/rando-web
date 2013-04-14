import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "rando-web"
  val appVersion      = "0.1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "org.skyluc" %% "tef" % "0.1.0-SNAPSHOT"
//    jdbc,
  //  anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
