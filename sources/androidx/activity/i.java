package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f588b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f589c;

    public i(ComponentActivity.b bVar, int i8, IntentSender.SendIntentException sendIntentException) {
        this.f589c = bVar;
        this.f587a = i8;
        this.f588b = sendIntentException;
    }

    public final void run() {
        this.f589c.a(this.f587a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f588b));
    }
}
