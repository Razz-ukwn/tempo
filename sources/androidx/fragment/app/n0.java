package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.j;

@SuppressLint({"BanParcelableUsage"})
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final Bundle F;
    public final boolean G;
    public final int H;
    public Bundle I;

    /* renamed from: a  reason: collision with root package name */
    public final String f2046a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2047b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2048c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2049d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2050e;

    public class a implements Parcelable.Creator<n0> {
        public final Object createFromParcel(Parcel parcel) {
            return new n0(parcel);
        }

        public final Object[] newArray(int i8) {
            return new n0[i8];
        }
    }

    public n0(p pVar) {
        this.f2046a = pVar.getClass().getName();
        this.f2047b = pVar.B;
        this.f2048c = pVar.K;
        this.f2049d = pVar.T;
        this.f2050e = pVar.U;
        this.B = pVar.V;
        this.C = pVar.Y;
        this.D = pVar.I;
        this.E = pVar.X;
        this.F = pVar.C;
        this.G = pVar.W;
        this.H = pVar.f2074k0.ordinal();
    }

    public final p a(b0 b0Var, ClassLoader classLoader) {
        p a10 = b0Var.a(this.f2046a);
        Bundle bundle = this.F;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.h0(bundle);
        a10.B = this.f2047b;
        a10.K = this.f2048c;
        a10.M = true;
        a10.T = this.f2049d;
        a10.U = this.f2050e;
        a10.V = this.B;
        a10.Y = this.C;
        a10.I = this.D;
        a10.X = this.E;
        a10.W = this.G;
        a10.f2074k0 = j.b.values()[this.H];
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            a10.f2061b = bundle2;
        } else {
            a10.f2061b = new Bundle();
        }
        return a10;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2046a);
        sb2.append(" (");
        sb2.append(this.f2047b);
        sb2.append(")}:");
        if (this.f2048c) {
            sb2.append(" fromLayout");
        }
        int i8 = this.f2050e;
        if (i8 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i8));
        }
        String str = this.B;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.C) {
            sb2.append(" retainInstance");
        }
        if (this.D) {
            sb2.append(" removing");
        }
        if (this.E) {
            sb2.append(" detached");
        }
        if (this.G) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f2046a);
        parcel.writeString(this.f2047b);
        parcel.writeInt(this.f2048c ? 1 : 0);
        parcel.writeInt(this.f2049d);
        parcel.writeInt(this.f2050e);
        parcel.writeString(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeBundle(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeBundle(this.I);
        parcel.writeInt(this.H);
    }

    public n0(Parcel parcel) {
        this.f2046a = parcel.readString();
        this.f2047b = parcel.readString();
        boolean z10 = true;
        this.f2048c = parcel.readInt() != 0;
        this.f2049d = parcel.readInt();
        this.f2050e = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readBundle();
        this.G = parcel.readInt() == 0 ? false : z10;
        this.I = parcel.readBundle();
        this.H = parcel.readInt();
    }
}
