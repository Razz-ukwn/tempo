package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d2.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t1.a;

public class f implements x1.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f721y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f722a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f723b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f724c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f725d;

    /* renamed from: e  reason: collision with root package name */
    public a f726e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<h> f727f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f728g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f729h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<h> f730i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f731j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f732k;

    /* renamed from: l  reason: collision with root package name */
    public int f733l = 0;
    public CharSequence m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f734n;

    /* renamed from: o  reason: collision with root package name */
    public View f735o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f736p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f737q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f738r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f739s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<h> f740t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f741u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public h f742v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f743w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f744x;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f722a = context;
        Resources resources = context.getResources();
        this.f723b = resources;
        this.f727f = new ArrayList<>();
        this.f728g = new ArrayList<>();
        this.f729h = true;
        this.f730i = new ArrayList<>();
        this.f731j = new ArrayList<>();
        this.f732k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = x0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f725d = z11;
    }

    public h a(int i8, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = (-65536 & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f721y[i13] << 16) | (65535 & i11);
        h hVar = new h(this, i8, i10, i11, i14, charSequence, this.f733l);
        ArrayList<h> arrayList = this.f727f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size).f751d <= i14) {
                    i12 = size + 1;
                    break;
                }
            } else {
                i12 = 0;
                break;
            }
        }
        arrayList.add(i12, hVar);
        p(true);
        return hVar;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f722a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            androidx.appcompat.view.menu.h r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f754g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f741u.add(new WeakReference(jVar));
        jVar.h(context, this);
        this.f732k = true;
    }

    public final void c(boolean z10) {
        if (!this.f739s) {
            this.f739s = true;
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    jVar.c(this, z10);
                }
            }
            this.f739s = false;
        }
    }

    public final void clear() {
        h hVar = this.f742v;
        if (hVar != null) {
            d(hVar);
        }
        this.f727f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f734n = null;
        this.m = null;
        this.f735o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f742v == hVar) {
            y();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = jVar.g(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            x();
            if (z10) {
                this.f742v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f726e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = jVar.m(hVar);
                if (z10) {
                    break;
                }
            }
        }
        x();
        if (z10) {
            this.f742v = hVar;
        }
        return z10;
    }

    public final MenuItem findItem(int i8) {
        MenuItem findItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f727f.get(i10);
            if (hVar.f748a == i8) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f761o.findItem(i8)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i8, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f740t;
        arrayList.clear();
        h(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            char c3 = n2 ? hVar.f757j : hVar.f755h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n2 && c3 == 8 && i8 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i8) {
        return this.f727f.get(i8);
    }

    public final void h(ArrayList arrayList, int i8, KeyEvent keyEvent) {
        ArrayList arrayList2 = arrayList;
        int i10 = i8;
        KeyEvent keyEvent2 = keyEvent;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i10 == 67) {
            ArrayList<h> arrayList3 = this.f727f;
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = arrayList3.get(i11);
                if (hVar.hasSubMenu()) {
                    hVar.f761o.h(arrayList2, i10, keyEvent2);
                }
                char c3 = n2 ? hVar.f757j : hVar.f755h;
                if (((modifiers & 69647) == ((n2 ? hVar.f758k : hVar.f756i) & 69647)) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (n2 && c3 == 8) {
                            if (i10 != 67) {
                            }
                        }
                    }
                    if (hVar.isEnabled()) {
                        arrayList2.add(hVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f744x) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f727f.get(i8).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> l10 = l();
        if (this.f732k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 |= jVar.e();
                }
            }
            ArrayList<h> arrayList = this.f730i;
            ArrayList<h> arrayList2 = this.f731j;
            if (z10) {
                arrayList.clear();
                arrayList2.clear();
                int size = l10.size();
                for (int i8 = 0; i8 < size; i8++) {
                    h hVar = l10.get(i8);
                    if ((hVar.f770x & 32) == 32) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f732k = false;
        }
    }

    public final boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return g(i8, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f729h;
        ArrayList<h> arrayList = this.f728g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f727f;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = arrayList2.get(i8);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f729h = false;
        this.f732k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f743w;
    }

    public boolean n() {
        return this.f724c;
    }

    public boolean o() {
        return this.f725d;
    }

    public void p(boolean z10) {
        if (!this.f736p) {
            if (z10) {
                this.f729h = true;
                this.f732k = true;
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
            if (!copyOnWriteArrayList.isEmpty()) {
                y();
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        jVar.d(z10);
                    }
                }
                x();
                return;
            }
            return;
        }
        this.f737q = true;
        if (z10) {
            this.f738r = true;
        }
    }

    public final boolean performIdentifierAction(int i8, int i10) {
        return q(findItem(i8), (j) null, i10);
    }

    public final boolean performShortcut(int i8, KeyEvent keyEvent, int i10) {
        h g10 = g(i8, keyEvent);
        boolean q10 = g10 != null ? q(g10, (j) null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L_0x00cc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00cc
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f762p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x003e
        L_0x0019:
            androidx.appcompat.view.menu.f r1 = r7.f760n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            android.content.Intent r3 = r7.f754g
            if (r3 == 0) goto L_0x0034
            android.content.Context r1 = r1.f722a     // Catch:{ ActivityNotFoundException -> 0x002c }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002c }
            goto L_0x003e
        L_0x002c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0034:
            d2.b r1 = r7.A
            if (r1 == 0) goto L_0x0040
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0040
        L_0x003e:
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            d2.b r3 = r7.A
            if (r3 == 0) goto L_0x004d
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004d
            r4 = r2
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0060
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00cb
            r6.c(r2)
            goto L_0x00cb
        L_0x0060:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0071
            if (r4 == 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00cb
            r6.c(r2)
            goto L_0x00cb
        L_0x0071:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0078
            r6.c(r0)
        L_0x0078:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008c
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f722a
            r9.<init>(r5, r6, r7)
            r7.f761o = r9
            java.lang.CharSequence r5 = r7.f752e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x008c:
            androidx.appcompat.view.menu.m r7 = r7.f761o
            if (r4 == 0) goto L_0x0093
            r3.f(r7)
        L_0x0093:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f741u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x009c
            goto L_0x00c5
        L_0x009c:
            if (r8 == 0) goto L_0x00a2
            boolean r0 = r8.k(r7)
        L_0x00a2:
            java.util.Iterator r8 = r9.iterator()
        L_0x00a6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.j) r4
            if (r4 != 0) goto L_0x00be
            r9.remove(r3)
            goto L_0x00a6
        L_0x00be:
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r4.k(r7)
            goto L_0x00a6
        L_0x00c5:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00cb
            r6.c(r2)
        L_0x00cb:
            return r1
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final void removeGroup(int i8) {
        ArrayList<h> arrayList;
        int size = size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f727f;
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f749b == i8) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || arrayList.get(i11).f749b != i8) {
                    p(true);
                } else {
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        arrayList.remove(i11);
                    }
                    i10 = i12;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i8) {
        ArrayList<h> arrayList;
        int size = size();
        int i10 = 0;
        while (true) {
            arrayList = this.f727f;
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10).f748a == i8) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i8 = 0; i8 < size; i8++) {
                MenuItem item = getItem(i8);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).s(bundle);
                }
            }
            int i10 = bundle.getInt("android:menu:expandedactionview");
            if (i10 > 0 && (findItem = findItem(i10)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i8, boolean z10, boolean z11) {
        ArrayList<h> arrayList = this.f727f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f749b == i8) {
                hVar.f(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f743w = z10;
    }

    public final void setGroupEnabled(int i8, boolean z10) {
        ArrayList<h> arrayList = this.f727f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f749b == i8) {
                hVar.setEnabled(z10);
            }
        }
    }

    public final void setGroupVisible(int i8, boolean z10) {
        ArrayList<h> arrayList = this.f727f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f749b == i8) {
                int i11 = hVar.f770x;
                int i12 = (i11 & -9) | (z10 ? 0 : 8);
                hVar.f770x = i12;
                if (i11 != i12) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f724c = z10;
        p(false);
    }

    public final int size() {
        return this.f727f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        int id2 = jVar.getId();
                        if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            jVar.i(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable l10;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f741u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (l10 = jVar.l()) != null) {
                        sparseArray.put(id2, l10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final void w(int i8, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f735o = view;
            this.m = null;
            this.f734n = null;
        } else {
            if (i8 > 0) {
                this.m = this.f723b.getText(i8);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i10 > 0) {
                Object obj = t1.a.f15323a;
                this.f734n = a.c.b(this.f722a, i10);
            } else if (drawable != null) {
                this.f734n = drawable;
            }
            this.f735o = null;
        }
        p(false);
    }

    public final void x() {
        this.f736p = false;
        if (this.f737q) {
            this.f737q = false;
            p(this.f738r);
        }
    }

    public final void y() {
        if (!this.f736p) {
            this.f736p = true;
            this.f737q = false;
            this.f738r = false;
        }
    }

    public final MenuItem add(int i8) {
        return a(0, 0, 0, this.f723b.getString(i8));
    }

    public final SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f723b.getString(i8));
    }

    public final MenuItem add(int i8, int i10, int i11, CharSequence charSequence) {
        return a(i8, i10, i11, charSequence);
    }

    public SubMenu addSubMenu(int i8, int i10, int i11, CharSequence charSequence) {
        h a10 = a(i8, i10, i11, charSequence);
        m mVar = new m(this.f722a, this, a10);
        a10.f761o = mVar;
        mVar.setHeaderTitle(a10.f752e);
        return mVar;
    }

    public final MenuItem add(int i8, int i10, int i11, int i12) {
        return a(i8, i10, i11, this.f723b.getString(i12));
    }

    public final SubMenu addSubMenu(int i8, int i10, int i11, int i12) {
        return addSubMenu(i8, i10, i11, (CharSequence) this.f723b.getString(i12));
    }
}
