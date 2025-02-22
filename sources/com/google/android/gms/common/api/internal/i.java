package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import k7.f;
import k7.f0;
import qc.a;
import u6.q;

public final class i<L> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4273a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f4274b;

    /* renamed from: c  reason: collision with root package name */
    public volatile a f4275c;

    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4276a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4277b;

        public a(L l10, String str) {
            this.f4276a = l10;
            this.f4277b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
            r5 = (com.google.android.gms.common.api.internal.i.a) r5;
            r1 = r5.f4276a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.google.android.gms.common.api.internal.i.a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.google.android.gms.common.api.internal.i$a r5 = (com.google.android.gms.common.api.internal.i.a) r5
                java.lang.Object r1 = r5.f4276a
                java.lang.Object r3 = r4.f4276a
                if (r3 != r1) goto L_0x001d
                java.lang.String r1 = r4.f4277b
                java.lang.String r5 = r5.f4277b
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x001d
                return r0
            L_0x001d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.i.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return this.f4277b.hashCode() + (System.identityHashCode(this.f4276a) * 31);
        }
    }

    public interface b<L> {
        void a(L l10);

        void b();
    }

    public i(f fVar) {
        this.f4273a = f0.f10363a;
        this.f4274b = fVar;
        q.f("GetCurrentLocation");
        this.f4275c = new a(fVar, "GetCurrentLocation");
    }

    public final void a(b<? super L> bVar) {
        this.f4273a.execute(new i0(0, (Object) this, (Object) bVar));
    }

    public i(Looper looper, a.b bVar, String str) {
        this.f4273a = new a7.a(looper);
        this.f4274b = bVar;
        q.f(str);
        this.f4275c = new a(bVar, str);
    }
}
