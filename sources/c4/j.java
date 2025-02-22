package c4;

import android.content.Context;
import c4.i;
import h4.h;
import i4.e;
import java.util.List;
import jf.d;
import lf.c;
import x3.b;

public final class j implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f3704a;

    /* renamed from: b  reason: collision with root package name */
    public final List<i> f3705b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3706c;

    /* renamed from: d  reason: collision with root package name */
    public final h f3707d;

    /* renamed from: e  reason: collision with root package name */
    public final e f3708e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3709f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3710g;

    @lf.e(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public j f3711a;

        /* renamed from: b  reason: collision with root package name */
        public i f3712b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f3713c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f3714d;

        /* renamed from: e  reason: collision with root package name */
        public int f3715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, d<? super a> dVar) {
            super(dVar);
            this.f3714d = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3713c = obj;
            this.f3715e |= Integer.MIN_VALUE;
            return this.f3714d.c((h) null, this);
        }
    }

    public j(h hVar, List<? extends i> list, int i8, h hVar2, e eVar, b bVar, boolean z10) {
        this.f3704a = hVar;
        this.f3705b = list;
        this.f3706c = i8;
        this.f3707d = hVar2;
        this.f3708e = eVar;
        this.f3709f = bVar;
        this.f3710g = z10;
    }

    public final void a(h hVar, i iVar) {
        Context context = hVar.f9144a;
        h hVar2 = this.f3704a;
        boolean z10 = true;
        if (context == hVar2.f9144a) {
            if (hVar.f9145b != h4.j.f9194a) {
                if (hVar.f9146c == hVar2.f9146c) {
                    if (hVar.A == hVar2.A) {
                        if (hVar.B != hVar2.B) {
                            z10 = false;
                        }
                        if (!z10) {
                            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                        }
                        return;
                    }
                    throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's context.").toString());
    }

    public final h b() {
        return this.f3707d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(h4.h r14, jf.d<? super h4.i> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof c4.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c4.j$a r0 = (c4.j.a) r0
            int r1 = r0.f3715e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3715e = r1
            goto L_0x0018
        L_0x0013:
            c4.j$a r0 = new c4.j$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f3713c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f3715e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            c4.i r14 = r0.f3712b
            c4.j r0 = r0.f3711a
            cb.b.J(r15)
            goto L_0x0071
        L_0x002b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0033:
            cb.b.J(r15)
            java.util.List<c4.i> r15 = r13.f3705b
            int r2 = r13.f3706c
            if (r2 <= 0) goto L_0x0047
            int r4 = r2 + -1
            java.lang.Object r4 = r15.get(r4)
            c4.i r4 = (c4.i) r4
            r13.a(r14, r4)
        L_0x0047:
            java.lang.Object r15 = r15.get(r2)
            c4.i r15 = (c4.i) r15
            int r7 = r2 + 1
            i4.e r9 = r13.f3708e
            c4.j r2 = new c4.j
            h4.h r5 = r13.f3704a
            java.util.List<c4.i> r6 = r13.f3705b
            x3.b r10 = r13.f3709f
            boolean r11 = r13.f3710g
            r4 = r2
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f3711a = r13
            r0.f3712b = r15
            r0.f3715e = r3
            java.lang.Object r14 = r15.a(r2, r0)
            if (r14 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r0 = r13
            r12 = r15
            r15 = r14
            r14 = r12
        L_0x0071:
            h4.i r15 = (h4.i) r15
            h4.h r1 = r15.b()
            r0.a(r1, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.j.c(h4.h, jf.d):java.lang.Object");
    }
}
