package com.grafica.proyecto.utils;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.Texture;

public class AssetDescriptors {
    public static final String CIRCLE = "images/circle.png";

    public static final AssetDescriptor<Texture> circle = new AssetDescriptor<Texture>(CIRCLE, Texture.class);
}
