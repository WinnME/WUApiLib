package de.furryhome.WUApiLib.Tester;

import de.furryhome.WUApiLib.SearchResult;
import de.furryhome.WUApiLib.Update;
import de.furryhome.WUApiLib.UpdateCollection;
import de.furryhome.WUApiLib.UpdateSearcher;
import de.furryhome.WUApiLib.UpdateSession;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UpdateSession us = new UpdateSession();
		UpdateSearcher usearcher = us.CreateUpdateSearcher();
		System.out.println("search für updates...");
		SearchResult result = usearcher.Search("IsInstalled=0 and Type='Software'");
		System.out.println("finish");
		
		UpdateCollection updates = result.Updates();
		for (int i = 0; i < updates.Count(); i++) {
			Update update = updates.Item(i);
			System.out.println(i + "> " + update.Title());
		}
	}
}
