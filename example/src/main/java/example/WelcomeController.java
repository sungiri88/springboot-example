package example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {
	@RequestMapping(method=RequestMethod.POST, value="/api/getResponseFromURL")
	public String Welcome(@RequestBody String uri) {
		//final String uri = "https://reqres.in/api/users";		
		HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
	    RestTemplate restTemplate = new RestTemplate();
	    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	    return result.getBody();
	}
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String hello() {
		
		return "Message from " +System.getenv("env")  ;
		
	}
}
