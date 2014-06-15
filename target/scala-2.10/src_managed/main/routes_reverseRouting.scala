// @SOURCE:/home/master/vera/lab2-parte2-si1/conf/routes
// @HASH:b95ed678af040613906d274a29eda762f9c2fa9f
// @DATE:Sun Jun 15 13:31:02 BRT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def alterar(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "editar/alterar" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:9
def cadastrar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cadastro/novo")
}
                                                

// @LINE:13
def remover(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "editar/remover" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:11
def abrirRemover(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "remover/meta")
}
                                                

// @LINE:8
def editar(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editar")
}
                                                

// @LINE:7
def cadastro(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cadastro")
}
                                                

// @LINE:10
def abrirEdicao(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "editar/meta")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editar/alterar" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:9
def cadastrar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro/novo"})
      }
   """
)
                        

// @LINE:13
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editar/remover" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:11
def abrirRemover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.abrirRemover",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "remover/meta"})
      }
   """
)
                        

// @LINE:8
def editar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editar"})
      }
   """
)
                        

// @LINE:7
def cadastro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastro",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:10
def abrirEdicao : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.abrirEdicao",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editar/meta"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.alterar(id), HandlerDef(this, "controllers.Application", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """editar/alterar""")
)
                      

// @LINE:9
def cadastrar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastrar(), HandlerDef(this, "controllers.Application", "cadastrar", Seq(), "POST", """""", _prefix + """cadastro/novo""")
)
                      

// @LINE:13
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remover(id), HandlerDef(this, "controllers.Application", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """editar/remover""")
)
                      

// @LINE:11
def abrirRemover(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.abrirRemover(), HandlerDef(this, "controllers.Application", "abrirRemover", Seq(), "POST", """""", _prefix + """remover/meta""")
)
                      

// @LINE:8
def editar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editar(), HandlerDef(this, "controllers.Application", "editar", Seq(), "GET", """""", _prefix + """editar""")
)
                      

// @LINE:7
def cadastro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastro(), HandlerDef(this, "controllers.Application", "cadastro", Seq(), "GET", """""", _prefix + """cadastro""")
)
                      

// @LINE:10
def abrirEdicao(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.abrirEdicao(), HandlerDef(this, "controllers.Application", "abrirEdicao", Seq(), "POST", """""", _prefix + """editar/meta""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    