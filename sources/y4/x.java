package y4;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import l5.d;
import p4.h;
import p4.j;
import r4.w;
import s4.b;
import s4.c;
import y4.l;
import y4.r;

public final class x implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f17246a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17247b;

    public static class a implements l.b {

        /* renamed from: a  reason: collision with root package name */
        public final v f17248a;

        /* renamed from: b  reason: collision with root package name */
        public final d f17249b;

        public a(v vVar, d dVar) {
            this.f17248a = vVar;
            this.f17249b = dVar;
        }

        public final void a() {
            v vVar = this.f17248a;
            synchronized (vVar) {
                vVar.f17241c = vVar.f17239a.length;
            }
        }

        public final void b(Bitmap bitmap, c cVar) {
            IOException iOException = this.f17249b.f10991b;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.d(bitmap);
                }
                throw iOException;
            }
        }
    }

    public x(l lVar, b bVar) {
        this.f17246a = lVar;
        this.f17247b = bVar;
    }

    public final w a(Object obj, int i8, int i10, h hVar) {
        boolean z10;
        v vVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof v) {
            z10 = false;
            vVar = (v) inputStream;
        } else {
            vVar = new v(inputStream, this.f17247b);
            z10 = true;
        }
        ArrayDeque arrayDeque = d.f10989c;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        d dVar2 = dVar;
        dVar2.f10990a = vVar;
        l5.j jVar = new l5.j(dVar2);
        a aVar = new a(vVar, dVar2);
        try {
            l lVar = this.f17246a;
            d a10 = lVar.a(new r.b(lVar.f17208c, jVar, lVar.f17209d), i8, i10, hVar, aVar);
            dVar2.f10991b = null;
            dVar2.f10990a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z10) {
                vVar.d();
            }
            return a10;
        } catch (Throwable th) {
            dVar2.f10991b = null;
            dVar2.f10990a = null;
            ArrayDeque arrayDeque2 = d.f10989c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z10) {
                    vVar.d();
                }
                throw th;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        this.f17246a.getClass();
        return true;
    }
}
