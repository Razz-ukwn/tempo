package com.google.android.gms.internal.measurement;

import ag.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class a1 extends a {
    public static final Parcelable.Creator<a1> CREATOR = new b1();
    public final String B;
    public final Bundle C;
    public final String D;

    /* renamed from: a  reason: collision with root package name */
    public final long f5141a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5142b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5143c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5144d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5145e;

    public a1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f5141a = j10;
        this.f5142b = j11;
        this.f5143c = z10;
        this.f5144d = str;
        this.f5145e = str2;
        this.B = str3;
        this.C = bundle;
        this.D = str4;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.k(parcel, 1, this.f5141a);
        m.k(parcel, 2, this.f5142b);
        m.g(parcel, 3, this.f5143c);
        m.n(parcel, 4, this.f5144d);
        m.n(parcel, 5, this.f5145e);
        m.n(parcel, 6, this.B);
        m.h(parcel, 7, this.C);
        m.n(parcel, 8, this.D);
        m.E(parcel, s10);
    }
}
