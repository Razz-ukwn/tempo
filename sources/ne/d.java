package ne;

import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import d2.d1;
import d2.i0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f11902a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager f11903b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11904c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f11905d;

    /* renamed from: e  reason: collision with root package name */
    public e f11906e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f11907f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11908g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11909h;

    public class a extends DataSetObserver {
        public a() {
        }

        public final void onChanged() {
            d dVar = d.this;
            Runnable runnable = dVar.f11907f;
            if (runnable != null) {
                dVar.f11902a.removeCallbacks(runnable);
                dVar.f11907f = null;
            }
            e eVar = dVar.f11906e;
            TabLayout tabLayout = dVar.f11902a;
            if (eVar != null) {
                tabLayout.removeCallbacks(eVar);
                dVar.f11906e = null;
            }
            if (dVar.f11906e == null) {
                dVar.f11906e = new e(dVar);
            }
            tabLayout.post(dVar.f11906e);
        }
    }

    public class b implements TabLayout.d {
        public b() {
        }

        public final void a() {
            d.this.getClass();
        }

        public final void b(TabLayout.g gVar) {
            d dVar = d.this;
            if (!dVar.f11909h) {
                dVar.f11903b.setCurrentItem(gVar.f6140d);
                Runnable runnable = dVar.f11907f;
                if (runnable != null) {
                    dVar.f11902a.removeCallbacks(runnable);
                    dVar.f11907f = null;
                }
            }
        }

        public final void c() {
            d.this.getClass();
        }
    }

    public class c implements ViewPager.h {
        public c() {
        }

        public final void a(ViewPager viewPager, u3.a aVar, u3.a aVar2) {
            d dVar = d.this;
            ViewPager viewPager2 = dVar.f11903b;
            if (viewPager2 == viewPager) {
                a aVar3 = dVar.f11904c;
                if (aVar != null) {
                    aVar.f15711a.unregisterObserver(aVar3);
                }
                if (aVar2 != null) {
                    aVar2.f15711a.registerObserver(aVar3);
                }
                dVar.c(dVar.f11902a, aVar2, viewPager2.getCurrentItem());
            }
        }
    }

    /* renamed from: ne.d$d  reason: collision with other inner class name */
    public class C0225d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11913a;

        public C0225d(int i8) {
            this.f11913a = i8;
        }

        public final void run() {
            d dVar = d.this;
            dVar.f11905d = null;
            dVar.b(dVar.f11902a, this.f11913a);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            d dVar = d.this;
            dVar.f11907f = null;
            TabLayout tabLayout = dVar.f11902a;
            tabLayout.n(tabLayout.getSelectedTabPosition(), 0.0f, false, true);
        }
    }

    public static class f implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f11916a;

        /* renamed from: b  reason: collision with root package name */
        public int f11917b;

        /* renamed from: c  reason: collision with root package name */
        public int f11918c;

        public f(TabLayout tabLayout) {
            this.f11916a = new WeakReference<>(tabLayout);
        }

        public final void a(float f10, int i8) {
            TabLayout tabLayout = this.f11916a.get();
            if (tabLayout != null) {
                int i10 = this.f11918c;
                boolean z10 = false;
                if (i10 == 1 || (i10 == 2 && this.f11917b == 1)) {
                    if (i10 == 1 || (i10 == 2 && this.f11917b == 1)) {
                        z10 = true;
                    }
                    tabLayout.n(i8, f10, z10, true);
                }
            }
        }

        public final void b(int i8) {
            this.f11917b = this.f11918c;
            this.f11918c = i8;
        }

        public final void c(int i8) {
            TabLayout tabLayout = this.f11916a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8) {
                try {
                    g.f11919a.invoke(tabLayout, new Object[]{tabLayout.h(i8), Boolean.valueOf(this.f11918c == 0)});
                } catch (IllegalAccessException e10) {
                    new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    Throwable targetException = e11.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    throw new IllegalStateException(targetException);
                }
            }
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f11919a;

        static {
            try {
                Method declaredMethod = TabLayout.class.getDeclaredMethod("selectTab", new Class[]{TabLayout.g.class, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                f11919a = declaredMethod;
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager viewPager) {
        if (viewPager.getAdapter() != null) {
            this.f11902a = tabLayout;
            this.f11903b = viewPager;
            a aVar = new a();
            this.f11904c = aVar;
            b bVar = new b();
            f fVar = new f(tabLayout);
            c cVar = new c();
            u3.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                c(tabLayout, adapter, viewPager.getCurrentItem());
                viewPager.getAdapter().f15711a.registerObserver(aVar);
                if (viewPager.f2800q0 == null) {
                    viewPager.f2800q0 = new ArrayList();
                }
                viewPager.f2800q0.add(fVar);
                if (viewPager.f2802s0 == null) {
                    viewPager.f2802s0 = new ArrayList();
                }
                viewPager.f2802s0.add(cVar);
                tabLayout.a(bVar);
                return;
            }
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
    }

    public final void a(int i8) {
        if (this.f11905d == null) {
            TabLayout tabLayout = this.f11902a;
            if (i8 < 0) {
                i8 = tabLayout.getScrollX();
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.g.c(tabLayout)) {
                b(tabLayout, i8);
                return;
            }
            C0225d dVar = new C0225d(i8);
            this.f11905d = dVar;
            tabLayout.post(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.material.tabs.TabLayout r12, int r13) {
        /*
            r11 = this;
            int r0 = r12.getTabMode()
            r1 = 0
            r12.setTabMode(r1)
            r2 = 1
            r12.setTabGravity(r2)
            android.view.View r3 = r12.getChildAt(r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r4 = r3.getChildCount()
            int r5 = r12.getMeasuredWidth()
            int r6 = r12.getPaddingLeft()
            int r5 = r5 - r6
            int r6 = r12.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r12.getMeasuredHeight()
            int r7 = r12.getPaddingTop()
            int r6 = r6 - r7
            int r7 = r12.getPaddingBottom()
            int r6 = r6 - r7
            if (r4 != 0) goto L_0x0035
            goto L_0x0058
        L_0x0035:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r7 = r1
            r8 = r7
            r9 = r8
        L_0x003e:
            if (r7 >= r4) goto L_0x0053
            android.view.View r10 = r3.getChildAt(r7)
            r10.measure(r1, r6)
            int r10 = r10.getMeasuredWidth()
            int r8 = r8 + r10
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = r7 + 1
            goto L_0x003e
        L_0x0053:
            if (r8 >= r5) goto L_0x005a
            int r5 = r5 / r4
            if (r9 >= r5) goto L_0x005a
        L_0x0058:
            r3 = r2
            goto L_0x005b
        L_0x005a:
            r3 = r1
        L_0x005b:
            java.lang.Runnable r4 = r11.f11907f
            com.google.android.material.tabs.TabLayout r5 = r11.f11902a
            if (r4 == 0) goto L_0x0067
            r5.removeCallbacks(r4)
            r4 = 0
            r11.f11907f = r4
        L_0x0067:
            if (r3 != r2) goto L_0x0070
            r12.setTabGravity(r1)
            r12.setTabMode(r2)
            goto L_0x0089
        L_0x0070:
            android.view.View r3 = r12.getChildAt(r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.setGravity(r2)
            if (r0 != 0) goto L_0x007f
            r12.scrollTo(r13, r1)
            goto L_0x0089
        L_0x007f:
            ne.d$e r12 = new ne.d$e
            r12.<init>()
            r11.f11907f = r12
            r5.post(r12)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.d.b(com.google.android.material.tabs.TabLayout, int):void");
    }

    /* JADX INFO: finally extract failed */
    public final void c(TabLayout tabLayout, u3.a aVar, int i8) {
        try {
            this.f11909h = true;
            tabLayout.getSelectedTabPosition();
            int scrollX = tabLayout.getScrollX();
            tabLayout.k();
            if (aVar != null) {
                int c3 = aVar.c();
                for (int i10 = 0; i10 < c3; i10++) {
                    TabLayout.g i11 = tabLayout.i();
                    CharSequence d10 = aVar.d(i10);
                    if (TextUtils.isEmpty(i11.f6139c) && !TextUtils.isEmpty(d10)) {
                        i11.f6144h.setContentDescription(d10);
                    }
                    i11.f6138b = d10;
                    TabLayout.i iVar = i11.f6144h;
                    if (iVar != null) {
                        iVar.d();
                    }
                    tabLayout.b(i11, false);
                    if (i11.f6141e == null) {
                        i11.f6141e = null;
                        TabLayout.i iVar2 = i11.f6144h;
                        if (iVar2 != null) {
                            iVar2.d();
                        }
                    }
                }
                int min = Math.min(i8, c3 - 1);
                if (min >= 0) {
                    tabLayout.h(min).a();
                }
            }
            if (this.f11908g) {
                a(scrollX);
            } else if (tabLayout.getTabMode() == 0) {
                tabLayout.scrollTo(scrollX, 0);
            }
            this.f11909h = false;
        } catch (Throwable th) {
            this.f11909h = false;
            throw th;
        }
    }
}
