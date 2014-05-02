package de.fhws.applab.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ApplabGwtDemo implements EntryPoint
{
	private static String BASEURL = "http://reallychangethis.com";

	public static String getBaseUrl( )
	{
		return BASEURL;
	}

	public static String getApiUrl( )
	{
		return BASEURL + "/ping";    // must be equal to ${tomcat.path} from pom.xml
	}

	@Override
	public void onModuleLoad( )
	{
		Window.setTitle( "App.lab GWT Demo" );
		loadProperties( );

		RootLayoutPanel rp = RootLayoutPanel.get( );
		Label label = new Label("Hallo Welt");
		rp.add( label );
	}

	private void loadProperties( )
	{
		ApplabGwtDemoConstants myConstants = GWT.create( ApplabGwtDemoConstants.class );
		BASEURL = myConstants.serverUrl( );
	}

}
