package com.chanmaoganda.item;

import net.fabricmc.api.ModInitializer;

public class Initializer implements ModInitializer {
    public static final String MOD_ID = "magician_delight";

    @Override
    public void onInitialize() {
        RegisterUtils.RegisterHandler();
    }
}
