package com.springprojectone.castOfFilms.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springprojectone.castOfFilms.entity.Player;

@RestController
@RequestMapping(path="/api/v1/players")
public class playersController {
	
	private List<Player> avaliablePlayer = Arrays.asList(
			new Player(1,"raheel","netherlands"),
			new Player(2,"fredy","netherlands"),
			new Player(3,"zaid","Australia"),
			new Player(4,"hassan","Germany"),
			new Player(5,"Bisham","Germany"));
	
	@GetMapping
	public String getDataDefination() {
		return "get all players -> /v1/players/getplayers \n Getting a particular player -> /v1/players/getplayer?name=";
	}
	
	@GetMapping(path="/getplayers")
	public List<Player> getPlayers(){
		return avaliablePlayer;
	}
	
	@GetMapping(path="/getsingleplayer")
	public Player  getplayer( @RequestParam String name ) {
		 Optional<Player> player = avaliablePlayer.stream().filter(p->p.getName().equalsIgnoreCase(name)).findFirst();
		 if(player.isPresent()) {
			 return player.get();
		 }
		return null;
	}
	
	@GetMapping(path="/pl/{name}")
	public Player  getplayerPathVariable( @PathVariable String name ) {
		 Optional<Player> player = avaliablePlayer.stream().filter(p->p.getName().equalsIgnoreCase(name)).findFirst();
		 if(player.isPresent()) {
			 return player.get();
		 }
		return null;
	}
	

}
