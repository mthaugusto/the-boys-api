</p><h2>API Documentation - Character Management</h2>
<h3>Overview</h3>
<p>RESTful API that operates on the character database of The Boys series, allowing the creation, retrieval, update, and deletion of character records.</p>
<h3>Base URL</h3>
<p>http://localhost:8080/seriesapi/webapi/personagens</p>

<h3>Methods</h3>

<h3>1. List All Characters</h3>
	<p>Method: GET</p>
	<p>URL: /personagens</p>
	<p>Description: Retrieves a list of all characters from "The Boys" series.</p>
	<p>Success Response: Code 200 (OK)</p>
	<p>Response Example:</p>
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
	            // Other characters...
	        ]
	    </p>
	  </pre>

<h3>2. Get a Character by ID</h3>
	<p>Method: GET</p>
	<p>URL: /personagens/{id}</p>
	<p>URL Parameters: {id}: The ID of the character you want to retrieve.</p>
	<p>Description: Retrieves details of a character based on the provided ID.</p>
	<p>Success Response: Code 200 (OK)</p>
	<p>Response Example:</p>
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

<h3>3. Create a New Character</h3>
	<p>Method: POST</p>
	<p>URL: /personagens</p>
	<p>Description: Creates a new character with the provided details.</p>
	<p>Request Body:</p>
	<pre>			<p>
	{
	    "nome": "New Character",
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
	<p>Success Response: Code 201 (Created)</p>

<h3>4. Update a Character</h3>
	<p>Method: PUT</p>
	<p>URL: /personagens/{id}</p>
	<p>URL Parameters: {id}: The ID of the character you want to update.</p>
	<p>Description: Updates the details of a character based on the provided ID.</p>
	<p>Request Body (fields to be updated):</p>
	<pre>		<p>
	{
	    "nome": "New Name",
	    "idade": "31",
	    "status": "Dead"
	}
	</p>
	</pre>
	<p>Success Response: Code 200 (OK)</p>

<h3>5. Delete a Character</h3>
	<p>Method: DELETE</p>
	<p>URL: /personagens/{id}</p>
	<p>URL Parameters: {id}: The ID of the character you want to delete.</p>
	<p>Description: Deletes a character based on the provided ID.</p>
	<p>Success Response: Code 204 (No Content)</p>
