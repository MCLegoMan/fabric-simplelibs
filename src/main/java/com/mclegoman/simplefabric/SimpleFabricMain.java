package com.mclegoman.simplefabric;

import com.mclegoman.simplefabric.data.SimpleFabricData;
import net.fabricmc.api.ModInitializer;

public class SimpleFabricMain implements ModInitializer {
    @Override
    public void onInitialize() {
        SimpleFabricData.LOGGER.info(SimpleFabricData.PREFIX + "NOTE: '" + SimpleFabricData.NAME + "' combines 'Simple Fabric Libs' by  magistermaks - containing: 'simple-config' and 'simple-ray' - into a Fabric Mod. 'Simple Fabric Libs' and '" + SimpleFabricData.NAME + "' are licensed under the MIT license.");
    }
}