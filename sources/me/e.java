package me;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import sf.j;

public final class e implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final List<d> B;

    /* renamed from: a  reason: collision with root package name */
    public long f11473a;

    /* renamed from: b  reason: collision with root package name */
    public String f11474b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f11475c;

    /* renamed from: d  reason: collision with root package name */
    public String f11476d;

    /* renamed from: e  reason: collision with root package name */
    public long f11477e;

    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(e.class.getClassLoader());
            String readString2 = parcel.readString();
            long readLong2 = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((d) d.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new e(readLong, readString, uri, readString2, readLong2, arrayList);
        }

        public final Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e() {
        this(0);
    }

    public e(long j10, String str, Uri uri, String str2, long j11, List<d> list) {
        j.f(list, "medias");
        this.f11473a = j10;
        this.f11474b = str;
        this.f11475c = uri;
        this.f11476d = str2;
        this.f11477e = j11;
        this.B = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str = this.f11474b;
        String str2 = null;
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        if (eVar != null) {
            str2 = eVar.f11474b;
        }
        return j.a(str, str2);
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.f11473a).hashCode() * 31;
        String str = this.f11474b;
        int i8 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Uri uri = this.f11475c;
        int hashCode3 = (hashCode2 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str2 = this.f11476d;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return this.B.hashCode() + ((Long.valueOf(this.f11477e).hashCode() + ((hashCode3 + i8) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "parcel");
        parcel.writeLong(this.f11473a);
        parcel.writeString(this.f11474b);
        parcel.writeParcelable(this.f11475c, i8);
        parcel.writeString(this.f11476d);
        parcel.writeLong(this.f11477e);
        List<d> list = this.B;
        parcel.writeInt(list.size());
        for (d writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public /* synthetic */ e(int i8) {
        this(0, (String) null, (Uri) null, (String) null, 0, new ArrayList());
    }
}
