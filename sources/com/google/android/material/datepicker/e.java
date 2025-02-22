package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public final class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f5871a;

    public class a implements Parcelable.Creator<e> {
        public final Object createFromParcel(Parcel parcel) {
            return new e(parcel.readLong());
        }

        public final Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(long j10) {
        this.f5871a = j10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f5871a == ((e) obj).f5871a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5871a)});
    }

    public final boolean k(long j10) {
        return j10 >= this.f5871a;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f5871a);
    }
}
