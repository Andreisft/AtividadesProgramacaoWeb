<!DOCTYPE html>
<%@page import="br.ucsal.bes.model.User"%>
<%@page import="br.ucsal.bes.model.Message"%>
<html>
<head>
<jsp:useBean id="channel" scope="application"
	class="br.ucsal.bes.model.Channel"></jsp:useBean>
<jsp:useBean id="user" scope="session" class="br.ucsal.bes.model.User"></jsp:useBean>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Chat</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" media="screen" href="chat.css" />
</head>
<body>
	<div class="container">
		<div class="container-chat">
			<header>
				<div class="header">
					<div class="photo">
						<i class="fas fa-user"></i>
					</div>
					<div class="status">
						<h2>Chat - Web</h2>
						<h3>Seja Bem-Vindo</h3>
					</div>
					<div class="icons">
						<button>
							<i class="fas fa-search"></i>
						</button>
						<button>
							<i class="fas fa-paperclip"></i>
						</button>
						<button>
							<i class="fas fa-ellipsis-v"></i>
						</button>
					</div>
				</div>
			</header>
			<div class="body-chat">
				<div class="chat">
				<%
					for (Message message : channel.getPosts()) {
						if (message.getDestiny() == null) {%>
							<div class="chat_message">
								<%out.print(message);
								%>
							</div>
						<%} else {
							if (message.getDestiny().equals(user) || 
									message.getOrigin().equals(user)) { %>
							<div class="chat_message">
								<%out.print(message);
								%>
							</div>
							<%}
						}
					}
				%>
				</div>
			</div>
			<footer>
				<div class="footer">
					<form action="ChatServlet" method="POST">
						<div class="entry_position">
							<div class="entry">
								<div class="icon">
									<button>
										<i class="far fa-grin"></i>
									</button>
								</div>
								<input name="message" type="text" placeholder="Type a message">
								<!-- <div class="icon">
									<button>
										<i class="fas fa-camera"></i>
									</button>
								</div>
								<div class="icon">
									<button>
										<i class="fas fa-microphone"></i>
									</button>
								</div>
								 -->
								 <div class="private_chat">
								 	<select name="destiny">
								 		<option value="all">All</option>
								 		<%for (User userForEach : channel.getUsers()) {%>
								 			<option value="<%=userForEach.getLogin()%>"><%=userForEach.getLogin()%></option>
								 		<%}%>
								 	</select>
								 </div>
							</div>
							<div class="send">
								<button type="submit" name="send" value="send">
									<i class="fas fa-angle-right"></i>
								</button>
							</div>
						</div>
					</form>
				</div>
			</footer>
		</div>
	</div>
</body>
</html>