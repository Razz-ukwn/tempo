package t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.g;
import java.lang.reflect.Method;
import o.a;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f15333d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f15334e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15335f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15336g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15337h;

    /* renamed from: i  reason: collision with root package name */
    public int f15338i;

    /* renamed from: j  reason: collision with root package name */
    public int f15339j;

    /* renamed from: k  reason: collision with root package name */
    public int f15340k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public final b a() {
        Parcel parcel = this.f15334e;
        int dataPosition = parcel.dataPosition();
        int i8 = this.f15339j;
        if (i8 == this.f15335f) {
            i8 = this.f15336g;
        }
        return new b(parcel, dataPosition, i8, g.a(new StringBuilder(), this.f15337h, "  "), this.f15330a, this.f15331b, this.f15332c);
    }

    public final boolean e() {
        return this.f15334e.readInt() != 0;
    }

    public final byte[] f() {
        Parcel parcel = this.f15334e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f15334e);
    }

    public final boolean h(int i8) {
        while (this.f15339j < this.f15336g) {
            int i10 = this.f15340k;
            if (i10 == i8) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            int i11 = this.f15339j;
            Parcel parcel = this.f15334e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.f15340k = parcel.readInt();
            this.f15339j += readInt;
        }
        return this.f15340k == i8;
    }

    public final int i() {
        return this.f15334e.readInt();
    }

    public final <T extends Parcelable> T k() {
        return this.f15334e.readParcelable(b.class.getClassLoader());
    }

    public final String l() {
        return this.f15334e.readString();
    }

    public final void n(int i8) {
        w();
        this.f15338i = i8;
        this.f15333d.put(i8, this.f15334e.dataPosition());
        r(0);
        r(i8);
    }

    public final void o(boolean z10) {
        this.f15334e.writeInt(z10 ? 1 : 0);
    }

    public final void p(byte[] bArr) {
        Parcel parcel = this.f15334e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f15334e, 0);
    }

    public final void r(int i8) {
        this.f15334e.writeInt(i8);
    }

    public final void t(Parcelable parcelable) {
        this.f15334e.writeParcelable(parcelable, 0);
    }

    public final void u(String str) {
        this.f15334e.writeString(str);
    }

    public final void w() {
        int i8 = this.f15338i;
        if (i8 >= 0) {
            int i10 = this.f15333d.get(i8);
            Parcel parcel = this.f15334e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(dataPosition - i10);
            parcel.setDataPosition(dataPosition);
        }
    }

    public b(Parcel parcel, int i8, int i10, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f15333d = new SparseIntArray();
        this.f15338i = -1;
        this.f15340k = -1;
        this.f15334e = parcel;
        this.f15335f = i8;
        this.f15336g = i10;
        this.f15339j = i8;
        this.f15337h = str;
    }
}
