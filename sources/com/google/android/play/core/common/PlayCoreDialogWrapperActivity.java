package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f6268a;

    public final void onActivityResult(int i8, int i10, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i8, i10, intent);
        if (i8 == 0 && (resultReceiver = this.f6268a) != null) {
            if (i10 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i10 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f6268a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                ResultReceiver resultReceiver = this.f6268a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
                return;
            }
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver2 = this.f6268a;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f6268a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f6268a);
    }
}
