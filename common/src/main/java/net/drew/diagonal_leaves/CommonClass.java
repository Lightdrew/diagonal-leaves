package net.drew.diagonal_leaves;

import net.drew.diagonal_leaves.platform.Services;

public class CommonClass
{
    public static void init() {
        if (Services.PLATFORM.isModLoaded("diagonal_leaves")) {
            Constants.LOG.info("Loaded Diagonal Leaves.");
        }
    }
}
