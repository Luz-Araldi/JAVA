package br.com.luzaraldi.aspects_java_springaop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import br.comluzaraldi.aspects_java_springaop.AspectsJavaSpringaopApplication;

@SpringBootTest
class AspectsJavaSpringaopApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		SprintApplication.run(AspectsJavaSpringaopApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(HelloService hs, DummyService ds) {

		return args -> {
			hs.hello();
			ds.dummy();

		};
	}
}
