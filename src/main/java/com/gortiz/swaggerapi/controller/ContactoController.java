package com.gortiz.swaggerapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gortiz.swaggerapi.entity.Contacto;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Contact;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api")
public class ContactoController {

	 @ApiOperation(value = "Lista de todos los contactos", response = Iterable.class, tags = "getList")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Suceess|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/contactos")
	public ResponseEntity<List<Contacto>> findAll() {
		return null;

	}

	 @ApiOperation(value = "Obtiene un contacto ", response = Iterable.class, tags = "getContact")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Suceess|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/contacts/{contactId}")
	public ResponseEntity<Contacto> findContactById() {

		return null;

	}

	 @ApiOperation(value = "Agrega un nuevo contacto ", response = Iterable.class, tags = "newContact")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Suceess|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@PostMapping("/contacto")
	public ResponseEntity<Contacto> addContact(@RequestBody Contact body) {

		return null;

	}

	 @ApiOperation(value = "Actualiza un  contacto ", response = Iterable.class, tags = "updateContact")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Suceess|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@PutMapping("/contacts/{contactId}")
	public ResponseEntity<Contacto> updateContact(@PathVariable Long id) {
		return null;

	}

	 @ApiOperation(value = "Elimina un  contacto ", response = Iterable.class, tags = "deleteContact")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Suceess|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@DeleteMapping(path = "/contacts/{contactId}")
	public ResponseEntity<Void> deleteContactById(@PathVariable Long id) {

		return null;

	}

}
