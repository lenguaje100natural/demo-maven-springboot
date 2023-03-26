package com.example.demomaven;

import com.example.demomaven.domain.Carro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
		System.out.println("Hola Mundo!!, estoy aprendiendo Java!");

		Carro objetoCarro = new Carro();
		Carro objetoCarroConId = new Carro("Carro con Id");

		objetoCarro.setId("Carro sin Id, se cargo desde SetId");

		objetoCarro.acelerar(1);
		objetoCarroConId.acelerar(2);

		System.out.println(objetoCarroConId);
		System.out.println(objetoCarro);

	}

}
