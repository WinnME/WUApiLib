package de.furryhome.WUApiLib.Tester;

import de.furryhome.WUApiLib.WindowsUpdateAgentInfo;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(WindowsUpdateAgentInfo.getInfo(WindowsUpdateAgentInfo.VersionInfo.ProductVersionString.name()));
	}
}
