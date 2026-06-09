package net.drew.diagonal_leaves;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Main {

    public Main(IEventBus ignore) {
        CommonClass.init();
    }
}
