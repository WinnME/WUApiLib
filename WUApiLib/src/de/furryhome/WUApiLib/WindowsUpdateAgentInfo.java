package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * Contains information about the installed Windows Update Agent (WUA) version.
 * 
 * @author	Jens Eichler
 * @version	1.0
 */
public class WindowsUpdateAgentInfo {
	
	/**
	 * Enumeration with the possibilities to state the type of version to fetch<br><br>
	 * 
	 * ApiMajorVersion		- Retrieves the current major version of WUA.<br>
	 * ApiMinorVersion		- Retrieves the current minor version of WUA.<br>
	 * ProductVersionString	- Retrieves the file version of the Wuapi.dll file in string format.
	 * 
	 * @since	1.0
	 * 
	 */
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
	
	/**
	 * Private constructor, initializes the WindowsUpdateAgentInfo object and saves it into {@link #instance}.
	 * 
	 * @since	1.0
	 * 
	 */
	private WindowsUpdateAgentInfo() {
		instance = new Dispatch(IDENTIFIER);
	}

	/**
	 * Creates and returns an instance of the WindowsUpdateAgentinfo class.<br>
	 * If one instance already exists, it will be returned instead of creating a new one.
	 * 
	 * @return	the instance of that class
	 * @since	1.0
	 * 
	 */
	private static Dispatch getInstance() {
		if (instance == null) {
			new WindowsUpdateAgentInfo();
		}
		return instance;
	}
	
	//Wrapped
	/**
	 * Retrieves version information about Windows Update Agent (WUA).
	 * 
	 * @param	String A string value that specifies the type of information
	 * @return	the version as a string
	 * @throws	IllegalArgumentException Throws when the supplied parameter is not valid<br>(see enumeration VersionInfo)
	 * @since	1.0
	 * 
	 */
	public static String getInfo(String s) throws IllegalArgumentException {
		boolean throwException = true;
		for (VersionInfo e : VersionInfo.values()) {
			if (e.name().equals(s)) throwException = false;
		}
		if (!throwException) {
			return Dispatch.call(getInstance(), "GetInfo", new Variant(s)).toString();
		} else {
			throw new IllegalArgumentException( s + "is not a valid argument");
		}
	}
	
	/**
	 * Retrieves version information about Windows Update Agent (WUA).
	 * 
	 * @param	VersionInfo A VersionInfo enumeration that specifies the type of information
	 * @return	the version as a string
	 * @since	1.0
	 * 
	 */
	public static String getInfo(VersionInfo e) {
		return Dispatch.call(getInstance(), "GetInfo", new Variant(e.name())).toString();
	}
}
