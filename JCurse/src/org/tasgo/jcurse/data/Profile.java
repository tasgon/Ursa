package org.tasgo.jcurse.data;

public class Profile {
	public static enum ProfileType { VANILLA, MODPACK }
	
	public ProfileType profileType;
	public String data;
	
	public Profile(ProfileType typein, String datain) {
		data = datain;
		profileType = typein;
	}
}
