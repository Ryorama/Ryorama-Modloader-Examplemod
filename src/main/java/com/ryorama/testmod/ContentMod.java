package com.ryorama.testmod;

import com.ryorama.modloader.api.ModInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContentMod implements ModInit {

    public static final Logger logger = LogManager.getLogger("Test Mod");

    @Override
    public void init() {
        logger.info("Test Mod Initialized!");
    }
}
