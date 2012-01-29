package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

/**
 * Contains information about the specified computer. This information is relevant to the Windows Update Agent (WUA).
 * 
 * @author	Jens Eichler
 * @version	1.0
 */
public class SystemInformation {
	
	/**
	 * the program identifier of this object
	 * 
	 * @since	1.0
	 * 
	 */
	public static final String IDENTIFIER = "Microsoft.Update.SystemInfo";
	
	/**
	 * the static instance variable
	 * 
	 * @since	1.0
	 * 
	 */
	private static Dispatch instance = null;
	
	/**
	 * Private constructor, initializes the SystemInfo object and saves it into {@link #instance}.
	 * 
	 * @since	1.0
	 * 
	 */
	private SystemInformation() {
		instance = new Dispatch(IDENTIFIER);
	}
	
	/**
	 * Creates and returns an instance of the SystemInformation class.<br>
	 * If one instance already exists, it will be returned instead of creating a new one.
	 * 
	 * @return	the instance of that class
	 * @since	1.0
	 * 
	 */
	private static Dispatch getInstance() {
		if (instance == null) {
			new SystemInformation();
		}
		return instance;
	}

	//Wrapped
	/**
	 * Gets a boolean value that indicates whether a system restart is required<br>
	 * to complete the installation or uninstallation of one or more updates.
	 * 
	 * @return	the status as a boolean value
	 * @since	1.0
	 * 
	 */
	public static boolean isRebootRequired() {
		return Dispatch.get(getInstance(), "RebootRequired").getBoolean();
	}
	
	/**
	 * Gets a hyperlink to technical support information for OEM hardware.
	 * 
	 * @return	the hyperlink as a string
	 * @since	1.0
	 * 
	 */
	public static String getOemHardwareSupportLink() {
		return Dispatch.get(getInstance(), "OemHardwareSupportLink").getString();
	}
	
	//Deprecated Routines
	/**
	 * @deprecated	only for compatibility reasons
	 * @see			{@link #isRebootRequired()}
	 * @since		1.0
	 */
	public static boolean RebootRequired() {
		return isRebootRequired();
	}
	
	/**
	 * @deprecated	only for compatibility reasons
	 * @see			{@link #getOemHardwareSupportLink()}
	 * @since		1.0
	 */
	public static String OemHardwareSupportLink() {
		return getOemHardwareSupportLink();
	}
}
