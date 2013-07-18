
var Constant = {
	ajaxurl : "/medu/ajaxservlet",
	actionkey : "actionkey"
};

var Util = {
	ajaxPost : function(kw, callback) {
		$.ajax({
			type : "post",
			url : Constant.ajaxurl,
			data : kw,
			success : callback,
			dataType : "json"
		});
	},
	
	preparePostData : function(actionkey,data){
		var postdate = {};
		if(data){
			postdate = data;
		}
		postdate[Constant.actionkey] = actionkey;
		return postdate;
	}
};