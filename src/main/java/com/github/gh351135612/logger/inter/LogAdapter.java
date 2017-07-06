package com.github.gh351135612.logger.inter;

public interface LogAdapter {

  boolean isLoggable(int priority);

  void log(int priority, String message);
}