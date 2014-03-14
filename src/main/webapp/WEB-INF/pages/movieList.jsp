<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Kriseos User Management </h2>
<%--<%@ page isELIgnored="false" %>--%>

<form action="movies/saveMovie" method="post">
    <label for="movieId">movieId</label>
    <input type="text" id="movieId" name="movieId">
    <label for="title">title</label>
    <input type="text" id="title" name="title"/>
    <label for="cinema">cinema</label>
    <input type="text" id="cinema" name="cinema"/>
    <input type="submit" value="Submit"/>
</form>

<table border="1">
    <c:forEach var="movie" items="${movieList}">
        <tr>
            <td>${movie.movieId}</td>
            <td>${movie.title}</td>
            <td>${movie.cinema}</td>
            <td><input type="button" value="delete" onclick="window.location='userManager/delete?movieId=${movie.movieId}'"/></td>
        </tr>
    </c:forEach>
</table>
