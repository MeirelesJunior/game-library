package com.meireles.game_library.repository;

import com.meireles.game_library.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
