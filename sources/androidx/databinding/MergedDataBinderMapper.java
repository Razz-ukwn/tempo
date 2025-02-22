package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends c {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f1759a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f1760b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f1761c = new CopyOnWriteArrayList();

    public final ViewDataBinding b(d dVar, View view, int i8) {
        Iterator it = this.f1760b.iterator();
        while (it.hasNext()) {
            ViewDataBinding b10 = ((c) it.next()).b(dVar, view, i8);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(dVar, view, i8);
        }
        return null;
    }

    public final ViewDataBinding c(d dVar, View[] viewArr, int i8) {
        Iterator it = this.f1760b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c3 = ((c) it.next()).c(dVar, viewArr, i8);
            if (c3 != null) {
                return c3;
            }
        }
        if (e()) {
            return c(dVar, viewArr, i8);
        }
        return null;
    }

    public final void d(c cVar) {
        if (this.f1759a.add(cVar.getClass())) {
            this.f1760b.add(cVar);
            for (c d10 : cVar.a()) {
                d(d10);
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1761c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (c.class.isAssignableFrom(cls)) {
                    d((c) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
