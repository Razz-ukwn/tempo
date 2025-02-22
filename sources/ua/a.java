package ua;

import com.google.android.gms.internal.measurement.f2;
import q.g;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15942a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15943b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15944c;

    /* renamed from: d  reason: collision with root package name */
    public final f f15945d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15946e;

    public a(String str, String str2, String str3, f fVar, int i8) {
        this.f15942a = str;
        this.f15943b = str2;
        this.f15944c = str3;
        this.f15945d = fVar;
        this.f15946e = i8;
    }

    public final f a() {
        return this.f15945d;
    }

    public final String b() {
        return this.f15943b;
    }

    public final String c() {
        return this.f15944c;
    }

    public final int d() {
        return this.f15946e;
    }

    public final String e() {
        return this.f15942a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f15942a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f15943b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f15944c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f15945d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i8 = this.f15946e;
                        if (i8 == 0) {
                            if (dVar.d() == 0) {
                                return true;
                            }
                        } else if (g.b(i8, dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f15942a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f15943b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15944c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f15945d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        int i10 = this.f15946e;
        if (i10 != 0) {
            i8 = g.c(i10);
        }
        return i8 ^ hashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f15942a + ", fid=" + this.f15943b + ", refreshToken=" + this.f15944c + ", authToken=" + this.f15945d + ", responseCode=" + f2.b(this.f15946e) + "}";
    }
}
