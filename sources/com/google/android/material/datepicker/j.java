package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.r;
import com.quickkonnect.silencio.R;
import d2.i0;
import e2.i;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class j<S> extends b0<S> {
    public static final /* synthetic */ int J0 = 0;
    public w A0;
    public int B0;
    public c C0;
    public RecyclerView D0;
    public RecyclerView E0;
    public View F0;
    public View G0;
    public View H0;
    public View I0;

    /* renamed from: w0  reason: collision with root package name */
    public int f5887w0;

    /* renamed from: x0  reason: collision with root package name */
    public d<S> f5888x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f5889y0;

    /* renamed from: z0  reason: collision with root package name */
    public f f5890z0;

    public class a extends d2.a {
        public final void d(View view, i iVar) {
            this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
            iVar.k((i.c) null);
        }
    }

    public class b extends d0 {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i8, int i10) {
            super(i8);
            this.E = i10;
        }

        public final void D0(RecyclerView.y yVar, int[] iArr) {
            int i8 = this.E;
            j jVar = j.this;
            if (i8 == 0) {
                iArr[0] = jVar.E0.getWidth();
                iArr[1] = jVar.E0.getWidth();
                return;
            }
            iArr[0] = jVar.E0.getHeight();
            iArr[1] = jVar.E0.getHeight();
        }
    }

    public class c implements d {
        public c() {
        }
    }

    public interface d {
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.C;
        }
        this.f5887w0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f5888x0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5889y0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5890z0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A0 = (w) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8;
        int i10;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(q(), this.f5887w0);
        this.C0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        w wVar = this.f5889y0.f5844a;
        if (r.v0(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i8 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i8 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = e0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = x.C;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        i0.n(gridView, new a());
        int i12 = this.f5889y0.f5848e;
        if (i12 <= 0) {
            gVar = new g();
        }
        gridView.setAdapter(gVar);
        gridView.setNumColumns(wVar.f5929d);
        gridView.setEnabled(false);
        this.E0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        q();
        this.E0.setLayoutManager(new b(i8, i8));
        this.E0.setTag("MONTHS_VIEW_GROUP_TAG");
        z zVar = new z(contextThemeWrapper, this.f5888x0, this.f5889y0, this.f5890z0, new c());
        this.E0.setAdapter(zVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.D0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.D0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.D0.setAdapter(new h0(this));
            this.D0.g(new l(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            i0.n(materialButton, new m(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.F0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.G0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.H0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.I0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            p0(1);
            materialButton.setText(this.A0.d());
            this.E0.h(new n(this, zVar, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.G0.setOnClickListener(new p(this, zVar));
            this.F0.setOnClickListener(new h(this, zVar));
        }
        if (!r.v0(contextThemeWrapper)) {
            new v().a(this.E0);
        }
        RecyclerView recyclerView2 = this.E0;
        w wVar2 = this.A0;
        w wVar3 = zVar.f5938d.f5844a;
        if (wVar3.f5926a instanceof GregorianCalendar) {
            recyclerView2.a0((wVar2.f5927b - wVar3.f5927b) + ((wVar2.f5928c - wVar3.f5928c) * 12));
            i0.n(this.E0, new k());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void W(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5887w0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5888x0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5889y0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f5890z0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A0);
    }

    public final boolean n0(r.d dVar) {
        return super.n0(dVar);
    }

    public final void o0(w wVar) {
        w wVar2 = ((z) this.E0.getAdapter()).f5938d.f5844a;
        Calendar calendar = wVar2.f5926a;
        if (calendar instanceof GregorianCalendar) {
            int i8 = wVar.f5928c;
            int i10 = wVar2.f5928c;
            int i11 = wVar.f5927b;
            int i12 = wVar2.f5927b;
            int i13 = (i11 - i12) + ((i8 - i10) * 12);
            w wVar3 = this.A0;
            if (calendar instanceof GregorianCalendar) {
                int i14 = i13 - ((wVar3.f5927b - i12) + ((wVar3.f5928c - i10) * 12));
                boolean z10 = true;
                boolean z11 = Math.abs(i14) > 3;
                if (i14 <= 0) {
                    z10 = false;
                }
                this.A0 = wVar;
                if (z11 && z10) {
                    this.E0.a0(i13 - 3);
                    this.E0.post(new i(this, i13));
                } else if (z11) {
                    this.E0.a0(i13 + 3);
                    this.E0.post(new i(this, i13));
                } else {
                    this.E0.post(new i(this, i13));
                }
            } else {
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final void p0(int i8) {
        this.B0 = i8;
        if (i8 == 2) {
            this.D0.getLayoutManager().q0(this.A0.f5928c - ((h0) this.D0.getAdapter()).f5883d.f5889y0.f5844a.f5928c);
            this.H0.setVisibility(0);
            this.I0.setVisibility(8);
            this.F0.setVisibility(8);
            this.G0.setVisibility(8);
        } else if (i8 == 1) {
            this.H0.setVisibility(8);
            this.I0.setVisibility(0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            o0(this.A0);
        }
    }
}
