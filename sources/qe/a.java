package qe;

import androidx.activity.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: t  reason: collision with root package name */
    public static final g f13507t;

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f13508u = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f13509v = Pattern.compile("[- ]");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f13510w = Pattern.compile(" ");

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f13511a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public String f13512b = "";

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f13513c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public final StringBuilder f13514d = new StringBuilder();

    /* renamed from: e  reason: collision with root package name */
    public boolean f13515e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13516f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13517g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13518h = false;

    /* renamed from: i  reason: collision with root package name */
    public final e f13519i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13520j;

    /* renamed from: k  reason: collision with root package name */
    public final g f13521k;

    /* renamed from: l  reason: collision with root package name */
    public g f13522l;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final StringBuilder f13523n = new StringBuilder();

    /* renamed from: o  reason: collision with root package name */
    public boolean f13524o = false;

    /* renamed from: p  reason: collision with root package name */
    public String f13525p = "";

    /* renamed from: q  reason: collision with root package name */
    public final StringBuilder f13526q = new StringBuilder();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f13527r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final re.a f13528s = new re.a(64);

    static {
        g gVar = new g();
        gVar.f13583g0 = "NA";
        f13507t = gVar;
    }

    public a(e eVar, String str) {
        this.f13519i = eVar;
        this.f13520j = str;
        g h3 = h(str);
        this.f13522l = h3;
        this.f13521k = h3;
    }

    public final String a(String str) {
        StringBuilder sb2 = this.f13523n;
        int length = sb2.length();
        if (!this.f13524o || length <= 0 || sb2.charAt(length - 1) == ' ') {
            return sb2 + str;
        }
        return new String(sb2) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb2 = this.f13526q;
        if (sb2.length() < 3) {
            return a(sb2.toString());
        }
        String sb3 = sb2.toString();
        for (f fVar : (!(this.f13517g && this.f13525p.length() == 0) || this.f13522l.f13596t0.size() <= 0) ? this.f13522l.f13595s0 : this.f13522l.f13596t0) {
            if (this.f13525p.length() > 0) {
                String str = fVar.f13571e;
                if ((str.length() == 0 || e.f13554z.matcher(str).matches()) && !fVar.B && !fVar.C) {
                }
            }
            if (this.f13525p.length() == 0 && !this.f13517g) {
                String str2 = fVar.f13571e;
                if (!(str2.length() == 0 || e.f13554z.matcher(str2).matches()) && !fVar.B) {
                }
            }
            if (f13508u.matcher(fVar.f13568b).matches()) {
                this.f13527r.add(fVar);
            }
        }
        m(sb3);
        String f10 = f();
        return f10.length() > 0 ? f10 : l() ? i() : this.f13513c.toString();
    }

    public final String c() {
        this.f13515e = true;
        this.f13518h = false;
        this.f13527r.clear();
        this.m = 0;
        this.f13511a.setLength(0);
        this.f13512b = "";
        return b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = new java.lang.StringBuilder();
        r3 = r5.f13519i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = r5.f13526q
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            qe.e r3 = r5.f13519i
            int r4 = r3.b(r0, r1)
            if (r4 != 0) goto L_0x0018
            return r2
        L_0x0018:
            r0.setLength(r2)
            r0.append(r1)
            java.lang.String r0 = r3.k(r4)
            java.lang.String r1 = "001"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0031
            qe.g r0 = r3.e(r4)
            r5.f13522l = r0
            goto L_0x003f
        L_0x0031:
            java.lang.String r1 = r5.f13520j
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x003f
            qe.g r0 = r5.h(r0)
            r5.f13522l = r0
        L_0x003f:
            java.lang.String r0 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r1 = r5.f13523n
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r5.f13525p = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.a.d():boolean");
    }

    public final boolean e() {
        Pattern a10 = this.f13528s.a("\\+|" + this.f13522l.f13583g0);
        StringBuilder sb2 = this.f13514d;
        Matcher matcher = a10.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f13517g = true;
        int end = matcher.end();
        StringBuilder sb3 = this.f13526q;
        sb3.setLength(0);
        sb3.append(sb2.substring(end));
        StringBuilder sb4 = this.f13523n;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, end));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    public final String f() {
        Iterator it = this.f13527r.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Matcher matcher = this.f13528s.a(fVar.f13567a).matcher(this.f13526q);
            if (matcher.matches()) {
                this.f13524o = f13509v.matcher(fVar.f13571e).find();
                String a10 = a(matcher.replaceAll(fVar.f13568b));
                if (e.s(a10, e.f13541l).contentEquals(this.f13514d)) {
                    return a10;
                }
            }
        }
        return "";
    }

    public final void g() {
        this.f13513c.setLength(0);
        this.f13514d.setLength(0);
        this.f13511a.setLength(0);
        this.m = 0;
        this.f13512b = "";
        this.f13523n.setLength(0);
        this.f13525p = "";
        this.f13526q.setLength(0);
        this.f13515e = true;
        this.f13516f = false;
        this.f13517g = false;
        this.f13518h = false;
        this.f13527r.clear();
        this.f13524o = false;
        if (!this.f13522l.equals(this.f13521k)) {
            this.f13522l = h(this.f13520j);
        }
    }

    public final g h(String str) {
        int i8;
        e eVar = this.f13519i;
        if (!eVar.n(str)) {
            Level level = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            e.f13537h.log(level, g.a(sb2, str, ") provided."));
            i8 = 0;
        } else {
            i8 = eVar.d(str);
        }
        g f10 = eVar.f(eVar.k(i8));
        return f10 != null ? f10 : f13507t;
    }

    public final String i() {
        StringBuilder sb2 = this.f13526q;
        int length = sb2.length();
        if (length <= 0) {
            return this.f13523n.toString();
        }
        String str = "";
        for (int i8 = 0; i8 < length; i8++) {
            str = k(sb2.charAt(i8));
        }
        return this.f13515e ? a(str) : this.f13513c.toString();
    }

    public final String j(char c3) {
        StringBuilder sb2 = this.f13513c;
        sb2.append(c3);
        boolean z10 = Character.isDigit(c3) || (sb2.length() == 1 && e.f13544p.matcher(Character.toString(c3)).matches());
        StringBuilder sb3 = this.f13514d;
        StringBuilder sb4 = this.f13526q;
        if (!z10) {
            this.f13515e = false;
            this.f13516f = true;
        } else if (c3 == '+') {
            sb3.append(c3);
        } else {
            c3 = Character.forDigit(Character.digit(c3, 10), 10);
            sb3.append(c3);
            sb4.append(c3);
        }
        boolean z11 = this.f13515e;
        StringBuilder sb5 = this.f13523n;
        if (z11) {
            int length = sb3.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb2.toString();
            }
            if (length == 3) {
                if (e()) {
                    this.f13518h = true;
                } else {
                    this.f13525p = n();
                    return b();
                }
            }
            if (this.f13518h) {
                if (d()) {
                    this.f13518h = false;
                }
                return sb5 + sb4.toString();
            } else if (this.f13527r.size() <= 0) {
                return b();
            } else {
                String k10 = k(c3);
                String f10 = f();
                if (f10.length() > 0) {
                    return f10;
                }
                m(sb4.toString());
                return l() ? i() : this.f13515e ? a(k10) : sb2.toString();
            }
        } else if (this.f13516f) {
            return sb2.toString();
        } else {
            if (!e()) {
                if (this.f13525p.length() > 0) {
                    sb4.insert(0, this.f13525p);
                    sb5.setLength(sb5.lastIndexOf(this.f13525p));
                }
                if (!this.f13525p.equals(n())) {
                    sb5.append(' ');
                    return c();
                }
            } else if (d()) {
                return c();
            }
            return sb2.toString();
        }
    }

    public final String k(char c3) {
        Pattern pattern = f13510w;
        StringBuilder sb2 = this.f13511a;
        Matcher matcher = pattern.matcher(sb2);
        if (matcher.find(this.m)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c3));
            sb2.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.m = start;
            return sb2.substring(0, start + 1);
        }
        if (this.f13527r.size() == 1) {
            this.f13515e = false;
        }
        this.f13512b = "";
        return this.f13513c.toString();
    }

    public final boolean l() {
        boolean z10;
        Iterator it = this.f13527r.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            String str = fVar.f13567a;
            if (this.f13512b.equals(str)) {
                return false;
            }
            String str2 = fVar.f13567a;
            StringBuilder sb2 = this.f13511a;
            sb2.setLength(0);
            String str3 = fVar.f13568b;
            Matcher matcher = this.f13528s.a(str2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.f13526q.length() ? "" : group.replaceAll(str2, str3).replaceAll("9", " ");
            if (replaceAll.length() > 0) {
                sb2.append(replaceAll);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f13512b = str;
                this.f13524o = f13509v.matcher(fVar.f13571e).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.f13515e = false;
        return false;
    }

    public final void m(String str) {
        int length = str.length() - 3;
        Iterator it = this.f13527r.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.f13569c.size() != 0) {
                ArrayList arrayList = fVar.f13569c;
                if (!this.f13528s.a((String) arrayList.get(Math.min(length, arrayList.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String n() {
        int i8 = this.f13522l.f13582f0;
        int i10 = 1;
        StringBuilder sb2 = this.f13526q;
        boolean z10 = i8 == 1 && sb2.charAt(0) == '1' && sb2.charAt(1) != '0' && sb2.charAt(1) != '1';
        StringBuilder sb3 = this.f13523n;
        if (z10) {
            sb3.append('1');
            sb3.append(' ');
            this.f13517g = true;
        } else {
            g gVar = this.f13522l;
            if (gVar.f13590n0) {
                Matcher matcher = this.f13528s.a(gVar.f13591o0).matcher(sb2);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f13517g = true;
                    i10 = matcher.end();
                    sb3.append(sb2.substring(0, i10));
                }
            }
            i10 = 0;
        }
        String substring = sb2.substring(0, i10);
        sb2.delete(0, i10);
        return substring;
    }
}
