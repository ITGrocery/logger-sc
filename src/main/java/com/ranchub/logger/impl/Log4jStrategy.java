package com.ranchub.logger.impl;

import com.ranchub.logger.inter.LogStrategy;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/**
 * @Author chenxl
 * @Date 2017/6/30 13:35
 * @Describle
 */
public class Log4jStrategy implements LogStrategy {

    private org.apache.log4j.Logger logger = Logger.getLogger(Log4jStrategy.class);

    @Override
    public void log(int priority, String message) {
        // TODO: 2017/6/30 待适配
        logger.log(Priority.toPriority(priority),message);
    }
}
