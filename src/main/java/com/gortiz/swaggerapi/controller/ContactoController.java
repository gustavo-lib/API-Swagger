package com.gortiz.swaggerapi.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "Swagger API- Gustavo Ortiz", description = "Shows hello world")
public class ContactoController {

	@ApiOperation(value = "Returns List contactos")
    @ApiResponses(
			value = {
					@ApiResponse(code = 100, message = "100 is the message"),
					@ApiResponse(code = 200, message = "Successful return list")
			}
	)
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
