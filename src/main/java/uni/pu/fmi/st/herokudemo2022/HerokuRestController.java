package uni.pu.fmi.st.herokudemo2022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuRestController {
	@GetMapping("/name")
	public String getName() {
		return "Heroku Demo 2022";
	}
}
