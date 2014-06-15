// @SOURCE:/home/master/vera/lab2-parte2-si1/conf/routes
// @HASH:b95ed678af040613906d274a29eda762f9c2fa9f
// @DATE:Sun Jun 15 13:31:02 BRT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_cadastro1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro"))))
        

// @LINE:8
private[this] lazy val controllers_Application_editar2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editar"))))
        

// @LINE:9
private[this] lazy val controllers_Application_cadastrar3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro/novo"))))
        

// @LINE:10
private[this] lazy val controllers_Application_abrirEdicao4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editar/meta"))))
        

// @LINE:11
private[this] lazy val controllers_Application_abrirRemover5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remover/meta"))))
        

// @LINE:12
private[this] lazy val controllers_Application_alterar6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editar/alterar"))))
        

// @LINE:13
private[this] lazy val controllers_Application_remover7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editar/remover"))))
        

// @LINE:16
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.Application.cadastro()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editar""","""controllers.Application.editar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro/novo""","""controllers.Application.cadastrar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editar/meta""","""controllers.Application.abrirEdicao()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remover/meta""","""controllers.Application.abrirRemover()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editar/alterar""","""controllers.Application.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editar/remover""","""controllers.Application.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_cadastro1(params) => {
   call { 
        invokeHandler(controllers.Application.cadastro(), HandlerDef(this, "controllers.Application", "cadastro", Nil,"GET", """""", Routes.prefix + """cadastro"""))
   }
}
        

// @LINE:8
case controllers_Application_editar2(params) => {
   call { 
        invokeHandler(controllers.Application.editar(), HandlerDef(this, "controllers.Application", "editar", Nil,"GET", """""", Routes.prefix + """editar"""))
   }
}
        

// @LINE:9
case controllers_Application_cadastrar3(params) => {
   call { 
        invokeHandler(controllers.Application.cadastrar(), HandlerDef(this, "controllers.Application", "cadastrar", Nil,"POST", """""", Routes.prefix + """cadastro/novo"""))
   }
}
        

// @LINE:10
case controllers_Application_abrirEdicao4(params) => {
   call { 
        invokeHandler(controllers.Application.abrirEdicao(), HandlerDef(this, "controllers.Application", "abrirEdicao", Nil,"POST", """""", Routes.prefix + """editar/meta"""))
   }
}
        

// @LINE:11
case controllers_Application_abrirRemover5(params) => {
   call { 
        invokeHandler(controllers.Application.abrirRemover(), HandlerDef(this, "controllers.Application", "abrirRemover", Nil,"POST", """""", Routes.prefix + """remover/meta"""))
   }
}
        

// @LINE:12
case controllers_Application_alterar6(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.alterar(id), HandlerDef(this, "controllers.Application", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """editar/alterar"""))
   }
}
        

// @LINE:13
case controllers_Application_remover7(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.remover(id), HandlerDef(this, "controllers.Application", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """editar/remover"""))
   }
}
        

// @LINE:16
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     