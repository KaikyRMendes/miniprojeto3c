package br.com.itb.miniprojeto3c.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itb.miniprojeto3c.model.Produto;
import br.com.itb.miniprojeto3c.service.ProdutoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "false")
@RequestMapping("/produto")
public class ProdutoController {
	
	// Criação do objeto de servico
	final ProdutoService produtoService;
	
	// Injeção de Dependencia
	public ProdutoController(ProdutoService _produtoService) {
		this.produtoService = _produtoService;
	}
	
	// ROTA POST
	@PostMapping
	public ResponseEntity<Object> saveProduto(Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(produtoService.save(produto));
	}
	
	// ROTA GET
	
}
