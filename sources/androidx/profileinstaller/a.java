package androidx.profileinstaller;

import java.io.File;

public final class a {
    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z10 = true;
            for (int i8 = 0; i8 < length; i8++) {
                z10 = a(listFiles[i8]) && z10;
            }
            return z10;
        }
        file.delete();
        return true;
    }
}
