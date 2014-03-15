<%@include file="header.jsp" %>

<!-- Menu Horizontal -->
<ul class="menu">
    <li><a href="home">Home</a></li>
    <li class="current"><a href="events">Upcoming events</a></li>
    <li><a href="challenges">Challenges</a></li>
    <li><a href="achievements">Achievements</a></li>
    <li><a href="ladder">Ladder</a></li>
</ul>
<div class="col_12" style="background:#fff;min-height:650px;">

    <div class="col_2">
        <div id='cssmenu'>
            <ul>
                <c:forEach var="category" items="${categories}">
                    <li class='has-sub'>
                        <a href='#'><span>${category.name}</span></a>
                        <ul class="subcategories">
                            <c:forEach var="subCategory" items="${category.subCategories}">
                                <li><a href='#'><span>${subCategory.name}</span></a></li>
                            </c:forEach>
                        </ul>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>

    <div id="eventsContent" class="col_10">
        <c:forEach var="category" items="${categories}">
            <c:forEach var="subCategory" items="${category.subCategories}">
                <div id="${subCategory.name}" class="events" style="display: none">
                    <c:forEach var="event" items="${subCategory.events}">
                        <div class="event" style="padding-bottom:10px;border-bottom: 1px solid #2f98c9">
                            <h1 style="font-size: 24px;color: #2f98c9">${event.name}</h1>

                            <p style="color: #6E6E6E">${event.description}</p>
                            <img src="http://lorempixel.com/500/200/nightlife/">

                            <span style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: 59px"><i class="icon-trophy"></i>${event.points}</span>
                        </div>
                    </c:forEach>
                </div>
            </c:forEach>
        </c:forEach>
    </div>
</div>

<script>

    $('.subcategories li span').click(function () {

        $('#eventsContent .events').hide();
        var name = $(this).html();
        console.log(name);
        $('#' + name).show();
    });

</script>

<!-- ===================================== START FOOTER ===================================== -->
<div class="clear"></div>
<div id="footer">
    &copy; Copyright 2014 All Rights Reserved. This website was built by Challenger Team: Miklos Albert, Silvana Albu
    and David Laspsanschi</a>
</div>

</body>
</html>