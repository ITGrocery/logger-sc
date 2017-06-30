package com.github.ranchub.logger;

import com.github.ranchub.logger.impl.Log4jAdapter;
import org.junit.Test;

public class LoggerTest {

    @Test
    public void testDebug(){

        Logger.addLogAdapter(new Log4jAdapter());
        Logger.d("DEBUG级别日志");
        Logger.i("INFO级别日志");
        Logger.w("WARN级别日志");
        Logger.e("ERROR级别日志");

    }

}
