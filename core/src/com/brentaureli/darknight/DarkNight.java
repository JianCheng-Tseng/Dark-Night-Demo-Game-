package com.brentaureli.darknight;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brentaureli.darknight.States.GameStateManager;
import com.brentaureli.darknight.States.MenuState;

/**
 * Created by Squall on 2016/1/12.
 */
public class DarkNight extends ApplicationAdapter {
    public static final int WIDTH=480;
    public static final int HEIGHT = 800;
    public static final float SCALE = 0.5f;
    public static final String TITLE ="DarkNight";

    private SpriteBatch spriteBatch;
    private GameStateManager gameStateManager;

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        gameStateManager = new GameStateManager();
        gameStateManager.push(new MenuState(gameStateManager));

        Gdx.gl.glClearColor(1,0,0,1);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameStateManager.update(Gdx.graphics.getDeltaTime());
        gameStateManager.render(spriteBatch);
    }

}
