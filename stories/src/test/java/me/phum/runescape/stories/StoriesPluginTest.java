package me.phum.runescape.stories;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class StoriesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(StoriesPlugin.class);
		RuneLite.main(args);
	}
}