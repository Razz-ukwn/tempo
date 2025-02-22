package com.google.android.material.textfield;

import a9.e;
import a9.f;
import a9.n;
import a9.o;
import a9.p;
import a9.u;
import a9.w;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.h1;
import androidx.fragment.app.q;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m8.r;
import m8.v;

@SuppressLint({"ViewConstructor"})
public final class a extends LinearLayout {
    public View.OnLongClickListener B;
    public final CheckableImageButton C;
    public final d D;
    public int E = 0;
    public final LinkedHashSet<TextInputLayout.h> F = new LinkedHashSet<>();
    public ColorStateList G;
    public PorterDuff.Mode H;
    public int I;
    public ImageView.ScaleType J;
    public View.OnLongClickListener K;
    public CharSequence L;
    public final d0 M;
    public boolean N;
    public EditText O;
    public final AccessibilityManager P;
    public e2.d Q;
    public final C0079a R = new C0079a();

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f6209a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f6210b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f6211c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f6212d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f6213e;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0079a extends r {
        public C0079a() {
        }

        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
            a.this.b().b();
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.O != textInputLayout.getEditText()) {
                EditText editText = aVar.O;
                C0079a aVar2 = aVar.R;
                if (editText != null) {
                    editText.removeTextChangedListener(aVar2);
                    if (aVar.O.getOnFocusChangeListener() == aVar.b().e()) {
                        aVar.O.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText editText2 = textInputLayout.getEditText();
                aVar.O = editText2;
                if (editText2 != null) {
                    editText2.addTextChangedListener(aVar2);
                }
                aVar.b().m(aVar.O);
                aVar.i(aVar.b());
            }
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.Q != null && (accessibilityManager = aVar.P) != null) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (i0.g.b(aVar)) {
                    e2.c.a(accessibilityManager, aVar.Q);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            e2.d dVar = aVar.Q;
            if (dVar != null && (accessibilityManager = aVar.P) != null) {
                e2.c.b(accessibilityManager, dVar);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<o> f6217a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f6218b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6219c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6220d;

        public d(a aVar, h1 h1Var) {
            this.f6218b = aVar;
            this.f6219c = h1Var.i(26, 0);
            this.f6220d = h1Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, h1 h1Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        b bVar = new b();
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6209a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6210b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f6211c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.C = a11;
        this.D = new d(this, h1Var);
        CharSequence charSequence = null;
        d0 d0Var = new d0(getContext(), (AttributeSet) null);
        this.M = d0Var;
        if (h1Var.l(36)) {
            this.f6212d = r8.c.b(getContext(), h1Var, 36);
        }
        if (h1Var.l(37)) {
            this.f6213e = v.d(h1Var.h(37, -1), (PorterDuff.Mode) null);
        }
        if (h1Var.l(35)) {
            h(h1Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!h1Var.l(51)) {
            if (h1Var.l(30)) {
                this.G = r8.c.b(getContext(), h1Var, 30);
            }
            if (h1Var.l(31)) {
                this.H = v.d(h1Var.h(31, -1), (PorterDuff.Mode) null);
            }
        }
        if (h1Var.l(28)) {
            f(h1Var.h(28, 0));
            if (h1Var.l(25) && a11.getContentDescription() != (k10 = h1Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(h1Var.a(24, true));
        } else if (h1Var.l(51)) {
            if (h1Var.l(52)) {
                this.G = r8.c.b(getContext(), h1Var, 52);
            }
            if (h1Var.l(53)) {
                this.H = v.d(h1Var.h(53, -1), (PorterDuff.Mode) null);
            }
            f(h1Var.a(51, false) ? 1 : 0);
            CharSequence k11 = h1Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = h1Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.I) {
                this.I = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (h1Var.l(29)) {
                ImageView.ScaleType b10 = p.b(h1Var.h(29, -1));
                this.J = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            d0Var.setVisibility(8);
            d0Var.setId(R.id.textinput_suffix_text);
            d0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            i0.g.f(d0Var, 1);
            d0Var.setTextAppearance(h1Var.i(70, 0));
            if (h1Var.l(71)) {
                d0Var.setTextColor(h1Var.b(71));
            }
            CharSequence k12 = h1Var.k(69);
            this.L = !TextUtils.isEmpty(k12) ? k12 : charSequence;
            d0Var.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(d0Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f6200y0.add(bVar);
            if (textInputLayout.f6177d != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i8) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i8);
        if (r8.c.e(getContext())) {
            d2.p.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o oVar;
        int i8 = this.E;
        d dVar = this.D;
        SparseArray<o> sparseArray = dVar.f6217a;
        o oVar2 = sparseArray.get(i8);
        if (oVar2 == null) {
            a aVar = dVar.f6218b;
            if (i8 == -1) {
                oVar = new f(aVar);
            } else if (i8 == 0) {
                oVar = new u(aVar);
            } else if (i8 == 1) {
                oVar2 = new w(aVar, dVar.f6220d);
                sparseArray.append(i8, oVar2);
            } else if (i8 == 2) {
                oVar = new e(aVar);
            } else if (i8 == 3) {
                oVar = new n(aVar);
            } else {
                throw new IllegalArgumentException(q.a("Invalid end icon mode: ", i8));
            }
            oVar2 = oVar;
            sparseArray.append(i8, oVar2);
        }
        return oVar2;
    }

    public final boolean c() {
        return this.f6210b.getVisibility() == 0 && this.C.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f6211c.getVisibility() == 0;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        o b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.C;
        boolean z12 = true;
        if (!k10 || (isChecked = checkableImageButton.isChecked()) == b10.l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        }
        if (!(b10 instanceof n) || (isActivated = checkableImageButton.isActivated()) == b10.j()) {
            z12 = z11;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z10 || z12) {
            p.c(this.f6209a, checkableImageButton, this.G);
        }
    }

    public final void f(int i8) {
        if (this.E != i8) {
            o b10 = b();
            e2.d dVar = this.Q;
            AccessibilityManager accessibilityManager = this.P;
            if (!(dVar == null || accessibilityManager == null)) {
                e2.c.b(accessibilityManager, dVar);
            }
            CharSequence charSequence = null;
            this.Q = null;
            b10.s();
            this.E = i8;
            Iterator<TextInputLayout.h> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            g(i8 != 0);
            o b11 = b();
            int i10 = this.D.f6219c;
            if (i10 == 0) {
                i10 = b11.d();
            }
            Drawable a10 = i10 != 0 ? f.a.a(getContext(), i10) : null;
            CheckableImageButton checkableImageButton = this.C;
            checkableImageButton.setImageDrawable(a10);
            TextInputLayout textInputLayout = this.f6209a;
            if (a10 != null) {
                p.a(textInputLayout, checkableImageButton, this.G, this.H);
                p.c(textInputLayout, checkableImageButton, this.G);
            }
            int c3 = b11.c();
            if (c3 != 0) {
                charSequence = getResources().getText(c3);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.k());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.r();
                e2.d h3 = b11.h();
                this.Q = h3;
                if (!(h3 == null || accessibilityManager == null)) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (i0.g.b(this)) {
                        e2.c.a(accessibilityManager, this.Q);
                    }
                }
                View.OnClickListener f10 = b11.f();
                View.OnLongClickListener onLongClickListener = this.K;
                checkableImageButton.setOnClickListener(f10);
                p.d(checkableImageButton, onLongClickListener);
                EditText editText = this.O;
                if (editText != null) {
                    b11.m(editText);
                    i(b11);
                }
                p.a(textInputLayout, checkableImageButton, this.G, this.H);
                e(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i8);
        }
    }

    public final void g(boolean z10) {
        if (c() != z10) {
            this.C.setVisibility(z10 ? 0 : 8);
            j();
            l();
            this.f6209a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f6211c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        p.a(this.f6209a, checkableImageButton, this.f6212d, this.f6213e);
    }

    public final void i(o oVar) {
        if (this.O != null) {
            if (oVar.e() != null) {
                this.O.setOnFocusChangeListener(oVar.e());
            }
            if (oVar.g() != null) {
                this.C.setOnFocusChangeListener(oVar.g());
            }
        }
    }

    public final void j() {
        int i8 = 8;
        this.f6210b.setVisibility((this.C.getVisibility() != 0 || d()) ? 8 : 0);
        if (c() || d() || !((this.L == null || this.N) ? true : false)) {
            i8 = 0;
        }
        setVisibility(i8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f6211c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z10 = true;
        TextInputLayout textInputLayout = this.f6209a;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.F.f183q && textInputLayout.m() ? 0 : 8);
        j();
        l();
        if (this.E == 0) {
            z10 = false;
        }
        if (!z10) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i8;
        TextInputLayout textInputLayout = this.f6209a;
        if (textInputLayout.f6177d != null) {
            if (c() || d()) {
                i8 = 0;
            } else {
                EditText editText = textInputLayout.f6177d;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i8 = i0.e.e(editText);
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.f6177d.getPaddingTop();
            int paddingBottom = textInputLayout.f6177d.getPaddingBottom();
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.e.k(this.M, dimensionPixelSize, paddingTop, i8, paddingBottom);
        }
    }

    public final void m() {
        d0 d0Var = this.M;
        int visibility = d0Var.getVisibility();
        boolean z10 = false;
        int i8 = (this.L == null || this.N) ? 8 : 0;
        if (visibility != i8) {
            o b10 = b();
            if (i8 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        j();
        d0Var.setVisibility(i8);
        this.f6209a.p();
    }
}
