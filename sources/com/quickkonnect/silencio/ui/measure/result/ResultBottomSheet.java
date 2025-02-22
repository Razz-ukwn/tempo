package com.quickkonnect.silencio.ui.measure.result;

import android.app.Dialog;
import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import nc.v0;
import od.k;
import r5.i;
import rf.l;
import sf.j;
import sf.w;
import x2.a;

public final class ResultBottomSheet extends od.a {
    public static final /* synthetic */ int U0 = 0;
    public v0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(k.class), new b(this));
    public androidx.appcompat.app.b T0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7056a;

        public a(od.d dVar) {
            this.f7056a = dVar;
        }

        public final ff.a<?> a() {
            return this.f7056a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7056a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f7056a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7056a.hashCode();
        }
    }

    public static final class b extends sf.k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7057a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7057a = pVar;
        }

        public final Object d() {
            p pVar = this.f7057a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends sf.k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7058a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f7058a = pVar;
        }

        public final Object d() {
            return this.f7058a;
        }
    }

    public static final class d extends sf.k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7059a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f7059a = cVar;
        }

        public final Object d() {
            return (p0) this.f7059a.d();
        }
    }

    public static final class e extends sf.k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7060a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7060a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7060a, "owner.viewModelStore");
        }
    }

    public static final class f extends sf.k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7061a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f7061a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7061a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class g extends sf.k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7062a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7063b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f7062a = pVar;
            this.f7063b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7063b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7062a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ResultBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(ResultViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        j.f(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(R.layout.bottom_sheet_result, viewGroup, false);
        int i8 = R.id.btn_claim_coins;
        MaterialButton materialButton = (MaterialButton) cb.b.x(inflate, R.id.btn_claim_coins);
        if (materialButton != null) {
            i8 = R.id.btn_close;
            ImageView imageView = (ImageView) cb.b.x(inflate, R.id.btn_close);
            if (imageView != null) {
                i8 = R.id.card_information_result;
                MaterialCardView materialCardView = (MaterialCardView) cb.b.x(inflate, R.id.card_information_result);
                if (materialCardView != null) {
                    i8 = R.id.cl_chart;
                    if (((ConstraintLayout) cb.b.x(inflate, R.id.cl_chart)) != null) {
                        i8 = R.id.dba_chart;
                        if (((TextView) cb.b.x(inflate, R.id.dba_chart)) != null) {
                            i8 = R.id.imageView22;
                            if (((ImageView) cb.b.x(inflate, R.id.imageView22)) != null) {
                                i8 = R.id.materialCardView;
                                if (((MaterialCardView) cb.b.x(inflate, R.id.materialCardView)) != null) {
                                    i8 = R.id.measuring_card_view;
                                    if (((MaterialCardView) cb.b.x(inflate, R.id.measuring_card_view)) != null) {
                                        i8 = R.id.measuring_chart;
                                        LineChart lineChart = (LineChart) cb.b.x(inflate, R.id.measuring_chart);
                                        if (lineChart != null) {
                                            i8 = R.id.measuring_meter_compose_view;
                                            ComposeView composeView = (ComposeView) cb.b.x(inflate, R.id.measuring_meter_compose_view);
                                            if (composeView != null) {
                                                i8 = R.id.textView38;
                                                if (((TextView) cb.b.x(inflate, R.id.textView38)) != null) {
                                                    i8 = R.id.textView47;
                                                    if (((TextView) cb.b.x(inflate, R.id.textView47)) != null) {
                                                        i8 = R.id.textView48;
                                                        if (((TextView) cb.b.x(inflate, R.id.textView48)) != null) {
                                                            i8 = R.id.textView49;
                                                            if (((TextView) cb.b.x(inflate, R.id.textView49)) != null) {
                                                                i8 = R.id.textView50;
                                                                if (((TextView) cb.b.x(inflate, R.id.textView50)) != null) {
                                                                    i8 = R.id.time_chart_text;
                                                                    if (((TextView) cb.b.x(inflate, R.id.time_chart_text)) != null) {
                                                                        i8 = R.id.tv_dba;
                                                                        if (((TextView) cb.b.x(inflate, R.id.tv_dba)) != null) {
                                                                            i8 = R.id.tv_measuring_avg_db;
                                                                            TextView textView = (TextView) cb.b.x(inflate, R.id.tv_measuring_avg_db);
                                                                            if (textView != null) {
                                                                                i8 = R.id.tv_measuring_db;
                                                                                TextView textView2 = (TextView) cb.b.x(inflate, R.id.tv_measuring_db);
                                                                                if (textView2 != null) {
                                                                                    i8 = R.id.tv_measuring_max_db;
                                                                                    TextView textView3 = (TextView) cb.b.x(inflate, R.id.tv_measuring_max_db);
                                                                                    if (textView3 != null) {
                                                                                        i8 = R.id.tv_measuring_min_db;
                                                                                        TextView textView4 = (TextView) cb.b.x(inflate, R.id.tv_measuring_min_db);
                                                                                        if (textView4 != null) {
                                                                                            i8 = R.id.tv_measuring_timer;
                                                                                            TextView textView5 = (TextView) cb.b.x(inflate, R.id.tv_measuring_timer);
                                                                                            if (textView5 != null) {
                                                                                                i8 = R.id.tv_over;
                                                                                                if (((TextView) cb.b.x(inflate, R.id.tv_over)) != null) {
                                                                                                    i8 = R.id.tv_result_earned_coins;
                                                                                                    TextView textView6 = (TextView) cb.b.x(inflate, R.id.tv_result_earned_coins);
                                                                                                    if (textView6 != null) {
                                                                                                        i8 = R.id.tv_zero;
                                                                                                        if (((TextView) cb.b.x(inflate, R.id.tv_zero)) != null) {
                                                                                                            this.Q0 = new v0((NestedScrollView) inflate, materialButton, imageView, materialCardView, lineChart, composeView, textView, textView2, textView3, textView4, textView5, textView6);
                                                                                                            Dialog dialog = this.G0;
                                                                                                            Integer num = null;
                                                                                                            com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                                                                                                            BottomSheetBehavior<FrameLayout> h3 = bVar != null ? bVar.h() : null;
                                                                                                            if (h3 != null) {
                                                                                                                h3.C(3);
                                                                                                            }
                                                                                                            v0 v0Var = this.Q0;
                                                                                                            j.c(v0Var);
                                                                                                            v0Var.f11858f.setContent(z.b.c(993406125, new od.j(this), true));
                                                                                                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
                                                                                                            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                                                                            Double length = u0().f12303a.getLength();
                                                                                                            String format = simpleDateFormat.format(new Date((length != null ? (long) length.doubleValue() : 0) * ((long) 1000)));
                                                                                                            v0 v0Var2 = this.Q0;
                                                                                                            j.c(v0Var2);
                                                                                                            v0Var2.f11863k.setText(format);
                                                                                                            v0 v0Var3 = this.Q0;
                                                                                                            j.c(v0Var3);
                                                                                                            Double minDb = u0().f12303a.getMinDb();
                                                                                                            v0Var3.f11862j.setText(String.valueOf(minDb != null ? Integer.valueOf(q4.a.f(minDb.doubleValue())) : null));
                                                                                                            v0 v0Var4 = this.Q0;
                                                                                                            j.c(v0Var4);
                                                                                                            Double maxDb = u0().f12303a.getMaxDb();
                                                                                                            v0Var4.f11861i.setText(String.valueOf(maxDb != null ? Integer.valueOf(q4.a.f(maxDb.doubleValue())) : null));
                                                                                                            v0 v0Var5 = this.Q0;
                                                                                                            j.c(v0Var5);
                                                                                                            Double avgDb = u0().f12303a.getAvgDb();
                                                                                                            v0Var5.f11859g.setText(String.valueOf(avgDb != null ? Integer.valueOf(q4.a.f(avgDb.doubleValue())) : null));
                                                                                                            v0 v0Var6 = this.Q0;
                                                                                                            j.c(v0Var6);
                                                                                                            Double avgDb2 = u0().f12303a.getAvgDb();
                                                                                                            if (avgDb2 != null) {
                                                                                                                num = Integer.valueOf(q4.a.f(avgDb2.doubleValue()));
                                                                                                            }
                                                                                                            v0Var6.f11860h.setText(String.valueOf(num));
                                                                                                            v0 v0Var7 = this.Q0;
                                                                                                            j.c(v0Var7);
                                                                                                            v0Var7.f11864l.setText(y(R.string.result_earned_coin_formatter, Float.valueOf(u0().f12304b)));
                                                                                                            v0 v0Var8 = this.Q0;
                                                                                                            j.c(v0Var8);
                                                                                                            LineChart lineChart2 = v0Var8.f11857e;
                                                                                                            lineChart2.setTouchEnabled(false);
                                                                                                            lineChart2.setScaleEnabled(false);
                                                                                                            lineChart2.setPinchZoom(false);
                                                                                                            lineChart2.setDoubleTapToZoomEnabled(false);
                                                                                                            lineChart2.l();
                                                                                                            lineChart2.getLegend().f14035a = false;
                                                                                                            r5.h xAxis = lineChart2.getXAxis();
                                                                                                            xAxis.f14023o = 5.0f;
                                                                                                            xAxis.f14024p = true;
                                                                                                            lineChart2.getXAxis().E = 2;
                                                                                                            lineChart2.getXAxis().f14016g = e0().getColor(R.color.chart_grid_color);
                                                                                                            lineChart2.getAxisRight().f14035a = false;
                                                                                                            i axisLeft = lineChart2.getAxisLeft();
                                                                                                            axisLeft.f14033y = true;
                                                                                                            axisLeft.B = 0.0f;
                                                                                                            axisLeft.C = Math.abs(axisLeft.A - 0.0f);
                                                                                                            i axisLeft2 = lineChart2.getAxisLeft();
                                                                                                            axisLeft2.f14034z = true;
                                                                                                            axisLeft2.A = 120.0f;
                                                                                                            axisLeft2.C = Math.abs(120.0f - axisLeft2.B);
                                                                                                            lineChart2.getAxisLeft().f14016g = e0().getColor(R.color.chart_grid_color);
                                                                                                            float[] fArr = {20.0f, 5.0f};
                                                                                                            lineChart2.getAxisLeft().f14028t = new DashPathEffect(fArr, 5.0f);
                                                                                                            lineChart2.getXAxis().f14028t = new DashPathEffect(fArr, 5.0f);
                                                                                                            lineChart2.getDescription().f14035a = false;
                                                                                                            ArrayList arrayList = new ArrayList();
                                                                                                            float[] fArr2 = u0().f12306d;
                                                                                                            int length2 = fArr2.length;
                                                                                                            int i10 = 0;
                                                                                                            int i11 = 0;
                                                                                                            while (i10 < length2) {
                                                                                                                arrayList.add(new s5.f((float) i11, fArr2[i10]));
                                                                                                                i10++;
                                                                                                                i11++;
                                                                                                            }
                                                                                                            s5.h hVar = new s5.h(arrayList);
                                                                                                            hVar.A = z5.f.c(1.75f);
                                                                                                            hVar.J = false;
                                                                                                            int color = e0().getColor(R.color.bluish_purple);
                                                                                                            if (hVar.f14706a == null) {
                                                                                                                hVar.f14706a = new ArrayList();
                                                                                                            }
                                                                                                            hVar.f14706a.clear();
                                                                                                            hVar.f14706a.add(Integer.valueOf(color));
                                                                                                            hVar.B = true;
                                                                                                            hVar.f14741y = f.a.a(e0(), R.drawable.measuring_chart_gradient);
                                                                                                            hVar.f14715j = false;
                                                                                                            s5.g gVar = new s5.g(hVar);
                                                                                                            v0 v0Var9 = this.Q0;
                                                                                                            j.c(v0Var9);
                                                                                                            v0Var9.f11857e.setData(gVar);
                                                                                                            v0 v0Var10 = this.Q0;
                                                                                                            j.c(v0Var10);
                                                                                                            v0Var10.f11857e.invalidate();
                                                                                                            v0 v0Var11 = this.Q0;
                                                                                                            j.c(v0Var11);
                                                                                                            ImageView imageView2 = v0Var11.f11855c;
                                                                                                            j.e(imageView2, "binding.btnClose");
                                                                                                            zd.e.a(imageView2, new od.g(this));
                                                                                                            v0 v0Var12 = this.Q0;
                                                                                                            j.c(v0Var12);
                                                                                                            MaterialButton materialButton2 = v0Var12.f11854b;
                                                                                                            j.e(materialButton2, "binding.btnClaimCoins");
                                                                                                            zd.e.a(materialButton2, new od.h(this));
                                                                                                            v0 v0Var13 = this.Q0;
                                                                                                            j.c(v0Var13);
                                                                                                            MaterialCardView materialCardView2 = v0Var13.f11856d;
                                                                                                            j.e(materialCardView2, "binding.cardInformationResult");
                                                                                                            zd.e.a(materialCardView2, new od.i(this));
                                                                                                            this.T0 = zd.d.a(this);
                                                                                                            this.B0 = false;
                                                                                                            Dialog dialog2 = this.G0;
                                                                                                            if (dialog2 != null) {
                                                                                                                dialog2.setCancelable(false);
                                                                                                            }
                                                                                                            v0 v0Var14 = this.Q0;
                                                                                                            j.c(v0Var14);
                                                                                                            NestedScrollView nestedScrollView = v0Var14.f11853a;
                                                                                                            j.e(nestedScrollView, "binding.root");
                                                                                                            return nestedScrollView;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        ((ResultViewModel) this.R0.getValue()).f7065h.e(z(), new a(new od.d(this)));
    }

    public final k u0() {
        return (k) this.S0.getValue();
    }
}
