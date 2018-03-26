var navs = [{
	"title": "客户信息",
	"icon": "&#xe613;",
	"spread": false,
	"children": [{
		"title": "客户列表",
		"icon": "&#xe641;",
		"href": "selectAllUser"
	}]
},{
	"title": "预约管理",
	"icon": "&#xe63c;",
	"spread": false,
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
	"spread": false,
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
	"title": "反馈管理",
	"icon": "fa-cogs",
	"spread": false,
	"children": [{
		"title": "反馈列表",
		"icon": "fa-table",
		"href": "selectAllFeedBack"
	},{
		"title": "未处理反馈",
		"icon": "&#xe62a;",
		"href": "selectBeforeFeedBack"
	}]
},{
	"title": "保险管理",
	"icon": "fa-address-book",
	"href": "",
	"spread": false,
	"children": [{
		"title": "保险列表",
		"icon": "&#xe629",
		"href": "selectAllInsurance"
	}]
},{
	"title": "人员管理",
	"icon": "&#xe612;",
	"spread": false,
	"children": [{
		"title": "人员列表",
		"icon": "fa-check-square-o",
		"href": "showEpolyee"
	},{
		"title": "人员入职",
		"icon": "fa-check-square-o",
		"href": "showjob"
	}]
},{
	"title": "车辆管理",
	"icon": "&#xe631;",
	"spread": false,
	"children": [{
		"title": "车辆列表",
		"icon": "fa-check-square-o",
		"href": "showCar"
	},{
		"title": "新增车辆",
		"icon": "fa-check-square-o",
		"href": "showCarType"
	}]
},{
	"title": "资讯管理",
	"icon": "&#xe611;",
	"spread": false,
	"children": [{
		"title": "新闻管理",
		"icon": "fa-check-square-o",
		"href": "selectAllnews"
	},{
		"title": "答疑管理",
		"icon": "fa-check-square-o",
		"href": "selectAllanswer"
	},{
		"title": "新增资讯",
		"icon": "fa-check-square-o",
		"href": "addnews.jsp"
	}]
},{
	"title": "在线客服",
	"icon": "&#xe63b;",
	"spread": false,
	"href": "https://app.meiqia.com/chat"
}
];