package com.github.gh351135612.logger;

import com.github.gh351135612.logger.impl.Log4jAdapter;
import org.junit.Test;

public class LoggerTest {

    @Test
    public void testDebug(){

        Logger.addLogAdapter(new Log4jAdapter());
        Logger.d("DEBUG级别日志");
        Logger.i("INFO级别日志");
        Logger.w("WARN级别日志");
        Logger.e("ERROR级别日志");
        Logger.d("hello %s", "world");
        Logger.e(new Throwable("print error"),"log e");

    }

}
