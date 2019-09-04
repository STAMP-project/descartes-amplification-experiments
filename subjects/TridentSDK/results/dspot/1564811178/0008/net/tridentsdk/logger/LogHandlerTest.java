package net.tridentsdk.logger;


import net.tridentsdk.Impl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class LogHandlerTest {
    private static final Logger logger = Mockito.mock(Logger.class);

    private static final LogHandler handler = ( message) -> true;

    static {
        Impl.setImpl(Mockito.mock(Impl.Provider.class));
        Mockito.when(Impl.get().removeHandler(LogHandlerTest.logger, LogHandlerTest.handler)).thenReturn(true);
    }

    @Test(timeout = 10000)
    public void removeHandler() throws Exception {
        boolean o_removeHandler__1 = LogHandler.removeHandler(LogHandlerTest.logger, LogHandlerTest.handler);
        Assert.assertTrue(o_removeHandler__1);
    }
}

