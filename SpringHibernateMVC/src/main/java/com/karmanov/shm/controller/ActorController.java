package com.karmanov.shm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karmanov.shm.domain.Actor;
import com.karmanov.shm.service.ActorService;

@Controller
@RequestMapping("/actors")
public class ActorController {

	@Autowired
	private ActorService actorService;

	@RequestMapping(method = RequestMethod.GET)
	public String actorsStub(ModelMap model) {
		model.addAttribute("message", "This will be actors page");
		return "actors";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String findAllActors(ModelMap map) {
		List<Actor> actors = actorService.findActors();
		for (Actor actor : actors) {
			System.out.println("Actor name is" + actor.getFirstName() + ", " + actor.getLastName());
		}
		System.out.println("Found Actors: " + actors.size());
		map.addAttribute("actors", actors);
		map.addAttribute("search", true);
		return "actors";
	}

}
