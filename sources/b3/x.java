package b3;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import t9.e;
import t9.v;

public final /* synthetic */ class x implements e {
    public static int a(String str, int i8, int i10) {
        return (str.hashCode() + i8) * i10;
    }

    public static String b(StringBuilder sb2, int i8, String str) {
        sb2.append(i8);
        sb2.append(str);
        return sb2.toString();
    }

    public static /* synthetic */ String c(int i8) {
        return i8 == 1 ? "OK" : i8 == 2 ? "TRANSIENT_ERROR" : i8 == 3 ? "FATAL_ERROR" : i8 == 4 ? "INVALID_PAYLOAD" : "null";
    }

    public Object e(v vVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(vVar);
    }
}
