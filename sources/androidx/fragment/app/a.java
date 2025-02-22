package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.q0;
import androidx.lifecycle.j;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import u2.c;

public final class a extends q0 implements i0.m {

    /* renamed from: q  reason: collision with root package name */
    public final i0 f1897q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1898r;

    /* renamed from: s  reason: collision with root package name */
    public int f1899s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1900t;

    public a(i0 i0Var) {
        i0Var.G();
        c0<?> c0Var = i0Var.f1985u;
        if (c0Var != null) {
            c0Var.f1915c.getClassLoader();
        }
        this.f1899s = -1;
        this.f1900t = false;
        this.f1897q = i0Var;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (i0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2112g) {
            return true;
        }
        i0 i0Var = this.f1897q;
        if (i0Var.f1969d == null) {
            i0Var.f1969d = new ArrayList<>();
        }
        i0Var.f1969d.add(this);
        return true;
    }

    public final void d(int i8, p pVar, String str, int i10) {
        String str2 = pVar.f2073j0;
        if (str2 != null) {
            c.d(pVar, str2);
        }
        Class<?> cls = pVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = pVar.V;
            if (str3 == null || str.equals(str3)) {
                pVar.V = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + pVar + ": was " + pVar.V + " now " + str);
            }
        }
        if (i8 != 0) {
            if (i8 != -1) {
                int i11 = pVar.T;
                if (i11 == 0 || i11 == i8) {
                    pVar.T = i8;
                    pVar.U = i8;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + pVar + ": was " + pVar.T + " now " + i8);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + pVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new q0.a(i10, pVar));
        pVar.P = this.f1897q;
    }

    public final void f(int i8) {
        if (this.f2112g) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i8);
            }
            ArrayList<q0.a> arrayList = this.f2106a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q0.a aVar = arrayList.get(i10);
                p pVar = aVar.f2122b;
                if (pVar != null) {
                    pVar.O += i8;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2122b + " to " + aVar.f2122b.O);
                    }
                }
            }
        }
    }

    public final int g() {
        return i(false);
    }

    public final int h() {
        return i(true);
    }

    public final int i(boolean z10) {
        if (!this.f1898r) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new a1());
                k("  ", printWriter, true);
                printWriter.close();
            }
            this.f1898r = true;
            boolean z11 = this.f2112g;
            i0 i0Var = this.f1897q;
            if (z11) {
                this.f1899s = i0Var.f1974i.getAndIncrement();
            } else {
                this.f1899s = -1;
            }
            i0Var.v(this, z10);
            return this.f1899s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void j() {
        if (!this.f2112g) {
            this.f2113h = false;
            this.f1897q.y(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2114i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1899s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1898r);
            if (this.f2111f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2111f));
            }
            if (!(this.f2107b == 0 && this.f2108c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2107b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2108c));
            }
            if (!(this.f2109d == 0 && this.f2110e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2109d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2110e));
            }
            if (!(this.f2115j == 0 && this.f2116k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2115j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2116k);
            }
            if (!(this.f2117l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2117l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList<q0.a> arrayList = this.f2106a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                q0.a aVar = arrayList.get(i8);
                switch (aVar.f2121a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2121a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2122b);
                if (z10) {
                    if (!(aVar.f2124d == 0 && aVar.f2125e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2124d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2125e));
                    }
                    if (aVar.f2126f != 0 || aVar.f2127g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2126f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2127g));
                    }
                }
            }
        }
    }

    public final a l(p pVar) {
        i0 i0Var = pVar.P;
        if (i0Var == null || i0Var == this.f1897q) {
            b(new q0.a(3, pVar));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + pVar.toString() + " is already attached to a FragmentManager.");
    }

    public final a m(p pVar, j.b bVar) {
        i0 i0Var = pVar.P;
        i0 i0Var2 = this.f1897q;
        if (i0Var != i0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + i0Var2);
        } else if (bVar == j.b.f2278b && pVar.f2059a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != j.b.f2277a) {
            b(new q0.a(pVar, bVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final a n(p pVar) {
        i0 i0Var;
        if (pVar == null || (i0Var = pVar.P) == null || i0Var == this.f1897q) {
            b(new q0.a(8, pVar));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + pVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1899s >= 0) {
            sb2.append(" #");
            sb2.append(this.f1899s);
        }
        if (this.f2114i != null) {
            sb2.append(" ");
            sb2.append(this.f2114i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public a(a aVar) {
        aVar.f1897q.G();
        c0<?> c0Var = aVar.f1897q.f1985u;
        if (c0Var != null) {
            c0Var.f1915c.getClassLoader();
        }
        Iterator<q0.a> it = aVar.f2106a.iterator();
        while (it.hasNext()) {
            this.f2106a.add(new q0.a(it.next()));
        }
        this.f2107b = aVar.f2107b;
        this.f2108c = aVar.f2108c;
        this.f2109d = aVar.f2109d;
        this.f2110e = aVar.f2110e;
        this.f2111f = aVar.f2111f;
        this.f2112g = aVar.f2112g;
        this.f2113h = aVar.f2113h;
        this.f2114i = aVar.f2114i;
        this.f2117l = aVar.f2117l;
        this.m = aVar.m;
        this.f2115j = aVar.f2115j;
        this.f2116k = aVar.f2116k;
        if (aVar.f2118n != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f2118n = arrayList;
            arrayList.addAll(aVar.f2118n);
        }
        if (aVar.f2119o != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f2119o = arrayList2;
            arrayList2.addAll(aVar.f2119o);
        }
        this.f2120p = aVar.f2120p;
        this.f1899s = -1;
        this.f1900t = false;
        this.f1897q = aVar.f1897q;
        this.f1898r = aVar.f1898r;
        this.f1899s = aVar.f1899s;
        this.f1900t = aVar.f1900t;
    }
}
