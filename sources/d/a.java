package d;

import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class a {
    public static String a(String str, int i8, String str2) {
        return str + i8 + str2;
    }

    public static StringBuilder b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static ArrayList c(ArrayList arrayList, String str, int i8, HashMap hashMap, ArrayList arrayList2, int i10) {
        arrayList.add(str);
        hashMap.put(Integer.valueOf(i8), arrayList2);
        return new ArrayList(i10);
    }

    public static /* synthetic */ String d(int i8) {
        return i8 == 1 ? "Measuring" : i8 == 2 ? "LookaheadMeasuring" : i8 == 3 ? "LayingOut" : i8 == 4 ? "LookaheadLayingOut" : i8 == 5 ? "Idle" : "null";
    }
}
