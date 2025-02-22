package sg;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import sf.j;
import zf.n;
import zf.o;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14964a = new d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        j.f(logRecord, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f14962a;
        String loggerName = logRecord.getLoggerName();
        j.e(loggerName, "record.loggerName");
        int i8 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        j.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = c.f14963b.get(loggerName);
        if (str == null) {
            str = o.a1(23, loggerName);
        }
        if (Log.isLoggable(str, i8)) {
            if (thrown != null) {
                message = message + 10 + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int F0 = n.F0(message, 10, i10, false, 4);
                if (F0 == -1) {
                    F0 = length;
                }
                while (true) {
                    min = Math.min(F0, i10 + 4000);
                    String substring = message.substring(i10, min);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i8, str, substring);
                    if (min >= F0) {
                        break;
                    }
                    i10 = min;
                }
                i10 = min + 1;
            }
        }
    }
}
