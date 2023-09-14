package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.bookstore.web.BookRepository;
import com.example.bookstore.domain.Book;
@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookstoreData (BookRepository repository) {
		return(args)->{
			log.info("simsalabim");
			Book book1 = new Book();
            book1.setTitle("Ihmeotukset ja niiden olinpaikat");
            book1.setAuthor("Newt Scamander");
            book1.setPrice(19);
            repository.save(book1);

	          
		};
	}

}
