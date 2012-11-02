package it.softphone.commons.gwt.showcase.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle{

	@Source("softphone_logo.png")
	ImageResource logo();

	@Source("scarlett.jpg")
	ImageResource scarlett();

	@Source("user_female.png")
	ImageResource userFemale();

	@Source("User-icon.png")
	ImageResource userMale();

}
