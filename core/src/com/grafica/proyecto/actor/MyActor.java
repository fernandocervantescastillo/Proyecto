package com.grafica.proyecto.actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyActor  extends Actor {

    Sprite sprite;
    Viewport viewport;
    float dx = 5;
    float dy = 5;

    public MyActor(Texture texture, final String actorName, Viewport viewport) {
        sprite = new Sprite(texture);

        spritePos(sprite.getX(), sprite.getY());
        setTouchable(Touchable.enabled);

        sprite.setSize(60,60);

        this.viewport = viewport;
    }

    public void mover(){

        float x = sprite.getX() + dx;
        float y = sprite.getY() + dy;
        if(x<0 || 1080 <x + 60)
            dx = -dx;
        if(y<0 || 720<y + 60)
            dy = -dy;
        spritePos(x, y);
    }

    public void spritePos(float x, float y){
        sprite.setPosition(x, y);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}