package org.tasgo.jcurse.api;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class Utility {
	/**Automatically retrieves a URL and converts it to the appropriate JSON form
	 * 
	 * @param url The source URL from which to get the JSON data
	 * @param classOfT the class type of the data
	 * @return
	 * @throws IOException 
	 * @throws JsonSyntaxException 
	 */
	public static <T> void urlToJson(URL url, Class<T> classOfT) throws JsonSyntaxException, IOException {
		//return new Gson().fromJson(IOUtils.toString(url), classOfT);
	}
}
