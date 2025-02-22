package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.x;
import androidx.lifecycle.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import java.lang.reflect.Modifier;
import java.util.Set;
import o.g;
import r6.f;
import r6.n;
import r6.u;
import y2.a;
import y2.b;

@KeepName
public class SignInHubActivity extends x {
    public static boolean Z = false;
    public boolean U = false;
    public SignInConfiguration V;
    public boolean W;
    public int X;
    public Intent Y;

    public final void K() {
        b a10 = a.a(this);
        u uVar = new u(this);
        b.c cVar = a10.f17124b;
        if (cVar.f17134e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            g<b.a> gVar = cVar.f17133d;
            b.a aVar = (b.a) gVar.h(0, (Integer) null);
            p pVar = a10.f17123a;
            if (aVar == null) {
                try {
                    cVar.f17134e = true;
                    Set set = d.f4196a;
                    synchronized (set) {
                    }
                    f fVar = new f(this, set);
                    Class<f> cls = f.class;
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVar);
                        }
                    }
                    b.a aVar2 = new b.a(fVar);
                    gVar.i(0, aVar2);
                    cVar.f17134e = false;
                    b.C0320b<D> bVar = new b.C0320b<>(aVar2.f17126n, uVar);
                    aVar2.e(pVar, bVar);
                    b.C0320b<D> bVar2 = aVar2.f17128p;
                    if (bVar2 != null) {
                        aVar2.j(bVar2);
                    }
                    aVar2.f17127o = pVar;
                    aVar2.f17128p = bVar;
                } catch (Throwable th) {
                    cVar.f17134e = false;
                    throw th;
                }
            } else {
                b.C0320b<D> bVar3 = new b.C0320b<>(aVar.f17126n, uVar);
                aVar.e(pVar, bVar3);
                b.C0320b<D> bVar4 = aVar.f17128p;
                if (bVar4 != null) {
                    aVar.j(bVar4);
                }
                aVar.f17127o = pVar;
                aVar.f17128p = bVar3;
            }
            Z = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void L(int i8) {
        Status status = new Status(i8, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        Z = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i8, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.U) {
            setResult(0);
            if (i8 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.f4167b) != null) {
                        n a10 = n.a(this);
                        GoogleSignInOptions googleSignInOptions = this.V.f4170b;
                        googleSignInAccount.getClass();
                        synchronized (a10) {
                            a10.f14083a.d(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.W = true;
                        this.X = i10;
                        this.Y = intent;
                        K();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        L(intExtra);
                        return;
                    }
                }
                L(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            L(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.V = signInConfiguration;
            if (bundle != null) {
                boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
                this.W = z10;
                if (z10) {
                    this.X = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.Y = intent2;
                    K();
                }
            } else if (Z) {
                setResult(0);
                L(12502);
            } else {
                Z = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.V);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.U = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    L(17);
                }
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        Z = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.W);
        if (this.W) {
            bundle.putInt("signInResultCode", this.X);
            bundle.putParcelable("signInResultData", this.Y);
        }
    }
}
