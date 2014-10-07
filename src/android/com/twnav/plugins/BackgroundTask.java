package com.twnav.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.provider.Settings;

public class BackgroundTask extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		if (action.equals("execute")) {
			this.cordova.getActivity().moveTaskToBack(true);
			return true;
		} else {
			callbackContext.error("Invlid action");
			return false;
		}
	}
}