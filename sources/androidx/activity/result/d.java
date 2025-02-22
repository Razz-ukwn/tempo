package androidx.activity.result;

import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class d {
    public static String a(String str, int i8, String str2, int i10) {
        return str + i8 + str2 + i10;
    }

    public static String b(String str, int i8, String str2, int i10, String str3) {
        return str + i8 + str2 + i10 + str3;
    }

    public static StringBuilder c(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList d(int i8, HashMap hashMap, ArrayList arrayList, int i10, String str) {
        hashMap.put(Integer.valueOf(i8), arrayList);
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.add(str);
        return arrayList2;
    }
}
