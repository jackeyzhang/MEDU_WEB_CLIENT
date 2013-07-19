
var Constant = {
	ajaxurl : "/medu/ajaxservlet",
	actionkey : "actionkey",
	formkey:"formkey"
};

var Util = {
	ajaxPost : function(kw, callback) {
		$.ajax({
			type : "post",
			url : Constant.ajaxurl,
			data : $.param(kw,true),
			success : callback,
			dataType : "json"
		});
	},
	
	preparePostData : function(actionkey,formkey,data){
		var postdate = {};
		if(data){
			postdate = data;
		}
		postdate[Constant.actionkey] = actionkey;
		postdate[Constant.formkey] = formkey;
		return postdate;
	}
};