package m3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

public interface b extends Closeable {
    void I();

    void J();

    void U();

    Cursor Z(e eVar, CancellationSignal cancellationSignal);

    void f();

    boolean isOpen();

    void l(String str);

    f o(String str);

    boolean o0();

    boolean s0();

    Cursor u0(e eVar);
}
