package z6;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
public final class d {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
