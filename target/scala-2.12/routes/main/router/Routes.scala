// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/tazz1/play-java-starter-example/conf/routes
// @DATE:Sat Dec 29 13:20:45 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  BooksController_2: controllers.BooksController,
  // @LINE:11
  HelloWorldControl_4: controllers.HelloWorldControl,
  // @LINE:17
  HomeController_1: controllers.HomeController,
  // @LINE:19
  CountController_0: controllers.CountController,
  // @LINE:21
  AsyncController_3: controllers.AsyncController,
  // @LINE:24
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    BooksController_2: controllers.BooksController,
    // @LINE:11
    HelloWorldControl_4: controllers.HelloWorldControl,
    // @LINE:17
    HomeController_1: controllers.HomeController,
    // @LINE:19
    CountController_0: controllers.CountController,
    // @LINE:21
    AsyncController_3: controllers.AsyncController,
    // @LINE:24
    Assets_5: controllers.Assets
  ) = this(errorHandler, BooksController_2, HelloWorldControl_4, HomeController_1, CountController_0, AsyncController_3, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BooksController_2, HelloWorldControl_4, HomeController_1, CountController_0, AsyncController_3, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.createbook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.getbookbyid(Id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.updatebookbyid(Id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.deletebookbyid(Id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getallbooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HelloWorld""", """controllers.HelloWorldControl.HelloWorld"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Hellotazz""", """controllers.HelloWorldControl.Hellotazz"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Hellos/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldControl.Hellos(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HelloTazz/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldControl.HelloTazz(name:String, age:Integer ?= 17)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_BooksController_createbook0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_createbook0_invoker = createInvoker(
    BooksController_2.createbook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "createbook",
      Nil,
      "POST",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_BooksController_getbookbyid1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getbookbyid1_invoker = createInvoker(
    BooksController_2.getbookbyid(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getbookbyid",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_BooksController_updatebookbyid2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_updatebookbyid2_invoker = createInvoker(
    BooksController_2.updatebookbyid(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "updatebookbyid",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BooksController_deletebookbyid3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_deletebookbyid3_invoker = createInvoker(
    BooksController_2.deletebookbyid(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "deletebookbyid",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_BooksController_getallbooks4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getallbooks4_invoker = createInvoker(
    BooksController_2.getallbooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getallbooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HelloWorldControl_HelloWorld5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HelloWorld")))
  )
  private[this] lazy val controllers_HelloWorldControl_HelloWorld5_invoker = createInvoker(
    HelloWorldControl_4.HelloWorld,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldControl",
      "HelloWorld",
      Nil,
      "GET",
      this.prefix + """HelloWorld""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HelloWorldControl_Hellotazz6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Hellotazz")))
  )
  private[this] lazy val controllers_HelloWorldControl_Hellotazz6_invoker = createInvoker(
    HelloWorldControl_4.Hellotazz,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldControl",
      "Hellotazz",
      Nil,
      "GET",
      this.prefix + """Hellotazz""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HelloWorldControl_Hellos7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Hellos/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldControl_Hellos7_invoker = createInvoker(
    HelloWorldControl_4.Hellos(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldControl",
      "Hellos",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Hellos/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HelloWorldControl_HelloTazz8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HelloTazz/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldControl_HelloTazz8_invoker = createInvoker(
    HelloWorldControl_4.HelloTazz(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldControl",
      "HelloTazz",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """HelloTazz/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index9_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CountController_count10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count10_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AsyncController_message11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message11_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_BooksController_createbook0_route(params@_) =>
      call { 
        controllers_BooksController_createbook0_invoker.call(BooksController_2.createbook())
      }
  
    // @LINE:6
    case controllers_BooksController_getbookbyid1_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_getbookbyid1_invoker.call(BooksController_2.getbookbyid(Id))
      }
  
    // @LINE:7
    case controllers_BooksController_updatebookbyid2_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_updatebookbyid2_invoker.call(BooksController_2.updatebookbyid(Id))
      }
  
    // @LINE:8
    case controllers_BooksController_deletebookbyid3_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_deletebookbyid3_invoker.call(BooksController_2.deletebookbyid(Id))
      }
  
    // @LINE:9
    case controllers_BooksController_getallbooks4_route(params@_) =>
      call { 
        controllers_BooksController_getallbooks4_invoker.call(BooksController_2.getallbooks())
      }
  
    // @LINE:11
    case controllers_HelloWorldControl_HelloWorld5_route(params@_) =>
      call { 
        controllers_HelloWorldControl_HelloWorld5_invoker.call(HelloWorldControl_4.HelloWorld)
      }
  
    // @LINE:12
    case controllers_HelloWorldControl_Hellotazz6_route(params@_) =>
      call { 
        controllers_HelloWorldControl_Hellotazz6_invoker.call(HelloWorldControl_4.Hellotazz)
      }
  
    // @LINE:13
    case controllers_HelloWorldControl_Hellos7_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HelloWorldControl_Hellos7_invoker.call(HelloWorldControl_4.Hellos(name))
      }
  
    // @LINE:14
    case controllers_HelloWorldControl_HelloTazz8_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Integer]("age", Some(17))) { (name, age) =>
        controllers_HelloWorldControl_HelloTazz8_invoker.call(HelloWorldControl_4.HelloTazz(name, age))
      }
  
    // @LINE:17
    case controllers_HomeController_index9_route(params@_) =>
      call { 
        controllers_HomeController_index9_invoker.call(HomeController_1.index)
      }
  
    // @LINE:19
    case controllers_CountController_count10_route(params@_) =>
      call { 
        controllers_CountController_count10_invoker.call(CountController_0.count)
      }
  
    // @LINE:21
    case controllers_AsyncController_message11_route(params@_) =>
      call { 
        controllers_AsyncController_message11_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:24
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
