package com.ezhomesixgod.config;

import com.ezhomesixgod.core.util.DESUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;


public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	
	private String[] encryptPropNames = { "userName", "password", "url", "driver"};
	
	protected String convertProperty(String propertyName, String propertyValue) {
		if (isEncryptProp(propertyName)) {
			String decryptValue = DESUtils.decrypt(propertyValue);
			return decryptValue;
		} else {
			return propertyValue;
		}
	}
	
	
	private boolean isEncryptProp(String propertyName) {
		for (String encryptpropertyName : encryptPropNames) {
			if (encryptpropertyName.equals(propertyName))
				return true;
		}
		return false;
	}
}
