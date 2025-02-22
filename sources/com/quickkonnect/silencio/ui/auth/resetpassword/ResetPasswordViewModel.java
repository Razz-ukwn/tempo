package com.quickkonnect.silencio.ui.auth.resetpassword;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.q;
import sf.j;
import zd.g;

public final class ResetPasswordViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6876g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6877h;

    /* renamed from: i  reason: collision with root package name */
    public final y0 f6878i;

    /* renamed from: j  reason: collision with root package name */
    public final g0 f6879j;

    /* renamed from: k  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f6880k = new v<>();

    @e(c = "com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel$isValid$1", f = "ResetPasswordViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements q<String, String, d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f6881a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f6882b;

        public a(d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            a aVar = new a((d) obj3);
            aVar.f6881a = (String) obj;
            aVar.f6882b = (String) obj2;
            return aVar.invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
            if ((r0.length() > 0) != false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                cb.b.J(r4)
                java.lang.String r4 = r3.f6881a
                java.lang.String r0 = r3.f6882b
                int r4 = r4.length()
                r1 = 1
                r2 = 0
                if (r4 <= 0) goto L_0x0011
                r4 = r1
                goto L_0x0012
            L_0x0011:
                r4 = r2
            L_0x0012:
                if (r4 == 0) goto L_0x0020
                int r4 = r0.length()
                if (r4 <= 0) goto L_0x001c
                r4 = r1
                goto L_0x001d
            L_0x001c:
                r4 = r2
            L_0x001d:
                if (r4 == 0) goto L_0x0020
                goto L_0x0021
            L_0x0020:
                r1 = r2
            L_0x0021:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel(Application application, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        this.f6876g = aVar;
        y0 a10 = z0.a("");
        this.f6877h = a10;
        y0 a11 = z0.a("");
        this.f6878i = a11;
        this.f6879j = new g0(a10, a11, new a((d<? super a>) null));
    }
}
