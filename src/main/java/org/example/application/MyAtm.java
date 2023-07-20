package org.example.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAtm {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyAtm.class);

    public static void withdrawMoney(int amount) throws InterruptedException {
        Thread.sleep(2000L); //processing going on here
        LOGGER.info("[Application] Successful Withdrawal of [{}] units!", amount);

    }
}
