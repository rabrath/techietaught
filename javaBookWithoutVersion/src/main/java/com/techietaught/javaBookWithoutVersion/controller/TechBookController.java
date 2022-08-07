package com.techietaught.javaBookWithoutVersion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techietaught.javaBookWithoutVersion.model.TechBook;
import com.techietaught.javaBookWithoutVersion.service.TechBookService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class TechBookController {
	
	@Autowired
	private TechBookService techBookService;

	@ApiImplicitParams({ @ApiImplicitParam(name = "techBook", value = "create tech book details", required = true) })
	@ApiOperation(value = "Create a new tech book entity.", notes = "")
	@PostMapping("/create-book")
	public ResponseEntity<TechBook> createBook(@RequestBody TechBook techBook) throws Exception{
		TechBook techBookResp = techBookService.createBook(techBook);		
		return ResponseEntity.ok(techBookResp);
	}
	
	@ApiImplicitParams({ @ApiImplicitParam(name = "techBook", value = "create tech book details", required = true) })
	@ApiOperation(value = "Create a new tech book entity.", notes = "")
	@PutMapping("/update-book")
	public ResponseEntity<TechBook> updateBook(@RequestBody TechBook techBook) throws Exception{
		TechBook techBookResp = techBookService.updateBook(techBook);		
		return ResponseEntity.ok(techBookResp);
	}
}
