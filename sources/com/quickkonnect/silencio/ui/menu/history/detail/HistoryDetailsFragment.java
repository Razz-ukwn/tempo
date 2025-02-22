package com.quickkonnect.silencio.ui.menu.history.detail;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import b3.g;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import h4.h;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import nc.c1;
import qd.b;
import sf.j;
import sf.k;
import sf.w;
import x3.f;
import zd.d;
import zf.n;

public final class HistoryDetailsFragment extends qd.a {
    public static final /* synthetic */ int C0 = 0;
    public c1 A0;
    public final g B0 = new g(w.a(b.class), new a(this));

    public static final class a extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7078a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f7078a = pVar;
        }

        public final Object d() {
            p pVar = this.f7078a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static void p0(TextView textView, String str, String str2, StyleSpan styleSpan) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int G0 = n.G0(str, str2, 0, false, 6);
        spannableStringBuilder.setSpan(styleSpan, G0, str2.length() + G0, 18);
        textView.setText(spannableStringBuilder);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_history_details, viewGroup, false);
        int i8 = R.id.card_history_back;
        MaterialCardView materialCardView = (MaterialCardView) cb.b.x(inflate, R.id.card_history_back);
        if (materialCardView != null) {
            i8 = R.id.divider;
            if (cb.b.x(inflate, R.id.divider) != null) {
                i8 = R.id.divider2;
                if (cb.b.x(inflate, R.id.divider2) != null) {
                    i8 = R.id.divider3;
                    if (cb.b.x(inflate, R.id.divider3) != null) {
                        i8 = R.id.guideline2;
                        Guideline guideline = (Guideline) cb.b.x(inflate, R.id.guideline2);
                        if (guideline != null) {
                            i8 = R.id.hd_ll;
                            if (((LinearLayout) cb.b.x(inflate, R.id.hd_ll)) != null) {
                                i8 = R.id.imageView2;
                                if (((ImageView) cb.b.x(inflate, R.id.imageView2)) != null) {
                                    i8 = R.id.iv_hd;
                                    ImageView imageView = (ImageView) cb.b.x(inflate, R.id.iv_hd);
                                    if (imageView != null) {
                                        i8 = R.id.textView46;
                                        if (((TextView) cb.b.x(inflate, R.id.textView46)) != null) {
                                            i8 = R.id.tv_hd_avd_db;
                                            TextView textView = (TextView) cb.b.x(inflate, R.id.tv_hd_avd_db);
                                            if (textView != null) {
                                                i8 = R.id.tv_hd_coins;
                                                TextView textView2 = (TextView) cb.b.x(inflate, R.id.tv_hd_coins);
                                                if (textView2 != null) {
                                                    i8 = R.id.tv_hd_date;
                                                    TextView textView3 = (TextView) cb.b.x(inflate, R.id.tv_hd_date);
                                                    if (textView3 != null) {
                                                        i8 = R.id.tv_hd_duration;
                                                        TextView textView4 = (TextView) cb.b.x(inflate, R.id.tv_hd_duration);
                                                        if (textView4 != null) {
                                                            i8 = R.id.tv_hd_max_db;
                                                            TextView textView5 = (TextView) cb.b.x(inflate, R.id.tv_hd_max_db);
                                                            if (textView5 != null) {
                                                                i8 = R.id.tv_hd_min_db;
                                                                TextView textView6 = (TextView) cb.b.x(inflate, R.id.tv_hd_min_db);
                                                                if (textView6 != null) {
                                                                    this.A0 = new c1((ConstraintLayout) inflate, materialCardView, guideline, imageView, textView, textView2, textView3, textView4, textView5, textView6);
                                                                    guideline.setGuidelineBegin(d.b(this));
                                                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
                                                                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss", Locale.getDefault());
                                                                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                                    Long createdAt = o0().f13506a.getCreatedAt();
                                                                    long j10 = 0;
                                                                    Date date = new Date(createdAt != null ? createdAt.longValue() : 0);
                                                                    Double length = o0().f13506a.getLength();
                                                                    if (length != null) {
                                                                        j10 = (long) length.doubleValue();
                                                                    }
                                                                    Date date2 = new Date(j10 * 1000);
                                                                    c1 c1Var = this.A0;
                                                                    j.c(c1Var);
                                                                    TextView textView7 = c1Var.f11640f;
                                                                    j.e(textView7, "binding.tvHdDate");
                                                                    p0(textView7, "Date: " + simpleDateFormat.format(date), "Date:", new StyleSpan(1));
                                                                    c1 c1Var2 = this.A0;
                                                                    j.c(c1Var2);
                                                                    TextView textView8 = c1Var2.f11641g;
                                                                    j.e(textView8, "binding.tvHdDuration");
                                                                    p0(textView8, "Duration: " + simpleDateFormat2.format(date2), "Duration:", new StyleSpan(1));
                                                                    c1 c1Var3 = this.A0;
                                                                    j.c(c1Var3);
                                                                    TextView textView9 = c1Var3.f11639e;
                                                                    j.e(textView9, "binding.tvHdCoins");
                                                                    String format = String.format("%,.2f", Arrays.copyOf(new Object[]{o0().f13506a.getCoinsEarned()}, 1));
                                                                    j.e(format, "format(format, *args)");
                                                                    p0(textView9, "Coins Earned: ".concat(format), "Coins Earned:", new StyleSpan(1));
                                                                    c1 c1Var4 = this.A0;
                                                                    j.c(c1Var4);
                                                                    TextView textView10 = c1Var4.f11643i;
                                                                    j.e(textView10, "binding.tvHdMinDb");
                                                                    StringBuilder sb2 = new StringBuilder("Min dB-A: ");
                                                                    Double minDb = o0().f13506a.getMinDb();
                                                                    Integer num = null;
                                                                    sb2.append(minDb != null ? Integer.valueOf(q4.a.f(minDb.doubleValue())) : null);
                                                                    p0(textView10, sb2.toString(), "Min dB-A:", new StyleSpan(1));
                                                                    c1 c1Var5 = this.A0;
                                                                    j.c(c1Var5);
                                                                    TextView textView11 = c1Var5.f11642h;
                                                                    j.e(textView11, "binding.tvHdMaxDb");
                                                                    StringBuilder sb3 = new StringBuilder("Max dB-A: ");
                                                                    Double maxDb = o0().f13506a.getMaxDb();
                                                                    sb3.append(maxDb != null ? Integer.valueOf(q4.a.f(maxDb.doubleValue())) : null);
                                                                    p0(textView11, sb3.toString(), "Max dB-A:", new StyleSpan(1));
                                                                    c1 c1Var6 = this.A0;
                                                                    j.c(c1Var6);
                                                                    TextView textView12 = c1Var6.f11638d;
                                                                    j.e(textView12, "binding.tvHdAvdDb");
                                                                    StringBuilder sb4 = new StringBuilder("Avg dB-A: ");
                                                                    Double avgDb = o0().f13506a.getAvgDb();
                                                                    if (avgDb != null) {
                                                                        num = Integer.valueOf(q4.a.f(avgDb.doubleValue()));
                                                                    }
                                                                    sb4.append(num);
                                                                    p0(textView12, sb4.toString(), "Avg dB-A:", new StyleSpan(1));
                                                                    c1 c1Var7 = this.A0;
                                                                    j.c(c1Var7);
                                                                    ImageView imageView2 = c1Var7.f11637c;
                                                                    j.e(imageView2, "binding.ivHd");
                                                                    String pathImage = o0().f13506a.getPathImage();
                                                                    f e10 = cb.f.e(imageView2.getContext());
                                                                    h.a aVar = new h.a(imageView2.getContext());
                                                                    aVar.f9171c = pathImage;
                                                                    aVar.c(imageView2);
                                                                    e10.a(aVar.a());
                                                                    c1 c1Var8 = this.A0;
                                                                    j.c(c1Var8);
                                                                    c1Var8.f11636b.setOnClickListener(new sc.a(this, 11));
                                                                    c1 c1Var9 = this.A0;
                                                                    j.c(c1Var9);
                                                                    ConstraintLayout constraintLayout = c1Var9.f11635a;
                                                                    j.e(constraintLayout, "binding.root");
                                                                    return constraintLayout;
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
        this.f2062b0 = true;
        this.A0 = null;
    }

    public final b o0() {
        return (b) this.B0.getValue();
    }
}
