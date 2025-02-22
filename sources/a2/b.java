package a2;

import a2.e;

public final /* synthetic */ class b implements e.c {
    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static /* synthetic */ String c(int i8) {
        return i8 == 1 ? "INITIALIZE" : i8 == 2 ? "RESOURCE_CACHE" : i8 == 3 ? "DATA_CACHE" : i8 == 4 ? "SOURCE" : i8 == 5 ? "ENCODE" : i8 == 6 ? "FINISHED" : "null";
    }

    public boolean a() {
        return false;
    }
}
