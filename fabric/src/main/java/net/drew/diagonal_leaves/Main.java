package net.drew.diagonal_leaves;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;

public class Main implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        CommonClass.init();
    }
}
