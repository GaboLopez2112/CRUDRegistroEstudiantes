package com.uisrael.crud.proyecto;

import com.uisrael.crud.proyecto.modelo.Estudiante;
import com.uisrael.crud.proyecto.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudProyectoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudProyectoApplication.class, args);
	}

	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void run(String... args) throws Exception {

		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();


		estudiante1.setNombre("Gabriel");
		estudiante1.setApellido("Lopez");
		estudiante1.setEmail("gabo@hotmail.com");
		estudianteRepository.save(estudiante1);

		estudiante2.setNombre("Gabriela");
		estudiante2.setApellido("Rueda");
		estudiante2.setEmail("gabaRUEDA@hotmail.com");
		estudianteRepository.save(estudiante2);



	}
}
