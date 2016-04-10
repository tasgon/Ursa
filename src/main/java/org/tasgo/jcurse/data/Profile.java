package org.tasgo.jcurse.data;

public class Profile {
	public static enum ProfileType { VANILLA, MODPACK }
	
	public ProfileType profileType;
	public String name, data;
	
	public Profile(String namein, ProfileType typein, String datain) {
		name = namein;
		data = datain;
		profileType = typein;
	}
}
