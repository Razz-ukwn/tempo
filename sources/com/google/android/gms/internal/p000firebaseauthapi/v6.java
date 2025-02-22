package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import java.security.GeneralSecurityException;
import java.util.List;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v6  reason: invalid package */
public final class v6 implements w {

    /* renamed from: a  reason: collision with root package name */
    public Object f5010a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5011b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5012c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5013d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5014e;

    public /* synthetic */ v6() {
        this.f5010a = null;
        this.f5011b = null;
        this.f5012c = null;
        this.f5013d = null;
        this.f5014e = x6.f5077d;
    }

    public /* synthetic */ v6(j3 j3Var, u uVar, w wVar, m0 m0Var, q0 q0Var) {
        this.f5014e = uVar;
        this.f5010a = wVar;
        this.f5011b = j3Var;
        this.f5012c = m0Var;
        this.f5013d = q0Var;
    }

    public final y6 a() {
        if (((Integer) this.f5010a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        } else if (((Integer) this.f5011b) != null) {
            Integer num = (Integer) this.f5012c;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            } else if (((w6) this.f5013d) == null) {
                throw new GeneralSecurityException("hash type is not set");
            } else if (((x6) this.f5014e) != null) {
                int intValue = num.intValue();
                w6 w6Var = (w6) this.f5013d;
                if (w6Var == w6.f5036b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (w6Var == w6.f5037c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (w6Var == w6.f5038d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (w6Var == w6.f5039e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (w6Var != w6.f5040f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new y6(((Integer) this.f5010a).intValue(), ((Integer) this.f5011b).intValue(), ((Integer) this.f5012c).intValue(), (x6) this.f5014e, (w6) this.f5013d);
            } else {
                throw new GeneralSecurityException("variant is not set");
            }
        } else {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
    }

    public final void d(n nVar) {
        List list = (List) ((g0) nVar).f4562a.f13862a;
        if (list == null || list.isEmpty()) {
            ((w) this.f5010a).zza("No users");
            return;
        }
        j3 j3Var = (j3) this.f5011b;
        m0 m0Var = (m0) this.f5012c;
        h0 h0Var = (h0) list.get(0);
        q0 q0Var = (q0) this.f5013d;
        w wVar = (w) this.f5010a;
        q.i(j3Var);
        q.i(m0Var);
        q.i(h0Var);
        q.i(q0Var);
        q.i(wVar);
        ((x) ((u) this.f5014e).f2324b).f(q0Var, new sh(j3Var, wVar, h0Var, m0Var, q0Var));
    }

    public final void zza(String str) {
        ((w) this.f5010a).zza(str);
    }
}
