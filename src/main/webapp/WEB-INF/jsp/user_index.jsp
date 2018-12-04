<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会议管理系统首页</title>
<!-- 日历 css -->
<link rel="stylesheet" href="css/documentation.css" type="text/css" />
<link rel="stylesheet" href="css/jalendar.css" type="text/css" />
<!-- 时钟css -->
<link href="css/style.css" rel="stylesheet" />

<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<!-- 日历 js -->
<script type="text/javascript" src="js/jalendar.js"></script>
<!-- 时钟js -->
<script src="js/moment.min.js"></script>
<script src="js/script.js"></script>

<script type="text/javascript">
$(function () {
    $('#myId3').jalendar();
});
</script>

</head>
<body>
	<div class="container">



		<div class="left_middle" style="width: 50%; border: 0px solid red;">

			<div id="clock" class="light">
				<div class="display">
					<div class="weekdays"></div>
					<div class="ampm"></div>
					<div class="alarm"></div>
					<div class="digits"></div>
				</div>
			</div>

			<div id="myId3" class="jalendar mid" style="width: 1000px;">
				<div class="added-event" data-date="9/8/2013" data-time="Tüm Gün"
					data-title="WWDC 13 on San Francisco, LA"></div>
				<div class="added-event" data-date="16/8/2013" data-time="20:45"
					data-title="Tarkan ?stanbul Concert on Harbiye A??k Hava Tiyatrosu"></div>
				<div class="added-event" data-date="17/8/2013" data-time="21:00"
					data-title="CodeCanyon ?stanbul Meeting on Starbucks, Kad?k?y"></div>
				<div class="added-event" data-date="17/8/2013" data-time="22:00"
					data-title="Front-End Design and Javascript Conferance on Hali? Kongre Merkezi"></div>
				<div class="added-event" data-date="17/12/2017" data-time="22:00"
					data-title="Lorem ipsum dolor sit amet"></div>
			</div>
		</div>



	</div>
</body>
</html>