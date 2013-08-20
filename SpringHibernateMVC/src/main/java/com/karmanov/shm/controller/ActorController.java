package com.karmanov.shm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		map.addAttribute("actors", actors);
		map.addAttribute("actorsSize", actors.size());
		map.addAttribute("search", true);
		return "actors";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String findPaggedActors(@RequestParam(value = "page", required = false) Integer page, ModelMap model) {
		List<Actor> actors = actorService.findPaggedActors(page);
		model.addAttribute("actors", actors);
		model.addAttribute("search", true);
		return "actors";
	}

}
