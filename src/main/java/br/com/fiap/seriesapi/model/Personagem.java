package br.com.fiap.seriesapi.model;


public record Personagem(
		Long id,
		String nome,
		String nomeReal,
		String idade,
		String especie,
		String genero,
		String corDoCabelo,
		String corDosOlhos,
		String altura,
		String peso,
		String status) {
}
