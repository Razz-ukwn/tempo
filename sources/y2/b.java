package y2;

import android.os.Bundle;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import o.g;
import r6.f;
import r6.u;
import y2.a;
import z2.a;
import z2.b;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final p f17123a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17124b;

    public static class a<D> extends v<D> implements b.a<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f17125l = 0;
        public final Bundle m = null;

        /* renamed from: n  reason: collision with root package name */
        public final z2.b<D> f17126n;

        /* renamed from: o  reason: collision with root package name */
        public p f17127o;

        /* renamed from: p  reason: collision with root package name */
        public C0320b<D> f17128p;

        /* renamed from: q  reason: collision with root package name */
        public z2.b<D> f17129q;

        public a(f fVar) {
            this.f17126n = fVar;
            this.f17129q = null;
            if (fVar.f17669b == null) {
                fVar.f17669b = this;
                fVar.f17668a = 0;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        public final void g() {
            z2.b<D> bVar = this.f17126n;
            bVar.f17670c = true;
            bVar.f17672e = false;
            bVar.f17671d = false;
            f fVar = (f) bVar;
            fVar.f14077j.drainPermits();
            fVar.a();
            fVar.f17666h = new a.C0329a();
            fVar.b();
        }

        public final void h() {
            this.f17126n.f17670c = false;
        }

        public final void j(w<? super D> wVar) {
            super.j(wVar);
            this.f17127o = null;
            this.f17128p = null;
        }

        public final void k(D d10) {
            super.k(d10);
            z2.b<D> bVar = this.f17129q;
            if (bVar != null) {
                bVar.f17672e = true;
                bVar.f17670c = false;
                bVar.f17671d = false;
                bVar.f17673f = false;
                this.f17129q = null;
            }
        }

        public final void l() {
            p pVar = this.f17127o;
            C0320b<D> bVar = this.f17128p;
            if (pVar != null && bVar != null) {
                super.j(bVar);
                e(pVar, bVar);
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f17125l);
            sb2.append(" : ");
            cb.b.p(this.f17126n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: y2.b$b  reason: collision with other inner class name */
    public static class C0320b<D> implements w<D> {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0319a<D> f17130a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17131b = false;

        public C0320b(z2.b bVar, u uVar) {
            this.f17130a = uVar;
        }

        public final void b(D d10) {
            u uVar = (u) this.f17130a;
            uVar.getClass();
            Void voidR = (Void) d10;
            SignInHubActivity signInHubActivity = uVar.f14085a;
            signInHubActivity.setResult(signInHubActivity.X, signInHubActivity.Y);
            signInHubActivity.finish();
            this.f17131b = true;
        }

        public final String toString() {
            return this.f17130a.toString();
        }
    }

    public static class c extends j0 {

        /* renamed from: f  reason: collision with root package name */
        public static final a f17132f = new a();

        /* renamed from: d  reason: collision with root package name */
        public final g<a> f17133d = new g<>();

        /* renamed from: e  reason: collision with root package name */
        public boolean f17134e = false;

        public static class a implements m0.b {
            public final <T extends j0> T a(Class<T> cls) {
                return new c();
            }
        }

        public final void c() {
            g<a> gVar = this.f17133d;
            int j10 = gVar.j();
            int i8 = 0;
            while (i8 < j10) {
                a k10 = gVar.k(i8);
                z2.b<D> bVar = k10.f17126n;
                bVar.a();
                bVar.f17671d = true;
                C0320b<D> bVar2 = k10.f17128p;
                if (bVar2 != null) {
                    k10.j(bVar2);
                    if (bVar2.f17131b) {
                        bVar2.f17130a.getClass();
                    }
                }
                b.a<D> aVar = bVar.f17669b;
                if (aVar == null) {
                    throw new IllegalStateException("No listener register");
                } else if (aVar == k10) {
                    bVar.f17669b = null;
                    bVar.f17672e = true;
                    bVar.f17670c = false;
                    bVar.f17671d = false;
                    bVar.f17673f = false;
                    i8++;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            }
            int i10 = gVar.f12037d;
            Object[] objArr = gVar.f12036c;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = null;
            }
            gVar.f12037d = 0;
            gVar.f12034a = false;
        }
    }

    public b(p pVar, o0 o0Var) {
        this.f17123a = pVar;
        this.f17124b = (c) new m0(o0Var, (m0.b) c.f17132f).a(c.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f17124b;
        if (cVar.f17133d.j() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i8 = 0; i8 < cVar.f17133d.j(); i8++) {
                a k10 = cVar.f17133d.k(i8);
                printWriter.print(str);
                printWriter.print("  #");
                g<a> gVar = cVar.f17133d;
                if (gVar.f12034a) {
                    gVar.g();
                }
                printWriter.print(gVar.f12035b[i8]);
                printWriter.print(": ");
                printWriter.println(k10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(k10.f17125l);
                printWriter.print(" mArgs=");
                printWriter.println(k10.m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(k10.f17126n);
                z2.b<D> bVar = k10.f17126n;
                String c3 = h4.a.c(str2, "  ");
                z2.a aVar = (z2.a) bVar;
                aVar.getClass();
                printWriter.print(c3);
                printWriter.print("mId=");
                printWriter.print(aVar.f17668a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.f17669b);
                if (aVar.f17670c || aVar.f17673f) {
                    printWriter.print(c3);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.f17670c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f17673f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.f17671d || aVar.f17672e) {
                    printWriter.print(c3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.f17671d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.f17672e);
                }
                if (aVar.f17666h != null) {
                    printWriter.print(c3);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.f17666h);
                    printWriter.print(" waiting=");
                    aVar.f17666h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f17667i != null) {
                    printWriter.print(c3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.f17667i);
                    printWriter.print(" waiting=");
                    aVar.f17667i.getClass();
                    printWriter.println(false);
                }
                if (k10.f17128p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(k10.f17128p);
                    C0320b<D> bVar2 = k10.f17128p;
                    bVar2.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar2.f17131b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                z2.b<D> bVar3 = k10.f17126n;
                Object d10 = k10.d();
                bVar3.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                cb.b.p(d10, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(k10.f2191c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        cb.b.p(this.f17123a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
