package net.drew.diagonal_leaves;

//? if fabric {
import net.fabricmc.api.ModInitializer;

import static net.drew.diagonal_leaves.CommonMain.*;

public class FabricMain implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Diagonal Leaves loaded.");
    }
}
//?}