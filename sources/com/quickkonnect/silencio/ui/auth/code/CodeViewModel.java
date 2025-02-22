package com.quickkonnect.silencio.ui.auth.code;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.auth.VerifyInviteCodeResponse;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.y0;
import lf.c;
import lf.e;
import sf.j;
import zd.g;

public final class CodeViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6709g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6710h;

    /* renamed from: i  reason: collision with root package name */
    public final a f6711i;

    /* renamed from: j  reason: collision with root package name */
    public final v<g<VerifyInviteCodeResponse>> f6712j = new v<>();

    public static final class a implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6713a;

        /* renamed from: com.quickkonnect.silencio.ui.auth.code.CodeViewModel$a$a  reason: collision with other inner class name */
        public static final class C0084a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f6714a;

            @e(c = "com.quickkonnect.silencio.ui.auth.code.CodeViewModel$special$$inlined$map$1$2", f = "CodeViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.auth.code.CodeViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C0085a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f6715a;

                /* renamed from: b  reason: collision with root package name */
                public int f6716b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0084a f6717c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0085a(C0084a aVar, d dVar) {
                    super(dVar);
                    this.f6717c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f6715a = obj;
                    this.f6716b |= Integer.MIN_VALUE;
                    return this.f6717c.m((Object) null, this);
                }
            }

            public C0084a(kotlinx.coroutines.flow.g gVar) {
                this.f6714a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.quickkonnect.silencio.ui.auth.code.CodeViewModel.a.C0084a.C0085a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.quickkonnect.silencio.ui.auth.code.CodeViewModel$a$a$a r0 = (com.quickkonnect.silencio.ui.auth.code.CodeViewModel.a.C0084a.C0085a) r0
                    int r1 = r0.f6716b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f6716b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.auth.code.CodeViewModel$a$a$a r0 = new com.quickkonnect.silencio.ui.auth.code.CodeViewModel$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f6715a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f6716b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r6)
                    goto L_0x004c
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    cb.b.J(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    int r5 = r5.length()
                    if (r5 <= 0) goto L_0x003c
                    r5 = r3
                    goto L_0x003d
                L_0x003c:
                    r5 = 0
                L_0x003d:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f6716b = r3
                    kotlinx.coroutines.flow.g r6 = r4.f6714a
                    java.lang.Object r5 = r6.m(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    ff.m r5 = ff.m.f8717a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.auth.code.CodeViewModel.a.C0084a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public a(y0 y0Var) {
            this.f6713a = y0Var;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, d dVar) {
            Object a10 = this.f6713a.a(new C0084a(gVar), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeViewModel(Application application, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        this.f6709g = aVar;
        y0 a10 = z0.a("");
        this.f6710h = a10;
        this.f6711i = new a(a10);
    }
}
