package yg;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jg.b0;
import jg.o;
import jg.q;
import jg.r;
import jg.t;
import jg.u;
import jg.x;
import sf.j;
import wg.g;

public final class z {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f17561l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f17562a;

    /* renamed from: b  reason: collision with root package name */
    public final r f17563b;

    /* renamed from: c  reason: collision with root package name */
    public String f17564c;

    /* renamed from: d  reason: collision with root package name */
    public r.a f17565d;

    /* renamed from: e  reason: collision with root package name */
    public final x.a f17566e = new x.a();

    /* renamed from: f  reason: collision with root package name */
    public final q.a f17567f;

    /* renamed from: g  reason: collision with root package name */
    public t f17568g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17569h;

    /* renamed from: i  reason: collision with root package name */
    public final u.a f17570i;

    /* renamed from: j  reason: collision with root package name */
    public final o.a f17571j;

    /* renamed from: k  reason: collision with root package name */
    public b0 f17572k;

    public static class a extends b0 {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f17573a;

        /* renamed from: b  reason: collision with root package name */
        public final t f17574b;

        public a(b0 b0Var, t tVar) {
            this.f17573a = b0Var;
            this.f17574b = tVar;
        }

        public final long a() {
            return this.f17573a.a();
        }

        public final t b() {
            return this.f17574b;
        }

        public final void c(g gVar) {
            this.f17573a.c(gVar);
        }
    }

    public z(String str, r rVar, String str2, q qVar, t tVar, boolean z10, boolean z11, boolean z12) {
        this.f17562a = str;
        this.f17563b = rVar;
        this.f17564c = str2;
        this.f17568g = tVar;
        this.f17569h = z10;
        if (qVar != null) {
            this.f17567f = qVar.d();
        } else {
            this.f17567f = new q.a();
        }
        if (z11) {
            this.f17571j = new o.a();
        } else if (z12) {
            u.a aVar = new u.a();
            this.f17570i = aVar;
            aVar.c(u.f10177f);
        }
    }

    public final void a(String str, String str2, boolean z10) {
        String str3 = str;
        o.a aVar = this.f17571j;
        if (z10) {
            aVar.getClass();
            j.f(str3, "name");
            aVar.f10142b.add(r.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f10141a, 83));
            aVar.f10143c.add(r.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f10141a, 83));
            return;
        }
        aVar.getClass();
        j.f(str3, "name");
        aVar.f10142b.add(r.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f10141a, 91));
        aVar.f10143c.add(r.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f10141a, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = t.f10171d;
                this.f17568g = t.a.a(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(j0.t.a("Malformed content type: ", str2), e10);
            }
        } else {
            this.f17567f.a(str, str2);
        }
    }

    public final void c(String str, String str2, boolean z10) {
        r.a aVar;
        String str3 = this.f17564c;
        String str4 = null;
        if (str3 != null) {
            r rVar = this.f17563b;
            rVar.getClass();
            try {
                aVar = new r.a();
                aVar.d(rVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f17565d = aVar;
            if (aVar != null) {
                this.f17564c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + rVar + ", Relative: " + this.f17564c);
            }
        }
        if (z10) {
            r.a aVar2 = this.f17565d;
            aVar2.getClass();
            j.f(str, "encodedName");
            if (aVar2.f10169g == null) {
                aVar2.f10169g = new ArrayList();
            }
            List<String> list = aVar2.f10169g;
            j.c(list);
            list.add(r.b.a(str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            List<String> list2 = aVar2.f10169g;
            j.c(list2);
            if (str2 != null) {
                str4 = r.b.a(str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            list2.add(str4);
            return;
        }
        r.a aVar3 = this.f17565d;
        aVar3.getClass();
        j.f(str, "name");
        if (aVar3.f10169g == null) {
            aVar3.f10169g = new ArrayList();
        }
        List<String> list3 = aVar3.f10169g;
        j.c(list3);
        list3.add(r.b.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
        List<String> list4 = aVar3.f10169g;
        j.c(list4);
        if (str2 != null) {
            str4 = r.b.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219);
        }
        list4.add(str4);
    }
}
