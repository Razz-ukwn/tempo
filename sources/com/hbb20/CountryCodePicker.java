package com.hbb20;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import qe.e;
import t1.a;

public class CountryCodePicker extends RelativeLayout {

    /* renamed from: b1  reason: collision with root package name */
    public static final /* synthetic */ int f6353b1 = 0;
    public String A0;
    public View B;
    public String B0;
    public LayoutInflater C;
    public g C0;
    public TextView D;
    public g D0;
    public EditText E;
    public boolean E0;
    public RelativeLayout F;
    public boolean F0;
    public ImageView G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public LinearLayout I;
    public boolean I0;
    public LinearLayout J;
    public boolean J0;
    public a K;
    public String K0;
    public a L;
    public f L0;
    public RelativeLayout M;
    public ib.h M0;
    public CountryCodePicker N;
    public TextWatcher N0;
    public k O;
    public boolean O0;
    public String P = "";
    public String P0;
    public c Q = c.f6389b;
    public int Q0;
    public qe.e R;
    public boolean R0;
    public boolean S = true;
    public int S0;
    public boolean T = true;
    public int T0;
    public boolean U = true;
    public int U0;
    public boolean V = true;
    public int V0;
    public boolean W = true;
    public int W0;
    public int X0;
    public float Y0;
    public b Z0;

    /* renamed from: a  reason: collision with root package name */
    public ib.a f6354a = new q4.a(10);

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6355a0 = false;

    /* renamed from: a1  reason: collision with root package name */
    public final a f6356a1;

    /* renamed from: b  reason: collision with root package name */
    public final String f6357b = "CCP_PREF_FILE";

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6358b0 = true;

    /* renamed from: c  reason: collision with root package name */
    public int f6359c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f6360c0 = true;

    /* renamed from: d  reason: collision with root package name */
    public String f6361d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f6362d0 = true;

    /* renamed from: e  reason: collision with root package name */
    public final Context f6363e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6364e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6365f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f6366g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f6367h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6368i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6369j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6370k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6371l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6372m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6373n0 = false;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6374o0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public i f6375p0 = i.f6397a;

    /* renamed from: q0  reason: collision with root package name */
    public String f6376q0 = "ccp_last_selection";

    /* renamed from: r0  reason: collision with root package name */
    public int f6377r0 = -99;

    /* renamed from: s0  reason: collision with root package name */
    public int f6378s0 = -99;

    /* renamed from: t0  reason: collision with root package name */
    public Typeface f6379t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6380u0;

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList f6381v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f6382w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public String f6383x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6384y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public List<a> f6385z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            int i8 = CountryCodePicker.f6353b1;
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            countryCodePicker.getClass();
            if (!countryCodePicker.F0) {
                return;
            }
            if (countryCodePicker.f6371l0) {
                countryCodePicker.f(countryCodePicker.getSelectedCountryNameCode());
            } else {
                countryCodePicker.f((String) null);
            }
        }
    }

    public class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public String f6387a = null;

        public b() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            r7 = qe.e.r(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                com.hbb20.CountryCodePicker r5 = com.hbb20.CountryCodePicker.this
                com.hbb20.a r6 = r5.getSelectedCountry()
                if (r6 == 0) goto L_0x0075
                java.lang.String r7 = r3.f6387a
                if (r7 == 0) goto L_0x0016
                java.lang.String r0 = r4.toString()
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L_0x0075
            L_0x0016:
                boolean r7 = r5.O0
                if (r7 == 0) goto L_0x0075
                com.hbb20.b r7 = r5.Z0
                if (r7 == 0) goto L_0x006f
                android.widget.EditText r7 = r5.getEditText_registeredCarrierNumber()
                android.text.Editable r7 = r7.getText()
                java.lang.String r7 = r7.toString()
                int r0 = r7.length()
                com.hbb20.b r1 = r5.Z0
                int r1 = r1.f6408b
                if (r0 < r1) goto L_0x006f
                java.lang.String r7 = qe.e.r(r7)
                int r0 = r7.length()
                com.hbb20.b r1 = r5.Z0
                int r1 = r1.f6408b
                if (r0 < r1) goto L_0x006f
                r0 = 0
                java.lang.String r7 = r7.substring(r0, r1)
                java.lang.String r0 = r5.P0
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x006f
                com.hbb20.b r0 = r5.Z0
                android.content.Context r1 = r5.f6363e
                com.hbb20.CountryCodePicker$g r2 = r5.getLanguageToApply()
                com.hbb20.a r0 = r0.a(r1, r2, r7)
                boolean r6 = r0.equals(r6)
                if (r6 != 0) goto L_0x006d
                r6 = 1
                r5.R0 = r6
                int r6 = android.text.Selection.getSelectionEnd(r4)
                r5.Q0 = r6
                r5.setSelectedCountry(r0)
            L_0x006d:
                r5.P0 = r7
            L_0x006f:
                java.lang.String r4 = r4.toString()
                r3.f6387a = r4
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public enum c {
        f6389b("123");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f6391a;

        /* access modifiers changed from: public */
        c(String str) {
            this.f6391a = str;
        }

        public static c a(String str) {
            for (c cVar : values()) {
                if (cVar.f6391a.equals(str)) {
                    return cVar;
                }
            }
            return f6389b;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public interface f {
    }

    public interface h {
    }

    public enum i {
        f6397a;

        /* access modifiers changed from: public */
        i() {
        }
    }

    public interface j {
        void a();
    }

    public enum k {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public final int f6400a;

        /* access modifiers changed from: public */
        k(int i8) {
            this.f6400a = i8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x03e6 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03f7 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0427 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x043b A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0320 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x033f A[ADDED_TO_REGION, Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x035c A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0383 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03c0 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03c5 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03d6 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03e1 A[Catch:{ Exception -> 0x02be, all -> 0x02bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CountryCodePicker(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r12.<init>(r13, r14)
            q4.a r0 = new q4.a
            r1 = 10
            r0.<init>(r1)
            r12.f6354a = r0
            java.lang.String r0 = "CCP_PREF_FILE"
            r12.f6357b = r0
            java.lang.String r0 = ""
            r12.P = r0
            com.hbb20.CountryCodePicker$c r2 = com.hbb20.CountryCodePicker.c.f6389b
            r12.Q = r2
            r2 = 1
            r12.S = r2
            r12.T = r2
            r12.U = r2
            r12.V = r2
            r12.W = r2
            r3 = 0
            r12.f6355a0 = r3
            r12.f6358b0 = r2
            r12.f6360c0 = r2
            r12.f6362d0 = r2
            r12.f6364e0 = r2
            r12.f6365f0 = r2
            r12.f6366g0 = r2
            r12.f6367h0 = r3
            r12.f6368i0 = r3
            r12.f6369j0 = r2
            r12.f6370k0 = r2
            r12.f6371l0 = r3
            r12.f6372m0 = r3
            r12.f6373n0 = r3
            r12.f6374o0 = r2
            com.hbb20.CountryCodePicker$i r4 = com.hbb20.CountryCodePicker.i.f6397a
            r12.f6375p0 = r4
            java.lang.String r4 = "ccp_last_selection"
            r12.f6376q0 = r4
            r4 = -99
            r12.f6377r0 = r4
            r12.f6378s0 = r4
            r12.f6382w0 = r3
            r12.f6384y0 = r3
            com.hbb20.CountryCodePicker$g r5 = com.hbb20.CountryCodePicker.g.f6392d
            r12.C0 = r5
            r12.D0 = r5
            r12.E0 = r2
            r12.F0 = r2
            r12.G0 = r3
            r12.H0 = r3
            r12.I0 = r2
            r12.J0 = r3
            java.lang.String r5 = "notSet"
            r12.K0 = r5
            r5 = 0
            r12.P0 = r5
            r12.Q0 = r3
            r12.R0 = r3
            r12.S0 = r3
            r12.X0 = r3
            com.hbb20.CountryCodePicker$a r5 = new com.hbb20.CountryCodePicker$a
            r5.<init>()
            r12.f6356a1 = r5
            r12.f6363e = r13
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r13)
            r12.C = r5
            if (r14 == 0) goto L_0x0090
            java.lang.String r5 = "http://schemas.android.com/apk/res/android"
            java.lang.String r6 = "layout_width"
            java.lang.String r5 = r14.getAttributeValue(r5, r6)
            r12.K0 = r5
        L_0x0090:
            r12.removeAllViewsInLayout()
            if (r14 == 0) goto L_0x00c9
            java.lang.String r5 = r12.K0
            if (r5 == 0) goto L_0x00c9
            java.lang.String r6 = "-1"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = r12.K0
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = r12.K0
            java.lang.String r6 = "fill_parent"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = r12.K0
            java.lang.String r6 = "match_parent"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00c9
        L_0x00bd:
            android.view.LayoutInflater r5 = r12.C
            r6 = 2131492976(0x7f0c0070, float:1.860942E38)
            android.view.View r5 = r5.inflate(r6, r12, r2)
            r12.B = r5
            goto L_0x00d4
        L_0x00c9:
            android.view.LayoutInflater r5 = r12.C
            r6 = 2131492975(0x7f0c006f, float:1.8609417E38)
            android.view.View r5 = r5.inflate(r6, r12, r2)
            r12.B = r5
        L_0x00d4:
            android.view.View r5 = r12.B
            r6 = 2131297327(0x7f09042f, float:1.8212596E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r12.D = r5
            android.view.View r5 = r12.B
            r6 = 2131296650(0x7f09018a, float:1.8211223E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r12.F = r5
            android.view.View r5 = r12.B
            r6 = 2131296882(0x7f090272, float:1.8211693E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r12.G = r5
            android.view.View r5 = r12.B
            r6 = 2131296883(0x7f090273, float:1.8211695E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r12.H = r5
            android.view.View r5 = r12.B
            r6 = 2131296927(0x7f09029f, float:1.8211784E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r12.J = r5
            android.view.View r5 = r12.B
            r6 = 2131296926(0x7f09029e, float:1.8211782E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r12.I = r5
            android.view.View r5 = r12.B
            r6 = 2131297097(0x7f090349, float:1.821213E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r12.M = r5
            r12.N = r12
            if (r14 == 0) goto L_0x0459
            android.content.res.Resources$Theme r5 = r13.getTheme()
            int[] r6 = cb.c.f3886b
            android.content.res.TypedArray r14 = r5.obtainStyledAttributes(r14, r6, r3, r3)
            r5 = 44
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.T = r5     // Catch:{ Exception -> 0x02be }
            r5 = 23
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.I0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 45
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.U = r5     // Catch:{ Exception -> 0x02be }
            r6 = 15
            boolean r5 = r14.getBoolean(r6, r5)     // Catch:{ Exception -> 0x02be }
            r12.V = r5     // Catch:{ Exception -> 0x02be }
            r5 = 14
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6370k0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 16
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6360c0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 49
            boolean r5 = r14.getBoolean(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6372m0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 48
            boolean r5 = r14.getBoolean(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6373n0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 13
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6362d0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 7
            boolean r5 = r14.getBoolean(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6371l0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 9
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6364e0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 43
            boolean r5 = r14.getBoolean(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6355a0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 12
            boolean r5 = r14.getBoolean(r5, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6358b0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 4
            int r5 = r14.getColor(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6384y0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 6
            int r5 = r14.getColor(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.S0 = r5     // Catch:{ Exception -> 0x02be }
            r5 = 5
            int r6 = r14.getResourceId(r5, r3)     // Catch:{ Exception -> 0x02be }
            r12.X0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 22
            boolean r6 = r14.getBoolean(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.G0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 18
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6369j0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 38
            boolean r6 = r14.getBoolean(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6368i0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 34
            boolean r6 = r14.getBoolean(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.J0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 36
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6374o0 = r6     // Catch:{ Exception -> 0x02be }
            android.content.res.Resources r6 = r13.getResources()     // Catch:{ Exception -> 0x02be }
            r7 = 2131099736(0x7f060058, float:1.7811834E38)
            float r6 = r6.getDimension(r7)     // Catch:{ Exception -> 0x02be }
            r7 = 37
            float r6 = r14.getDimension(r7, r6)     // Catch:{ Exception -> 0x02be }
            int r6 = (int) r6     // Catch:{ Exception -> 0x02be }
            android.widget.RelativeLayout r7 = r12.M     // Catch:{ Exception -> 0x02be }
            r7.setPadding(r6, r6, r6, r6)     // Catch:{ Exception -> 0x02be }
            r6 = 35
            int r6 = r14.getInt(r6, r3)     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$i[] r7 = com.hbb20.CountryCodePicker.i.values()     // Catch:{ Exception -> 0x02be }
            r6 = r7[r6]     // Catch:{ Exception -> 0x02be }
            r12.f6375p0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 40
            java.lang.String r6 = r14.getString(r6)     // Catch:{ Exception -> 0x02be }
            r12.f6376q0 = r6     // Catch:{ Exception -> 0x02be }
            if (r6 != 0) goto L_0x0214
            java.lang.String r6 = "CCP_last_selection"
            r12.f6376q0 = r6     // Catch:{ Exception -> 0x02be }
        L_0x0214:
            r6 = 123(0x7b, float:1.72E-43)
            r7 = 26
            int r6 = r14.getInt(r7, r6)     // Catch:{ Exception -> 0x02be }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$c r6 = com.hbb20.CountryCodePicker.c.a(r6)     // Catch:{ Exception -> 0x02be }
            r12.Q = r6     // Catch:{ Exception -> 0x02be }
            r6 = 21
            boolean r6 = r14.getBoolean(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.H0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 41
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6366g0 = r6     // Catch:{ Exception -> 0x02be }
            r12.h()     // Catch:{ Exception -> 0x02be }
            r6 = 11
            boolean r6 = r14.getBoolean(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6367h0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 39
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.S = r6     // Catch:{ Exception -> 0x02be }
            r12.j()     // Catch:{ Exception -> 0x02be }
            r6 = 42
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.l(r6)     // Catch:{ Exception -> 0x02be }
            r6 = 8
            boolean r6 = r14.getBoolean(r6, r2)     // Catch:{ Exception -> 0x02be }
            r12.setDialogKeyboardAutoPopup(r6)     // Catch:{ Exception -> 0x02be }
            r6 = 29
            int r6 = r14.getInt(r6, r1)     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$g r6 = b(r6)     // Catch:{ Exception -> 0x02be }
            r12.C0 = r6     // Catch:{ Exception -> 0x02be }
            r12.o()     // Catch:{ Exception -> 0x02be }
            r6 = 28
            java.lang.String r6 = r14.getString(r6)     // Catch:{ Exception -> 0x02be }
            r12.A0 = r6     // Catch:{ Exception -> 0x02be }
            r6 = 32
            java.lang.String r6 = r14.getString(r6)     // Catch:{ Exception -> 0x02be }
            r12.B0 = r6     // Catch:{ Exception -> 0x02be }
            boolean r6 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r6 != 0) goto L_0x0286
            r12.i()     // Catch:{ Exception -> 0x02be }
        L_0x0286:
            r6 = 27
            java.lang.String r6 = r14.getString(r6)     // Catch:{ Exception -> 0x02be }
            r12.f6383x0 = r6     // Catch:{ Exception -> 0x02be }
            boolean r6 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r6 != 0) goto L_0x0297
            r12.k()     // Catch:{ Exception -> 0x02be }
        L_0x0297:
            r6 = 46
            boolean r7 = r14.hasValue(r6)     // Catch:{ Exception -> 0x02be }
            if (r7 == 0) goto L_0x02a5
            int r6 = r14.getInt(r6, r3)     // Catch:{ Exception -> 0x02be }
            r12.f6382w0 = r6     // Catch:{ Exception -> 0x02be }
        L_0x02a5:
            int r6 = r12.f6382w0     // Catch:{ Exception -> 0x02be }
            r7 = 17
            r8 = 3
            r9 = -1
            if (r6 != r9) goto L_0x02b3
            android.widget.TextView r5 = r12.D     // Catch:{ Exception -> 0x02be }
            r5.setGravity(r8)     // Catch:{ Exception -> 0x02be }
            goto L_0x02c6
        L_0x02b3:
            if (r6 != 0) goto L_0x02c1
            android.widget.TextView r5 = r12.D     // Catch:{ Exception -> 0x02be }
            r5.setGravity(r7)     // Catch:{ Exception -> 0x02be }
            goto L_0x02c6
        L_0x02bb:
            r13 = move-exception
            goto L_0x0455
        L_0x02be:
            r13 = move-exception
            goto L_0x044e
        L_0x02c1:
            android.widget.TextView r6 = r12.D     // Catch:{ Exception -> 0x02be }
            r6.setGravity(r5)     // Catch:{ Exception -> 0x02be }
        L_0x02c6:
            r5 = 30
            java.lang.String r5 = r14.getString(r5)     // Catch:{ Exception -> 0x02be }
            r12.f6361d = r5     // Catch:{ Exception -> 0x02be }
            java.lang.String r6 = "IN"
            if (r5 == 0) goto L_0x032e
            int r5 = r5.length()     // Catch:{ Exception -> 0x02be }
            if (r5 == 0) goto L_0x032e
            boolean r5 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r5 != 0) goto L_0x0305
            android.content.Context r5 = r12.getContext()     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$g r10 = r12.getLanguageToApply()     // Catch:{ Exception -> 0x02be }
            java.lang.String r11 = r12.f6361d     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = com.hbb20.a.f(r5, r10, r11)     // Catch:{ Exception -> 0x02be }
            if (r5 == 0) goto L_0x031d
            android.content.Context r5 = r12.getContext()     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$g r10 = r12.getLanguageToApply()     // Catch:{ Exception -> 0x02be }
            java.lang.String r11 = r12.f6361d     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = com.hbb20.a.f(r5, r10, r11)     // Catch:{ Exception -> 0x02be }
            r12.setDefaultCountry(r5)     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = r12.L     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r5)     // Catch:{ Exception -> 0x02be }
            goto L_0x031b
        L_0x0305:
            java.lang.String r5 = r12.f6361d     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = com.hbb20.a.e(r5)     // Catch:{ Exception -> 0x02be }
            if (r5 == 0) goto L_0x031d
            java.lang.String r5 = r12.f6361d     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = com.hbb20.a.e(r5)     // Catch:{ Exception -> 0x02be }
            r12.setDefaultCountry(r5)     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = r12.L     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r5)     // Catch:{ Exception -> 0x02be }
        L_0x031b:
            r5 = r2
            goto L_0x031e
        L_0x031d:
            r5 = r3
        L_0x031e:
            if (r5 != 0) goto L_0x032f
            com.hbb20.a r5 = com.hbb20.a.e(r6)     // Catch:{ Exception -> 0x02be }
            r12.setDefaultCountry(r5)     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r5 = r12.L     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r5)     // Catch:{ Exception -> 0x02be }
            r5 = r2
            goto L_0x032f
        L_0x032e:
            r5 = r3
        L_0x032f:
            r10 = 31
            int r10 = r14.getInteger(r10, r9)     // Catch:{ Exception -> 0x02be }
            if (r5 != 0) goto L_0x037d
            if (r10 == r9) goto L_0x037d
            boolean r5 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r5 != 0) goto L_0x035c
            if (r10 == r9) goto L_0x0353
            android.content.Context r0 = r12.getContext()     // Catch:{ Exception -> 0x02be }
            com.hbb20.CountryCodePicker$g r5 = r12.getLanguageToApply()     // Catch:{ Exception -> 0x02be }
            java.util.ArrayList r9 = r12.f6381v0     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r0 = com.hbb20.a.c(r0, r5, r9, r10)     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x0353
            r10 = 91
        L_0x0353:
            r12.setDefaultCountryUsingPhoneCode(r10)     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r0 = r12.L     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r0)     // Catch:{ Exception -> 0x02be }
            goto L_0x037d
        L_0x035c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02be }
            r5.<init>()     // Catch:{ Exception -> 0x02be }
            r5.append(r10)     // Catch:{ Exception -> 0x02be }
            r5.append(r0)     // Catch:{ Exception -> 0x02be }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r0 = com.hbb20.a.d(r0)     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x0377
            java.lang.String r0 = "91"
            com.hbb20.a r0 = com.hbb20.a.d(r0)     // Catch:{ Exception -> 0x02be }
        L_0x0377:
            r12.setDefaultCountry(r0)     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r0)     // Catch:{ Exception -> 0x02be }
        L_0x037d:
            com.hbb20.a r0 = r12.getDefaultCountry()     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x0395
            com.hbb20.a r0 = com.hbb20.a.e(r6)     // Catch:{ Exception -> 0x02be }
            r12.setDefaultCountry(r0)     // Catch:{ Exception -> 0x02be }
            com.hbb20.a r0 = r12.getSelectedCountry()     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x0395
            com.hbb20.a r0 = r12.L     // Catch:{ Exception -> 0x02be }
            r12.setSelectedCountry(r0)     // Catch:{ Exception -> 0x02be }
        L_0x0395:
            boolean r0 = r12.H0     // Catch:{ Exception -> 0x02be }
            if (r0 == 0) goto L_0x03a2
            boolean r0 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x03a2
            r12.setAutoDetectedCountry(r2)     // Catch:{ Exception -> 0x02be }
        L_0x03a2:
            boolean r0 = r12.f6368i0     // Catch:{ Exception -> 0x02be }
            if (r0 == 0) goto L_0x03af
            boolean r0 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            if (r0 != 0) goto L_0x03af
            r12.g()     // Catch:{ Exception -> 0x02be }
        L_0x03af:
            r0 = 19
            int r0 = r14.getColor(r0, r4)     // Catch:{ Exception -> 0x02be }
            r12.setArrowColor(r0)     // Catch:{ Exception -> 0x02be }
            boolean r0 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            r5 = 25
            if (r0 == 0) goto L_0x03c5
            int r0 = r14.getColor(r5, r4)     // Catch:{ Exception -> 0x02be }
            goto L_0x03d4
        L_0x03c5:
            android.content.res.Resources r0 = r13.getResources()     // Catch:{ Exception -> 0x02be }
            r6 = 2131034195(0x7f050053, float:1.76789E38)
            int r0 = r0.getColor(r6)     // Catch:{ Exception -> 0x02be }
            int r0 = r14.getColor(r5, r0)     // Catch:{ Exception -> 0x02be }
        L_0x03d4:
            if (r0 == r4) goto L_0x03d9
            r12.setContentColor(r0)     // Catch:{ Exception -> 0x02be }
        L_0x03d9:
            boolean r0 = r12.isInEditMode()     // Catch:{ Exception -> 0x02be }
            r4 = 33
            if (r0 == 0) goto L_0x03e6
            int r13 = r14.getColor(r4, r3)     // Catch:{ Exception -> 0x02be }
            goto L_0x03f5
        L_0x03e6:
            android.content.res.Resources r13 = r13.getResources()     // Catch:{ Exception -> 0x02be }
            r0 = 2131034194(0x7f050052, float:1.7678899E38)
            int r13 = r13.getColor(r0)     // Catch:{ Exception -> 0x02be }
            int r13 = r14.getColor(r4, r13)     // Catch:{ Exception -> 0x02be }
        L_0x03f5:
            if (r13 == 0) goto L_0x03fa
            r12.setFlagBorderColor(r13)     // Catch:{ Exception -> 0x02be }
        L_0x03fa:
            r13 = 2
            int r13 = r14.getColor(r13, r3)     // Catch:{ Exception -> 0x02be }
            r12.setDialogBackgroundColor(r13)     // Catch:{ Exception -> 0x02be }
            int r13 = r14.getResourceId(r2, r3)     // Catch:{ Exception -> 0x02be }
            r12.setDialogBackground(r13)     // Catch:{ Exception -> 0x02be }
            int r13 = r14.getColor(r7, r3)     // Catch:{ Exception -> 0x02be }
            r12.setDialogTextColor(r13)     // Catch:{ Exception -> 0x02be }
            int r13 = r14.getColor(r1, r3)     // Catch:{ Exception -> 0x02be }
            r12.setDialogSearchEditTextTintColor(r13)     // Catch:{ Exception -> 0x02be }
            r13 = 0
            float r13 = r14.getDimension(r8, r13)     // Catch:{ Exception -> 0x02be }
            r12.setDialogCornerRaius(r13)     // Catch:{ Exception -> 0x02be }
            r13 = 47
            int r13 = r14.getDimensionPixelSize(r13, r3)     // Catch:{ Exception -> 0x02be }
            if (r13 <= 0) goto L_0x0433
            android.widget.TextView r0 = r12.D     // Catch:{ Exception -> 0x02be }
            float r1 = (float) r13     // Catch:{ Exception -> 0x02be }
            r0.setTextSize(r3, r1)     // Catch:{ Exception -> 0x02be }
            r12.setFlagSize(r13)     // Catch:{ Exception -> 0x02be }
            r12.setArrowSize(r13)     // Catch:{ Exception -> 0x02be }
        L_0x0433:
            r13 = 20
            int r13 = r14.getDimensionPixelSize(r13, r3)     // Catch:{ Exception -> 0x02be }
            if (r13 <= 0) goto L_0x043e
            r12.setArrowSize(r13)     // Catch:{ Exception -> 0x02be }
        L_0x043e:
            boolean r13 = r14.getBoolean(r3, r2)     // Catch:{ Exception -> 0x02be }
            r12.f6365f0 = r13     // Catch:{ Exception -> 0x02be }
            r13 = 24
            boolean r13 = r14.getBoolean(r13, r2)     // Catch:{ Exception -> 0x02be }
            r12.setCcpClickable(r13)     // Catch:{ Exception -> 0x02be }
            goto L_0x0451
        L_0x044e:
            r13.printStackTrace()     // Catch:{ all -> 0x02bb }
        L_0x0451:
            r14.recycle()
            goto L_0x0459
        L_0x0455:
            r14.recycle()
            throw r13
        L_0x0459:
            android.widget.RelativeLayout r13 = r12.M
            com.hbb20.CountryCodePicker$a r14 = r12.f6356a1
            r13.setOnClickListener(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static g b(int i8) {
        return i8 < g.values().length ? g.values()[i8] : g.f6392d;
    }

    public static boolean c(a aVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f6401a.equalsIgnoreCase(aVar.f6401a)) {
                return true;
            }
        }
        return false;
    }

    private g getCCPLanguageFromLocale() {
        String str;
        String str2;
        Locale locale = this.f6363e.getResources().getConfiguration().locale;
        for (g gVar : g.values()) {
            if (gVar.f6394a.equalsIgnoreCase(locale.getLanguage()) && ((str = gVar.f6395b) == null || str.equalsIgnoreCase(locale.getCountry()) || (str2 = gVar.f6396c) == null || str2.equalsIgnoreCase(locale.getScript()))) {
                return gVar;
            }
        }
        return null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return this.f6356a1;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.E != null && this.N0 == null) {
            this.N0 = new b();
        }
        return this.N0;
    }

    private a getDefaultCountry() {
        return this.L;
    }

    private qe.i getEnteredPhoneNumber() {
        EditText editText = this.E;
        return getPhoneUtil().t(editText != null ? qe.e.r(editText.getText().toString()) : "", getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.B;
    }

    private qe.e getPhoneUtil() {
        if (this.R == null) {
            this.R = qe.e.a(this.f6363e);
        }
        return this.R;
    }

    /* access modifiers changed from: private */
    public a getSelectedCountry() {
        if (this.K == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.K;
    }

    private e.a getSelectedHintNumberType() {
        int ordinal = this.f6375p0.ordinal();
        e.a aVar = e.a.f13563b;
        switch (ordinal) {
            case 0:
                return aVar;
            case 1:
                return e.a.f13562a;
            case 2:
                return e.a.f13564c;
            case 3:
                return e.a.f13565d;
            case 4:
                return e.a.f13566e;
            case 5:
                return e.a.B;
            case 6:
                return e.a.C;
            case 7:
                return e.a.D;
            case 8:
                return e.a.E;
            case 9:
                return e.a.F;
            case 10:
                return e.a.G;
            case ModuleDescriptor.MODULE_VERSION:
                return e.a.H;
            default:
                return aVar;
        }
    }

    private LayoutInflater getmInflater() {
        return this.C;
    }

    private void setCustomDefaultLanguage(g gVar) {
        a f10;
        this.C0 = gVar;
        o();
        if (this.K != null && (f10 = a.f(this.f6363e, getLanguageToApply(), this.K.f6401a)) != null) {
            setSelectedCountry(f10);
        }
    }

    private void setDefaultCountry(a aVar) {
        this.L = aVar;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.F = relativeLayout;
    }

    private void setHolderView(View view) {
        this.B = view;
    }

    public final boolean d(String str) {
        List<a> list;
        i();
        List<a> list2 = this.f6385z0;
        if (list2 == null || list2.size() <= 0) {
            list = a.j(this.f6363e, getLanguageToApply());
        } else {
            list = getCustomMasterCountriesList();
        }
        for (a aVar : list) {
            if (aVar.f6401a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        try {
            if (getEditText_registeredCarrierNumber() == null || getEditText_registeredCarrierNumber().getText().length() == 0) {
                if (getEditText_registeredCarrierNumber() == null) {
                    Toast.makeText(this.f6363e, "No editText for Carrier number found.", 0).show();
                }
                return false;
            }
            qe.e phoneUtil = getPhoneUtil();
            return getPhoneUtil().m(phoneUtil.t("+" + this.K.f6402b + getEditText_registeredCarrierNumber().getText().toString(), this.K.f6401a));
        } catch (qe.d unused) {
        }
    }

    public final void f(String str) {
        boolean z10;
        String str2 = str;
        CountryCodePicker countryCodePicker = this.N;
        Field field = e.f6412a;
        e.f6416e = countryCodePicker.getContext();
        e.f6415d = new Dialog(e.f6416e);
        countryCodePicker.i();
        countryCodePicker.k();
        Context context = e.f6416e;
        countryCodePicker.i();
        List<a> list = countryCodePicker.f6385z0;
        List j10 = (list == null || list.size() <= 0) ? a.j(context, countryCodePicker.getLanguageToApply()) : countryCodePicker.getCustomMasterCountriesList();
        e.f6415d.requestWindowFeature(1);
        e.f6415d.getWindow().setContentView(R.layout.layout_picker_dialog);
        Window window = e.f6415d.getWindow();
        Context context2 = e.f6416e;
        Object obj = t1.a.f15323a;
        window.setBackgroundDrawable(a.c.b(context2, 17170445));
        RecyclerView recyclerView = (RecyclerView) e.f6415d.findViewById(R.id.recycler_countryDialog);
        TextView textView = (TextView) e.f6415d.findViewById(R.id.textView_title);
        RelativeLayout relativeLayout = (RelativeLayout) e.f6415d.findViewById(R.id.rl_query_holder);
        ImageView imageView = (ImageView) e.f6415d.findViewById(R.id.img_clear_query);
        EditText editText = (EditText) e.f6415d.findViewById(R.id.editText_search);
        TextView textView2 = (TextView) e.f6415d.findViewById(R.id.textView_noresult);
        CardView cardView = (CardView) e.f6415d.findViewById(R.id.cardViewRoot);
        ImageView imageView2 = (ImageView) e.f6415d.findViewById(R.id.img_dismiss);
        if (!countryCodePicker.f6365f0 || !countryCodePicker.E0) {
            e.f6415d.getWindow().setSoftInputMode(2);
        } else {
            editText.requestFocus();
            e.f6415d.getWindow().setSoftInputMode(5);
        }
        try {
            if (countryCodePicker.getDialogTypeFace() != null) {
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                } else {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (countryCodePicker.getDialogBackgroundColor() != 0) {
            cardView.setCardBackgroundColor(countryCodePicker.getDialogBackgroundColor());
        }
        if (countryCodePicker.getDialogBackgroundResId() != 0) {
            cardView.setBackgroundResource(countryCodePicker.getDialogBackgroundResId());
        }
        cardView.setRadius(countryCodePicker.getDialogCornerRadius());
        if (countryCodePicker.f6367h0) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new ib.g());
        } else {
            imageView2.setVisibility(8);
        }
        if (!countryCodePicker.getCcpDialogShowTitle()) {
            textView.setVisibility(8);
        }
        if (countryCodePicker.getDialogTextColor() != 0) {
            int dialogTextColor = countryCodePicker.getDialogTextColor();
            imageView.setColorFilter(dialogTextColor);
            imageView2.setColorFilter(dialogTextColor);
            textView.setTextColor(dialogTextColor);
            textView2.setTextColor(dialogTextColor);
            editText.setTextColor(dialogTextColor);
            editText.setHintTextColor(Color.argb(100, Color.red(dialogTextColor), Color.green(dialogTextColor), Color.blue(dialogTextColor)));
        }
        if (countryCodePicker.getDialogSearchEditTextTintColor() != 0) {
            editText.setBackgroundTintList(ColorStateList.valueOf(countryCodePicker.getDialogSearchEditTextTintColor()));
            int dialogSearchEditTextTintColor = countryCodePicker.getDialogSearchEditTextTintColor();
            Field field2 = e.f6413b;
            if (field2 != null) {
                try {
                    Drawable drawable = editText.getContext().getDrawable(e.f6414c.getInt(editText));
                    drawable.setColorFilter(dialogSearchEditTextTintColor, PorterDuff.Mode.SRC_IN);
                    field2.set(e.f6412a.get(editText), new Drawable[]{drawable, drawable});
                } catch (Exception unused) {
                }
            }
        }
        textView.setText(countryCodePicker.getDialogTitle());
        editText.setHint(countryCodePicker.getSearchHintText());
        textView2.setText(countryCodePicker.getNoResultACK());
        if (!countryCodePicker.f6365f0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        ib.f fVar = new ib.f(e.f6416e, j10, countryCodePicker, relativeLayout, editText, textView2, e.f6415d, imageView);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(fVar);
        FastScroller fastScroller = (FastScroller) e.f6415d.findViewById(R.id.fastscroll);
        fastScroller.setRecyclerView(recyclerView);
        if (countryCodePicker.f6358b0) {
            if (countryCodePicker.getFastScrollerBubbleColor() != 0) {
                fastScroller.setBubbleColor(countryCodePicker.getFastScrollerBubbleColor());
            }
            if (countryCodePicker.getFastScrollerHandleColor() != 0) {
                fastScroller.setHandleColor(countryCodePicker.getFastScrollerHandleColor());
            }
            if (countryCodePicker.getFastScrollerBubbleTextAppearance() != 0) {
                try {
                    fastScroller.setBubbleTextAppearance(countryCodePicker.getFastScrollerBubbleTextAppearance());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            fastScroller.setVisibility(8);
        }
        e.f6415d.setOnDismissListener(new c(countryCodePicker));
        e.f6415d.setOnCancelListener(new d(countryCodePicker));
        if (str2 != null) {
            ArrayList arrayList = countryCodePicker.f6381v0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a) it.next()).f6401a.equalsIgnoreCase(str2)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                ArrayList arrayList2 = countryCodePicker.f6381v0;
                int size = (arrayList2 == null || arrayList2.size() <= 0) ? 0 : countryCodePicker.f6381v0.size() + 1;
                int i8 = 0;
                while (true) {
                    if (i8 >= j10.size()) {
                        break;
                    } else if (((a) j10.get(i8)).f6401a.equalsIgnoreCase(str2)) {
                        recyclerView.a0(i8 + size);
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        e.f6415d.show();
        countryCodePicker.getDialogEventsListener();
    }

    public final void g() {
        String string = this.f6363e.getSharedPreferences(this.f6357b, 0).getString(this.f6376q0, (String) null);
        if (string != null) {
            setCountryForNameCode(string);
        }
    }

    public boolean getCcpDialogRippleEnable() {
        return this.f6364e0;
    }

    public boolean getCcpDialogShowFlag() {
        return this.f6362d0;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.f6370k0;
    }

    public boolean getCcpDialogShowTitle() {
        return this.f6360c0;
    }

    public int getContentColor() {
        return this.f6377r0;
    }

    public k getCurrentTextGravity() {
        return this.O;
    }

    public g getCustomDefaultLanguage() {
        return this.C0;
    }

    public List<a> getCustomMasterCountriesList() {
        return this.f6385z0;
    }

    public String getCustomMasterCountriesParam() {
        return this.A0;
    }

    public String getDefaultCountryCode() {
        return this.L.f6402b;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        return "+" + getDefaultCountryCode();
    }

    public String getDefaultCountryName() {
        a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f6403c;
    }

    public String getDefaultCountryNameCode() {
        a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f6401a.toUpperCase(Locale.US);
    }

    public int getDialogBackgroundColor() {
        return this.U0;
    }

    public int getDialogBackgroundResId() {
        return this.T0;
    }

    public float getDialogCornerRadius() {
        return this.Y0;
    }

    public e getDialogEventsListener() {
        return null;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.W0;
    }

    public int getDialogTextColor() {
        return this.V0;
    }

    public String getDialogTitle() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = a.B;
        if (gVar == null || gVar != languageToApply || (str = a.C) == null || str.length() == 0) {
            a.l(this.f6363e, languageToApply);
        }
        return a.C;
    }

    public Typeface getDialogTypeFace() {
        return this.f6379t0;
    }

    public int getDialogTypeFaceStyle() {
        return this.f6380u0;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.E;
    }

    public int getFastScrollerBubbleColor() {
        return this.f6384y0;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.X0;
    }

    public int getFastScrollerHandleColor() {
        return this.S0;
    }

    public String getFormattedFullNumber() {
        try {
            qe.i enteredPhoneNumber = getEnteredPhoneNumber();
            return "+" + getPhoneUtil().c(enteredPhoneNumber, 2).substring(1);
        } catch (qe.d unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().c(getEnteredPhoneNumber(), 1).substring(1);
        } catch (qe.d unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getSelectedCountryCode() + qe.e.r(this.E.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        return "+" + getFullNumber();
    }

    public RelativeLayout getHolder() {
        return this.F;
    }

    public ImageView getImageViewFlag() {
        return this.H;
    }

    public g getLanguageToApply() {
        if (this.D0 == null) {
            o();
        }
        return this.D0;
    }

    public String getNoResultACK() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = a.B;
        if (gVar == null || gVar != languageToApply || (str = a.E) == null || str.length() == 0) {
            a.l(this.f6363e, languageToApply);
        }
        return a.E;
    }

    public String getSearchHintText() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = a.B;
        if (gVar == null || gVar != languageToApply || (str = a.D) == null || str.length() == 0) {
            a.l(this.f6363e, languageToApply);
        }
        return a.D;
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().f6402b;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        return "+" + getSelectedCountryCode();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().f6404d;
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().f6405e;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().f6403c;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().f6401a.toUpperCase(Locale.US);
    }

    public TextView getTextView_selectedCountry() {
        return this.D;
    }

    public final void h() {
        if (this.f6366g0) {
            this.G.setVisibility(0);
        } else {
            this.G.setVisibility(8);
        }
    }

    public final void i() {
        String str = this.A0;
        if (str == null || str.length() == 0) {
            String str2 = this.B0;
            if (str2 == null || str2.length() == 0) {
                this.f6385z0 = null;
            } else {
                this.B0 = this.B0.toLowerCase();
                ArrayList<a> j10 = a.j(this.f6363e, getLanguageToApply());
                ArrayList arrayList = new ArrayList();
                for (a aVar : j10) {
                    if (!this.B0.contains(aVar.f6401a.toLowerCase())) {
                        arrayList.add(aVar);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f6385z0 = arrayList;
                } else {
                    this.f6385z0 = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String f10 : this.A0.split(",")) {
                a f11 = a.f(getContext(), getLanguageToApply(), f10);
                if (f11 != null && !c(f11, arrayList2)) {
                    arrayList2.add(f11);
                }
            }
            if (arrayList2.size() == 0) {
                this.f6385z0 = null;
            } else {
                this.f6385z0 = arrayList2;
            }
        }
        List<a> list = this.f6385z0;
        if (list != null) {
            for (a m : list) {
                m.m();
            }
        }
    }

    public final void j() {
        if (this.S) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.M.setBackgroundResource(i8);
            } else {
                this.M.setBackgroundResource(typedValue.data);
            }
        }
    }

    public final void k() {
        a aVar;
        String str = this.f6383x0;
        if (str == null || str.length() == 0) {
            this.f6381v0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.f6383x0.split(",")) {
                Context context = getContext();
                List<a> list = this.f6385z0;
                g languageToApply = getLanguageToApply();
                if (list != null && list.size() != 0) {
                    Iterator<a> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = it.next();
                        if (aVar.f6401a.equalsIgnoreCase(str2)) {
                            break;
                        }
                    }
                } else {
                    aVar = a.f(context, languageToApply, str2);
                }
                if (aVar != null && !c(aVar, arrayList)) {
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() == 0) {
                this.f6381v0 = null;
            } else {
                this.f6381v0 = arrayList;
            }
        }
        ArrayList arrayList2 = this.f6381v0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).m();
            }
        }
    }

    public final void l(boolean z10) {
        this.W = z10;
        if (!z10) {
            this.J.setVisibility(8);
        } else if (this.f6372m0) {
            this.J.setVisibility(8);
        } else {
            this.J.setVisibility(0);
        }
        if (!isInEditMode()) {
            setSelectedCountry(this.K);
        }
    }

    public final void m() {
        EditText editText = this.E;
        if (editText != null && this.K != null) {
            String r10 = qe.e.r(getEditText_registeredCarrierNumber().getText().toString());
            ib.h hVar = this.M0;
            if (hVar != null) {
                this.E.removeTextChangedListener(hVar);
            }
            TextWatcher textWatcher = this.N0;
            if (textWatcher != null) {
                this.E.removeTextChangedListener(textWatcher);
            }
            if (this.I0) {
                ib.h hVar2 = new ib.h(this.f6363e, getSelectedCountryNameCode(), getSelectedCountryCodeAsInt(), this.f6374o0);
                this.M0 = hVar2;
                this.E.addTextChangedListener(hVar2);
            }
            if (this.f6369j0) {
                TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
                this.N0 = countryDetectorTextWatcher;
                this.E.addTextChangedListener(countryDetectorTextWatcher);
            }
            this.E.setText("");
            this.E.setText(r10);
            EditText editText2 = this.E;
            editText2.setSelection(editText2.getText().length());
        } else if (editText == null) {
            Log.v("CCP", "updateFormattingTextWatcher: EditText not registered " + this.f6376q0);
        } else {
            Log.v("CCP", "updateFormattingTextWatcher: selected country is null " + this.f6376q0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r5 = this;
            android.widget.EditText r0 = r5.E
            if (r0 == 0) goto L_0x0099
            boolean r0 = r5.J0
            if (r0 == 0) goto L_0x0099
            qe.e r0 = r5.getPhoneUtil()
            java.lang.String r1 = r5.getSelectedCountryNameCode()
            qe.e$a r2 = r5.getSelectedHintNumberType()
            boolean r3 = r0.n(r1)
            java.util.logging.Logger r4 = qe.e.f13537h
            if (r3 != 0) goto L_0x0030
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid or unknown region code provided: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.log(r0, r1)
            goto L_0x004d
        L_0x0030:
            qe.g r3 = r0.f(r1)
            qe.h r2 = qe.e.i(r3, r2)
            boolean r3 = r2.f13606e     // Catch:{ d -> 0x0043 }
            if (r3 == 0) goto L_0x004d
            java.lang.String r2 = r2.B     // Catch:{ d -> 0x0043 }
            qe.i r0 = r0.t(r2, r1)     // Catch:{ d -> 0x0043 }
            goto L_0x004e
        L_0x0043:
            r0 = move-exception
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r0.toString()
            r4.log(r1, r0)
        L_0x004d:
            r0 = 0
        L_0x004e:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0090
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r0.f13608b
            r2.append(r3)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getSelectedCountryCodeWithPlus()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r5.getSelectedCountryNameCode()
            java.lang.String r1 = android.telephony.PhoneNumberUtils.formatNumber(r0, r1)
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = r5.getSelectedCountryCodeWithPlus()
            int r0 = r0.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r1 = r0.trim()
        L_0x0090:
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r5.P
        L_0x0094:
            android.widget.EditText r0 = r5.E
            r0.setHint(r1)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.n():void");
    }

    public final void o() {
        boolean isInEditMode = isInEditMode();
        g gVar = g.f6392d;
        if (isInEditMode) {
            g gVar2 = this.C0;
            if (gVar2 != null) {
                this.D0 = gVar2;
            } else {
                this.D0 = gVar;
            }
        } else if (this.G0) {
            g cCPLanguageFromLocale = getCCPLanguageFromLocale();
            if (cCPLanguageFromLocale != null) {
                this.D0 = cCPLanguageFromLocale;
            } else if (getCustomDefaultLanguage() != null) {
                this.D0 = getCustomDefaultLanguage();
            } else {
                this.D0 = gVar;
            }
        } else if (getCustomDefaultLanguage() != null) {
            this.D0 = this.C0;
        } else {
            this.D0 = gVar;
        }
    }

    public final void onDetachedFromWindow() {
        Dialog dialog = e.f6415d;
        if (dialog != null) {
            dialog.dismiss();
        }
        e.f6415d = null;
        e.f6416e = null;
        super.onDetachedFromWindow();
    }

    public void setArrowColor(int i8) {
        this.f6378s0 = i8;
        if (i8 == -99) {
            int i10 = this.f6377r0;
            if (i10 != -99) {
                this.G.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        this.G.setColorFilter(i8, PorterDuff.Mode.SRC_IN);
    }

    public void setArrowSize(int i8) {
        if (i8 > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.G.getLayoutParams();
            layoutParams.width = i8;
            layoutParams.height = i8;
            this.G.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1 A[Catch:{ Exception -> 0x00cf }, LOOP:0: B:1:0x0003->B:47:0x00b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAutoDetectedCountry(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            com.hbb20.CountryCodePicker$c r3 = r6.Q     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = r3.f6391a     // Catch:{ Exception -> 0x00cf }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00cf }
            if (r1 >= r3) goto L_0x00b5
            com.hbb20.CountryCodePicker$c r3 = r6.Q     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = r3.f6391a     // Catch:{ Exception -> 0x00cf }
            char r3 = r3.charAt(r1)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r4 = "phone"
            android.content.Context r5 = r6.f6363e
            switch(r3) {
                case 49: goto L_0x007f;
                case 50: goto L_0x0051;
                case 51: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x00ae
        L_0x001e:
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ Exception -> 0x004c }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x004c }
            java.util.Locale r2 = r2.locale     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x004c }
            if (r2 == 0) goto L_0x00ad
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x004c }
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r6.d(r2)     // Catch:{ Exception -> 0x004c }
            if (r3 != 0) goto L_0x003c
            goto L_0x00ad
        L_0x003c:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x004c }
            com.hbb20.CountryCodePicker$g r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x004c }
            com.hbb20.a r2 = com.hbb20.a.f(r3, r4, r2)     // Catch:{ Exception -> 0x004c }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x00a7
        L_0x004c:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00cf }
            goto L_0x00ad
        L_0x0051:
            java.lang.Object r2 = r5.getSystemService(r4)     // Catch:{ Exception -> 0x007a }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = r2.getNetworkCountryIso()     // Catch:{ Exception -> 0x007a }
            if (r2 == 0) goto L_0x00ad
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x007a }
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r6.d(r2)     // Catch:{ Exception -> 0x007a }
            if (r3 != 0) goto L_0x006a
            goto L_0x00ad
        L_0x006a:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x007a }
            com.hbb20.CountryCodePicker$g r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x007a }
            com.hbb20.a r2 = com.hbb20.a.f(r3, r4, r2)     // Catch:{ Exception -> 0x007a }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a7
        L_0x007a:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00cf }
            goto L_0x00ad
        L_0x007f:
            java.lang.Object r2 = r5.getSystemService(r4)     // Catch:{ Exception -> 0x00a9 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r2.getSimCountryIso()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x00ad
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x00a9 }
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r6.d(r2)     // Catch:{ Exception -> 0x00a9 }
            if (r3 != 0) goto L_0x0098
            goto L_0x00ad
        L_0x0098:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x00a9 }
            com.hbb20.CountryCodePicker$g r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x00a9 }
            com.hbb20.a r2 = com.hbb20.a.f(r3, r4, r2)     // Catch:{ Exception -> 0x00a9 }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a7:
            r2 = 1
            goto L_0x00ae
        L_0x00a9:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00cf }
        L_0x00ad:
            r2 = r0
        L_0x00ae:
            if (r2 == 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x00b5:
            if (r2 != 0) goto L_0x0101
            if (r7 == 0) goto L_0x0101
            android.content.Context r0 = r6.getContext()     // Catch:{ Exception -> 0x00cf }
            com.hbb20.CountryCodePicker$g r1 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r2 = r6.getDefaultCountryNameCode()     // Catch:{ Exception -> 0x00cf }
            com.hbb20.a r0 = com.hbb20.a.f(r0, r1, r2)     // Catch:{ Exception -> 0x00cf }
            r6.L = r0     // Catch:{ Exception -> 0x00cf }
            r6.setSelectedCountry(r0)     // Catch:{ Exception -> 0x00cf }
            goto L_0x0101
        L_0x00cf:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setAutoDetectCountry: Exception"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CCP"
            android.util.Log.w(r1, r0)
            if (r7 == 0) goto L_0x0101
            android.content.Context r7 = r6.getContext()
            com.hbb20.CountryCodePicker$g r0 = r6.getLanguageToApply()
            java.lang.String r1 = r6.getDefaultCountryNameCode()
            com.hbb20.a r7 = com.hbb20.a.f(r7, r0, r1)
            r6.L = r7
            r6.setSelectedCountry(r7)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.setAutoDetectedCountry(boolean):void");
    }

    public void setAutoDetectionFailureListener(f fVar) {
    }

    public void setCcpClickable(boolean z10) {
        this.F0 = z10;
        if (!z10) {
            this.M.setOnClickListener((View.OnClickListener) null);
            this.M.setClickable(false);
            this.M.setEnabled(false);
            return;
        }
        this.M.setOnClickListener(this.f6356a1);
        this.M.setClickable(true);
        this.M.setEnabled(true);
    }

    public void setCcpDialogRippleEnable(boolean z10) {
        this.f6364e0 = z10;
    }

    public void setCcpDialogShowFlag(boolean z10) {
        this.f6362d0 = z10;
    }

    public void setCcpDialogShowNameCode(boolean z10) {
        this.f6370k0 = z10;
    }

    public void setCcpDialogShowPhoneCode(boolean z10) {
        this.V = z10;
    }

    public void setCcpDialogShowTitle(boolean z10) {
        this.f6360c0 = z10;
    }

    public void setContentColor(int i8) {
        this.f6377r0 = i8;
        this.D.setTextColor(i8);
        if (this.f6378s0 == -99) {
            this.G.setColorFilter(this.f6377r0, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCountryAutoDetectionPref(c cVar) {
        this.Q = cVar;
    }

    public void setCountryForNameCode(String str) {
        a f10 = a.f(getContext(), getLanguageToApply(), str);
        if (f10 == null) {
            if (this.L == null) {
                this.L = a.c(getContext(), getLanguageToApply(), this.f6381v0, this.f6359c);
            }
            setSelectedCountry(this.L);
            return;
        }
        setSelectedCountry(f10);
    }

    public void setCountryForPhoneCode(int i8) {
        a c3 = a.c(getContext(), getLanguageToApply(), this.f6381v0, i8);
        if (c3 == null) {
            if (this.L == null) {
                this.L = a.c(getContext(), getLanguageToApply(), this.f6381v0, this.f6359c);
            }
            setSelectedCountry(this.L);
            return;
        }
        setSelectedCountry(c3);
    }

    public void setCountryPreference(String str) {
        this.f6383x0 = str;
    }

    public void setCurrentTextGravity(k kVar) {
        this.O = kVar;
        int i8 = kVar.f6400a;
        if (i8 == -1) {
            this.D.setGravity(3);
        } else if (i8 == 0) {
            this.D.setGravity(17);
        } else {
            this.D.setGravity(5);
        }
    }

    public void setCustomDialogTextProvider(d dVar) {
    }

    public void setCustomMasterCountries(String str) {
        this.A0 = str;
    }

    public void setCustomMasterCountriesList(List<a> list) {
        this.f6385z0 = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        a f10 = a.f(getContext(), getLanguageToApply(), str);
        if (f10 != null) {
            this.f6361d = f10.f6401a;
            setDefaultCountry(f10);
        }
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i8) {
        a c3 = a.c(getContext(), getLanguageToApply(), this.f6381v0, i8);
        if (c3 != null) {
            this.f6359c = i8;
            setDefaultCountry(c3);
        }
    }

    public void setDetectCountryWithAreaCode(boolean z10) {
        this.f6369j0 = z10;
        m();
    }

    public void setDialogBackground(int i8) {
        this.T0 = i8;
    }

    public void setDialogBackgroundColor(int i8) {
        this.U0 = i8;
    }

    public void setDialogCornerRaius(float f10) {
        this.Y0 = f10;
    }

    public void setDialogEventsListener(e eVar) {
    }

    public void setDialogKeyboardAutoPopup(boolean z10) {
        this.E0 = z10;
    }

    public void setDialogSearchEditTextTintColor(int i8) {
        this.W0 = i8;
    }

    public void setDialogTextColor(int i8) {
        this.V0 = i8;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.f6379t0 = typeface;
            this.f6380u0 = -99;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.E = editText;
        if (editText.getHint() != null) {
            this.P = this.E.getHint().toString();
        }
        try {
            this.E.removeTextChangedListener(this.L0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e();
        f fVar = new f(this);
        this.L0 = fVar;
        this.E.addTextChangedListener(fVar);
        m();
        n();
    }

    public void setExcludedCountries(String str) {
        this.B0 = str;
        i();
    }

    public void setFastScrollerBubbleColor(int i8) {
        this.f6384y0 = i8;
    }

    public void setFastScrollerBubbleTextAppearance(int i8) {
        this.X0 = i8;
    }

    public void setFastScrollerHandleColor(int i8) {
        this.S0 = i8;
    }

    public void setFlagBorderColor(int i8) {
        this.I.setBackgroundColor(i8);
    }

    public void setFlagSize(int i8) {
        this.H.getLayoutParams().height = i8;
        this.H.requestLayout();
    }

    public void setFullNumber(String str) {
        int indexOf;
        b bVar;
        Context context = getContext();
        g languageToApply = getLanguageToApply();
        ArrayList arrayList = this.f6381v0;
        a aVar = null;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                int i8 = 0;
                if (trim.charAt(0) == '+') {
                    i8 = 1;
                }
                int i10 = i8;
                while (true) {
                    if (i10 > trim.length()) {
                        break;
                    }
                    String substring = trim.substring(i8, i10);
                    try {
                        bVar = b.b(Integer.parseInt(substring));
                    } catch (Exception unused) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        int length = substring.length() + i8;
                        int length2 = trim.length();
                        int i11 = bVar.f6408b + length;
                        aVar = length2 >= i11 ? bVar.a(context, languageToApply, trim.substring(length, i11)) : a.f(context, languageToApply, bVar.f6407a);
                    } else {
                        a b10 = a.b(context, languageToApply, substring, arrayList);
                        if (b10 != null) {
                            aVar = b10;
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        if (aVar == null) {
            aVar = getDefaultCountry();
        }
        setSelectedCountry(aVar);
        if (!(aVar == null || str == null || str.isEmpty() || (indexOf = str.indexOf(aVar.f6402b)) == -1)) {
            str = str.substring(aVar.f6402b.length() + indexOf);
        }
        if (getEditText_registeredCarrierNumber() != null) {
            getEditText_registeredCarrierNumber().setText(str);
            m();
            return;
        }
        Log.w("CCP", "EditText for carrier number is not registered. Register it using registerCarrierNumberEditText() before getFullNumber() or setFullNumber().");
    }

    public void setHintExampleNumberEnabled(boolean z10) {
        this.J0 = z10;
        n();
    }

    public void setHintExampleNumberType(i iVar) {
        this.f6375p0 = iVar;
        n();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.H = imageView;
    }

    public void setInternationalFormattingOnly(boolean z10) {
        this.f6374o0 = z10;
        if (this.E != null) {
            m();
        }
    }

    public void setLanguageToApply(g gVar) {
        this.D0 = gVar;
    }

    public void setNumberAutoFormattingEnabled(boolean z10) {
        this.I0 = z10;
        if (this.E != null) {
            m();
        }
    }

    public void setOnCountryChangeListener(h hVar) {
    }

    public void setPhoneNumberValidityChangeListener(j jVar) {
        if (this.E != null && jVar != null) {
            e();
            jVar.a();
        }
    }

    public void setSearchAllowed(boolean z10) {
        this.f6365f0 = z10;
    }

    public void setSelectedCountry(a aVar) {
        ib.a aVar2 = this.f6354a;
        if (!(aVar2 == null || ((q4.a) aVar2).c(aVar) == null)) {
            this.D.setContentDescription(((q4.a) this.f6354a).c(aVar));
        }
        this.O0 = false;
        String str = "";
        this.P0 = str;
        if (aVar != null || (aVar = a.c(getContext(), getLanguageToApply(), this.f6381v0, this.f6359c)) != null) {
            this.K = aVar;
            if (this.W && this.f6372m0) {
                str = isInEditMode() ? this.f6373n0 ? "🏁​ " : a.g(aVar).concat("​ ") : a.g(aVar).concat("  ");
            }
            if (this.f6355a0) {
                StringBuilder c3 = h0.e.c(str);
                c3.append(aVar.f6403c);
                str = c3.toString();
            }
            if (this.T) {
                if (this.f6355a0) {
                    StringBuilder b10 = d.a.b(str, " (");
                    b10.append(aVar.f6401a.toUpperCase(Locale.US));
                    b10.append(")");
                    str = b10.toString();
                } else {
                    StringBuilder b11 = d.a.b(str, " ");
                    b11.append(aVar.f6401a.toUpperCase(Locale.US));
                    str = b11.toString();
                }
            }
            if (this.U) {
                if (str.length() > 0) {
                    str = str.concat("  ");
                }
                StringBuilder b12 = d.a.b(str, "+");
                b12.append(aVar.f6402b);
                str = b12.toString();
            }
            this.D.setText(str);
            if (!this.W && str.length() == 0) {
                StringBuilder b13 = d.a.b(str, "+");
                b13.append(aVar.f6402b);
                this.D.setText(b13.toString());
            }
            ImageView imageView = this.H;
            if (aVar.f6405e == -99) {
                aVar.f6405e = a.h(aVar);
            }
            imageView.setImageResource(aVar.f6405e);
            m();
            n();
            EditText editText = this.E;
            this.O0 = true;
            if (this.R0) {
                try {
                    editText.setSelection(this.Q0);
                    this.R0 = false;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.Z0 = b.b(getSelectedCountryCodeAsInt());
        }
    }

    public void setShowFastScroller(boolean z10) {
        this.f6358b0 = z10;
    }

    public void setShowPhoneCode(boolean z10) {
        this.U = z10;
        setSelectedCountry(this.K);
    }

    public void setTalkBackTextProvider(ib.a aVar) {
        this.f6354a = aVar;
        setSelectedCountry(this.K);
    }

    public void setTextSize(int i8) {
        if (i8 > 0) {
            this.D.setTextSize(0, (float) i8);
            setArrowSize(i8);
            setFlagSize(i8);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.D = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.D.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public enum g {
        f6392d("en");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f6394a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6395b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6396c;

        /* access modifiers changed from: public */
        g(String str, String str2) {
            this.f6394a = "zh";
            this.f6395b = str;
            this.f6396c = str2;
        }

        /* access modifiers changed from: public */
        g(String str) {
            this.f6394a = str;
        }
    }
}
