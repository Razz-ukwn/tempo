package b3;

import android.net.Uri;
import android.os.Bundle;
import androidx.activity.g;
import ff.j;
import gf.q;
import gf.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sf.k;
import zf.n;

public final class u {
    @Deprecated
    public static final Pattern m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final String f3174a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3175b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3176c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f3177d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f3178e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final String f3179f;

    /* renamed from: g  reason: collision with root package name */
    public final j f3180g = b7.a.x(new c(this));

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3181h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3182i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3183j;

    /* renamed from: k  reason: collision with root package name */
    public final j f3184k = b7.a.x(new b(this));

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3185l;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f3186a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f3187b = new ArrayList();
    }

    public static final class b extends k implements rf.a<Pattern> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f3188a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar) {
            super(0);
            this.f3188a = uVar;
        }

        public final Object d() {
            String str = this.f3188a.f3183j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    public static final class c extends k implements rf.a<Pattern> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f3189a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(u uVar) {
            super(0);
            this.f3189a = uVar;
        }

        public final Object d() {
            String str = this.f3189a.f3179f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public u(String str, String str2, String str3) {
        int i8;
        List list;
        boolean z10;
        this.f3174a = str;
        this.f3175b = str2;
        this.f3176c = str3;
        boolean z11 = true;
        int i10 = 0;
        if (str != null) {
            Uri parse = Uri.parse(str);
            boolean z12 = parse.getQuery() != null;
            this.f3181h = z12;
            StringBuilder sb2 = new StringBuilder("^");
            if (!m.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (z12) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    sf.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sf.j.e(compile, "fillInPattern");
                    this.f3185l = a(substring, sb2, compile);
                }
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        this.f3182i = z11;
                        queryParameter = next;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    a aVar = new a();
                    while (matcher2.find()) {
                        String group = matcher2.group(z11 ? 1 : 0);
                        if (group != null) {
                            aVar.f3187b.add(group);
                            sf.j.e(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i10, matcher2.start());
                            sf.j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(substring2));
                            sb3.append("(.+?)?");
                            i10 = matcher2.end();
                            z11 = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i10 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i10);
                        sf.j.e(substring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(substring3));
                    }
                    String sb4 = sb3.toString();
                    sf.j.e(sb4, "argRegex.toString()");
                    aVar.f3186a = zf.j.v0(sb4, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f3178e;
                    sf.j.e(next, "paramName");
                    linkedHashMap.put(next, aVar);
                    z11 = true;
                    i10 = 0;
                }
            } else {
                sf.j.e(compile, "fillInPattern");
                this.f3185l = a(str, sb2, compile);
            }
            String sb5 = sb2.toString();
            sf.j.e(sb5, "uriRegex.toString()");
            this.f3179f = zf.j.v0(sb5, ".*", "\\E.*\\Q");
        }
        if (this.f3176c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f3176c).matches()) {
            String str4 = this.f3176c;
            sf.j.f(str4, "mimeType");
            List a10 = new zf.c("/").a(str4);
            if (!a10.isEmpty()) {
                ListIterator listIterator = a10.listIterator(a10.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        i8 = 1;
                        list = q.K0(a10, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                this.f3183j = zf.j.v0("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(i8)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            i8 = 1;
            list = s.f8978a;
            this.f3183j = zf.j.v0("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(i8)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(g.a(new StringBuilder("The given mimeType "), this.f3176c, " does not match to required \"type/subtype\" format").toString());
    }

    public static void b(Bundle bundle, String str, String str2, i iVar) {
        if (iVar != null) {
            h0<Object> h0Var = iVar.f3079a;
            h0Var.getClass();
            sf.j.f(str, "key");
            h0Var.d(bundle, str, h0Var.c(str2));
            return;
        }
        bundle.putString(str, str2);
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !n.A0(str, ".*");
        int i8 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f3177d.add(group);
                String substring = str.substring(i8, matcher.start());
                sf.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
                sb2.append("([^/]+?)");
                i8 = matcher.end();
                z10 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i8 < str.length()) {
            String substring2 = str.substring(i8);
            sf.j.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return sf.j.a(this.f3174a, uVar.f3174a) && sf.j.a(this.f3175b, uVar.f3175b) && sf.j.a(this.f3176c, uVar.f3176c);
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f3174a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f3175b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3176c;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return hashCode2 + i8;
    }
}
