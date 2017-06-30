package com.ranchub.logger;

import com.ranchub.logger.impl.Log4jAdapter;
import org.junit.Test;

/**
 * @Author chenxl
 * @Date 2017/6/30 13:48
 * @Describle
 */
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
