package com.quickkonnect.silencio.ui.auth.email;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.BaseResponse;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.y0;
import lf.c;
import lf.e;
import sf.j;
import zd.g;

public final class EmailViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6743g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6744h;

    /* renamed from: i  reason: collision with root package name */
    public final a f6745i;

    /* renamed from: j  reason: collision with root package name */
    public final v<g<BaseResponse>> f6746j = new v<>();

    public static final class a implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6747a;

        /* renamed from: com.quickkonnect.silencio.ui.auth.email.EmailViewModel$a$a  reason: collision with other inner class name */
        public static final class C0086a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f6748a;

            @e(c = "com.quickkonnect.silencio.ui.auth.email.EmailViewModel$special$$inlined$map$1$2", f = "EmailViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.auth.email.EmailViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C0087a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f6749a;

                /* renamed from: b  reason: collision with root package name */
                public int f6750b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0086a f6751c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0087a(C0086a aVar, d dVar) {
                    super(dVar);
                    this.f6751c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f6749a = obj;
                    this.f6750b |= Integer.MIN_VALUE;
                    return this.f6751c.m((Object) null, this);
                }
            }

            public C0086a(kotlinx.coroutines.flow.g gVar) {
                this.f6748a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.quickkonnect.silencio.ui.auth.email.EmailViewModel.a.C0086a.C0087a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.quickkonnect.silencio.ui.auth.email.EmailViewModel$a$a$a r0 = (com.quickkonnect.silencio.ui.auth.email.EmailViewModel.a.C0086a.C0087a) r0
                    int r1 = r0.f6750b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f6750b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.auth.email.EmailViewModel$a$a$a r0 = new com.quickkonnect.silencio.ui.auth.email.EmailViewModel$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f6749a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f6750b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r6)
                    goto L_0x005c
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    cb.b.J(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    java.util.regex.Pattern r6 = android.util.Patterns.EMAIL_ADDRESS
                    java.util.regex.Matcher r6 = r6.matcher(r5)
                    boolean r6 = r6.matches()
                    r2 = 0
                    if (r6 == 0) goto L_0x004d
                    int r5 = r5.length()
                    if (r5 <= 0) goto L_0x0049
                    r5 = r3
                    goto L_0x004a
                L_0x0049:
                    r5 = r2
                L_0x004a:
                    if (r5 == 0) goto L_0x004d
                    r2 = r3
                L_0x004d:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    r0.f6750b = r3
                    kotlinx.coroutines.flow.g r6 = r4.f6748a
                    java.lang.Object r5 = r6.m(r5, r0)
                    if (r5 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    ff.m r5 = ff.m.f8717a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.auth.email.EmailViewModel.a.C0086a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public a(y0 y0Var) {
            this.f6747a = y0Var;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, d dVar) {
            Object a10 = this.f6747a.a(new C0086a(gVar), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmailViewModel(Application application, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        this.f6743g = aVar;
        y0 a10 = z0.a("");
        this.f6744h = a10;
        this.f6745i = new a(a10);
    }
}
