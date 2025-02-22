package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class a extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2861a = new ArrayList(3);

    public final void a(int i8) {
        try {
            Iterator it = this.f2861a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).a(i8);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    public final void b(float f10, int i8, int i10) {
        try {
            Iterator it = this.f2861a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).b(f10, i8, i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    public final void c(int i8) {
        try {
            Iterator it = this.f2861a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).c(i8);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
