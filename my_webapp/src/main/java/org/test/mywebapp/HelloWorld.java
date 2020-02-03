package org.test.mywebapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.test.TimePanel;

public class HelloWorld extends WebPage {

	@Override
	protected void onConfigure() {
		super.onConfigure();		
		add(new TimePanel("time"));
	}
}