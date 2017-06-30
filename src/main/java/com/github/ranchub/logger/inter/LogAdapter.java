package com.github.ranchub.logger.inter;

public interface LogAdapter {

  boolean isLoggable(int priority);

  void log(int priority, String message);
}