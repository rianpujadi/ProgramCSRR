package com.rian.pujadi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

@Autowired
private ProgramService service;

@RequestMapping("/")
public String viewHome () {
	return "index";
}
//handler methods..
@RequestMapping("/list")
public String viewHomePage (Model model) {
	List<Program> listprograms = service.listAll();
	model.addAttribute("listPrograms", listprograms);
	
	return "list";
	}

@RequestMapping("/new")
public String showNewProgramPage(Model model) {
	Program program = new Program();
	model.addAttribute("program", program);
	
	return "new_program";
	}
	
@RequestMapping(value = "/update", method = RequestMethod.GET)
public String updateProgram(@ModelAttribute("program") Program program) {
	service.save(program);
	
	return "redirect:/list";
	}

@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveProgram(@ModelAttribute("Program") Program program) {
    service.save(program);
     
    return "redirect:/list";
	}

@RequestMapping("/edit/{id}")
public ModelAndView showEditProgramPage(@PathVariable(name = "id") int id) {
    ModelAndView mav = new ModelAndView("edit_program");
    Program program = service.get(id);
    mav.addObject("program", program);
     
    return mav;
	}

@RequestMapping("/delete/{id}")
public String deleteProgram(@PathVariable(name = "id") int id) {
    service.delete(id);
    return "redirect:/list";       
	}

}
