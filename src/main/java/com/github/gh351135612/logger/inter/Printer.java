package com.github.gh351135612.logger.inter;

public interface Printer {

  void addAdapter(LogAdapter adapter);

  void d(String message, Object... args);

  void d(Object object);

  void e(String message, Object... args);

  void e(Throwable throwable, String message, Object... args);

  void w(String message, Object... args);

  void i(String message, Object... args);

  void log(int priority, String message, Throwable throwable);

  void clearLogAdapters();
}
