package s2;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.Serializable;

public final class b {

    public static class a {
        public static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long j10, int i8) {
            return Os.lseek(fileDescriptor, j10, i8);
        }
    }

    /* renamed from: s2.b$b  reason: collision with other inner class name */
    public static class C0275b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb2.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i8])}));
        }
        return sb2.toString();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                jArr[i8] = (long) iArr[i8];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }
}
