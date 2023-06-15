package com.mclegoman.simplefabric.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleFabricData {
    public static final String ID;
    public static final String NAME;
    public static final String VERSION;
    public static final String PREFIX;
    public static final Logger LOGGER;
    static {
        ID = "simplefabric";
        NAME = "SimpleFabric";
        VERSION = "1.0.3+LegacyFabric";
        PREFIX = "[" + NAME + " " + VERSION + "] ";
        LOGGER = LogManager.getLogger(ID);
    }
}