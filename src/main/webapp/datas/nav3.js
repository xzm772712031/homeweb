var navs = [{
	"title": "客户信息",
	"icon": "&#xe613;",
	"spread": true,
	"children": [{
		"title": "客户列表",
		"icon": "&#xe641;",
		"href": "selectAllUser"
	}]
},{
	"title": "预约管理",
	"icon": "&#xe63c;",
	"spread": true,
	"children": [{
		"title": "预约列表",
		"icon": "fa-table",
		"href": "selectAllbespeak"
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
		"title": "订单列表",
		"icon": "fa-table",
		"href": "showOrderList"
	}]
},{
	"title": "反馈管理",
	"icon": "fa-cogs",
	"spread": true,
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
	"spread": true,
	"children": [{
		"title": "保险列表",
		"icon": "&#xe629",
		"href": "selectAllInsurance"
	}]
}

,{
	"title": "在线客服",
	"icon": "&#xe63b;",
	"spread": true,
	"href": "https://app.meiqia.com/chat"
}
];