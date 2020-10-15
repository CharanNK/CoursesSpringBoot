package io.charan.springbootstarted.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
	@RequestMapping({"/hello","/hi"})
	public String sayHi() {
		return "Hi";
	}
}
