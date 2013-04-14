package controllers

import play.api._
import play.api.mvc._
import org.skyluc.tef.Tef
import scala.io.Source
import java.io.File

object Application extends Controller {
  
  def index = Action {
    val tef= Tef(Source.fromFile(new File("/home/luc/tmp/sap05.tef")))
    Ok(views.html.index(tef))
  }
  
}