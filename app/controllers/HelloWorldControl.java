package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class HelloWorldControl extends Controller {
    public Result HelloWorld() {
        return ok("Tazzz");
    }
    public Result Hellotazz()
    {
        return ok("Hello" + "tazbia" + "!!");
    }
    public Result Hellos(String name){
        return ok("HII"+ name + "!!");
    }
    public Result HelloTazz(String name, Integer age)
    {
        final StringBuffer sb = new StringBuffer();
        sb.append("HELLO");

        if(age>18)
        {
            sb.append(name + " YOU ARE AN ADULT");
        }
        else
        {
            sb.append(name + "you aren't an adult yet");
        }
        return ok(sb.toString());
        
    }
}
