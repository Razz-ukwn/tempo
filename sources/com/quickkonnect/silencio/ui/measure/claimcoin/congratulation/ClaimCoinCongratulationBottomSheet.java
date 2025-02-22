package com.quickkonnect.silencio.ui.measure.claimcoin.congratulation;

import ag.g0;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.l;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.q;
import b3.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.R;
import eg.e;
import fd.f;
import ff.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jf.d;
import jf.f;
import lf.e;
import nc.i;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import rf.p;
import sf.j;
import sf.k;
import sf.w;
import zd.h;

public final class ClaimCoinCongratulationBottomSheet extends com.google.android.material.bottomsheet.c {
    public static final /* synthetic */ int Q0 = 0;
    public i L0;
    public final g M0 = new g(w.a(f.class), new c(this));
    public a3.a N0;
    public boolean O0;
    public i9.f P0;

    @e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet$onResume$1", f = "ClaimCoinCongratulationBottomSheet.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends lf.i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6901a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinCongratulationBottomSheet f6902b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, d<? super a> dVar) {
            super(2, dVar);
            this.f6902b = claimCoinCongratulationBottomSheet;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f6902b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f6901a;
            if (i8 == 0) {
                cb.b.J(obj);
                this.f6901a = 1;
                if (cb.d.x(500, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List P = cb.d.P(new Integer(16340040), new Integer(10214778), new Integer(16639831), new Integer(2454755), new Integer(13199308));
            fg.c cVar = new fg.c(new fg.b(TimeUnit.MILLISECONDS));
            cVar.f8743b = 1.0f / ((float) 60);
            eg.b bVar = new eg.b(P, new e.b(-0.1d), cVar);
            i iVar = this.f6902b.L0;
            j.c(iVar);
            KonfettiView konfettiView = iVar.f11702d;
            konfettiView.getClass();
            konfettiView.f11995a.add(new eg.d(bVar));
            konfettiView.invalidate();
            return m.f8717a;
        }
    }

    @lf.e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet$onResume$2", f = "ClaimCoinCongratulationBottomSheet.kt", l = {80}, m = "invokeSuspend")
    public static final class b extends lf.i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6903a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinCongratulationBottomSheet f6904b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, d<? super b> dVar) {
            super(2, dVar);
            this.f6904b = claimCoinCongratulationBottomSheet;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f6904b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet = this.f6904b;
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f6903a;
            if (i8 == 0) {
                cb.b.J(obj);
                this.f6903a = 1;
                if (cb.d.x(500, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                if (claimCoinCongratulationBottomSheet.O0) {
                    return m.f8717a;
                }
                claimCoinCongratulationBottomSheet.O0 = true;
                if (claimCoinCongratulationBottomSheet.u0().f8694b) {
                    SharedPreferences sharedPreferences = h.f17950a;
                    if (sharedPreferences == null) {
                        j.l("prefs");
                        throw null;
                    } else if (!sharedPreferences.getBoolean("SHOW_CAP_LIMIT_POPUP", false)) {
                        ag.m.c(claimCoinCongratulationBottomSheet).n(new fd.g(claimCoinCongratulationBottomSheet.u0().f8694b, claimCoinCongratulationBottomSheet.u0().f8695c, claimCoinCongratulationBottomSheet.u0().f8696d));
                        return m.f8717a;
                    }
                }
                if (claimCoinCongratulationBottomSheet.u0().f8695c) {
                    SharedPreferences sharedPreferences2 = h.f17950a;
                    if (sharedPreferences2 == null) {
                        j.l("prefs");
                        throw null;
                    } else if (!sharedPreferences2.getBoolean("SHOW_MIC_INTERRUPT_POPUP", false)) {
                        ag.m.c(claimCoinCongratulationBottomSheet).n(new fd.g(claimCoinCongratulationBottomSheet.u0().f8694b, claimCoinCongratulationBottomSheet.u0().f8695c, claimCoinCongratulationBottomSheet.u0().f8696d));
                        return m.f8717a;
                    }
                }
                if (claimCoinCongratulationBottomSheet.u0().f8696d) {
                    SharedPreferences sharedPreferences3 = h.f17950a;
                    if (sharedPreferences3 == null) {
                        j.l("prefs");
                        throw null;
                    } else if (!sharedPreferences3.getBoolean("DONT_SHOW_SPEED_CAP_POPUP", false)) {
                        ag.m.c(claimCoinCongratulationBottomSheet).n(new fd.g(claimCoinCongratulationBottomSheet.u0().f8694b, claimCoinCongratulationBottomSheet.u0().f8695c, claimCoinCongratulationBottomSheet.u0().f8696d));
                    }
                }
                return m.f8717a;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class c extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6905a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.p pVar) {
            super(0);
            this.f6905a = pVar;
        }

        public final Object d() {
            androidx.fragment.app.p pVar = this.f6905a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final void t0(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, boolean z10) {
        Task task;
        claimCoinCongratulationBottomSheet.getClass();
        Integer p02 = zf.i.p0(h.a("RECORDING_COUNT"));
        int intValue = p02 != null ? p02.intValue() : 0;
        if (intValue == 1 || intValue == 10) {
            i9.f fVar = claimCoinCongratulationBottomSheet.P0;
            if (fVar != null) {
                i9.i iVar = fVar.f9621a;
                j9.g gVar = i9.i.f9628c;
                gVar.a("requestInAppReview (%s)", iVar.f9630b);
                if (iVar.f9629a == null) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", j9.g.b(gVar.f9871a, "Play Store app is either not installed or not the official version", objArr));
                    }
                    task = Tasks.forException(new i9.a());
                } else {
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    j9.p pVar = iVar.f9629a;
                    i9.g gVar2 = new i9.g(iVar, taskCompletionSource, taskCompletionSource);
                    synchronized (pVar.f9887f) {
                        pVar.f9886e.add(taskCompletionSource);
                        taskCompletionSource.getTask().addOnCompleteListener(new l(12, (Object) pVar, (Object) taskCompletionSource));
                    }
                    synchronized (pVar.f9887f) {
                        if (pVar.f9892k.getAndIncrement() > 0) {
                            j9.g gVar3 = pVar.f9883b;
                            Object[] objArr2 = new Object[0];
                            gVar3.getClass();
                            if (Log.isLoggable("PlayCore", 3)) {
                                Log.d("PlayCore", j9.g.b(gVar3.f9871a, "Already connected to the service.", objArr2));
                            }
                        }
                    }
                    pVar.a().post(new j9.j(pVar, taskCompletionSource, gVar2));
                    task = taskCompletionSource.getTask();
                }
                j.e(task, "reviewManager.requestReviewFlow()");
                task.addOnCompleteListener(new fd.a(claimCoinCongratulationBottomSheet, z10)).addOnFailureListener(new k6.j(5));
                return;
            }
            j.l("reviewManager");
            throw null;
        }
        claimCoinCongratulationBottomSheet.v0(z10);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = 0;
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_claim_coin_congratulation, viewGroup, false);
        int i10 = R.id.btn_close_claim_yor_coin_congratulation;
        ImageView imageView = (ImageView) cb.b.x(inflate, R.id.btn_close_claim_yor_coin_congratulation);
        if (imageView != null) {
            i10 = R.id.btn_congratulation;
            MaterialButton materialButton = (MaterialButton) cb.b.x(inflate, R.id.btn_congratulation);
            if (materialButton != null) {
                i10 = R.id.congratulation_confetti_animation;
                KonfettiView konfettiView = (KonfettiView) cb.b.x(inflate, R.id.congratulation_confetti_animation);
                if (konfettiView != null) {
                    i10 = R.id.imageView19;
                    if (((ImageView) cb.b.x(inflate, R.id.imageView19)) != null) {
                        i10 = R.id.imageView21;
                        if (((ImageView) cb.b.x(inflate, R.id.imageView21)) != null) {
                            i10 = R.id.textView78;
                            if (((TextView) cb.b.x(inflate, R.id.textView78)) != null) {
                                i10 = R.id.textView79;
                                if (((TextView) cb.b.x(inflate, R.id.textView79)) != null) {
                                    i10 = R.id.textView80;
                                    if (((TextView) cb.b.x(inflate, R.id.textView80)) != null) {
                                        i10 = R.id.tv_congratulation_coin;
                                        TextView textView = (TextView) cb.b.x(inflate, R.id.tv_congratulation_coin);
                                        if (textView != null) {
                                            this.L0 = new i((NestedScrollView) inflate, imageView, materialButton, konfettiView, textView);
                                            Dialog dialog = this.G0;
                                            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
                                            com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                                            if (bVar != null) {
                                                bottomSheetBehavior = bVar.h();
                                            }
                                            if (bottomSheetBehavior != null) {
                                                bottomSheetBehavior.C(3);
                                            }
                                            i iVar = this.L0;
                                            j.c(iVar);
                                            iVar.f11703e.setText(u0().f8693a);
                                            this.N0 = a3.a.a(e0());
                                            i iVar2 = this.L0;
                                            j.c(iVar2);
                                            ImageView imageView2 = iVar2.f11700b;
                                            j.e(imageView2, "binding.btnCloseClaimYorCoinCongratulation");
                                            zd.e.a(imageView2, new fd.d(this));
                                            i iVar3 = this.L0;
                                            j.c(iVar3);
                                            MaterialButton materialButton2 = iVar3.f11701c;
                                            j.e(materialButton2, "binding.btnCongratulation");
                                            materialButton2.setOnClickListener(new zd.i(2000, new zd.f(new fd.e(this))));
                                            this.B0 = false;
                                            Dialog dialog2 = this.G0;
                                            if (dialog2 != null) {
                                                dialog2.setCancelable(false);
                                            }
                                            Context e02 = e0();
                                            Context applicationContext = e02.getApplicationContext();
                                            if (applicationContext != null) {
                                                e02 = applicationContext;
                                            }
                                            this.P0 = new i9.f(new i9.i(e02));
                                            Integer p02 = zf.i.p0(h.a("RECORDING_COUNT"));
                                            if (p02 != null) {
                                                i8 = p02.intValue();
                                            }
                                            h.c("RECORDING_COUNT", String.valueOf(i8 + 1));
                                            i iVar4 = this.L0;
                                            j.c(iVar4);
                                            NestedScrollView nestedScrollView = iVar4.f11699a;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    public final void N() {
        super.N();
        this.L0 = null;
    }

    public final void V() {
        this.f2062b0 = true;
        cb.b.D(cb.d.I(this), (f.b) null, 0, new a(this, (d<? super a>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new b(this, (d<? super b>) null), 3);
    }

    public final fd.f u0() {
        return (fd.f) this.M0.getValue();
    }

    public final void v0(boolean z10) {
        try {
            ag.m.c(this).o();
            if (z10) {
                Intent intent = new Intent("com.quickkonnect.silencio.bottom_nav");
                intent.putExtra("BOTTOM_NAV_BROADCAST_NAME", "wallet");
                a3.a aVar = this.N0;
                if (aVar != null) {
                    aVar.c(intent);
                }
            }
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
    }
}
