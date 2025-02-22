package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import yf.g;

public final class y2 implements g<x2> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1528a = new ArrayList();

    public final void b(Object obj, String str) {
        this.f1528a.add(new x2(obj, str));
    }

    public final Iterator<x2> iterator() {
        return this.f1528a.iterator();
    }
}
