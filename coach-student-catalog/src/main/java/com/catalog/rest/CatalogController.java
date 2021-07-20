package com.catalog.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

	@Autowired
	CatalogService catalogService;
	
	@GetMapping("")
	public ResponseEntity<?> updateCatalog(@RequestParam("studentID") Long studentID,
			@RequestParam("subjectIDs") String subjectIDs) {
		catalogService.updateCart(studentID, subjectIDs);
		return new ResponseEntity<String>("Catalog updated", HttpStatus.OK);
	}
	
	@GetMapping("/remove")
	public ResponseEntity<?> removeSubject(@RequestParam("studentID") Long studentID,
			@RequestParam("subjectID") Long subjectID) {
		catalogService.deleted(studentID, subjectID);
		return new ResponseEntity<String>("Successfully removed from catalog", HttpStatus.OK);
	}
}
