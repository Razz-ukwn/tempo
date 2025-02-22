package ma;

import java.lang.annotation.Annotation;
import ma.d;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f11350a;

    public a(int i8) {
        this.f11350a = i8;
    }

    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f11350a == aVar.f11350a) {
            d.a aVar2 = d.a.f11352a;
            aVar.getClass();
            if (aVar2.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (14552422 ^ this.f11350a) + (d.a.f11352a.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11350a + "intEncoding=" + d.a.f11352a + ')';
    }
}
