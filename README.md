# logger-sc
✔️ Simple, pretty and powerful logger for java

# Setup

Add maven dependency

```xml
<!-- https://mvnrepository.com/artifact/com.github.gh351135612/logger-sc -->
<dependency>
    <groupId>com.github.gh351135612</groupId>
    <artifactId>logger-sc</artifactId>
    <version>1.1</version>
</dependency>

```
Initialize
```java
Logger.addLogAdapter(new Log4jAdapter());
```

And use
```java
Logger.addLogAdapter(new Log4jAdapter());
Logger.d("DEBUG级别日志");
Logger.i("INFO级别日志");
Logger.w("WARN级别日志");
Logger.e("ERROR级别日志");
Logger.d("hello %s", "world");
Logger.e(new Throwable("print error"),"log e");
```
Output
