package br.com.criscorp.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.criscorp.hello.model.Usuario;

@RestController
public class UserController {

	@PostMapping("/loginuser")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		if (dadosLogin.getRacf().equals("ricotaa")) {
			if (dadosLogin.getSenha().equals("1234")) {
				Usuario resposta = new Usuario();
				resposta.setId(1);
				resposta.setNome("Ricota Avila");
				resposta.setEmail("ricota@bbzinha.com");
				resposta.setRacf("ricotaa");
				resposta.setFuncional("000332211");
				resposta.setSquad("Dogues");
				return ResponseEntity.ok(resposta);
			}
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.status(404).build();
	}
}
