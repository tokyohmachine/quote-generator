package last.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;

    public List<Quote> getAllQuotes() {
        return (List<Quote>) quoteRepository.findAll();
    }

    public Quote saveQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }

    public Quote getQuoteById(Long id) {
        return quoteRepository.findById(id).orElse(null);
    }
}
