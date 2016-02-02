package com.brentaureli.darknight.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brentaureli.darknight.DarkNight;

/**
 * Created by Bruce Tseng on 2016/1/13.
 */
public class MenuState extends State {
    Texture background;
    Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");

    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }


    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, DarkNight.WIDTH, DarkNight.HEIGHT);
        sb.draw(playBtn, (DarkNight.WIDTH/2) - (playBtn.getWidth()/2),DarkNight.HEIGHT/2);
        sb.end();
     }

    }

