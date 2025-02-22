package com.google.android.gms.common.api;

import ag.i0;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.common.api.internal.y0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.i;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public abstract class c<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4184b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4185c;

    /* renamed from: d  reason: collision with root package name */
    public final a.c f4186d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a f4187e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f4188f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4189g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    public final f0 f4190h;

    /* renamed from: i  reason: collision with root package name */
    public final i0 f4191i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4192j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4193c = new a(new i0(), Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final i0 f4194a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f4195b;

        public a(i0 i0Var, Looper looper) {
            this.f4194a = i0Var;
            this.f4195b = looper;
        }
    }

    public c(Context context, a<O> aVar, O o10, a aVar2) {
        String str;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        } else if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        } else if (aVar2 != null) {
            this.f4183a = context.getApplicationContext();
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                this.f4184b = str;
                this.f4185c = aVar;
                this.f4186d = o10;
                this.f4188f = aVar2.f4195b;
                this.f4187e = new com.google.android.gms.common.api.internal.a(aVar, o10, str);
                this.f4190h = new f0(this);
                e f10 = e.f(this.f4183a);
                this.f4192j = f10;
                this.f4189g = f10.f4247h.getAndIncrement();
                this.f4191i = aVar2.f4194a;
                i iVar = f10.m;
                iVar.sendMessage(iVar.obtainMessage(7, this));
            }
            str = null;
            this.f4184b = str;
            this.f4185c = aVar;
            this.f4186d = o10;
            this.f4188f = aVar2.f4195b;
            this.f4187e = new com.google.android.gms.common.api.internal.a(aVar, o10, str);
            this.f4190h = new f0(this);
            e f102 = e.f(this.f4183a);
            this.f4192j = f102;
            this.f4189g = f102.f4247h.getAndIncrement();
            this.f4191i = aVar2.f4194a;
            i iVar2 = f102.m;
            iVar2.sendMessage(iVar2.obtainMessage(7, this));
        } else {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u6.d.a a() {
        /*
            r6 = this;
            u6.d$a r0 = new u6.d$a
            r0.<init>()
            com.google.android.gms.common.api.a$c r1 = r6.f4186d
            boolean r2 = r1 instanceof com.google.android.gms.common.api.a.c.b
            if (r2 == 0) goto L_0x0021
            r3 = r1
            com.google.android.gms.common.api.a$c$b r3 = (com.google.android.gms.common.api.a.c.b) r3
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r3.h()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r3.f4150d
            if (r3 != 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r4.<init>(r3, r5)
            goto L_0x002e
        L_0x0021:
            boolean r3 = r1 instanceof com.google.android.gms.common.api.a.c.C0068a
            if (r3 == 0) goto L_0x002d
            r3 = r1
            com.google.android.gms.common.api.a$c$a r3 = (com.google.android.gms.common.api.a.c.C0068a) r3
            android.accounts.Account r4 = r3.i()
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            r0.f15777a = r4
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.common.api.a$c$b r1 = (com.google.android.gms.common.api.a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.h()
            if (r1 != 0) goto L_0x003f
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0048
        L_0x003f:
            java.util.HashSet r1 = r1.w()
            goto L_0x0048
        L_0x0044:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0048:
            o.b r2 = r0.f15778b
            if (r2 != 0) goto L_0x0053
            o.b r2 = new o.b
            r2.<init>()
            r0.f15778b = r2
        L_0x0053:
            o.b r2 = r0.f15778b
            r2.addAll(r1)
            android.content.Context r1 = r6.f4183a
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r0.f15780d = r2
            java.lang.String r1 = r1.getPackageName()
            r0.f15779c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.c.a():u6.d$a");
    }

    public final Task<Boolean> b(i.a<?> aVar, int i8) {
        e eVar = this.f4192j;
        eVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        eVar.e(taskCompletionSource, i8, this);
        y0 y0Var = new y0(aVar, taskCompletionSource);
        h7.i iVar = eVar.m;
        iVar.sendMessage(iVar.obtainMessage(13, new l0(y0Var, eVar.f4248i.get(), this)));
        return taskCompletionSource.getTask();
    }

    public final Task c(int i8, s0 s0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e eVar = this.f4192j;
        eVar.getClass();
        eVar.e(taskCompletionSource, s0Var.f4314c, this);
        x0 x0Var = new x0(i8, s0Var, taskCompletionSource, this.f4191i);
        h7.i iVar = eVar.m;
        iVar.sendMessage(iVar.obtainMessage(4, new l0(x0Var, eVar.f4248i.get(), this)));
        return taskCompletionSource.getTask();
    }
}
