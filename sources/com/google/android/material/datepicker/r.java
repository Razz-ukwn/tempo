package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.n;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.h1;
import d2.i0;
import d2.i1;
import d2.u1;
import e2.i;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import v8.f;

public final class r<S> extends n {

    /* renamed from: l1  reason: collision with root package name */
    public static final /* synthetic */ int f5902l1 = 0;
    public final LinkedHashSet<u<? super S>> L0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> M0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> N0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> O0 = new LinkedHashSet<>();
    public int P0;
    public d<S> Q0;
    public b0<S> R0;
    public a S0;
    public f T0;
    public j<S> U0;
    public int V0;
    public CharSequence W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1  reason: collision with root package name */
    public CharSequence f5903a1;

    /* renamed from: b1  reason: collision with root package name */
    public int f5904b1;

    /* renamed from: c1  reason: collision with root package name */
    public CharSequence f5905c1;

    /* renamed from: d1  reason: collision with root package name */
    public TextView f5906d1;

    /* renamed from: e1  reason: collision with root package name */
    public TextView f5907e1;

    /* renamed from: f1  reason: collision with root package name */
    public CheckableImageButton f5908f1;

    /* renamed from: g1  reason: collision with root package name */
    public f f5909g1;

    /* renamed from: h1  reason: collision with root package name */
    public Button f5910h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f5911i1;

    /* renamed from: j1  reason: collision with root package name */
    public CharSequence f5912j1;

    /* renamed from: k1  reason: collision with root package name */
    public CharSequence f5913k1;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<u<? super S>> it = rVar.L0.iterator();
            while (it.hasNext()) {
                rVar.t0().q();
                it.next().a();
            }
            rVar.o0(false, false);
        }
    }

    public class b extends d2.a {
        public b() {
        }

        public final void d(View view, i iVar) {
            this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
            StringBuilder sb2 = new StringBuilder();
            int i8 = r.f5902l1;
            sb2.append(r.this.t0().v());
            sb2.append(", ");
            sb2.append(iVar.i());
            iVar.m(sb2.toString());
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<View.OnClickListener> it = rVar.M0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            rVar.o0(false, false);
        }
    }

    public class d extends a0<S> {
        public d() {
        }

        public final void a(S s10) {
            r rVar = r.this;
            d t02 = rVar.t0();
            rVar.q();
            String f10 = t02.f();
            TextView textView = rVar.f5907e1;
            d t03 = rVar.t0();
            rVar.e0();
            textView.setContentDescription(t03.m());
            rVar.f5907e1.setText(f10);
            rVar.f5910h1.setEnabled(rVar.t0().l());
        }
    }

    public static int u0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c3 = f0.c();
        c3.set(5, 1);
        Calendar b10 = f0.b(c3);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean v0(Context context) {
        return w0(context, 16843277);
    }

    public static boolean w0(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r8.b.c(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, new int[]{i8});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.C;
        }
        this.P0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.Q0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.S0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.T0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.V0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.W0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.Y0 = bundle.getInt("INPUT_MODE_KEY");
        this.Z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5903a1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5904b1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5905c1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.W0;
        if (charSequence == null) {
            charSequence = e0().getResources().getText(this.V0);
        }
        this.f5912j1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f5913k1 = charSequence;
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.X0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.T0;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.X0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(u0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(u0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f5907e1 = textView;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.g.f(textView, 1);
        this.f5908f1 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f5906d1 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f5908f1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5908f1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], f.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f5908f1.setChecked(this.Y0 != 0);
        i0.n(this.f5908f1, (d2.a) null);
        y0(this.f5908f1);
        this.f5908f1.setOnClickListener(new t(this));
        this.f5910h1 = (Button) inflate.findViewById(R.id.confirm_button);
        if (t0().l()) {
            this.f5910h1.setEnabled(true);
        } else {
            this.f5910h1.setEnabled(false);
        }
        this.f5910h1.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f5903a1;
        if (charSequence != null) {
            this.f5910h1.setText(charSequence);
        } else {
            int i8 = this.Z0;
            if (i8 != 0) {
                this.f5910h1.setText(i8);
            }
        }
        this.f5910h1.setOnClickListener(new a());
        i0.n(this.f5910h1, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f5905c1;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i10 = this.f5904b1;
            if (i10 != 0) {
                button.setText(i10);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    public final void W(Bundle bundle) {
        super.W(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.P0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.Q0);
        a.b bVar = new a.b(this.S0);
        w wVar = this.U0.A0;
        if (wVar != null) {
            bVar.f5853c = Long.valueOf(wVar.B);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f5855e);
        w c3 = w.c(bVar.f5851a);
        w c10 = w.c(bVar.f5852b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f5853c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(c3, c10, cVar, l10 == null ? null : w.c(l10.longValue()), bVar.f5854d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.T0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.V0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.W0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f5903a1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5904b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f5905c1);
    }

    public final void X() {
        super.X();
        Window window = q0().getWindow();
        if (this.X0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5909g1);
            if (!this.f5911i1) {
                View findViewById = f0().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i8 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = valueOf == null || valueOf.intValue() == 0;
                int e10 = b1.b.e(window.getContext(), 16842801, -16777216);
                if (z11) {
                    valueOf = Integer.valueOf(e10);
                }
                Integer valueOf2 = Integer.valueOf(e10);
                if (i8 >= 30) {
                    i1.a(window, false);
                } else {
                    h1.a(window, false);
                }
                window.getContext();
                int c3 = i8 < 27 ? v1.d.c(b1.b.e(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(c3);
                (Build.VERSION.SDK_INT >= 30 ? new u1.d(window) : new u1.c(window, window.getDecorView())).d(b1.b.g(0) || b1.b.g(valueOf.intValue()));
                boolean g10 = b1.b.g(valueOf2.intValue());
                if (b1.b.g(c3) || (c3 == 0 && g10)) {
                    z10 = true;
                }
                (Build.VERSION.SDK_INT >= 30 ? new u1.d(window) : new u1.c(window, window.getDecorView())).c(z10);
                s sVar = new s(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.i.u(findViewById, sVar);
                this.f5911i1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = v().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f5909g1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new h8.a(q0(), rect));
        }
        x0();
    }

    public final void Y() {
        this.R0.f5862v0.clear();
        super.Y();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.N0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.O0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2066d0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog p0() {
        Context e02 = e0();
        e0();
        int i8 = this.P0;
        if (i8 == 0) {
            i8 = t0().j();
        }
        Dialog dialog = new Dialog(e02, i8);
        Context context = dialog.getContext();
        this.X0 = v0(context);
        int i10 = r8.b.c(R.attr.colorSurface, context, r.class.getCanonicalName()).data;
        f fVar = new f(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132018222);
        this.f5909g1 = fVar;
        fVar.j(context);
        this.f5909g1.m(ColorStateList.valueOf(i10));
        f fVar2 = this.f5909g1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        fVar2.l(i0.i.i(decorView));
        return dialog;
    }

    public final d<S> t0() {
        if (this.Q0 == null) {
            this.Q0 = (d) this.C.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.Q0;
    }

    public final void x0() {
        b0<S> b0Var;
        CharSequence charSequence;
        e0();
        int i8 = this.P0;
        if (i8 == 0) {
            i8 = t0().j();
        }
        d t02 = t0();
        a aVar = this.S0;
        f fVar = this.T0;
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("GRID_SELECTOR_KEY", t02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f5847d);
        jVar.h0(bundle);
        this.U0 = jVar;
        boolean isChecked = this.f5908f1.isChecked();
        if (isChecked) {
            d t03 = t0();
            a aVar2 = this.S0;
            b0Var = new v<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i8);
            bundle2.putParcelable("DATE_SELECTOR_KEY", t03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            b0Var.h0(bundle2);
        } else {
            b0Var = this.U0;
        }
        this.R0 = b0Var;
        TextView textView = this.f5906d1;
        if (isChecked) {
            if (v().getConfiguration().orientation == 2) {
                charSequence = this.f5913k1;
                textView.setText(charSequence);
                d t04 = t0();
                q();
                String f10 = t04.f();
                TextView textView2 = this.f5907e1;
                d t05 = t0();
                e0();
                textView2.setContentDescription(t05.m());
                this.f5907e1.setText(f10);
                androidx.fragment.app.i0 p10 = p();
                p10.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(p10);
                aVar3.e(R.id.mtrl_calendar_frame, this.R0, (String) null);
                aVar3.j();
                this.R0.n0(new d());
            }
        }
        charSequence = this.f5912j1;
        textView.setText(charSequence);
        d t042 = t0();
        q();
        String f102 = t042.f();
        TextView textView22 = this.f5907e1;
        d t052 = t0();
        e0();
        textView22.setContentDescription(t052.m());
        this.f5907e1.setText(f102);
        androidx.fragment.app.i0 p102 = p();
        p102.getClass();
        androidx.fragment.app.a aVar32 = new androidx.fragment.app.a(p102);
        aVar32.e(R.id.mtrl_calendar_frame, this.R0, (String) null);
        aVar32.j();
        this.R0.n0(new d());
    }

    public final void y0(CheckableImageButton checkableImageButton) {
        this.f5908f1.setContentDescription(this.f5908f1.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
