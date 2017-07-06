package com.github.gh351135612.logger.impl;

import com.github.gh351135612.logger.inter.FormatStrategy;
import com.github.gh351135612.logger.inter.LogAdapter;

public class Log4jAdapter implements LogAdapter {

    private final FormatStrategy formatStrategy;

    public Log4jAdapter() {
        this.formatStrategy = PrettyFormatStrategy.newBuilder().build();
    }

    @Override
    public boolean isLoggable(int priority) {
        return true;
    }

    @Override
    public void log(int priority, String message) {
        formatStrategy.log(priority,message);
    }
}
