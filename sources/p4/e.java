package p4;

import java.io.IOException;

public final class e extends IOException {
    public e(int i8, String str, IOException iOException) {
        super(str + ", status code: " + i8, iOException);
    }
}
