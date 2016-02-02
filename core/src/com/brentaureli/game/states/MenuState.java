package com.brentaureli.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brentaureli.game.NightDemo;

import java.util.Calendar;

import javax.swing.text.View;


/**
 * Created by Squall on 2016/1/13.
 */
public class MenuState extends State {
    private Texture background;
    private Texture playBtn,playBtn1;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, NightDemo.WIDTH / 2, NightDemo.HEIGHT / 2);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
        playBtn1 = new Texture("playbtn1.png");
    }



    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update (float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(background, 0, 0);
        sb.draw(playBtn, cam.position.x - playBtn.getWidth() / 2, cam.position.y);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        System.out.println("Menu State Disposed");
    }
}
