package r4;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p4.f;

public final class s extends Exception {
    public static final StackTraceElement[] B = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f13984a;

    /* renamed from: b  reason: collision with root package name */
    public f f13985b;

    /* renamed from: c  reason: collision with root package name */
    public p4.a f13986c;

    /* renamed from: d  reason: collision with root package name */
    public Class<?> f13987d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13988e;

    public s(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof s) {
            for (Throwable a10 : ((s) th).f13984a) {
                a(a10, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            aVar.append((CharSequence) "Cause (");
            int i10 = i8 + 1;
            aVar.append((CharSequence) String.valueOf(i10));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i8);
            if (th instanceof s) {
                ((s) th).f(aVar);
            } else {
                d(th, aVar);
            }
            i8 = i10;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i8 + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i8));
            i8 = i10;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f13984a, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f13988e);
        String str3 = "";
        if (this.f13987d != null) {
            str = ", " + this.f13987d;
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f13986c != null) {
            str2 = ", " + this.f13986c;
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f13985b != null) {
            str3 = ", " + this.f13985b;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append(10);
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public s(String str, List<Throwable> list) {
        this.f13988e = str;
        setStackTrace(B);
        this.f13984a = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f13989a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13990b = true;

        public a(Appendable appendable) {
            this.f13989a = appendable;
        }

        public final Appendable append(char c3) {
            boolean z10 = this.f13990b;
            Appendable appendable = this.f13989a;
            boolean z11 = false;
            if (z10) {
                this.f13990b = false;
                appendable.append("  ");
            }
            if (c3 == 10) {
                z11 = true;
            }
            this.f13990b = z11;
            appendable.append(c3);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i8, int i10) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f13990b;
            Appendable appendable = this.f13989a;
            boolean z11 = false;
            if (z10) {
                this.f13990b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == 10) {
                z11 = true;
            }
            this.f13990b = z11;
            appendable.append(charSequence, i8, i10);
            return this;
        }
    }
}
