package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l  reason: invalid package */
public final class l {
    public static Object a(String str, Class cls) {
        if (cls == String.class) {
            try {
                d0 d0Var = new d0();
                d0Var.a(str);
                if (!TextUtils.isEmpty(d0Var.f4477a)) {
                    return d0Var.f4477a;
                }
                throw new xh("No error message: " + str);
            } catch (Exception e10) {
                throw new xh("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } else if (cls == Void.class) {
            return null;
        } else {
            try {
                n nVar = (n) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    nVar.zza(str);
                    return nVar;
                } catch (Exception e11) {
                    throw new xh("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new xh("Instantiation of JsonResponse failed! ".concat(cls.toString()), e12);
            }
        }
    }
}
