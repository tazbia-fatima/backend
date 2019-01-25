// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/tazz1/play-java-starter-example/conf/routes
// @DATE:Sat Dec 29 13:20:45 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
