<html>
<body>
    <h2>The Boys API</h2>
    <p>Uma api de personagens da s�rie The Boys para te ajudar com o seu entretenimento.</p>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p><a href="webapi/personagens">Personagens resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
    <h2>Documenta��o da API - Gerenciamento de Personagens</h2>
    <h3>Vis�o Geral</h3>
    <p>Esta API oferece opera��es de gerenciamento de personagens, permitindo a cria��o, recupera��o, atualiza��o e exclus�o de registros de personagens. � uma API RESTful que opera no banco de dados de personagens da s�rie "The Boys".</p>
	<h3>Base URL</h3>
	<p>http://localhost:8080/seriesapi/webapi/personagens</p>
	
	<h3>M�todos</h3>
	
	<h3>1. Listar Todos os Personagens</h3>
		<p>M�todo: GET</p>
		<p>URL: /personagens</p>
		<p>Descri��o: Obt�m uma lista de todos os personagens da s�rie "The Boys".</p>
		<p>Resposta de Sucesso: C�digo 200 (OK)</p>
		<p>Exemplo de Resposta:</p>
		<pre>
		    <p>
		        [
		            {
		                "id": 1,
		                "nome": "Homelander",
		                "idade": "41",
		                "especie": "Super",
		                "genero": "Masculino",
		                "corDoCabelo": "Loiro",
		                "corDosOlhos": "Azul",
		                "altura": "1.80m",
		                "peso": "74.84Kg",
		                "status": "Vivo"
		            },
		            // Outros personagens...
		        ]
		    </p>
		  </pre>
	
	<h3>2. Obter um Personagem por ID</h3>
		<p>M�todo: GET</p>
		<p>URL: /personagens/{id}</p>
		<p>Par�metros de URL: {id}: O ID do personagem que deseja obter.</p>
		<p>Descri��o: Obt�m os detalhes de um personagem com base no ID fornecido.</p>
		<p>Resposta de Sucesso: C�digo 200 (OK)</p>
		<p>Exemplo de Resposta:</p>
		<pre>
		    <p>
		        {
		             "id": 1,
		             "nome": "Homelander",
		             "idade": "41",
		             "especie": "Super",
		             "genero": "Masculino",
		             "corDoCabelo": "Loiro",
		             "corDosOlhos": "Azul",
		             "altura": "1.80m",
		             "peso": "74.84Kg",
		             "status": "Vivo"
		         },
		    </p>
		  </pre>
	
	<h3>3. Criar um Novo Personagem</h3>
		<p>M�todo: POST</p>
		<p>URL: /personagens</p>
		<p>Descri��o: Cria um novo personagem com os detalhes fornecidos.</p>
		<p>Corpo da Requisi��o:</p>
		<pre>
			<p>
		{
		    "nome": "Novo Personagem",
		    "idade": "30",
		    "especie": "Super",
		    "genero": "Masculino",
		    "corDoCabelo": "Preto",
		    "corDosOlhos": "Verde",
		    "altura": "1.85m",
		    "peso": "80.00Kg",
		    "status": "Vivo"
		}
			</p>
		</pre>
		<p>Resposta de Sucesso: C�digo 201 (Created)</p>
	
	<h3>4. Atualizar um Personagem</h3>
		<p>M�todo: PUT</p>
		<p>URL: /personagens/{id}</p>
		<p>Par�metros de URL: {id}: O ID do personagem que deseja atualizar.</p>
		<p>Descri��o: Atualiza os detalhes de um personagem com base no ID fornecido.</p>
		<p>Corpo da Requisi��o (campos a serem atualizados):</p>
		<pre>
		<p>
		{
		    "nome": "Novo Nome",
		    "idade": "31",
		    "status": "Morto"
		}
		</p>
		</pre>
		<p>Resposta de Sucesso: C�digo 200 (OK)</p>
	
	<h3>5. Excluir um Personagem</h3>
		<p>M�todo: DELETE</p>
		<p>URL: /personagens/{id}</p>
		<p>Par�metros de URL: {id}: O ID do personagem que deseja excluir.</p>
		<p>Descri��o: Exclui um personagem com base no ID fornecido.</p>
		<p>Resposta de Sucesso: C�digo 204 (No Content)</p>
</body>
</html>
