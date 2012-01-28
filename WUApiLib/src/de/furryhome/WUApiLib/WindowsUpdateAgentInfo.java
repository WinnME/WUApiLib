package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class WindowsUpdateAgentInfo {
	public static enum VersionInfo {ApiMajorVersion, ApiMinorVersion, ProductVersionString}
	
	/**
	 * the program identifier of this object
	 * 
	 * @since	1.0
	 * 
	 */
	public static final String IDENTIFIER = "Microsoft.Update.AgentInfo";
	
	/**
	 * the static instance variable
	 * 
	 * @since	1.0
	 * 
	 */
	private static Dispatch instance = null;
	
	private WindowsUpdateAgentInfo() {
		instance = new Dispatch(IDENTIFIER);
	}

	/**
	 * Creates an instance of the WindowsUpdateAgentinfo class and saves it to a class variable.<br>
	 * if an instance already exists, no new one will be created.
	 * 
	 * @since	1.0
	 * 
	 */
	private static void createInstance() {
		if (instance == null) {
			new WindowsUpdateAgentInfo();
		}
	}
	
	//Wrapped
	public static String getInfo(String s) {
		createInstance();
		return Dispatch.call(instance, "GetInfo", new Variant(s)).toString();
	}
	
	public static String getInfo(VersionInfo e) {
		createInstance();
		return Dispatch.call(instance, "GetInfo", new Variant(e.name())).toString();
	}
}
