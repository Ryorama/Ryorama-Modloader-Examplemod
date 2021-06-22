package com.ryorama.examplemod;

import com.ryorama.modloader.api.ModInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInit {

    public static final Logger logger = LogManager.getLogger("Example Mod");

    @Override
    public void init() {
        logger.info("Example Mod Initialized!");
    }
}
