package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xc  reason: invalid package */
public final class xc {

    /* renamed from: a  reason: collision with root package name */
    public final uc f5081a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5082b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f5083c;

    public /* synthetic */ xc(uc ucVar, List list, Integer num) {
        this.f5081a = ucVar;
        this.f5082b = list;
        this.f5083c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        if (this.f5081a.equals(xcVar.f5081a) && this.f5082b.equals(xcVar.f5082b)) {
            Integer num = this.f5083c;
            Integer num2 = xcVar.f5083c;
            if (num != num2) {
                return num != null && num.equals(num2);
            }
            return true;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5081a, this.f5082b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f5081a, this.f5082b, this.f5083c});
    }
}
