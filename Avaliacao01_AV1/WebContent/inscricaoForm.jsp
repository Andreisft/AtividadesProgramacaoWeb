
	<form method="post" action="InscricaoController">
		<div>
			<h2>Adicionar inscrição</h2>
			<label>
				Nome:
				<input name="nome" type="text" />
			</label>
			<label>
				CPF:
				<input name="cpf" type="text" />
			</label>
			<label>
				Email:
				<input name="email" type="text" />
			</label>
			<input name="evento_id" type="text" value="${evento.id}" style="display:none" />
			<button type="submit">Enviar</button>
		</div>
	</form>