</p><h2>Documentação da API - Gerenciamento de Personagens</h2>
<h3>Visão Geral</h3>
<p>API RESTful que opera no banco de dados de personagens da série The Boys, permitindo a criação, recuperação, atualização e exclusão do registro de personagens.</p>
<h3>Base URL</h3>
<p>http://localhost:8080/seriesapi/webapi/personagens</p>

<h3>Métodos</h3>

<h3>1. Listar Todos os Personagens</h3>
	<p>Método: GET</p>
	<p>URL: /personagens</p>
	<p>Descrição: Obtém uma lista de todos os personagens da série "The Boys".</p>
	<p>Resposta de Sucesso: Código 200 (OK)</p>
	<p>Exemplo de Resposta:</p>
	<pre>		    <p>
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
	<p>Método: GET</p>
	<p>URL: /personagens/{id}</p>
	<p>Parâmetros de URL: {id}: O ID do personagem que deseja obter.</p>
	<p>Descrição: Obtém os detalhes de um personagem com base no ID fornecido.</p>
	<p>Resposta de Sucesso: Código 200 (OK)</p>
	<p>Exemplo de Resposta:</p>
	<pre>		    <p>
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
	<p>Método: POST</p>
	<p>URL: /personagens</p>
	<p>Descrição: Cria um novo personagem com os detalhes fornecidos.</p>
	<p>Corpo da Requisição:</p>
	<pre>			<p>
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
	<p>Resposta de Sucesso: Código 201 (Created)</p>

<h3>4. Atualizar um Personagem</h3>
	<p>Método: PUT</p>
	<p>URL: /personagens/{id}</p>
	<p>Parâmetros de URL: {id}: O ID do personagem que deseja atualizar.</p>
	<p>Descrição: Atualiza os detalhes de um personagem com base no ID fornecido.</p>
	<p>Corpo da Requisição (campos a serem atualizados):</p>
	<pre>		<p>
	{
	    "nome": "Novo Nome",
	    "idade": "31",
	    "status": "Morto"
	}
	</p>
	</pre>
	<p>Resposta de Sucesso: Código 200 (OK)</p>

<h3>5. Excluir um Personagem</h3>
	<p>Método: DELETE</p>
	<p>URL: /personagens/{id}</p>
	<p>Parâmetros de URL: {id}: O ID do personagem que deseja excluir.</p>
	<p>Descrição: Exclui um personagem com base no ID fornecido.</p>
	<p>Resposta de Sucesso: Código 204 (No Content)</p>
