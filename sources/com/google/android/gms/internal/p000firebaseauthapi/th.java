package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.compose.ui.platform.j3;
import java.util.List;
import r9.g0;
import t.r1;
import x6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.th  reason: invalid package */
public final class th implements w {
    public final /* synthetic */ j3 B;
    public final /* synthetic */ m0 C;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f4962a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4963b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4964c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Boolean f4965d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g0 f4966e;

    public th(j3 j3Var, w wVar, m0 m0Var, g0 g0Var, Boolean bool, String str, String str2) {
        this.f4962a = wVar;
        this.f4963b = str;
        this.f4964c = str2;
        this.f4965d = bool;
        this.f4966e = g0Var;
        this.B = j3Var;
        this.C = m0Var;
    }

    public final void d(n nVar) {
        List list = (List) ((g0) nVar).f4562a.f13862a;
        if (list == null || list.isEmpty()) {
            this.f4962a.zza("No users.");
            return;
        }
        h0 h0Var = (h0) list.get(0);
        r1 r1Var = h0Var.f4597f;
        List list2 = r1Var != null ? r1Var.f15222a : null;
        if (list2 != null && !list2.isEmpty()) {
            String str = this.f4963b;
            boolean isEmpty = TextUtils.isEmpty(str);
            String str2 = this.f4964c;
            if (!isEmpty) {
                int i8 = 0;
                while (true) {
                    if (i8 >= list2.size()) {
                        break;
                    } else if (((p0) list2.get(i8)).f4799d.equals(str)) {
                        ((p0) list2.get(i8)).f4800e = str2;
                        break;
                    } else {
                        i8++;
                    }
                }
            } else {
                ((p0) list2.get(0)).f4800e = str2;
            }
        }
        h0Var.f4601j = this.f4965d.booleanValue();
        h0Var.f4602k = this.f4966e;
        m0 m0Var = this.C;
        j3 j3Var = this.B;
        j3Var.getClass();
        try {
            ((b) j3Var.f1338a).d(m0Var, h0Var);
        } catch (RemoteException e10) {
            ((a) j3Var.f1339b).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        this.f4962a.zza(str);
    }
}
