# Quote-generator

Esse é um projeto criado usando todo o aprendizado no Bootcamp FullStack Java da Santander

'''mermaid
classDiagram
    class Quote {
        - id: Long
        - author: String
        - quote: String
        + getId(): Long
        + getAuthor(): String
        + getQuote(): String
        + setId(id: Long): void
        + setAuthor(author: String): void
        + setQuote(quote: String): void
    }
    class QuoteService {
        - quoteRepository: QuoteRepository
        + getAllQuotes(): List<Quote>
        + getQuoteById(id: Long): Quote
        + saveQuote(quote: Quote): Quote
        + deleteQuote(id: Long): void
    }
    class QuoteRepository {
        // Métodos de repositório
    }

    QuoteService "1" --> "1" Quote : uses
    QuoteService "1" --> "1" QuoteRepository : uses
'''
