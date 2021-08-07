/**
 * 
 */
package com.birprojedaha.common.utils;

/**
 * @author egemen
 *
 */
public class PageUtils {

	private PageUtils() {
		    throw new IllegalStateException("Utility class");
	}

	public static String view(String folder, String page) {
		return new StringBuilder(folder).append("/").append(page).toString();
	}
	
	public static String view(String page) {
		return page;
	}
}
