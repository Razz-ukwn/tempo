package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.e;
import h7.i;
import t6.b;
import u6.q;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4171b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f4172a = 0;

    public final void onActivityResult(int i8, int i10, Intent intent) {
        super.onActivityResult(i8, i10, intent);
        if (i8 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4172a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                e f10 = e.f(this);
                if (i10 == -1) {
                    i iVar = f10.m;
                    iVar.sendMessage(iVar.obtainMessage(3));
                } else if (i10 == 0) {
                    f10.g(new b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i8 == 2) {
            this.f4172a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4172a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4172a = bundle.getInt("resolution");
        }
        if (this.f4172a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f4172a = 1;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        e.f(this).g(new b(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String a10 = c.a("Activity not found while launching ", pendingIntent.toString(), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            a10 = a10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", a10, e10);
                    }
                    this.f4172a = 1;
                    finish();
                } catch (IntentSender.SendIntentException e11) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                }
            } else {
                q.i(num);
                AlertDialog d10 = t6.e.f15393d.d(this, num.intValue(), 2, this);
                if (d10 != null) {
                    t6.e.f(this, d10, "GooglePlayServicesErrorDialog", this);
                }
                this.f4172a = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4172a);
        super.onSaveInstanceState(bundle);
    }
}
