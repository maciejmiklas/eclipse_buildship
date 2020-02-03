package org.test;

import java.time.LocalDateTime;
import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class TimePanel extends Panel{

	private IModel<LocalDateTime> model = Model.of(LocalDateTime.now());
	
	public TimePanel(String id) {
		super(id);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(new Label("time", model));
	}
	
	
	@Override
	protected void onConfigure() {
		super.onConfigure();
		model.setObject(LocalDateTime.now());
	}

}

