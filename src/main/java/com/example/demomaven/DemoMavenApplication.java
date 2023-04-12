package com.example.demomaven;

import com.example.demomaven.domain.Carro;
import com.example.demomaven.domain.CarroHijo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
		System.out.println("Hola Mundo!!, estoy aprendiendo Java!");

		Carro objetoCarroPapa = new Carro();
		Carro objetoCarroConId = new Carro("Carro con Id");

		CarroHijo objetoCarroHijo = new CarroHijo("Carro hijo", "Atributo hijo");

		List<Carro> carroList = new ArrayList<>();
		//Agregando objetos a la lista
		carroList.add(objetoCarroPapa);
		carroList.add(objetoCarroConId);
		carroList.add(objetoCarroHijo);

		objetoCarroPapa.setId("Carro sin Id, se cargo desde SetId");
		objetoCarroPapa.acelerar(1);
		objetoCarroConId.acelerar(2);

		carroList.forEach(carro -> System.out.println(carro));


	}

}
