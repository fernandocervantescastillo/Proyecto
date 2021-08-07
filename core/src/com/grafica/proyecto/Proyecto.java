package com.grafica.proyecto;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.grafica.proyecto.screen.ScreenGame;

public class Proyecto extends Game {

	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		setScreen(new ScreenGame(this));
	}

	@Override
	public void dispose() {
	}

}