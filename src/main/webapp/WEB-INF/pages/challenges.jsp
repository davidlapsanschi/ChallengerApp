<%@include file="header.jsp" %>
<!-- Menu Horizontal -->
<ul class="menu">
    <li><a href="home">Home</a></li>
    <li><a href="events">Upcoming events</a></li>
    <li class="current"><a href="challenges">Challenges</a></li>
    <li><a href="achievements">Achievements</a></li>
    <li><a href="ladder">Ladder</a></li>
</ul>
<div style="background:#fff;min-height:650px; width: 100%">
    <div class="challengesList" style="float:left; width: 70%; border-right: 1px solid #2f98c9; text-align: center">
        <h2>I still have to go to events related to ...</h2>
        <div class="magicCss2" ><h4>DubStep</h4></div>
        <div class="magicCss2" ><h4>Theater</h4></div>
    </div>
    <div class="challengeYourself" style="float: right;width: 300px;position: absolute;left: 75%;top: 30%;text-align: center;">
        <div class="magicCss"><h3>Challenge Yourself</h3>
        </div>
        <div id='cssmenu' style="display: none; margin-top: 20px">
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
</div>
<div style="clear:both"></div>

<script>
   $('.challengeYourself').click(function() {
           $('#cssmenu').fadeToggle();
   });

    $('.subcategories li span').click(function () {
        var name = $(this).html();
        var challenge = document.createElement('div');
        challenge.setAttribute("class", "magicCss2");
        challenge.innerHTML="<h4>" + name + "</h4>";
        $(".challengesList").append(challenge);
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