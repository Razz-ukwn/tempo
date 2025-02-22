package com.google.android.gms.internal.p000firebaseauthapi;

import ag.v1;
import cb.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b6  reason: invalid package */
public final class b6 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4419a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap f4420b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4421c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public c6 f4422d;

    /* renamed from: e  reason: collision with root package name */
    public uc f4423e;

    public /* synthetic */ b6(Class cls) {
        this.f4419a = cls;
        this.f4423e = uc.f4995b;
    }

    public final void a(Object obj, Object obj2, yf yfVar, boolean z10) {
        byte[] bArr;
        if (this.f4420b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        } else if (yfVar.C() == 3) {
            Integer valueOf = Integer.valueOf(yfVar.t());
            byte[] bArr2 = null;
            if (yfVar.x() == mg.RAW) {
                valueOf = null;
            }
            c a10 = xa.f5079b.a(lb.a(yfVar.u().y(), yfVar.u().x(), yfVar.u().u(), yfVar.x(), valueOf));
            int ordinal = yfVar.x().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = v1.D;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(yfVar.t()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(yfVar.t()).array();
            }
            c6 c6Var = new c6(obj, obj2, bArr, yfVar.C(), yfVar.x(), yfVar.t(), yfVar.u().y(), a10);
            ConcurrentHashMap concurrentHashMap = this.f4420b;
            ArrayList arrayList = this.f4421c;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c6Var);
            byte[] bArr3 = c6Var.f4446c;
            if (bArr3 != null) {
                bArr2 = Arrays.copyOf(bArr3, bArr3.length);
            }
            d6 d6Var = new d6(bArr2);
            List list = (List) concurrentHashMap.put(d6Var, Collections.unmodifiableList(arrayList2));
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(list);
                arrayList3.add(c6Var);
                concurrentHashMap.put(d6Var, Collections.unmodifiableList(arrayList3));
            }
            arrayList.add(c6Var);
            if (!z10) {
                return;
            }
            if (this.f4422d == null) {
                this.f4422d = c6Var;
                return;
            }
            throw new IllegalStateException("you cannot set two primary primitives");
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }
}
