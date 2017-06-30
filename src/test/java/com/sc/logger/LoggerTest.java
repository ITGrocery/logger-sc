package com.sc.logger;

import com.sc.logger.impl.Log4jAdapter;
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
        Logger.d("faegaefafaf");
        Logger.i("ajfpajefpoajf");
        Logger.w("fjpaejfoapjfpoaj");
        Logger.e("fjapjfepoajfo");

    }

}
