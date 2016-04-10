package org.tasgo.jcurse.api.minecraft;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

import org.tasgo.jcurse.api.Utility;

import com.google.gson.JsonSyntaxException;


/**Type class for the Minecraft version listing
 * 
 * @author Tasgo
 *
 */
public class MinecraftVersionList {
	public static final MinecraftVersionList instance = getInstance();
	
	public class Version {
		public String id, time, releaseTime, type;
	}
	
	private static MinecraftVersionList getInstance() {
		try {
			URL versionURL = new URL("http://s3.amazonaws.com/Minecraft.Download/versions/versions.json");
			//return Utility.urlToJson(versionURL, MinecraftVersionList.class);
			return null;
		} catch (JsonSyntaxException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Map<String, String> latest;
	public List<Version> versions;
}
