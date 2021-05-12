package com.example.demo.controllers;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Unidade;
import com.example.demo.services.UnidadeService;

import db.DB;

@RestController
@RequestMapping(value = "/unidades")
public class UnidadeController {

	Connection conn = DB.getConnection();
	
	@Autowired
	private UnidadeService service;
	
	@GetMapping
	public ResponseEntity<List<Unidade>> findAll(){
		List<Unidade> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Unidade> findById(@PathVariable Long id){
		Unidade obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
