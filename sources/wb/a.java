package wb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static String f16661b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f16662c;

    /* renamed from: a  reason: collision with root package name */
    public final String f16663a;

    /* renamed from: wb.a$a  reason: collision with other inner class name */
    public static class C0306a implements b {
        public final void a(int i8, String str, String str2, Throwable th) {
            if (i8 == 0) {
                Log.v(str, str2, th);
            } else if (i8 == 1) {
                Log.i(str, str2, th);
            } else if (i8 == 2) {
                Log.w(str, str2, th);
            } else if (i8 == 3) {
                Log.e(str, str2, th);
            }
        }
    }

    public interface b {
        void a(int i8, String str, String str2, Throwable th);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f16662c = arrayList;
        arrayList.add(new C0306a());
    }

    public a(String str) {
        this.f16663a = str;
    }

    public final void a(int i8, Object... objArr) {
        ArrayList arrayList = f16662c;
        if (3 <= i8 && arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            Throwable th = null;
            for (Throwable th2 : objArr) {
                if (th2 instanceof Throwable) {
                    th = th2;
                }
                sb2.append(th2);
                sb2.append(" ");
            }
            String trim = sb2.toString().trim();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(i8, this.f16663a, trim, th);
            }
            f16661b = trim;
        }
    }
}
