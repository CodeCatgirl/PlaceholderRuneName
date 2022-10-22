package io.github.codecatgirl.placeholderrunename;

import org.bukkit.plugin.java.JavaPlugin;

public class placeholderrunename extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Runic Enchants has been enabled!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Runic Enchants has been disabled.");
	}
}
