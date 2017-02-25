package com.github.squidpony.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.github.squidpony.SquidBasicDemo;

/** Launches the GWT application. */
public class GwtLauncher extends GwtApplication {
    @Override
    public GwtApplicationConfiguration getConfig() {
        GwtApplicationConfiguration configuration = new GwtApplicationConfiguration(80 * 11, (24 + 8) * 22);
        return configuration;
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new SquidBasicDemo();
    }
}