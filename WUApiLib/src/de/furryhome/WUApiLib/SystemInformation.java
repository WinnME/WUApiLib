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
	 * @since	1.0
	 * 
	 */
	private SystemInformation() {
		instance = new Dispatch(IDENTIFIER);
	}
	
	/**
	 * Creates an instance of the SystemInfo class and saves it to a class variable.<br>
	 * if an instance already exists, no new one will be created.
	 * 
	 * @since	1.0
	 * 
	 */
	private static void createInstance() {
		if (instance == null) {
			new SystemInformation();
		}
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
		createInstance();
		return Dispatch.get(instance, "RebootRequired").getBoolean();
	}
	
	/**
	 * Gets a hyperlink to technical support information for OEM hardware.
	 * 
	 * @return	the hyperlink as a string
	 * @since	1.0
	 * 
	 */
	public static String getOemHardwareSupportLink() {
		createInstance();
		return Dispatch.get(instance, "OemHardwareSupportLink").getString();
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
