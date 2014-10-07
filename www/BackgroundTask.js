var exec = require('cordova/exec');

function BackgroundTask() {
}

BackgroundTask.prototype.execute = function(successCallback, failureCallback) {
	return exec(successCallback, failureCallback, "BackgroundTask", "execute", []);
};

BackgroundTask.install = function() {
	if (!window.plugins) {
		window.plugins = [];
	}

	window.plugins.BackgroundTask = new BackgroundTask();
	return window.plugins.BackgroundTask;
};

cordova.addConstructor(BackgroundTask.install); 