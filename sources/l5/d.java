package l5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayDeque f10989c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f10990a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f10991b;

    static {
        char[] cArr = l.f11007a;
    }

    public final int available() {
        return this.f10990a.available();
    }

    public final void close() {
        this.f10990a.close();
    }

    public final void mark(int i8) {
        this.f10990a.mark(i8);
    }

    public final boolean markSupported() {
        return this.f10990a.markSupported();
    }

    public final int read() {
        try {
            return this.f10990a.read();
        } catch (IOException e10) {
            this.f10991b = e10;
            throw e10;
        }
    }

    public final synchronized void reset() {
        this.f10990a.reset();
    }

    public final long skip(long j10) {
        try {
            return this.f10990a.skip(j10);
        } catch (IOException e10) {
            this.f10991b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f10990a.read(bArr);
        } catch (IOException e10) {
            this.f10991b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i8, int i10) {
        try {
            return this.f10990a.read(bArr, i8, i10);
        } catch (IOException e10) {
            this.f10991b = e10;
            throw e10;
        }
    }
}
