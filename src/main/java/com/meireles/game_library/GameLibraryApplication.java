package com.meireles.game_library;

import com.meireles.game_library.model.Game;
import com.meireles.game_library.repository.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GameLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameLibraryApplication.class, args);
	}


	@Bean
	public CommandLineRunner init(GameRepository gameRepository){
		return args -> {
			gameRepository.save(new Game("The legend of Zelda"));
			System.out.println("Game salvo com sucesso!");
		};
	}

}
