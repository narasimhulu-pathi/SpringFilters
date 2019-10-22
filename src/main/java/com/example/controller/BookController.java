package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
 
	@RequestMapping(value = "/getbook",method = RequestMethod.GET)
	@ResponseBody
    public Book getBook() {
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("rich dad poor dad");
		book.setBookPrice("10");
    	
		return book;
	}
	
}
