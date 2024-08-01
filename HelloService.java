package br.com.luzaraldi.aspects_java_springaop.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public static void hello() {
       System.out.println("Hello");     

    }
        
    }
}
