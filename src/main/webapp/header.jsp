<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = "style.css";
    %>
    <link rel="stylesheet" href=<%=path%> type="text/css"/>
    <title>Sklep oparty o servlety w Javie</title>
    <meta name="description" content="Sklep WWW zbudowany w oparciu o servlety w Javie"/>
    <meta name="keywords" content="Java, Servlet, JSP, HTML, CSS"/>
    <meta charset="UTF-8"/>
</head>
<body>
<header>
    <a href="index.jsp">
        <img src="logo.png" class="logo">
    </a>
</header>

<nav>
    <fieldset>
    <legend><h3>MENU:</h3></legend>
    <a href="about.jsp">O Firmie</a>&nbsp;
    <a href="products.jsp">Produkty</a>&nbsp;
    <a href="login.jsp">Logowanie</a>&nbsp;
    <a href="contact.jsp">Kontakt</a>&nbsp;
    </fieldset>
</nav>
