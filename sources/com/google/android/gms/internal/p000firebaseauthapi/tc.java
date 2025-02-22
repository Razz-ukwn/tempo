package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.g;
import cb.c;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tc  reason: invalid package */
public final class tc implements f6 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f4953a = Logger.getLogger(tc.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4954b = {0};

    /* renamed from: c  reason: collision with root package name */
    public static final tc f4955c = new tc();

    public final Object a(e6 e6Var) {
        for (List it : ((ConcurrentMap) e6Var.f4510a).values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c6 c6Var = (c6) it2.next();
                    c cVar = c6Var.f4450g;
                    if (cVar instanceof qc) {
                        qc qcVar = (qc) cVar;
                        byte[] bArr = c6Var.f4446c;
                        lh a10 = lh.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                        if (!a10.equals(qcVar.p())) {
                            String valueOf = String.valueOf(qcVar.o());
                            String lhVar = qcVar.p().toString();
                            String lhVar2 = a10.toString();
                            StringBuilder sb2 = new StringBuilder("Mac Key with parameters ");
                            sb2.append(valueOf);
                            sb2.append(" has wrong output prefix (");
                            sb2.append(lhVar);
                            sb2.append(") instead of (");
                            throw new GeneralSecurityException(g.a(sb2, lhVar2, ")"));
                        }
                    }
                }
            }
        }
        return new sc(e6Var);
    }

    public final Class zza() {
        return a6.class;
    }

    public final Class zzb() {
        return a6.class;
    }
}
