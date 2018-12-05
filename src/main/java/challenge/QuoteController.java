package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	@Autowired
	private QuoteService service;

	public Quote getQuote() {
		return service.getQuote();
	}

	public Quote getQuoteByActor(String actor) {
		return service.getQuoteByActor(actor);
	}

}
