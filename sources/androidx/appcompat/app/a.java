package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f680b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f680b = bVar;
        this.f679a = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
        AlertController.b bVar = this.f680b;
        DialogInterface.OnClickListener onClickListener = bVar.f673n;
        AlertController alertController = this.f679a;
        onClickListener.onClick(alertController.f634b, i8);
        if (!bVar.f676q) {
            alertController.f634b.dismiss();
        }
    }
}
