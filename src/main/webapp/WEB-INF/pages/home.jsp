<%@include file="header.jsp" %>
<!-- Menu Horizontal -->
<ul class="menu">
    <li class="current"><a href="home">Home</a></li>
    <li><a href="events">Upcoming events</a></li>
    <li><a href="challenges">Challenges</a></li>
    <li><a href="achievements">Achievements</a></li>
    <li><a href="ladder">Ladder</a></li>
</ul>

<div class="specialEvents" style="display: none">

    <div class="event" style="padding-bottom:10px;border-bottom: 1px solid #2f98c9">
        <h1 style="font-size: 24px;color: #2f98c9">Noaptea Alba a Muzeelor</h1>

        <p style="color: #6E6E6E">Noaptea Europeana a Muzeelor este un eveniment de succes initiat de Ministerul
            Culturii si Comunicarii din Franta si aflat deja la a zecea editie.</p>
        <img src="http://lorempixel.com/500/200/people/">
        <span class="beforeAccept" style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: -20px"><div
                class="magicCss2"
                style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: 59px; font-size: 10px; color: #ffffff">
            <h4 style="text-align: center;margin-left: 68px;">Challenge Accepted</h4></div><i class="icon-trophy"></i>50</span>
    </div>

    <div class="event" style="padding-bottom:10px;border-bottom: 1px solid #2f98c9">
        <h1 style="font-size: 24px;color: #2f98c9">Expozitie Arta Contemporana</h1>

        <p style="color: #6E6E6E">Ajunsa la editia a patra, expozitia Tribuna Graphic a fost initiata si organizata de
            revista Tribuna cu scopul de a aduce artele grafice in atentia publicului. Invitarea unor artisti de marca
            cu lucrari de inalta calitate artistica, optiunea pentru o diversitate de tehnici grafice si teme a fost o
            mai mult</p>
        <img src="http://lorempixel.com/500/200/people/">
        <span class="beforeAccept" style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: -20px"><div
                class="magicCss2"
                style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: 59px; font-size: 10px; color: #ffffff">
            <h4 style="text-align: center;margin-left: 68px;">Challenge Accepted</h4></div><i class="icon-trophy"></i>50</span>
    </div>
    <div class="event" style="padding-bottom:10px;border-bottom: 1px solid #2f98c9">
        <h1 style="font-size: 24px;color: #2f98c9">Treasure Hunt Zilele Clujului</h1>

        <p style="color: #6E6E6E">Cel mai mare concurs de Treasure Hunt din tara va avea loc in 26 si 27 mai, in cadrul
            Zilelor Clujului 2012, iar premiul cel mare va fi de 1.000 de euro.</p>
        <img src="http://lorempixel.com/500/200/city/">
        <span class="beforeAccept" style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: -20px"><div
                class="magicCss2"
                style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: 59px; font-size: 10px; color: #ffffff">
            <h4 style="text-align: center;margin-left: 68px;">Challenge Accepted</h4></div><i class="icon-trophy"></i>50</span>
    </div>

    <div class="event" style="padding-bottom:10px;border-bottom: 1px solid #2f98c9">
        <h1 style="font-size: 24px;color: #2f98c9">Treasure Hunt Culorile Clujului</h1>

        <p style="color: #6E6E6E">Au fost pregatite peste 60 de manifestari si activitati prin care organizatorii
            urmaresc sa coloreze Clujul intr-o perioada mai saraca in programe de obicei si sa convinga oamenii sa
            participe nu doar ca spectatori, ci chiar ca actori ai evenimentelor propuse.</p>
        <img src="http://lorempixel.com/500/200/city/">
        <span class="beforeAccept" style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: -20px"><div
                class="magicCss2"
                style="font-size: 48px; color: #79980D; float: right; padding-right: 225px; margin-top: 59px; font-size: 10px; color: #ffffff">
            <h4 style="text-align: center;margin-left: 68px;">Challenge Accepted</h4></div><i class="icon-trophy"></i>50</span>
    </div>

</div>

<script>
    $(document).ready(function () {
        $('.beforeAccept').click(function() {
            $(this).html('<div class="magicCss2" style="font-size: 48px; color: #79980D; float: right; padding-right: 196px; margin-top: 59px; font-size: 10px; color: #ffffff"> <h4 class="checkIn" style="text-align: center;margin-left: 68px;">Check In</h4></div> <div class="magicCss2" style="font-size: 48px; color: #79980D; float: right; padding-right: 196px; margin-top: 4px; font-size: 10px; color: #ffffff"> <h4 class="bailOut" style="text-align: center;margin-left: 68px;">Bail Out</h4></div>');
            var parent = this.parentNode;

            $('.checkIn').click(function() {
              var score = $('.score').html();
                score = parseInt(score);
                score = score + 65;
                $('.score').html(score);
                if(score > 13700) {
                    alert('Achievment Unlocked!!!');
                }
                parent.style.display = 'none';
            });
            $('.bailOut').click(function() {
                var score = $('.score').html();
                score = parseInt(score);
                score = score - 65;
                $('.score').html(score);
                parent.style.display = 'none';
            });
        });

        setTimeout(function () {
            $('.specialEvents').show('slow');
        }, 8000);
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