package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import s4.b;
import y4.v;

public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            try {
                int d10 = ((ImageHeaderParser) list.get(i8)).d(inputStream, bVar);
                if (d10 != -1) {
                    return d10;
                }
                i8++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ImageHeaderParser.ImageType a10 = list.get(i8).a(byteBuffer);
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType c(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            try {
                ImageHeaderParser.ImageType c3 = ((ImageHeaderParser) list.get(i8)).c(inputStream);
                inputStream.reset();
                if (c3 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c3;
                }
                i8++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
