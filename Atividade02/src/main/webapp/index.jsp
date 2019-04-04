<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="channel" scope="application"
	class="br.ucsal.bes.model.Channel"></jsp:useBean>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous" />
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
</head>
<body>
	<div class="container">
		<div class="container-menu">
			<div class="head-login">
				<h1>
					<a href="/index.jsp"><i class="fas fa-user"></i></a>
				</h1>
			</div>
			<div class="body-login">
				<form name="forms" action="LoginServlet" method="POST">
					<input name="username" type="text" placeholder="Informe o nome">
					<div class="btn">
						<button type="submit" name="log_in" value="log_in">Log in
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>