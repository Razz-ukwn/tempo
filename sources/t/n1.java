package t;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

@SuppressLint({"BanParcelableUsage"})
public final class n1<T> extends r2<T> implements Parcelable {
    public static final Parcelable.Creator<n1<Object>> CREATOR = new a();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(T t2, s2<T> s2Var) {
        super(t2, s2Var);
        j.f(s2Var, "policy");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int i10;
        j.f(parcel, "parcel");
        parcel.writeValue(getValue());
        k1 k1Var = k1.f15133a;
        s2<T> s2Var = this.f15223a;
        if (j.a(s2Var, k1Var)) {
            i10 = 0;
        } else if (j.a(s2Var, b3.f14997a)) {
            i10 = 1;
        } else if (j.a(s2Var, h2.f15064a)) {
            i10 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i10);
    }

    public static final class a implements Parcelable.ClassLoaderCreator<n1<Object>> {
        public static n1 a(Parcel parcel, ClassLoader classLoader) {
            s2 s2Var;
            j.f(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                s2Var = k1.f15133a;
            } else if (readInt == 1) {
                s2Var = b3.f14997a;
            } else if (readInt == 2) {
                s2Var = h2.f15064a;
            } else {
                throw new IllegalStateException(d.a.a("Unsupported MutableState policy ", readInt, " was restored"));
            }
            return new n1(readValue, s2Var);
        }

        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return a(parcel, (ClassLoader) null);
        }

        public final Object[] newArray(int i8) {
            return new n1[i8];
        }

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
