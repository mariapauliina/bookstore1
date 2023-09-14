package com.example.bookstore.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.bookstore.web.BookRepository;



import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bookstore.domain.Book;

@Controller
public class BookstoreController {
	@Autowired
	private BookRepository repository;
	
	//@RequestMapping("/index")
	//@ResponseBody
	//public String kotisivu() {
	//return "This is main pageee! Welcome to the bookstore!! ^_^";
	
	@GetMapping("/booklist")
	
	public String kirjasivu(Model model) {
		Iterable<Book> books = repository.findAll();
		 model.addAttribute("books", books);
	return "booklist";
}
	 @GetMapping("/add-book-form") //lomake uuden kirjan lisäämiselle
	    public String showAddBookForm(Model model) {
		 model.addAttribute("book", new Book()); // luo uusi kirja objekti
	        return "addbook"; 
	    }

	    @PostMapping("/add-book") // uuden kirhan lisääminen
	    public String addBook(@ModelAttribute Book book) {
	    	repository.save(book);

	        return "redirect:/booklist";
	    } 
	    
	    @GetMapping("/delete-book/{id}")
	    public String deleteBook(@PathVariable Long id) { //kirjaa poistellaan
	        repository.deleteById(id);
	        return "redirect:/booklist";
	    }
	    
	    @GetMapping("/edit-book/{id}")
	    public String showEditBookForm(@PathVariable Long id, Model model) {
	        Book book = repository.findById(id).orElse(null);
	        model.addAttribute("book", book);
	        return "editbook";
	    }

	    @PostMapping("/edit-book")
	    public String editBook(@ModelAttribute Book book) {
	        repository.save(book); //xcgijsf<döhfhöjfghöjfg<höj
	        return "redirect:/booklist";
	    }


}