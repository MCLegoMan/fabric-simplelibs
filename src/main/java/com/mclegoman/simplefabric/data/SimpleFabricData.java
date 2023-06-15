package com.mclegoman.simplefabric.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleFabricData {
    public static final String ID;
    public static final String NAME;
    public static final String VERSION;
    public static final String PREFIX;
    public static final Logger LOGGER;
    static {
        ID = "simplefabric";
        NAME = "SimpleFabric";
        VERSION = "1.0.1";
        PREFIX = "[" + NAME + " " + VERSION + "] ";
        LOGGER = LoggerFactory.getLogger(ID);
    }
}