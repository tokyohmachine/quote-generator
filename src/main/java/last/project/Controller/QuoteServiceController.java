package last.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import last.project.Quote;
import last.project.QuoteService;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteServiceController {
    @Autowired
    private QuoteService quoteService;

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public Quote getQuoteById(@PathVariable Long id) {
        return quoteService.getQuoteById(id);
    }


    @PostMapping
    public ResponseEntity<Quote> createQuote(@RequestBody Quote quote) {
        Quote savedQuote = quoteService.saveQuote(quote);
        return ResponseEntity.ok(savedQuote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable Long id) {
        quoteService.deleteQuote(id);
        return ResponseEntity.noContent().build();
    }
}

