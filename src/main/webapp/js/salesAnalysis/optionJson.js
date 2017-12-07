	var b = true;
	var time = 10000;
	//第一屏幕overAll
//左侧销售量
	var json = {
		chart : {
			zoomType : 'xy'
		},
		title : {
			text : ''
		},
		subtitle : {
			text : ''
		},
		xAxis : [ {
			categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
					'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
			crosshair : true,
			tickInterval : 0
		} ],
		yAxis : [ { // Primary yAxis
			labels : {
				formatter : function() {
					return this.value / unit + unitE;
				},
				style : {
					color : "#707073"
				}
			},
			
			plotLines:[{
				color:'#707073',           //线的颜色，定义为红色
				dashStyle:'longdash',     //默认值，这里定义为实线solid
				value:0,               //定义在那个值上显示标示线，这里是在x轴上刻度为3的值处垂直化一条线
				width:1                //标示线的宽度，2px
			}],
			//网格线
			gridLineWidth: 0.1,
			title : {
				text : 'GMV',
				style : {
					color : "#707073"
				}
			}
		} ],
		legend:{
			enabled :false
		},
		tooltip : {
			shared : true,
			style : { // 提示框内容的样式
				color : 'pink',
				padding : '10px', // 内边距 (这个会常用到)
				fontSize : '9pt'
			} ,
			formatter : function() {
				var s = '<b style="float:right;color:#ffffff" >' + this.x + '</b>';
				$.each(
						this.points,
						function(i, value) {
							var _value = value.y;
							if (i != 4) {
								if (dateType == "MONTH") {
									_value = _value / unit;
									_value = _value.toFixed(1);
									_value = formatNum(_value);
								} else {
									_value = _value / unit;
									_value = _value.toFixed(0);
									_value = formatNum(_value);
								}
							}
							s += '<br/>'
									+ '<span style="float:right;color:'
					+ value.series.color + '">'
									+ value.series.name
									+ ' : </span>'
									+ '<span style="float:left;color:'
					+ value.series.color + '">'
									+ _value
									+ value.series.tooltipOptions.valueSuffix
									+ '</span>';
						});
				return s;
			} 
		},
		/* legend : {
			layout : 'vertical',
			align : 'left',
			x : 0,
			verticalAlign : 'top',
			y : 0,
			floating : true,
			backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
					|| '#FFFFFF'
		}, */
		plotOptions : {
			areaspline : {
				marker : {
					enabled : false,
					symbol : 'circle',
					radius : 2,
					states : {
						hover : {
							enabled : true
						}
					}
				}
			},
			spline : {
				marker : {
					enabled : false,
					symbol : 'circle',
					radius : 2,
					states : {
						hover : {
							enabled : true
						}
					}
				}
			}
		},
		series : [ {
			name : 'GMV',
			type : 'spline',
			color : '#FF9933',
			data : [],
			tooltip : {
				valueSuffix : ''
			}
		}]
	};
	//客单量曲线
	var atvjson = {
			chart : {
				zoomType : 'xy'
			},
			title : {
				text : ''
			},
			subtitle : {
				text : ''
			},
			xAxis : [ {
				categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
				crosshair : true,
				tickInterval : 0
			} ],
			yAxis : [ { // Primary yAxis
				labels : {
					style : {
						color : "#707073"
					}
				},
				
				plotLines:[{
					color:'#707073',           //线的颜色，定义为红色
					dashStyle:'longdash',     //默认值，这里定义为实线solid
					width:1                //标示线的宽度，2px
				}],
				//网格线
				gridLineWidth: 0.1,
				title : {
					text : 'ATV',
					style : {
						color : "#707073"
					}
				}
			} ],
			legend:{
				enabled :false
			},
			tooltip : {
				shared : true,
				style : { // 提示框内容的样式
					color : '#ffffff',
					padding : '10px', // 内边距 (这个会常用到)
					fontSize : '9pt'
				} ,
				formatter : function() {
					var s = '<b>' + this.x + '</b>';
					$.each(
							this.points,
							function(i, value) {
								var _value = value.y;
								s += '<br/>'
										+ '<span style="float:right;color:'
						+ value.series.color + '">'
										+ value.series.name
										+ ' : </span>'
										+ '<span style="float:left;color:'
						+ value.series.color + '">'
										+ _value
										+ value.series.tooltipOptions.valueSuffix
										+ '</span>';
							});
					return s;
				} 
			},
			//图标展示
			/* legend : {
				layout : 'vertical',
				align : 'left',
				x : 0,
				verticalAlign : 'top',
				y : 0,
				floating : true,
				backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
						|| '#FFFFFF'
			}, */
			plotOptions : {
				areaspline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				},
				spline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				}
			},
			series : [ {
				name : 'ATV',
				type : 'spline',
				color : '#FF9933',
				tooltip : {
					valueSuffix : ''
				}
			}]
		};
	//第五屏幕Discount
	var discount={
		        chart: {
		            type: 'columnrange',
		        },
		        title: {
		            text: ''
		        },
		        subtitle: {
		            text: ''
		        },
		        xAxis: {
		            categories: []
		        },
		        yAxis: {
		        	floor: 0,
		            title: {
		                text: ''
		            }
		        },
		   
		        plotOptions: {
		            columnrange: {
		                dataLabels: {
		                    enabled: true,
		                    formatter: function () {
		                        return Number(this.y).toFixed(0);
		                    }
		                }
		            }
		        },
		        legend: {
		            enabled: false
		        },
		        tooltip: {
		        	formatter : function() {
						var s = '<b>' +this.x+ '</b>';
						s+='<br>' 
						s+='<b>' +(Number(this.point.options.low).toFixed(0)- Number(this.point.options.high).toFixed(0)) + '</b>'
						return s;
					} 
		        },
		        series: [{
		        	color:'#FF9933',
		            name: '金额',
		            data: [
		            ]
		        }]
		    }

	var priceRangeJson={
			chart : {
				zoomType : 'xy'
			},
			title : {
				text : ''
			},
			subtitle : {
				text : ''
			},
			xAxis : {
                type: 'datetime',
                dateTimeLabelFormats: {
                	 millisecond: '%H:%M:%S.%L',
                     second: '%H:%M:%S',
                     minute: '%H:%M',
                     hour: '%H:%M',
                     day: '%Y-%m-%d',
                     week: '%m-%d',
                     month: '%Y-%m',
                     year: '%Y'
                }
            },
            tooltip: {
            	type: 'datetime',
            	 dateTimeLabelFormats: {
                     millisecond: '%H:%M:%S.%L',
                     second: '%H:%M:%S',
                     minute: '%H:%M',
                     hour: '%H:%M',
                     day: '%Y-%m-%d',
                     week: '%m-%d',
                     month: '%Y-%m',
                     year: '%Y'
                 }
            },
			yAxis : [ { // Primary yAxis
				labels : {
					style : {
						color : "#707073"
					}
				},
				
				plotLines:[{
					color:'#707073',           //线的颜色，定义为红色
					dashStyle:'longdash',     //默认值，这里定义为实线solid
					width:1                //标示线的宽度，2px
				}],
				//网格线
				gridLineWidth: 0.1,
				title : {
					text : 'ATV',
					style : {
						color : "#707073"
					}
				}
			} ],
			legend:{
				enabled :false
			},
			plotOptions : {
				areaspline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				},
				spline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				}
			},
			series : [ {
				name : 'GMV',
				type : 'spline',
				color : '#FF9933',
				tooltip : {
					valueSuffix : ''
				},
			}]
		}
	var storeComparisonJson = {
			chart : {
				zoomType : 'xy'
			},
			title : {
				text : ''
			},
			subtitle : {
				text : ''
			},
			xAxis : [ {
				categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
				crosshair : true,
				tickInterval : 0
			} ],
			yAxis : [ { // Primary yAxis
				labels : {
					formatter : function() {
						return this.value / unit + unitE;
					},
					style : {
						color : "#707073"
					}
				},
				
				plotLines:[{
					color:'#707073',           //线的颜色，定义为红色
					dashStyle:'longdash',     //默认值，这里定义为实线solid
					value:0,               //定义在那个值上显示标示线，这里是在x轴上刻度为3的值处垂直化一条线
					width:1                //标示线的宽度，2px
				}],
				//网格线
				gridLineWidth: 0.1,
				title : {
					text : 'GMV',
					style : {
						color : "#707073"
					}
				}
			} ],
			legend:{
				enabled :false
			},
			tooltip : {
				shared : true,
				style : { // 提示框内容的样式
					color : 'pink',
					padding : '10px', // 内边距 (这个会常用到)
					fontSize : '9pt'
				} ,
				formatter : function() {
					var s = '<b style="float:right;color:#ffffff" >' + this.x + '</b>';
					$.each(
							this.points,
							function(i, value) {
								var _value = value.y;
								if (i != 4) {
									if (dateType == "MONTH") {
										_value = _value / unit;
										_value = _value.toFixed(1);
										_value = formatNum(_value);
									} else {
										_value = _value / unit;
										_value = _value.toFixed(0);
										_value = formatNum(_value);
									}
								}
								s += '<br/>'
										+ '<span style="float:right;color:'
						+ value.series.color + '">'
										+ value.series.name
										+ ' : </span>'
										+ '<span style="float:left;color:'
						+ value.series.color + '">'
										+ _value
										+ value.series.tooltipOptions.valueSuffix
										+ '</span>';
							});
					return s;
				} 
			},
			 legend : {
				layout : 'vertical',
				align : 'right',
				x : 0,
				verticalAlign : 'top',
				y : 0,
				floating : true,
			}, 
			plotOptions : {
				areaspline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				},
				spline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				}
			},
			series : [ {
				name : 'GMV',
				type : 'spline',
				color : '#dda04b',
				data : [],
				tooltip : {
					valueSuffix : ''
				}
			},
			{
				name : 'GMV',
				type : 'spline',
				color : '#4a3b93',
				data : [],
				tooltip : {
					valueSuffix : ''
				}
			}]
		};