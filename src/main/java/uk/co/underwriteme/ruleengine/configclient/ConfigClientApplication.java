package uk.co.underwriteme.ruleengine.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${describe: Test Message}")
	private String message;

	@GetMapping("/message")
	public String getPlans() {
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}










// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.cloud.context.config.annotation.RefreshScope;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// 
// @RefreshScope
// @RequestMapping("/rest")
// @RestController
// public class MessageResource {
// 
//     @Value("${message: Default Hello}")
//     private String message;
// 
//     @GetMapping("/message")
//     public String message() {
//         return message;
//     }
// }
