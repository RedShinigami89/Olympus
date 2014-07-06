package com.drdee89.olympus;

import com.drdee89.olympus.configuration.ConfigurationHandler;
import com.drdee89.olympus.proxy.IProxy;
import com.drdee89.olympus.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.SidedProxy;
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) 
public class Olympus 
{

	@Mod.Instance("Olympus")
	public static Olympus instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
	    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
