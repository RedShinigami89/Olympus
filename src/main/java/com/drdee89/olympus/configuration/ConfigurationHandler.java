package com.drdee89.olympus.configuration;

import java.io.File;
import net.minecraftforge.common.config.Configuration;


public class ConfigurationHandler 
{
    public static void init(File configFile)
    {
         //create the configuration object from the given file     
    	Configuration configuration = new Configuration(configFile);
    	boolean configValue = false;
    	    	
    	try
    	{
    		//Load the configuration file
    		configuration.load();
    		
    		//Read in properties from configuration file
    		configValue = configuration.get(configuration.CATEGORY_GENERAL, "congifValue", true, "This is an example config value").getBoolean(true);
    		
    	}
    	catch (Exception e)
    	{
    		// Log the Exception
    	}
    	finally
    	{
    		//save the configuration file
    		configuration.save();
    	}
    	System.out.println(configValue);
    }
	
}
