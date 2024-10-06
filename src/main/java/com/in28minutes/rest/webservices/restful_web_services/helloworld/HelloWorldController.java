package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping(path= "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	@RequestMapping(path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	@RequestMapping(path = "/hello-world-internationized")
	public String helloWorldInternationalized() {
		Locale local = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", local);
		//return "Hello World V2";
	}

}
