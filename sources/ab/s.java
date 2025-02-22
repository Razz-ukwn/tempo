package ab;

import cb.q;
import java.io.Serializable;
import java.math.BigInteger;

public final class s extends n {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f276a;

    public s(Boolean bool) {
        bool.getClass();
        this.f276a = bool;
    }

    public static boolean d(s sVar) {
        Serializable serializable = sVar.f276a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        Serializable serializable = this.f276a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c());
    }

    public final Number b() {
        Serializable serializable = this.f276a;
        return serializable instanceof String ? new q((String) serializable) : (Number) serializable;
    }

    public final String c() {
        Serializable serializable = this.f276a;
        return serializable instanceof Number ? b().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f276a;
        Serializable serializable2 = sVar.f276a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (d(this) && d(sVar)) {
            return b().longValue() == sVar.b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = b().doubleValue();
        double doubleValue2 = sVar.b().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long j10;
        Serializable serializable = this.f276a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            j10 = b().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            j10 = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (j10 ^ (j10 >>> 32));
    }

    public s(Number number) {
        number.getClass();
        this.f276a = number;
    }

    public s(String str) {
        str.getClass();
        this.f276a = str;
    }
}
