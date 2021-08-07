package com.grafica.proyecto.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.grafica.proyecto.actor.MyActor;
import com.grafica.proyecto.utils.AssetDescriptors;

public class ScreenGame implements Screen {

    private final Game game;
    private Stage stage;
    private Viewport viewport;
    private final AssetManager manager;
    private MyActor myActor1;
    public ScreenGame(Game game){
        this.game = game;
        manager = new AssetManager();
    }

    @java.lang.Override
    public void show() {
        viewport = new FitViewport(1080, 720);
        stage = new Stage(viewport);
        Gdx.gl.glClearColor(1.0f, 1.0f, 0.5f, 1.0f);
        Gdx.input.setInputProcessor(stage);

        loadAssets();

        myActor1 = new MyActor(manager.get(AssetDescriptors.circle) , AssetDescriptors.circle.fileName, viewport);
        myActor1.spritePos(0, 0);

        stage.addActor(myActor1);

    }

    @java.lang.Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        myActor1.mover();
        stage.act(delta);
        stage.draw();
    }

    @java.lang.Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @java.lang.Override
    public void pause() {

    }

    @java.lang.Override
    public void resume() {

    }

    @java.lang.Override
    public void hide() {
        dispose();
    }

    @java.lang.Override
    public void dispose() {
        stage.dispose();
    }

    private void loadAssets() {
        manager.load(AssetDescriptors.circle);
        manager.finishLoading();
    }
}
