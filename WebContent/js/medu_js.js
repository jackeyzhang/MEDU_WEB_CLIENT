var Medu = {

	testcallback : function(result) {
		alert(result.name + result.age);
	},

	sendAjaxRequest : function() {
		var kw = {
			name : "wbb",
			age : "20"
		};

		Util.ajaxPost(kw, this.testcallback);
	}
};