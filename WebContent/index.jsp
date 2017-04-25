<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title>Dashboard - Bootstrap Admin</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="apple-mobile-web-app-capable" content="yes" />

<link href="./css/bootstrap.min.css" rel="stylesheet" />
<link href="./css/bootstrap-responsive.min.css" rel="stylesheet" />

<link href="./css/font-awesome.css" rel="stylesheet" />

<link href="./css/adminia.css" rel="stylesheet" />
<link href="./css/adminia-responsive.css" rel="stylesheet" />

<link href="./css/pages/dashboard.css" rel="stylesheet" />
<script type="text/javascript" src="https://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script src="https://cdn.hcharts.cn/highcharts/5.0.10/highcharts.js"></script>
<script src="https://cdn.hcharts.cn/highcharts/5.0.10/modules/exporting.js"></script>


<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    
    <![endif]-->

<style type="text/css">
ul#nav {
	width: 100%;
	height: 40px;
	background: #E9E9E9;
	background:-moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%); /* FF3.6+ */
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0%,#FAFAFA), color-stop(100%,#E9E9E9)); /* Chrome,Safari4+ */
	background:-webkit-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%); /* Chrome10+,Safari5.1+ */
	background:-o-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%); /* Opera11.10+ */
	background:-ms-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%); /* IE10+ */
	background:linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%); /* W3C */
	margin: 0 auto
}

ul#nav li {
	display: inline;
	height: 40px
	
}

ul#nav li a {
	display: inline-block;
	padding: 0 25px;
	height: 40px;
	line-height: 40px;
	color: #000	;
	font-size: 15px;
	text-decoration : none;
}

ul#nav li a:hover {
	background: #0095BB
} /*设置鼠标滑过或悬停时变化的背景颜色*/

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="text/javascript">


	
	function change(index){
		var uls = document.getElementById("nav");;
		for(var i = 1 ; i < uls.getElementsByTagName("li").length ; i ++ ){
			if(i == index){
				uls.getElementsByTagName("a")[i].style.background="#00ff00";
			}else{
				uls.getElementsByTagName("a")[i].style.background="";
			}
		}
	}

</script>

</head>


<body>

	<div class="navbar navbar-fixed-top">

		<div class="navbar-inner">

			<div class="container">

				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="./">WifiFeelerAdmin</a>

				<div class="nav-collapse">

					<ul class="nav pull-right">
						<li><a href="#"><span class="badge badge-warning">7</span></a>
						</li>

						<li class="divider-vertical"></li>

						<li class="dropdown"><a data-toggle="dropdown"
							class="dropdown-toggle " href="#"> Rod Howard <b
								class="caret"></b>
						</a>

							<ul class="dropdown-menu">
								<li><a href="./account.html"><i class="icon-user"></i>
										Account Setting </a></li>

								<li><a href="./change_password.html"><i
										class="icon-lock"></i> Change Password</a></li>

								<li class="divider"></li>

								<li><a href="./"><i class="icon-off"></i> Logout</a></li>
							</ul></li>
					</ul>

				</div>
				<!-- /nav-collapse -->

			</div>
			<!-- /container -->

		</div>
		<!-- /navbar-inner -->

	</div>
	<!-- /navbar -->


	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">ç½é¡µæ¨¡æ¿</a>
	</div>

	<div id="content">

		<div class="container">

			<div class="row">

				<div class="span3">

					<div class="account-container">

						<div class="account-avatar">
							<img src="./img/headshot.png" alt="" class="thumbnail" />
						</div>
						<!-- /account-avatar -->

						<div class="account-details">

							<span class="account-name">Rod Howard</span> <span
								class="account-role">Administrator</span> <span
								class="account-actions"> <a href="javascript:;">Profile</a>
								| <a href="javascript:;">Edit Settings</a>
							</span>

						</div>
						<!-- /account-details -->

					</div>
					<!-- /account-container -->

					<hr />

					<ul id="main-nav" class="nav nav-tabs nav-stacked">

						<li class="active"><a href="./"> <i class="icon-home"></i>
								客流管理
						</a></li>

						<li><a href="./faq.html"> <i class="icon-pushpin"></i>
								FAQ
						</a></li>

						<li><a href="./plans.html"> <i class="icon-th-list"></i>
								Pricing Plans
						</a></li>

						<li><a href="./grid.html"> <i class="icon-th-large"></i>
								Grid Layout <span class="label label-warning pull-right">5</span>
						</a></li>

						<li><a href="./charts.html"> <i class="icon-signal"></i>
								Charts
						</a></li>

						<li><a href="./account.html"> <i class="icon-user"></i>
								User Account
						</a></li>

						<li><a href="./login.html"> <i class="icon-lock"></i>
								Login
						</a></li>

					</ul>

					<hr />

					<div class="sidebar-extra">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud.</p>
					</div>
					<!-- .sidebar-extra -->

					<br />

				</div>
				<!-- /span3 -->



				<div class="span9">

					<h1 class="page-title">
						<i class="icon-home"></i> 客流管理
					</h1>

					<div class="stat-container">

						<div class="stat-holder">
							<div class="stat">
								<span>564</span> 客流量
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

						<div class="stat-holder">
							<div class="stat">
								<span>423</span> 新顾客数
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

						<div class="stat-holder">
							<div class="stat">
								<span>96</span> 老顾客数
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

						<div class="stat-holder">
							<div class="stat">
								<span>2</span> 平均驻店时长
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

					</div>
					<!-- /stat-container -->

					<div class="widget">

						<div class="widget-header">
							<i class="icon-signal"></i>
							<h3>统计表</h3>
						</div>
						<!-- /widget-header -->

						<div class="widget-content">
							<div id="container" style="min-width: 310px; height: 436px; max-width: 870px; margin: 0 auto"></div>
						</div>
						
						<!-- /widget-content -->
						

		<script type="text/javascript">

		var chart = Highcharts.chart('container', {
    chart: {
        type: 'scatter',
        zoomType: 'xy'
    },
    title: {
        text: '顾客实时分布图'
    },
    subtitle: {
        text: 'Source: JSU'
    },
    xAxis: {
        title: {
            enabled: true,
            text: 'Height (cm)'
        },
        startOnTick: true,
        endOnTick: true,
        showLastLabel: true
    },
    yAxis: {
        title: {
            text: 'Weight (kg)'
        }
    },
    legend: {
        layout: 'vertical',
        align: 'left',
        verticalAlign: 'top',
        x: 100,
        y: 70,
        floating: true,
        backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
        borderWidth: 1
    },
    plotOptions: {
        scatter: {
            marker: {
                radius: 5,
                states: {
                    hover: {
                        enabled: true,
                        lineColor: 'rgb(100,100,100)'
                    }
                }
            },
            states: {
                hover: {
                    marker: {
                        enabled: false
                    }
                }
            },
            tooltip: {
                headerFormat: '<b>{series.name}</b><br>',
                pointFormat: '{point.x} cm, {point.y} kg'
            }
        }
    },
    series: [{
        name: 'Female',
        color: 'rgba(223, 83, 83, .5)',
        data: [[160.0, 64.1], [175.3, 63.6],
            [169.5, 67.3], [160.0, 75.5], [172.7, 68.2], [162.6, 61.4], [157.5, 76.8],
            [176.5, 71.8], [164.4, 55.5], [160.7, 48.6], [174.0, 66.4], [163.8, 67.3]]

    }, {
        name: 'Male',
        color: 'rgba(119, 152, 191, .5)',
        data: [[180.3, 73.6], [167.6, 74.1], [188.0, 85.9],
            [180.3, 73.2], [167.6, 76.3], [183.0, 65.9], [183.0, 90.9], [179.1, 89.1],
            [170.2, 62.3], [177.8, 82.7], [179.1, 79.1], [190.5, 98.2], [177.8, 84.1],
            [180.3, 83.2], [180.3, 83.2]]
    }]
});

	//	window.setInterval(RefreshData,10000);
		
		function RefreshData(){
		$.ajax({
		           type: "POST",
		           url: "chart.ashx",
		           success: function(data){
		              chart.series[0].setData(data);
		           },
		           error:function(msg)
		           {
		                alert("通信错误!");
		           }
		   });
		}

		</script>
					</div>
					<!-- /widget -->



					<div class="widget widget-table">

						
						<!-- /widget-header -->
						
						<ul id="nav">
								<li><a href="javascript:void(0)"><i class="icon-th-list"></i></a></li>
								<li onclick="change(1)"><a href="javascript:void(0)">客流量</a></li>
								<li onclick="change(2)"><a href="javascript:void(0)">老顾客</a></li>
								<li onclick="change(3)"><a href="javascript:void(0)">新顾客</a></li>
							</ul>

						<div class="widget-content">

							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th style="width:40px;text-align:center">#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
										<th>Company</th>
										<th>&nbsp;</th>
									</tr>
								</thead>

								<tbody>
									<tr>
										<td style="width:40px;text-align:center">1</td>
										<td>Michael</td>
										<td>Jordan</td>
										<td>@mjordan</td>
										<td>Chicago Bulls</td>
										<td class="action-td"><a href="javascript:;"
											class="btn btn-small btn-warning"> <i class="icon-ok"></i>
										</a> <a href="javascript:;" class="btn btn-small"> <i
												class="icon-remove"></i>
										</a></td>
									</tr>
									<tr>
										<td style="width:40px;text-align:center">2</td>
										<td>Magic</td>
										<td>Johnson</td>
										<td>@mjohnson</td>
										<td>Los Angeles Lakers</td>
										<td class="action-td"><a href="javascript:;"
											class="btn btn-small btn-warning"> <i class="icon-ok"></i>
										</a> <a href="javascript:;" class="btn btn-small"> <i
												class="icon-remove"></i>
										</a></td>
									</tr>
									<tr>
										<td style="width:40px;text-align:center">3</td>
										<td>Charles</td>
										<td>Barkley</td>
										<td>@cbarkley</td>
										<td>Phoenix Suns</td>
										<td class="action-td"><a href="javascript:;"
											class="btn btn-small btn-warning"> <i class="icon-ok"></i>
										</a> <a href="javascript:;" class="btn btn-small"> <i
												class="icon-remove"></i>
										</a></td>
									</tr>
									
									
								</tbody>
							</table>

						</div>
						<!-- /widget-content -->

					</div>
					<!-- /widget -->




					<div class="row">

						<div class="span5">

							<div class="widget">

								<div class="widget-header">
									<h3>5 Column</h3>
								</div>
								<!-- /widget-header -->

								<div class="widget-content">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit, sed do eiusmod tempor incididunt ut labore et dolore
										magna aliqua. Ut enim ad minim veniam, quis nostrud
										exercitation ullamco laboris nisi ut aliquip ex ea commodo
										consequat. Duis aute irure dolor in reprehenderit in voluptate
										velit esse cillum dolore eu fugiat nulla pariatur. Excepteur
										sint occaecat cupidatat non proident, sunt in culpa qui
										officia deserunt mollit anim id est laborum.</p>
								</div>
								<!-- /widget-content -->

							</div>
							<!-- /widget -->

						</div>
						<!-- /span5 -->

						<div class="span4">

							<div class="widget">

								<div class="widget-header">
									<h3>4 Column</h3>
								</div>
								<!-- /widget-header -->

								<div class="widget-content">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit, sed do eiusmod tempor incididunt ut labore et dolore
										magna aliqua. Ut enim ad minim veniam, quis nostrud
										exercitation ullamco laboris nisi ut aliquip ex ea commodo
										consequat. Duis aute irure dolor in reprehenderit in voluptate
										velit esse cillum dolore eu fugiat nulla pariatur.</p>
								</div>
								<!-- /widget-content -->

							</div>
							<!-- /widget -->
						</div>
						<!-- /span4 -->

					</div>
					<!-- /row -->

				</div>
				<!-- /span9 -->


			</div>
			<!-- /row -->

		</div>
		<!-- /container -->

	</div>
	<!-- /content -->


	<div id="footer">

		<div class="container">
			<hr />
			<p>
				&copy; 2012 Go Ideate.More Templates <a
					href="http://www.cssmoban.com/" target="_blank"
					title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a
					href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿"
					target="_blank">ç½é¡µæ¨¡æ¿</a>
			</p>
		</div>
		<!-- /container -->

	</div>
	<!-- /footer -->




	<!-- Le javascript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="./js/jquery-1.7.2.min.js"></script>
	<script src="./js/excanvas.min.js"></script>
	<script src="./js/jquery.flot.js"></script>
	<script src="./js/jquery.flot.pie.js"></script>
	<script src="./js/jquery.flot.orderBars.js"></script>
	<script src="./js/jquery.flot.resize.js"></script>


	<script src="./js/bootstrap.js"></script>
	<script src="./js/charts/bar.js"></script>

</body>
</html>
