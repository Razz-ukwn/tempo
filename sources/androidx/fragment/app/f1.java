package androidx.fragment.app;

import java.util.HashMap;
import ma.a;

public final /* synthetic */ class f1 {
    public static /* synthetic */ int a(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            return 2;
        }
        if (i8 == 3) {
            return 3;
        }
        if (i8 == 4) {
            return 4;
        }
        if (i8 == 5) {
            return 5;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i8) {
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5) {
            return 4;
        }
        if (i8 == 6) {
            return -1;
        }
        throw null;
    }

    public static int c(int i8, int i10, int i11) {
        return (Integer.hashCode(i8) + i10) * i11;
    }

    public static HashMap d(Class cls, a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ String e(int i8) {
        if (i8 == 1) {
            return "UNKNOWN_KEYMATERIAL";
        }
        if (i8 == 2) {
            return "SYMMETRIC";
        }
        if (i8 == 3) {
            return "ASYMMETRIC_PRIVATE";
        }
        if (i8 == 4) {
            return "ASYMMETRIC_PUBLIC";
        }
        if (i8 == 5) {
            return "REMOTE";
        }
        if (i8 == 6) {
            return "UNRECOGNIZED";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i8) {
        if (i8 == 1) {
            return "IMAGE";
        }
        if (i8 == 2) {
            return "VIDEO";
        }
        if (i8 == 3) {
            return "AUDIO";
        }
        if (i8 == 4) {
            return "DOC";
        }
        if (i8 == 5) {
            return "FILE_TYPE_WITH_SYSTEM_VIEW";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i8) {
        return i8 == 1 ? "NONE" : i8 == 2 ? "ADDING" : i8 == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String h(int i8) {
        return i8 == 1 ? "IMAGE" : i8 == 2 ? "VIDEO" : i8 == 3 ? "AUDIO" : i8 == 4 ? "DOC" : i8 == 5 ? "FILE_TYPE_WITH_SYSTEM_VIEW" : "null";
    }

    public static /* synthetic */ int i(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("IMAGE")) {
            return 1;
        } else {
            if (str.equals("VIDEO")) {
                return 2;
            }
            if (str.equals("AUDIO")) {
                return 3;
            }
            if (str.equals("DOC")) {
                return 4;
            }
            if (str.equals("FILE_TYPE_WITH_SYSTEM_VIEW")) {
                return 5;
            }
            throw new IllegalArgumentException("No enum constant com.lassi.domain.media.MediaType.".concat(str));
        }
    }
}
