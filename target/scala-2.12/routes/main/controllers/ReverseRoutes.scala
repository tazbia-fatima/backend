// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/tazz1/play-java-starter-example/conf/routes
// @DATE:Sat Dec 29 13:20:45 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:11
  class ReverseHelloWorldControl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def HelloTazz(name:String, age:Integer = 17): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "HelloTazz/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + play.core.routing.queryString(List(if(age == 17) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("age", age)))))
    }
  
    // @LINE:11
    def HelloWorld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "HelloWorld")
    }
  
    // @LINE:13
    def Hellos(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Hellos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:12
    def Hellotazz(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Hellotazz")
    }
  
  }

  // @LINE:5
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def updatebookbyid(Id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:5
    def createbook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:9
    def getallbooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:8
    def deletebookbyid(Id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:6
    def getbookbyid(Id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
  }

  // @LINE:17
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
