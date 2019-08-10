<%@ page import="pl.marek.controller.LanguageProvider" %>
<%@ include file="header.jsp" %>
<main>
    <fieldset>
        <legend><h3>Strona Glowna</h3></legend>
        <p>Some text.</p>
        <%= LanguageProvider.INSTANCE.getMessage("hello") %>
    </fieldset>
</main>
<%@ include file="footer.jsp" %>

