# logger-sc
✔️ Simple, pretty and powerful logger for java

# Introduction
The [logger-sc](https://github.com/gh351135612/logger-sc) forked from [orhanobut/logger
](https://github.com/orhanobut/logger),because it depends on Logcat of Android,we don't use it on other java project.I modify some source code,let it depends on log4j to make it more generally. 

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
<img src="https://github.com/gh351135612/logger-sc/blob/master/art/output.png"/>

# Warning
1.If you have configurated personally log4j.properties,the logger-sc won't work well.I suggest you configurate logrj.properties like this:
```properties
log4j.rootLogger=DEBUG,Console
#Console
log4j.appender.Console=org.apache.log4j.ConsoleAppender
log4j.appender.Console.Target=System.out
log4j.appender.Console.layout=org.apache.log4j.PatternLayout
log4j.appender.Console.layout.ConversionPattern=[%d{yyyy-MM-dd HH\:mm\:ss}][%p][LOGGER_SC]: %m%n
```
2.If you meet with log4j conflict,you can configurate like this:
```xml
<dependency>
    <groupId>com.github.gh351135612</groupId>
    <artifactId>logger-sc</artifactId>
    <version>1.1</version>
    <exclusions>
    <exclusion>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
