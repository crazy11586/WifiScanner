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
<script type="text/javascript"
	src="https://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script src="https://cdn.hcharts.cn/highcharts/5.0.10/highcharts.js"></script>
<script
	src="https://cdn.hcharts.cn/highcharts/5.0.10/modules/exporting.js"></script>


<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    
    <![endif]-->

<style type="text/css">
ul#nav {
	width: 100%;
	height: 40px;
	background: #E9E9E9;
	background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	/* FF3.6+ */
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FAFAFA),
		color-stop(100%, #E9E9E9)); /* Chrome,Safari4+ */
	background: -webkit-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	/* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	/* Opera11.10+ */
	background: -ms-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	/* IE10+ */
	background: linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%); /* W3C */
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
	color: #000;
	font-size: 15px;
	text-decoration: none;
}

ul#nav li a:hover {
	background: #0095BB
} /*设置鼠标滑过或悬停时变化的背景颜色*/
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>


<body>

	<div class="navbar navbar-fixed-top">

		<div class="navbar-inner">

			<div class="container">

				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="./">GodEyes</a>

				<div class="nav-collapse">

					<ul class="nav pull-right">
						<li><a href="#"><span class="badge badge-warning">7</span></a>
						</li>

						<li class="divider-vertical"></li>

						<li class="dropdown"><a data-toggle="dropdown"
							class="dropdown-toggle " href="#"> Crazy11586 <b
								class="caret"></b>
						</a>

							<ul class="dropdown-menu">
								<li><a href="./account.html"><i class="icon-user"></i>
										None </a></li>

								<li><a href="./change_password.html"><i
										class="icon-lock"></i> None</a></li>

								<li class="divider"></li>

								<li><a href="./"><i class="icon-off"></i> None</a></li>
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

							<span class="account-name">Crazy11586</span> <span
								class="account-role">管理员</span> <span
								class="account-actions"> <a href="javascript:;">切换用户</a>
								| <a href="javascript:;">资料设置</a>
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
						
						<li><a href="./plans2.html"> <i class="icon-pushpin"></i>
								新老顾客
						</a></li>
 
						<li><a href="./plans.html"> <i class="icon-th-list"></i>
								客流趋势
						</a></li>

						<li><a href="./grid.html"> <i class="icon-th-large"></i>
								设备管理 <!-- 
						<span class="label label-warning pull-right">5</span>
						-->
						</a></li>

						<!--  
						<li><a href="./charts.html"> <i class="icon-signal"></i>
								Charts
						</a></li>
						-->
						<li><a href="./account.html"> <i class="icon-user"></i>
								资料设置
						</a></li>

						<li><a href="./login.html"> <i class="icon-lock"></i>
								切换
						</a></li>

					</ul>

					<hr />

					<br />

				</div>
				<!-- /span3 -->



				<div class="span9">

					<h1 class="page-title">
						<i class="icon-home"></i> 今天总计
					</h1>

					<div class="stat-container">

						<div class="stat-holder">
							<div class="stat">
								<span id="keliu"></span> 客流量
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

						<div class="stat-holder">
							<div class="stat">
								<span id="xinguke"></span> 新顾客数
							</div>
							<!-- /stat -->
						</div>
						<!-- /stat-holder -->

						<div class="stat-holder">
							<div class="stat">
								<span id="laoguke"></span> 老顾客数
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
							<h3>店铺 :</h3>
							<select id="my_store" class="cs-select cs-skin-rotate"
								style="margin: auto 0">

							</select>

							<input type="button" id="time" style="margin: auto 0 auto 20px;"/> 

						</div>
						<!-- /widget-header -->

						<div class="widget-content">
							<div id="container"
								style="min-width: 310px; height: 436px; max-width: 870px; margin: 0 auto"></div>
						</div>

						<!-- /widget-content -->


						<script type="text/javascript">
						
						function get_time(){
							
							var date = new Date();
							
							Y = date.getFullYear(),
							m = date.getMonth()+1,
							d = date.getDate();
							
							if(m<10){
									m = '0'+m;
							}
							if(d<10){
								d = '0'+d;
							}
							
							var t = Y+'-'+m+'-'+d+" 00:00:00";
							
							data = new Date(t);
							var timestamp = Date.parse(data);
								return timestamp; 
							}
						
						
						
							function getStore() {
								var url_at = "http://localhost:8080/Test01/GetDataAction?action=getStore";
								//清空原有select内的数据
								$("#my_store").empty();
								$("#mybody").empty();
								$.ajax({
											url : url_at,
											type : "post",
											dataType : "json",
											success : function(data) {
												//  $("#my_store").append("<option value='-1'>--请选择需要展示的店铺--</option>");	           
												var count = 1;
												$.each(data,function(index,item) {
																	var id = count++;
																	var text = data[index].store_name;
																	$("#my_store").append("<option value='"+id+"'>"+ text+ "</option>");

																	var number = "<td style=\"width:40px;text-align:center\">"
																			+ id
																			+ "</td>";
																	var name = "<td style=\"text-align:center\">"
																			+ text
																			+ "</td>";
																	var TodayCustomer = "<td style=\"text-align:center\">Jordan</td>";
																	var enterCustomer = "<td style=\"text-align:center\">@mjordan</td>";
																	var rate = "<td style=\"text-align:center\">@mjordan</td>";
																	var addr = "<td style=\"text-align:center\">"
																			+ data[index].store_addr
																			+ "</td>";
																	var cl = "<td class=\"action-td\" style=\"text-align:center\"><a href=\"javascript:;\" class=\"btn btn-small btn-warning\"> <i class=\"icon-ok\"></i> </a> <a href=\"javascript:;\" class=\"btn btn-small\"> <i class=\"icon-remove\"></i></a></td>";

																	var html = "<tr>"
																			+ number
																			+ ""
																			+ name
																			+ ""
																			+ TodayCustomer
																			+ ""
																			+ enterCustomer
																			+ ""
																			+ rate
																			+ ""
																			+ addr
																			+ ""
																			+ cl
																			+ "</tr>";
																	$("#mybody")
																			.append(
																					html);

																});
											},
											error : function(XMLHttpRequest,
													textStatus, errorThrown) {
												alert(errorThrown);
											}
										});
							}
							

							$(function() {
								var chart = Highcharts
										.chart(
												'container',
												{
													chart : {
														type : 'scatter'
													},
													title : {
														text : '顾客实时分布图'
													},
													series : [ {} ],
													yAxis : {
														gridLineWidth : 0,
														tickWidth : 0
													},
													xAxis : {
														gridLineWidth : 0,
														tickWidth : 0
													},
													legend : {
														layout : 'vertical',
														align : 'left',
														verticalAlign : 'top',
														x : 100,
														y : 70,
														floating : true,
														backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
																|| '#FFFFFF',
														borderWidth : 1
													},
													plotOptions : {
														scatter : {
															marker : {
																radius : 5,
																states : {
																	hover : {
																		enabled : true,
																		lineColor : 'rgb(100,100,100)'
																	}
																}
															},
															states : {
																hover : {
																	marker : {
																		enabled : false
																	}
																}
															},
															tooltip : {
																headerFormat : '<b>{series.name}</b><br>',
																pointFormat : '{point.x} cm, {point.y} kg'
															}
														}
													}
												});
								
								getStore();
								RefreshData();
								settime();
								
								function change(index) {
									var uls = document.getElementById("nav");
									;
									for (var i = 1; i < uls.getElementsByTagName("li").length; i++) {
										if (i == index) {
											uls.getElementsByTagName("a")[i].style.background = "#00ff00";
										} else {
											uls.getElementsByTagName("a")[i].style.background = "";
										}
									}
								}
						
								function RefreshData() {
									
									$.ajax({
												url : 'http://localhost:8080/Test01/GetDataAction?action=getCustomerPosition',
												type : 'POST',
												cache : false,
												success : function(data,
														textStatus) {
													var json = eval(data);
													chart.series[0].remove();
													chart.addSeries("man");
													var x;
													var y;
													var data = [];
													for (var i = 0; i < json.length; i++) {
														x = json[i].position_x;
														y = json[i].position_y;
														data.push([ x, y ]);
													}
													chart.series[0]
															.setData(data);
													;
												}
											});

								}
								
								var countdown = 10;
								
								function settime() {
									
									var val = $("#time");
									if (countdown == 0) {
									//	val.removeAttribute("disabled");
										val.val("正在刷新数据") ;
										RefreshData();
										countdown = 10;
									} else {
									//	val.setAttribute("disabled", true);
										val.val("剩余自动刷新时间  : "+countdown + " S ");
										countdown--;
									}
									
									setTimeout(function() {
										settime(val)
									}, 1000)
								}
								
							});
							 
							 

							function toJson(str) {
								var json = (new Function("return " + str))();
								return json;
							}
							
							function GetSumData(){
								//客流量 + 新顾客数量 + 老顾客数量
								var str = get_time();
								//获取当前天数的
								time1 = "1496804341336";
							     time2 = "1496805355381";
							      
							      var str = 'http://localhost:8080/Test01/GetDataAction?action=getCustomerCount2time&time1='+time1+'&time2='+time2;
							      $.ajax({ 
							    	  //http://localhost:1314/Test01/GetDataAction?action=getall&time1=1496804400000&time2=1496807999000
							    	  url: str, 
							          type:"post" , 
							          dataType:"json",
							          success:function(data){
							            //  $("#my_store").append("<option value='-1'>--请选择需要展示的店铺--</option>");	           
							              var count = 1;
							            //  alert(data);
							              var keliu;
							              var xinguke = 0;
							              var laoguke = 0;
							              $.each(data, function (index, item) {
							                  var id = count++; 
							                  var all = data[index].all;	                
							                  var time = parseInt(data[index].current_time);	                  
						                  	  var enter = data[index].enter;
												
						                  	  xinguke += parseInt(enter);
						                  	  laoguke += parseInt(all);
					           
							              });
							              
							              keliu = xinguke+laoguke;
							              $("#keliu").text(keliu);
							              $("#xinguke").text(xinguke);
							              $("#laoguke").text(laoguke);
							          }, 
							      error:function(XMLHttpRequest,textStatus, errorThrown) { 
							           alert(errorThrown);
							         }
							      });   
								
								
								
							}
							
							GetSumData();
							
						</script>

					</div>
					<!-- /widget -->



<!-- 
					<div class="widget widget-table">



						<ul id="nav">
							<li><a href="javascript:void(0)"><i class="icon-th-list"></i></a><span>门店统计</span></li>

							 	<li onclick="change(1)" ><a href="javascript:void(0)">客流量</a></li>
								<li onclick="change(2)" ><a href="javascript:void(0)">老顾客</a></li>
								<li onclick="change(3)" ><a href="javascript:void(0)">新顾客</a></li>
						
						</ul>
						<div class="widget-content">

							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th style="width: 40px; text-align: center">#</th>
										<th style="text-align: center">店铺名称</th>
										<th style="text-align: center">今日客流</th>
										<th style="text-align: center">入店顾客</th>
										<th style="text-align: center">入店率</th>
										<th style="text-align: center">门店地址</th>
										<th>&nbsp;</th>
									</tr>
								</thead>

								<tbody id="mybody">


								</tbody>
							</table>

						</div>
					</div>
 -->

				</div>


			</div>
			<!-- /row -->

		</div>
		<!-- /container -->

	</div>
	<!-- /content -->


	<div id="footer">

		<div class="container">
			<hr />

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
