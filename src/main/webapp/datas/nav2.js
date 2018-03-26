var navs = [{
	"title": "预约管理",
	"icon": "&#xe63c;",
	"spread": true,
	"children": [{
		"title": "预约列表",
		"icon": "fa-table",
		"href": "selectAllbespeak"
	}, {
		"title": "待处理预约",
		"icon": "fa-navicon",
		"href": "showbespeakBefore"
	}, {
		"title": "已确认预约",
		"icon": "&#xe62a;",
		"href": "showbespeakOK"
	}, {
		"title": "已分配预约",
		"icon": "&#xe62a;",
		"href": "showbespeakComplete"
	}, {
		"title": "预约统计",
		"icon": "&#xe629;",
		"href": "BespeakStatistics.jsp"
	}]
},
{
	"title": "订单管理",
	"icon": "&#xe62a;",
	"spread": true,
	"children": [{
		"title": "待创建",
		"icon": "fa-table",
		"href": "showOrderBefore"
	},{
		"title": "订单列表",
		"icon": "fa-table",
		"href": "showOrderList"
	}, {
		"title": "待服务",
		"icon": "fa-navicon",
		"href": "showOrdercreated"
	}, {
		"title": "进行中",
		"icon": "fa-navicon",
		"href": "showOrderListIng"
	}, {
		"title": "已完成",
		"icon": "&#xe62a;",
		"href": "showOrderListOK"
	}]
},{
	"title": "保险管理",
	"icon": "fa-address-book",
	"href": "",
	"spread": true,
	"children": [{
		"title": "保险列表",
		"icon": "&#xe629",
		"href": "selectAllInsurance"
	}]

}
];