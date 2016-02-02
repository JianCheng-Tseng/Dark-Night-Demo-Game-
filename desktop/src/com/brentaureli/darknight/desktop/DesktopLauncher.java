package com.brentaureli.darknight.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.brentaureli.darknight.DarkNight;

/**
 * Created by Squall on 2016/1/12.
 */
public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = DarkNight.WIDTH;
        config.height = DarkNight.HEIGHT;
        config.title =  DarkNight.TITLE;
        new LwjglApplication(new DarkNight(), config );
    }
}
