// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/tazz1/play-java-starter-example/conf/routes
// @DATE:Sat Dec 29 13:20:45 IST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHelloWorldControl HelloWorldControl = new controllers.ReverseHelloWorldControl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBooksController BooksController = new controllers.ReverseBooksController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHelloWorldControl HelloWorldControl = new controllers.javascript.ReverseHelloWorldControl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBooksController BooksController = new controllers.javascript.ReverseBooksController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  }

}
