package e9;

import android.content.Context;
import java.io.File;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7893a;

    public i(Context context) {
        this.f7893a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File a10 : listFiles) {
                j10 += a(a10);
            }
        }
        return j10;
    }
}
