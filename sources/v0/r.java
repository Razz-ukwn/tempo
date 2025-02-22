package v0;

import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.List;
import rf.p;
import sf.j;
import sf.k;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final w<List<String>> f16079a = new w<>("ContentDescription", a.f16102a);

    /* renamed from: b  reason: collision with root package name */
    public static final w<String> f16080b;

    /* renamed from: c  reason: collision with root package name */
    public static final w<f> f16081c;

    /* renamed from: d  reason: collision with root package name */
    public static final w<String> f16082d = new w<>("PaneTitle", e.f16106a);

    /* renamed from: e  reason: collision with root package name */
    public static final w<m> f16083e;

    /* renamed from: f  reason: collision with root package name */
    public static final w<b> f16084f;

    /* renamed from: g  reason: collision with root package name */
    public static final w<c> f16085g;

    /* renamed from: h  reason: collision with root package name */
    public static final w<m> f16086h;

    /* renamed from: i  reason: collision with root package name */
    public static final w<m> f16087i;

    /* renamed from: j  reason: collision with root package name */
    public static final w<e> f16088j;

    /* renamed from: k  reason: collision with root package name */
    public static final w<Boolean> f16089k;

    /* renamed from: l  reason: collision with root package name */
    public static final w<Boolean> f16090l;
    public static final w<m> m = new w<>("InvisibleToUser", b.f16103a);

    /* renamed from: n  reason: collision with root package name */
    public static final w<h> f16091n;

    /* renamed from: o  reason: collision with root package name */
    public static final w<h> f16092o;

    /* renamed from: p  reason: collision with root package name */
    public static final w<g> f16093p = new w<>("Role", f.f16107a);

    /* renamed from: q  reason: collision with root package name */
    public static final w<String> f16094q = new w<>("TestTag", g.f16108a);

    /* renamed from: r  reason: collision with root package name */
    public static final w<List<x0.a>> f16095r = new w<>("Text", h.f16109a);

    /* renamed from: s  reason: collision with root package name */
    public static final w<x0.a> f16096s;

    /* renamed from: t  reason: collision with root package name */
    public static final w<x0.h> f16097t;

    /* renamed from: u  reason: collision with root package name */
    public static final w<Boolean> f16098u;

    /* renamed from: v  reason: collision with root package name */
    public static final w<w0.a> f16099v;

    /* renamed from: w  reason: collision with root package name */
    public static final w<m> f16100w;

    /* renamed from: x  reason: collision with root package name */
    public static final w<String> f16101x;

    public static final class a extends k implements p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16102a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            j.f(list2, "childValue");
            if (list == null) {
                return list2;
            }
            ArrayList P0 = q.P0(list);
            P0.addAll(list2);
            return P0;
        }
    }

    public static final class b extends k implements p<m, m, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16103a = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = (m) obj;
            j.f((m) obj2, "<anonymous parameter 1>");
            return mVar;
        }
    }

    public static final class c extends k implements p<m, m, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16104a = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = (m) obj;
            j.f((m) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class d extends k implements p<m, m, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16105a = new d();

        public d() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = (m) obj;
            j.f((m) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class e extends k implements p<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16106a = new e();

        public e() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            j.f((String) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    public static final class f extends k implements p<g, g, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f16107a = new f();

        public f() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            g gVar = (g) obj;
            int i8 = ((g) obj2).f16042a;
            return gVar;
        }
    }

    public static final class g extends k implements p<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f16108a = new g();

        public g() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            j.f((String) obj2, "<anonymous parameter 1>");
            return str;
        }
    }

    public static final class h extends k implements p<List<? extends x0.a>, List<? extends x0.a>, List<? extends x0.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f16109a = new h();

        public h() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            j.f(list2, "childValue");
            if (list == null) {
                return list2;
            }
            ArrayList P0 = q.P0(list);
            P0.addAll(list2);
            return P0;
        }
    }

    static {
        v vVar = v.f16114a;
        f16080b = new w<>("StateDescription", vVar);
        f16081c = new w<>("ProgressBarRangeInfo", vVar);
        f16083e = new w<>("SelectableGroup", vVar);
        f16084f = new w<>("CollectionInfo", vVar);
        f16085g = new w<>("CollectionItemInfo", vVar);
        f16086h = new w<>("Heading", vVar);
        f16087i = new w<>("Disabled", vVar);
        f16088j = new w<>("LiveRegion", vVar);
        f16089k = new w<>("Focused", vVar);
        f16090l = new w<>("IsContainer", vVar);
        f16091n = new w<>("HorizontalScrollAxisRange", vVar);
        f16092o = new w<>("VerticalScrollAxisRange", vVar);
        j.f(d.f16105a, "mergePolicy");
        j.f(c.f16104a, "mergePolicy");
        f16096s = new w<>("EditableText", vVar);
        f16097t = new w<>("TextSelectionRange", vVar);
        j.f(vVar, "mergePolicy");
        f16098u = new w<>("Selected", vVar);
        f16099v = new w<>("ToggleableState", vVar);
        f16100w = new w<>("Password", vVar);
        f16101x = new w<>("Error", vVar);
    }
}
