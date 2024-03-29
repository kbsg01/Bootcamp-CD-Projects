package com.karlasanti.mostrarlafecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TimeController {
	String time = new SimpleDateFormat("HH:mm a").format(new Date());
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String time(Model model) {
		model.addAttribute("time", time);
		return "time";
	}
}
