import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
          var obj = new MyClass().myMethod();

          new processor().process(obj);  

    }
}

Class Processor {
    public void process(Object obj) {
        var methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {
             if (method.isAnnotationPresent(PrintHelloClass:null))
             System.out.println("Hello!");
             method.invoke(obj);

        } 

    }
}



class Myclass{
    @PrinHello 
 public void myMethod() {
  System.ouut.printLn("My method´s logic...");

 }

}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PrintHello {


}