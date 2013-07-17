
var Constant = {
	ajaxurl : "/medu/ajaxservlet"
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
	}
};