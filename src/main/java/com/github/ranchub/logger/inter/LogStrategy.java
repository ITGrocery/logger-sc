package com.github.ranchub.logger.inter;

public interface LogStrategy {

  void log(int priority, String message);
}
