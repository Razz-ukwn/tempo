package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0073a();
    public final int B;
    public final int C;

    /* renamed from: a  reason: collision with root package name */
    public final w f5844a;

    /* renamed from: b  reason: collision with root package name */
    public final w f5845b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5846c;

    /* renamed from: d  reason: collision with root package name */
    public final w f5847d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5848e;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public class C0073a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            Class<w> cls = w.class;
            return new a((w) parcel.readParcelable(cls.getClassLoader()), (w) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (w) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f5849f = f0.a(w.a(1900, 0).B);

        /* renamed from: g  reason: collision with root package name */
        public static final long f5850g = f0.a(w.a(2100, 11).B);

        /* renamed from: a  reason: collision with root package name */
        public final long f5851a = f5849f;

        /* renamed from: b  reason: collision with root package name */
        public final long f5852b = f5850g;

        /* renamed from: c  reason: collision with root package name */
        public Long f5853c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5854d;

        /* renamed from: e  reason: collision with root package name */
        public final c f5855e = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f5851a = aVar.f5844a.B;
            this.f5852b = aVar.f5845b.B;
            this.f5853c = Long.valueOf(aVar.f5847d.B);
            this.f5854d = aVar.f5848e;
            this.f5855e = aVar.f5846c;
        }
    }

    public interface c extends Parcelable {
        boolean k(long j10);
    }

    public a(w wVar, w wVar2, c cVar, w wVar3, int i8) {
        Objects.requireNonNull(wVar, "start cannot be null");
        Objects.requireNonNull(wVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f5844a = wVar;
        this.f5845b = wVar2;
        this.f5847d = wVar3;
        this.f5848e = i8;
        this.f5846c = cVar;
        Calendar calendar = wVar.f5926a;
        if (wVar3 != null && calendar.compareTo(wVar3.f5926a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (wVar3 != null && wVar3.f5926a.compareTo(wVar2.f5926a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i8 < 0 || i8 > f0.d((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else if (calendar instanceof GregorianCalendar) {
            int i10 = wVar2.f5928c;
            int i11 = wVar.f5928c;
            this.C = (wVar2.f5927b - wVar.f5927b) + ((i10 - i11) * 12) + 1;
            this.B = (i10 - i11) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5844a.equals(aVar.f5844a) && this.f5845b.equals(aVar.f5845b) && c2.b.a(this.f5847d, aVar.f5847d) && this.f5848e == aVar.f5848e && this.f5846c.equals(aVar.f5846c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5844a, this.f5845b, this.f5847d, Integer.valueOf(this.f5848e), this.f5846c});
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f5844a, 0);
        parcel.writeParcelable(this.f5845b, 0);
        parcel.writeParcelable(this.f5847d, 0);
        parcel.writeParcelable(this.f5846c, 0);
        parcel.writeInt(this.f5848e);
    }
}
