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
								class="account-role">管理员</span> <span class="account-actions">
								<a href="javascript:;">切换用户</a> | <a href="javascript:;">资料设置</a>
							</span>

						</div>
						<!-- /account-details -->

					</div>
					<!-- /account-container -->

					<hr />

					<ul id="main-nav" class="nav nav-tabs nav-stacked">

						<li class="active"><a href="./index.jsp"> <i
								class="icon-home"></i> 客流管理
						</a></li>

						<li><a href="./OldAndNew.html"> <i class="icon-pushpin"></i>
								新老顾客
						</a></li>
						<li><a href="./customerStay.html"> <i class="icon-signal"></i>
								驻留分析
						</a></li>
						<li><a href="./customerDirection.html"> <i
								class="icon-th-list"></i> 客流趋势
						</a></li>

						<li><a href="./deviceAdmin.html"> <i
								class="icon-th-large"></i> 设备管理
						</a></li>

						<li><a href="./account.html"> <i class="icon-user"></i>
								资料设置
						</a></li>

						<li><a href="./login.html"> <i class="icon-lock"></i> 切换
						</a></li>

					</ul>

					<hr />

					<br />

				</div>
				<!-- /span3 -->



				<div class="span9">

					<h1 class="page-title">
						<i class="icon-home"></i> 今日客流
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

						<div class="stat-holder" style="display: none">
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

							</select> <input type="button" id="time" style="margin: auto 0 auto 20px;" />

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
								var url_at = "http://47.94.104.25:8080/Test01/GetDataAction?action=getStore";
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
														text : '顾客实时分布图(平面)'
													},
													series : [],
													yAxis : {
														gridLineWidth : 0 ,
														tickWidth : 0 
													},
													xAxis : {
														gridLineWidth : 0,
														tickWidth : 0
												    
													},
													legend : {
														labelFormatter: function() {
										                        return this.name;
										                },
											
														layout : 'horizontal',
														align : 'left',
														verticalAlign : 'top',
														x : 80,
														y : 0,
														floating : true,
														backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
																|| '#FFFFFF',
														borderWidth : 1
													},
													credits: {
												          enabled:false
												},
												exporting: {
										            enabled:false
												}
													
												});
								
								getStore();
								//RefreshData("1497408360562","1497409680564");
								RefreshData("1497408600564","1497411000554");
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
								
								var servies_data;
								var servies_tzdata;
						
								function RefreshData(time1 , time2) {
									getCustomer();
									$.ajax({
												url : 'http://47.94.104.25:8080/Test01/GetDataAction?action=getCustomerPositiontime',
												type : 'POST',
												cache : false,
												success : function(data,
														textStatus) {
													
													console.log("data"+data);
													var json = eval(data);
													
													if(servies_data != null){
														servies_data.remove();
													}
													if(servies_tzdata != null){
														servies_tzdata.remove();
													}
													
													var plotOptions = {
														scatter : {
															marker : {
																radius : 15 ,
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
																headerFormat : '<b>用户位置</b>',
																pointFormat : 'x = {point.x} , y = {point.y}'
															}
														}
													};
													
													var tzplotOptions = {
															scatter : {
																marker : {
																	radius : 15 ,
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
																	headerFormat : '<b>探针设备</b>',
																	pointFormat : 'x = {point.mac} , y = {point.y}'
																}
															}
														};
													
													servies_data = chart.addSeries(plotOptions,true);
													servies_tzdata = chart.addSeries(tzplotOptions,true);
													
													var x;
													var y;
													var data = [];
													var tzdata = [];
													var mac;
													
													var bq_168_mac="20:f4:1b:7d:b0:3a";
													var bq_168_x = 0;
													var bq_168_y = 0;
													
													var bq_181_mac="e0:b9:4d:f9:8e:5a";
													var bq_181_x = 0;
													var bq_181_y = 0;
													
													var bq_182_mac="e0:b9:4d:f9:8e:3c";
													var bq_182_x = 0;
													var bq_182_y = 0;
													
													var min_x;
													var min_y;
													
													var max_x;
													var max_y;
													
													for (var i = 0; i < json.length; i++) {
														
														mac  = json[i].customer_mac;
														x = json[i].position_x;
														y = json[i].position_y;
														
														
														
														if(mac == bq_168_mac){
															bq_168_x = x;
															bq_168_y = y;
															tzdata.push([ parseFloat(x), parseFloat(y)]);
															console.log("TZ"+parseFloat(x),parseFloat(x));
														}else if(mac == bq_181_mac){
															bq_181_x = x;
															bq_181_y = y;
															tzdata.push([ parseFloat(x), parseFloat(y)]);
															console.log("TZ"+parseFloat(x),parseFloat(y));
														}else if(mac == bq_182_mac){
															bq_182_x = x;
															bq_182_y = y;
															tzdata.push([ parseFloat(x), parseFloat(y)]);
															console.log("TZ"+parseFloat(x),parseFloat(y));
														}else{
															data.push([ parseFloat(x), parseFloat(y)]);
														}
														
														
													}

													console.log(bq_168_x+"-168-"+bq_168_y);
													console.log(bq_181_x+"-181-"+bq_181_y);
													console.log(bq_182_x+"-182-"+bq_182_y);
													
													min_x = getmin(bq_168_x,bq_181_x,bq_182_x);
													max_x = getmax(bq_168_x,bq_181_x,bq_182_x);
													
													min_y = getmin(bq_168_y,bq_181_y,bq_182_y);
													max_y = getmax(bq_168_y,bq_181_y,bq_182_y);
												
													/*
									
													for (var i = 0; i < json.length; i++) {
														
														x = json[i].position_x;
														y = json[i].position_y;
														
														//if(parseFloat(x) > min_x && parseFloat(x) < max_x
														//	&&parseFloat(y) > min_y && parseFloat(y) < max_y){
															
															data.push([ parseFloat(x), parseFloat(y)]);
														//	console.log(parseFloat(x),parseFloat(x));
															
														//}

													}
													*/
													
													servies_data.setData(data);
													servies_tzdata.setData(tzdata);
													
													servies_data.name = "用户";
													servies_tzdata.name = "探针";
													
													chart.redraw();
												}
											});

								}
								
								var countdown = 120;
								function getmax(No1 , No2 , No3){
									
									if (No1 > No2 && No1 > No3)
										   return No1;
									 if (No2 > No1 && No2 > No3)
										 	return No2;
								     if (No3 > No1 && No3 > No2)
								    	 	return No3;
								     
								}
								
								function getmin(No1 , No2 , No3){
								
								     if (No1 < No2 && No1 < No3)
								    	 	return No1;
								     if (No2 < No1 && No2 < No3)
								    	 	return No2;
									 if (No3 < No1 && No3 < No2)
										 	return No3;
								}
								
								function settime() {
									
									var val = $("#time");
									if (countdown == 0) {
									//	val.removeAttribute("disabled");
										val.val("正在刷新数据") ;
										RefreshData("1497409560564","1497410960564");
										countdown = 120;
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
								
								//当日0点的时间

								var dateStr = new Date(new Date().setHours(0, 0, 0, 0))/1000 ;
								//var timestamp0 = strtotime($dateStr);

								//当日24点的时间

								var timestamp24 = dateStr*1000 + 86400000;  
								
							
								//客流量 + 新顾客数量 + 老顾客数量
							//	var str = get_time();
								//获取当前天数的
								time1 = dateStr*1000;
							    time2 = timestamp24;
							      var str = 'http://47.94.104.25:8080/Test01/GetDataAction?action=getCustomerCount2time&time1='+time1+'&time2='+time2;
							      console.log(str);
							      $.ajax({ 
							    	  //http://47.94.104.25:1314/Test01/GetDataAction?action=getall&time1=1496804400000&time2=1496807999000
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
							
							function getCustomer(){
								//  var url_at = "http://47.94.104.25:1314/Test01/GetDataAction?action=getCustomerCount2time&time1="+time1+"&time2="+time2; 
							      //清空原有select内的数据
							      $("#customerbody").empty();
							      
							      var str = 'http://47.94.104.25:8080/Test01/GetDataAction?action=getflim';
							      $.ajax({ 
							    	  //http://47.94.104.25:1314/Test01/GetDataAction?action=getall&time1=1496804400000&time2=1496807999000
							    	  url: str, 
							          type:"post" , 
							          dataType:"json",
							          success:function(data){
							        	  
							              var count = 1;
							              
							              var flim;
							              var mac;
							              var position_x;
							              var position_y;
							              var time;
							              
							              $.each(data, function (index, item) {
							                  var id = count++; 
							                  
							                  flim = data[index].flim;
							                  mac = data[index].mac;
							                  position_x = data[index].position_x;
							                  position_y = data[index].position_y;
							                  time = data[index].time;
							                  
							                  var number  ="<td style=\"width:40px;text-align:center\">"+id+"</td>";
							                  var time2 = "<td style=\"text-align:center\">"+mac+"</td>";
							                  var AllCustomer = "<td style=\"text-align:center\">"+flim+"</td>";
							                  var enterCustomer = "<td style=\"text-align:center\">"+position_x+"</td>";
							                  
							                  var rate = "<td style=\"text-align:center\">"+position_y+" </td>";

							                  var times = "<td style=\"text-align:center\">"+time+" S </td>";
							                  var cl = "<td class=\"action-td\" style=\"text-align:center\"><a href=\"javascript:;\" class=\"btn btn-small btn-warning\"> <i class=\"icon-ok\"></i> </a> <a href=\"javascript:;\" class=\"btn btn-small\"> <i class=\"icon-remove\"></i></a></td>";
							                  
							                  var html = "<tr>"+number+""+time2+""+
							                  AllCustomer+""+enterCustomer+""+rate+""+times+"</tr>";
							                  
							                  $("#customerbody").append(html);
					           
							              }); 
							          }, 
							      error:function(XMLHttpRequest,textStatus, errorThrown) { 
							           alert(errorThrown);
							         }
							      });   
							}
							
						</script>

					</div>
					<!-- /widget -->


<div class="widget widget-table">
					
					<div class="widget-header">
						<h3>数据详情</h3>
					</div> <!-- /widget-header -->
														
					<div class="widget-content">
					<table class="table table-striped table-bordered" >
								<thead>
									<tr>
										<th style="width:40px; text-align:center">#</th>
										<th style="text-align:center">mac地址</th>
										<th style="text-align:center">手机厂商</th>
										<th style="text-align:center">X坐标</th>
										<th style="text-align:center">Y坐标</th>
										<th style="text-align:center">累计时长</th>
										<th>&nbsp;</th>
									</tr>
								</thead>

								<tbody id="customerbody">
								
								
								</tbody>
							</table>
					</div> <!-- /widget-content -->
					
				</div> <!-- /widget -->

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
