package v1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import u1.d;
import z1.l;

public class n {

    public interface a<T> {
        int a(T t2);

        boolean b(T t2);
    }

    public n() {
        new ConcurrentHashMap();
    }

    public static <T> T d(T[] tArr, int i8, a<T> aVar) {
        int i10 = (i8 & 1) == 0 ? 400 : 700;
        boolean z10 = (i8 & 2) != 0;
        T t2 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int abs = (Math.abs(aVar.a(t10) - i10) * 2) + (aVar.b(t10) == z10 ? 0 : 1);
            if (t2 == null || i11 > abs) {
                t2 = t10;
                i11 = abs;
            }
        }
        return t2;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i8) {
        throw null;
    }

    public Typeface b(Context context, l[] lVarArr, int i8) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i8, String str, int i10) {
        File d10 = o.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!o.b(d10, resources, i8)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public l e(int i8, l[] lVarArr) {
        return (l) d(lVarArr, i8, new m());
    }
}
