package logger.inter;

public interface FormatStrategy {

  void log(int priority, String message);
}