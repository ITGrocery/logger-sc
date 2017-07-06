package com.github.gh351135612.logger.impl;

import com.github.gh351135612.logger.Logger;
import com.github.gh351135612.logger.Utils;
import com.github.gh351135612.logger.inter.LogAdapter;
import com.github.gh351135612.logger.inter.Printer;

import java.util.ArrayList;
import java.util.List;


public class LoggerPrinter implements Printer {

  /**
   * It is used for json pretty print
   */
  private static final int JSON_INDENT = 2;

  private final List<LogAdapter> logAdapters = new ArrayList<>();


  @Override public void d(String message, Object... args) {
    log(Logger.DEBUG, null, message, args);
  }

  @Override public void d(Object object) {
    log(Logger.DEBUG, null, Utils.toString(object));
  }

  @Override public void e(String message, Object... args) {
    e(null, message, args);
  }

  @Override public void e(Throwable throwable, String message, Object... args) {
    log(Logger.ERROR, throwable, message, args);
  }

  @Override public void w(String message, Object... args) {
    log(Logger.WARN, null, message, args);
  }

  @Override public void i(String message, Object... args) {
    log(Logger.INFO, null, message, args);
  }

  @Override public synchronized void log(int priority, String message, Throwable throwable) {
    if (throwable != null && message != null) {
      message += " : " + Utils.getStackTraceString(throwable);
    }
    if (throwable != null && message == null) {
      message = Utils.getStackTraceString(throwable);
    }
    if (Utils.isEmpty(message)) {
      message = "Empty/NULL log message";
    }

    for (LogAdapter adapter : logAdapters) {
      if (adapter.isLoggable(priority)) {
        adapter.log(priority, message);
      }
    }
  }

  @Override public void clearLogAdapters() {
    logAdapters.clear();
  }

  @Override public void addAdapter(LogAdapter adapter) {
    logAdapters.add(adapter);
  }

  /**
   * This method is synchronized in order to avoid messy of logs' order.
   */
  private synchronized void log(int priority, Throwable throwable, String msg, Object... args) {
    String message = createMessage(msg, args);
    log(priority, message, throwable);
  }


  private String createMessage(String message, Object... args) {
    return args == null || args.length == 0 ? message : String.format(message, args);
  }
}