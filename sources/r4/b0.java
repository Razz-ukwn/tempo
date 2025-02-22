package r4;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.ArrayList;
import p4.a;
import p4.f;
import r4.h;
import v4.n;

public final class b0 implements h, h.a {
    public volatile n.a<?> B;
    public volatile f C;

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f13871a;

    /* renamed from: b  reason: collision with root package name */
    public final h.a f13872b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f13873c;

    /* renamed from: d  reason: collision with root package name */
    public volatile e f13874d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f13875e;

    public b0(i<?> iVar, h.a aVar) {
        this.f13871a = iVar;
        this.f13872b = aVar;
    }

    public final void a(f fVar, Object obj, d<?> dVar, a aVar, f fVar2) {
        this.f13872b.a(fVar, obj, dVar, this.B.f16190c.d(), fVar);
    }

    public final boolean b() {
        if (this.f13875e != null) {
            Object obj = this.f13875e;
            this.f13875e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f13874d != null && this.f13874d.b()) {
            return true;
        }
        this.f13874d = null;
        this.B = null;
        boolean z10 = false;
        while (!z10) {
            if (!(this.f13873c < this.f13871a.b().size())) {
                break;
            }
            ArrayList b10 = this.f13871a.b();
            int i8 = this.f13873c;
            this.f13873c = i8 + 1;
            this.B = (n.a) b10.get(i8);
            if (this.B != null) {
                if (!this.f13871a.f13907p.c(this.B.f16190c.d())) {
                    if (!(this.f13871a.c(this.B.f16190c.a()) != null)) {
                    }
                }
                this.B.f16190c.e(this.f13871a.f13906o, new a0(this, this.B));
                z10 = true;
            }
        }
        return z10;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void cancel() {
        n.a<?> aVar = this.B;
        if (aVar != null) {
            aVar.f16190c.cancel();
        }
    }

    public final void d(f fVar, Exception exc, d<?> dVar, a aVar) {
        this.f13872b.d(fVar, exc, dVar, this.B.f16190c.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "SourceGenerator"
            java.lang.String r1 = "Attempt to write: "
            java.lang.String r2 = "Finished encoding source to cache, key: "
            int r3 = l5.h.f10997b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 0
            r4.i<?> r6 = r13.f13871a     // Catch:{ all -> 0x00db }
            com.bumptech.glide.h r6 = r6.f13895c     // Catch:{ all -> 0x00db }
            com.bumptech.glide.k r6 = r6.f4061b     // Catch:{ all -> 0x00db }
            com.bumptech.glide.load.data.e r6 = r6.f(r14)     // Catch:{ all -> 0x00db }
            java.lang.Object r7 = r6.a()     // Catch:{ all -> 0x00db }
            r4.i<?> r8 = r13.f13871a     // Catch:{ all -> 0x00db }
            p4.d r8 = r8.e(r7)     // Catch:{ all -> 0x00db }
            r4.g r9 = new r4.g     // Catch:{ all -> 0x00db }
            r4.i<?> r10 = r13.f13871a     // Catch:{ all -> 0x00db }
            p4.h r10 = r10.f13901i     // Catch:{ all -> 0x00db }
            r9.<init>(r8, r7, r10)     // Catch:{ all -> 0x00db }
            r4.f r7 = new r4.f     // Catch:{ all -> 0x00db }
            v4.n$a<?> r10 = r13.B     // Catch:{ all -> 0x00db }
            p4.f r10 = r10.f16188a     // Catch:{ all -> 0x00db }
            r4.i<?> r11 = r13.f13871a     // Catch:{ all -> 0x00db }
            p4.f r12 = r11.f13905n     // Catch:{ all -> 0x00db }
            r7.<init>(r10, r12)     // Catch:{ all -> 0x00db }
            r4.j$d r10 = r11.f13900h     // Catch:{ all -> 0x00db }
            r4.n$c r10 = (r4.n.c) r10     // Catch:{ all -> 0x00db }
            t4.a r10 = r10.a()     // Catch:{ all -> 0x00db }
            r10.c(r7, r9)     // Catch:{ all -> 0x00db }
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch:{ all -> 0x00db }
            java.lang.String r11 = ", data: "
            if (r9 == 0) goto L_0x0074
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r9.<init>(r2)     // Catch:{ all -> 0x00db }
            r9.append(r7)     // Catch:{ all -> 0x00db }
            r9.append(r11)     // Catch:{ all -> 0x00db }
            r9.append(r14)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = ", encoder: "
            r9.append(r2)     // Catch:{ all -> 0x00db }
            r9.append(r8)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = ", duration: "
            r9.append(r2)     // Catch:{ all -> 0x00db }
            double r2 = l5.h.a(r3)     // Catch:{ all -> 0x00db }
            r9.append(r2)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x00db }
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00db }
        L_0x0074:
            java.io.File r2 = r10.d(r7)     // Catch:{ all -> 0x00db }
            r3 = 1
            if (r2 == 0) goto L_0x0096
            r13.C = r7     // Catch:{ all -> 0x00db }
            r4.e r14 = new r4.e     // Catch:{ all -> 0x00db }
            v4.n$a<?> r0 = r13.B     // Catch:{ all -> 0x00db }
            p4.f r0 = r0.f16188a     // Catch:{ all -> 0x00db }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00db }
            r4.i<?> r1 = r13.f13871a     // Catch:{ all -> 0x00db }
            r14.<init>(r0, r1, r13)     // Catch:{ all -> 0x00db }
            r13.f13874d = r14     // Catch:{ all -> 0x00db }
            v4.n$a<?> r14 = r13.B
            com.bumptech.glide.load.data.d<Data> r14 = r14.f16190c
            r14.b()
            return r3
        L_0x0096:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00b9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r2.<init>(r1)     // Catch:{ all -> 0x00db }
            r4.f r1 = r13.C     // Catch:{ all -> 0x00db }
            r2.append(r1)     // Catch:{ all -> 0x00db }
            r2.append(r11)     // Catch:{ all -> 0x00db }
            r2.append(r14)     // Catch:{ all -> 0x00db }
            java.lang.String r14 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r2.append(r14)     // Catch:{ all -> 0x00db }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x00db }
            android.util.Log.d(r0, r14)     // Catch:{ all -> 0x00db }
        L_0x00b9:
            r4.h$a r14 = r13.f13872b     // Catch:{ all -> 0x00d8 }
            v4.n$a<?> r0 = r13.B     // Catch:{ all -> 0x00d8 }
            p4.f r7 = r0.f16188a     // Catch:{ all -> 0x00d8 }
            java.lang.Object r8 = r6.a()     // Catch:{ all -> 0x00d8 }
            v4.n$a<?> r0 = r13.B     // Catch:{ all -> 0x00d8 }
            com.bumptech.glide.load.data.d<Data> r9 = r0.f16190c     // Catch:{ all -> 0x00d8 }
            v4.n$a<?> r0 = r13.B     // Catch:{ all -> 0x00d8 }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f16190c     // Catch:{ all -> 0x00d8 }
            p4.a r10 = r0.d()     // Catch:{ all -> 0x00d8 }
            v4.n$a<?> r0 = r13.B     // Catch:{ all -> 0x00d8 }
            p4.f r11 = r0.f16188a     // Catch:{ all -> 0x00d8 }
            r6 = r14
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00d8 }
            return r5
        L_0x00d8:
            r14 = move-exception
            r5 = r3
            goto L_0x00dc
        L_0x00db:
            r14 = move-exception
        L_0x00dc:
            if (r5 != 0) goto L_0x00e5
            v4.n$a<?> r0 = r13.B
            com.bumptech.glide.load.data.d<Data> r0 = r0.f16190c
            r0.b()
        L_0x00e5:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b0.e(java.lang.Object):boolean");
    }
}
