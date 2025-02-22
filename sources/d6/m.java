package d6;

import a6.b;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f7353a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7354b;

    public m(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f7353a = bVar;
            this.f7354b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f7353a.equals(mVar.f7353a)) {
            return false;
        }
        return Arrays.equals(this.f7354b, mVar.f7354b);
    }

    public final int hashCode() {
        return ((this.f7353a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7354b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f7353a + ", bytes=[...]}";
    }
}
