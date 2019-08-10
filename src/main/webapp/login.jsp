<%@ include file="header.jsp" %>
<main>
    <fieldset>
        <legend><h3>Strona Logowania</h3></legend>
    <form action="/ShopServlet/login" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="login"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
        <input type="submit" value="Login">
    </form>
    </fieldset>
</main>
<%@ include file="footer.jsp" %>
