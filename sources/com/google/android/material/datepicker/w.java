package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

public final class w implements Comparable<w>, Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();
    public final long B;
    public String C;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f5926a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5927b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5928c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5929d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5930e;

    public class a implements Parcelable.Creator<w> {
        public final Object createFromParcel(Parcel parcel) {
            return w.a(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new w[i8];
        }
    }

    public w(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = f0.b(calendar);
        this.f5926a = b10;
        this.f5927b = b10.get(2);
        this.f5928c = b10.get(1);
        this.f5929d = b10.getMaximum(7);
        this.f5930e = b10.getActualMaximum(5);
        this.B = b10.getTimeInMillis();
    }

    public static w a(int i8, int i10) {
        Calendar d10 = f0.d((Calendar) null);
        d10.set(1, i8);
        d10.set(2, i10);
        return new w(d10);
    }

    public static w c(long j10) {
        Calendar d10 = f0.d((Calendar) null);
        d10.setTimeInMillis(j10);
        return new w(d10);
    }

    public final int compareTo(Object obj) {
        return this.f5926a.compareTo(((w) obj).f5926a);
    }

    public final String d() {
        if (this.C == null) {
            this.C = DateUtils.formatDateTime((Context) null, this.f5926a.getTimeInMillis(), 8228);
        }
        return this.C;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f5927b == wVar.f5927b && this.f5928c == wVar.f5928c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5927b), Integer.valueOf(this.f5928c)});
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f5928c);
        parcel.writeInt(this.f5927b);
    }
}
