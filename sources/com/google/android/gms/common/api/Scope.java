package com.google.android.gms.common.api;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import u6.q;
import v6.a;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public final int f4173a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4174b;

    public Scope() {
        throw null;
    }

    public Scope(int i8, String str) {
        q.g("scopeUri must not be null or empty", str);
        this.f4173a = i8;
        this.f4174b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4174b.equals(((Scope) obj).f4174b);
    }

    public final int hashCode() {
        return this.f4174b.hashCode();
    }

    public final String toString() {
        return this.f4174b;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f4173a);
        m.n(parcel, 2, this.f4174b);
        m.E(parcel, s10);
    }
}
