package br.com.iter.horaspj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaSpringController {

	  @RequestMapping("/olaMundoSpring")
	  public String execute() {
	    System.out.println("Executando a lógica com Spring MVC");
	    return "ok";
	  }
}
