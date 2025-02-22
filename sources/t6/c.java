package t6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import u6.q;

public final class c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f15382a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f15383b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f15384c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15383b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f15382a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f15384c == null) {
            Activity activity = getActivity();
            q.i(activity);
            this.f15384c = new AlertDialog.Builder(activity).create();
        }
        return this.f15384c;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
