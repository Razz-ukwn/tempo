package rb;

public final /* synthetic */ class b {
    public static String a(StringBuilder sb2, int i8, char c3) {
        sb2.append(i8);
        sb2.append(c3);
        return sb2.toString();
    }

    public static /* synthetic */ String b(int i8) {
        if (i8 == 1) {
            return "CAMERA";
        }
        if (i8 == 2) {
            return "GALLERY";
        }
        if (i8 == 3) {
            return "CAMERA_AND_GALLERY";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i8) {
        return i8 == 1 ? "CAMERA" : i8 == 2 ? "GALLERY" : i8 == 3 ? "CAMERA_AND_GALLERY" : "null";
    }

    public static /* synthetic */ int d(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("CAMERA")) {
            return 1;
        } else {
            if (str.equals("GALLERY")) {
                return 2;
            }
            if (str.equals("CAMERA_AND_GALLERY")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.lassi.domain.media.LassiOption.".concat(str));
        }
    }
}
