package je;

import android.net.Uri;
import com.quickkonnect.silencio.R;
import ff.g;
import gf.q;
import gf.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import me.c;
import sf.j;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f9993a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<Uri> f9994b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<Uri> f9995c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet<c> f9996d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public static final int f9997e = R.style.LibAppTheme;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9998f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9999g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f10000h = true;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f10001i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashMap f10002j = y.T(new g(b.f9988a, 2), new g(b.f9989b, 3));

    /* renamed from: k  reason: collision with root package name */
    public static final int f10003k = -1;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f10004l = true;

    public static void a(int i8, List list) {
        j.f(list, "paths");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((Uri) list.get(i10), i8);
        }
    }

    public static void b(Uri uri, int i8) {
        if (uri != null && e()) {
            ArrayList<Uri> arrayList = f9994b;
            if (arrayList.contains(uri) || i8 != 1) {
                ArrayList<Uri> arrayList2 = f9995c;
                if (!arrayList2.contains(uri) && i8 == 2) {
                    arrayList2.add(uri);
                    return;
                }
                return;
            }
            arrayList.add(uri);
        }
    }

    public static int c() {
        return f9995c.size() + f9994b.size();
    }

    public static void d(Uri uri, int i8) {
        if (i8 == 1) {
            ArrayList<Uri> arrayList = f9994b;
            if (q.s0(arrayList, uri)) {
                sf.y.a(arrayList);
                arrayList.remove(uri);
                return;
            }
        }
        if (i8 == 2) {
            ArrayList<Uri> arrayList2 = f9995c;
            if (arrayList2 != null) {
                sf.y.a(arrayList2);
                arrayList2.remove(uri);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
    }

    public static boolean e() {
        return f9993a == -1 || c() < f9993a;
    }
}
