package com.gortiz.swaggerapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gortiz.swaggerapi.entity.Contacto;

@RestController
@RequestMapping("/api")
public class ContactoController {

	@GetMapping("/contactos")
	public ResponseEntity<List<Contacto>> findAll() {
		return null;

	}

	@GetMapping("/contacts/{contactId}")
	public ResponseEntity<Contacto> findContactById() {

		return null;

	}

	@PostMapping("/contacto")
	public ResponseEntity<Contacto> addContact() {

		return null;

	}

	@PutMapping("/contacts/{contactId}")
	public ResponseEntity<Contacto> updateContact() {
		return null;

	}

	@DeleteMapping(path = "/contacts/{contactId}")
	public ResponseEntity<Void> deleteContactById() {

		return null;

	}

}
