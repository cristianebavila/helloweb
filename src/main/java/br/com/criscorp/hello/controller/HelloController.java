package br.com.criscorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.criscorp.hello.model.Produto;

@RestController
public class HelloController {
	
	@GetMapping("/hello")	
	public String sayHello() {
			return "Hello World!!. Meu primeiro projeto";
	}

	@GetMapping("/helloricota")
	public String sayHtml() {
		return "<html>"
				+"<body>"
				+"<h1>Ricotinha é fedidinha :o) <h1>"
				+"<hr>"
				+"<p> ;o) </p>"
				+"<body>"
				+"<html>";
	}

	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto prod = new Produto();
		prod.setId(10012);
		prod.setDescricao("Mesa Linda para dar banho em dog");
		prod.setPreco(100.00);
		prod.setQtEstoque(1);
		return prod;
				
	}
	
	@PostMapping("/novoproduto")
	public String cadastrarProduto(@RequestBody Produto novo) {
		System.out.println("Recebi " +novo.getId()+ " / " +novo.getDescricao()+ " / " +novo.getPreco()+" / "+novo.getQtEstoque());
		return "Produto Cadastrado";
	}
	
		
	}

