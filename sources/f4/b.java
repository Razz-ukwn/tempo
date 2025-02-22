package f4;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import sf.j;

public interface b {

    public static final class a implements Parcelable {
        @Deprecated
        public static final Parcelable.Creator<a> CREATOR = new C0152a();

        /* renamed from: a  reason: collision with root package name */
        public final String f8576a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f8577b;

        /* renamed from: f4.b$a$a  reason: collision with other inner class name */
        public static final class C0152a implements Parcelable.Creator<a> {
            public final Object createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                j.c(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 < readInt; i8++) {
                    String readString2 = parcel.readString();
                    j.c(readString2);
                    String readString3 = parcel.readString();
                    j.c(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new a(readString, linkedHashMap);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, Map<String, String> map) {
            this.f8576a = str;
            this.f8577b = map;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return j.a(this.f8576a, aVar.f8576a) && j.a(this.f8577b, aVar.f8577b);
            }
        }

        public final int hashCode() {
            return this.f8577b.hashCode() + (this.f8576a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.f8576a + ", extras=" + this.f8577b + ')';
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f8576a);
            Map<String, String> map = this.f8577b;
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
    }

    /* renamed from: f4.b$b  reason: collision with other inner class name */
    public static final class C0153b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f8578a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f8579b;

        public C0153b(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f8578a = bitmap;
            this.f8579b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0153b) {
                C0153b bVar = (C0153b) obj;
                return j.a(this.f8578a, bVar.f8578a) && j.a(this.f8579b, bVar.f8579b);
            }
        }

        public final int hashCode() {
            return this.f8579b.hashCode() + (this.f8578a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(bitmap=" + this.f8578a + ", extras=" + this.f8579b + ')';
        }
    }

    void a(int i8);

    C0153b b(a aVar);

    void c(a aVar, C0153b bVar);
}
