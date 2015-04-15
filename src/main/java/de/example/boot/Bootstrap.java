package de.example.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bootstrap {

    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    protected void init() {
        log.info("Starting app");

    }


}
