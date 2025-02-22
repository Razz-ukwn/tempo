package jg;

import ff.m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kg.b;
import sf.j;
import wg.h;

public abstract class d0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public a f10068a;

    public static final class a extends Reader {

        /* renamed from: a  reason: collision with root package name */
        public final h f10069a;

        /* renamed from: b  reason: collision with root package name */
        public final Charset f10070b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10071c;

        /* renamed from: d  reason: collision with root package name */
        public InputStreamReader f10072d;

        public a(h hVar, Charset charset) {
            j.f(hVar, "source");
            j.f(charset, "charset");
            this.f10069a = hVar;
            this.f10070b = charset;
        }

        public final void close() {
            m mVar;
            this.f10071c = true;
            InputStreamReader inputStreamReader = this.f10072d;
            if (inputStreamReader == null) {
                mVar = null;
            } else {
                inputStreamReader.close();
                mVar = m.f8717a;
            }
            if (mVar == null) {
                this.f10069a.close();
            }
        }

        public final int read(char[] cArr, int i8, int i10) {
            j.f(cArr, "cbuf");
            if (!this.f10071c) {
                InputStreamReader inputStreamReader = this.f10072d;
                if (inputStreamReader == null) {
                    h hVar = this.f10069a;
                    inputStreamReader = new InputStreamReader(hVar.D0(), b.s(hVar, this.f10070b));
                    this.f10072d = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i8, i10);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long c();

    public void close() {
        b.d(e());
    }

    public abstract t d();

    public abstract h e();
}
