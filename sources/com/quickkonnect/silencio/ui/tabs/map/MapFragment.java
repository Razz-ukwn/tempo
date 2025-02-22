package com.quickkonnect.silencio.ui.tabs.map;

import a9.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.result.c;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.p;
import b3.f0;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.google.android.material.card.MaterialCardView;
import com.google.android.recaptcha.RecaptchaDefinitions;
import com.quickkonnect.silencio.R;
import ff.m;
import j0.q;
import java.util.Map;
import rf.l;
import sf.j;
import sf.k;
import zd.d;

public final class MapFragment extends p implements LocationListener {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;

    /* renamed from: v0  reason: collision with root package name */
    public e6 f7126v0;

    /* renamed from: w0  reason: collision with root package name */
    public LocationManager f7127w0;

    /* renamed from: x0  reason: collision with root package name */
    public c<String[]> f7128x0;

    /* renamed from: y0  reason: collision with root package name */
    public double f7129y0;

    /* renamed from: z0  reason: collision with root package name */
    public double f7130z0;

    public static final class a implements androidx.activity.result.b<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapFragment f7131a;

        public a(MapFragment mapFragment) {
            this.f7131a = mapFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r8) {
            /*
                r7 = this;
                java.util.Map r8 = (java.util.Map) r8
                java.lang.String r0 = "permissions"
                sf.j.e(r8, r0)
                boolean r0 = r8.isEmpty()
                if (r0 == 0) goto L_0x000e
                goto L_0x0030
            L_0x000e:
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x0016:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0030
                java.lang.Object r0 = r8.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0016
                r8 = 0
                goto L_0x0031
            L_0x0030:
                r8 = 1
            L_0x0031:
                com.quickkonnect.silencio.ui.tabs.map.MapFragment r0 = r7.f7131a
                if (r8 == 0) goto L_0x003b
                int r8 = com.quickkonnect.silencio.ui.tabs.map.MapFragment.B0
                r0.o0()
                goto L_0x0085
            L_0x003b:
                int r8 = com.quickkonnect.silencio.ui.tabs.map.MapFragment.B0
                java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
                boolean r8 = r0.l0(r8)
                if (r8 == 0) goto L_0x0058
                java.lang.String r1 = "Permission Required"
                java.lang.String r2 = "Location Permission is required for this app."
                java.lang.String r3 = "OK"
                java.lang.String r4 = "Cancel"
                vd.e r5 = new vd.e
                r5.<init>(r0)
                vd.f r6 = vd.f.f16424a
                r0.p0(r1, r2, r3, r4, r5, r6)
                goto L_0x0085
            L_0x0058:
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                boolean r8 = r0.l0(r8)
                if (r8 == 0) goto L_0x0073
                java.lang.String r1 = "Permission Required"
                java.lang.String r2 = "Location Permission is required for this app."
                java.lang.String r3 = "OK"
                java.lang.String r4 = "Cancel"
                vd.g r5 = new vd.g
                r5.<init>(r0)
                vd.h r6 = vd.h.f16426a
                r0.p0(r1, r2, r3, r4, r5, r6)
                goto L_0x0085
            L_0x0073:
                java.lang.String r1 = "Permission Required"
                java.lang.String r2 = "Location permissions are required for this app."
                java.lang.String r3 = "Open Settings"
                java.lang.String r4 = "Cancel"
                vd.i r5 = new vd.i
                r5.<init>(r0)
                vd.j r6 = vd.j.f16428a
                r0.p0(r1, r2, r3, r4, r5, r6)
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.tabs.map.MapFragment.a.a(java.lang.Object):void");
        }
    }

    public static final class b extends k implements l<Location, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapFragment f7132a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MapFragment mapFragment) {
            super(1);
            this.f7132a = mapFragment;
        }

        public final Object invoke(Object obj) {
            Location location = (Location) obj;
            if (location != null) {
                double longitude = location.getLongitude();
                MapFragment mapFragment = this.f7132a;
                mapFragment.f7129y0 = longitude;
                mapFragment.f7130z0 = location.getLatitude();
                mapFragment.A0 = true;
                e6 e6Var = mapFragment.f7126v0;
                if (e6Var != null) {
                    ((WebView) e6Var.f4511b).evaluateJavascript("setloaction(" + location.getLongitude() + ", " + location.getLatitude() + ')', (ValueCallback) null);
                }
            }
            return m.f8717a;
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_map, viewGroup, false);
        int i8 = R.id.bottom_map_web_view;
        WebView webView = (WebView) cb.b.x(inflate, R.id.bottom_map_web_view);
        if (webView != null) {
            i8 = R.id.card_current_location;
            MaterialCardView materialCardView = (MaterialCardView) cb.b.x(inflate, R.id.card_current_location);
            if (materialCardView != null) {
                i8 = R.id.card_information_map;
                MaterialCardView materialCardView2 = (MaterialCardView) cb.b.x(inflate, R.id.card_information_map);
                if (materialCardView2 != null) {
                    i8 = R.id.guideline;
                    Guideline guideline = (Guideline) cb.b.x(inflate, R.id.guideline);
                    if (guideline != null) {
                        this.f7126v0 = new e6((Object) (ConstraintLayout) inflate, (Object) webView, (Object) materialCardView, (Object) materialCardView2, (Object) guideline);
                        Object systemService = e0().getSystemService("location");
                        j.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                        this.f7127w0 = (LocationManager) systemService;
                        this.f7128x0 = c0(new a(this), new c.c());
                        e6 e6Var = this.f7126v0;
                        j.c(e6Var);
                        ((Guideline) e6Var.f4514e).setGuidelineBegin(d.b(this));
                        e6 e6Var2 = this.f7126v0;
                        j.c(e6Var2);
                        ((MaterialCardView) e6Var2.f4512c).setOnClickListener(new h(this, 13));
                        e6 e6Var3 = this.f7126v0;
                        j.c(e6Var3);
                        ((MaterialCardView) e6Var3.f4513d).setOnClickListener(new sc.a(this, 14));
                        e6 e6Var4 = this.f7126v0;
                        j.c(e6Var4);
                        WebSettings settings = ((WebView) e6Var4.f4511b).getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setLoadWithOverviewMode(true);
                        settings.setDomStorageEnabled(true);
                        settings.setBuiltInZoomControls(false);
                        settings.setAllowContentAccess(true);
                        settings.setAllowFileAccess(true);
                        e6 e6Var5 = this.f7126v0;
                        j.c(e6Var5);
                        ((WebView) e6Var5.f4511b).loadUrl("https://map.silencio.store/");
                        e6 e6Var6 = this.f7126v0;
                        j.c(e6Var6);
                        ((WebView) e6Var6.f4511b).setWebViewClient(new vd.d(this));
                        n0();
                        e6 e6Var7 = this.f7126v0;
                        j.c(e6Var7);
                        ConstraintLayout constraintLayout = (ConstraintLayout) e6Var7.f4510a;
                        j.e(constraintLayout, "binding.root");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        this.f2062b0 = true;
        LocationManager locationManager = this.f7127w0;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
            this.f7126v0 = null;
            return;
        }
        j.l("locationManager");
        throw null;
    }

    public final void V() {
        this.f2062b0 = true;
        bh.a.f3654a.b("check gps", new Object[0]);
        LocationManager locationManager = this.f7127w0;
        if (locationManager == null) {
            j.l("locationManager");
            throw null;
        } else if (!locationManager.isProviderEnabled("gps")) {
            p0("GPS is disabled", "Your GPS (with high accuracy) seems to be disabled, do you want to enable it?", "Yes", "No", new vd.b(this), vd.c.f16420a);
        }
    }

    public final void n0() {
        if (t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION") + t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            o0();
            SharedPreferences sharedPreferences = zd.h.f17950a;
            if (sharedPreferences == null) {
                j.l("prefs");
                throw null;
            } else if (!sharedPreferences.getBoolean("DONT_SHOW_MAP_LIMIT_POPUP", false)) {
                try {
                    ag.m.c(this).l(R.id.action_mapFragment_to_mapPopupBottomSheet, new Bundle(), (f0) null);
                } catch (Exception e10) {
                    bh.a.f3654a.c(e10);
                }
            }
        } else {
            c<String[]> cVar = this.f7128x0;
            if (cVar != null) {
                cVar.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
            } else {
                j.l("requestPermissions");
                throw null;
            }
        }
    }

    public final void o0() {
        Context e02 = e0();
        int i8 = n7.d.f11604a;
        k7.d dVar = new k7.d(e02);
        if (t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") == 0 || t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = this.f7127w0;
            if (locationManager != null) {
                locationManager.requestLocationUpdates("gps", RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT, 0.0f, this);
                dVar.d().addOnSuccessListener(new q(new b(this)));
                return;
            }
            j.l("locationManager");
            throw null;
        }
    }

    public final void onLocationChanged(Location location) {
        j.f(location, "location");
        this.f7129y0 = location.getLongitude();
        this.f7130z0 = location.getLatitude();
        this.A0 = true;
    }

    public final void onProviderDisabled(String str) {
        j.f(str, "provider");
    }

    public final void onProviderEnabled(String str) {
        j.f(str, "provider");
    }

    public final void onStatusChanged(String str, int i8, Bundle bundle) {
    }

    public final void p0(String str, String str2, String str3, String str4, rf.a aVar, rf.a aVar2) {
        e6 e6Var = this.f7126v0;
        j.c(e6Var);
        b.a aVar3 = new b.a(((ConstraintLayout) e6Var.f4510a).getContext());
        AlertController.b bVar = aVar3.f681a;
        bVar.f664d = str;
        bVar.f666f = str2;
        vd.a aVar4 = new vd.a(aVar, 0);
        bVar.f667g = str3;
        bVar.f668h = aVar4;
        sb.c cVar = new sb.c(aVar2, 3);
        bVar.f669i = str4;
        bVar.f670j = cVar;
        aVar3.a().show();
    }
}
