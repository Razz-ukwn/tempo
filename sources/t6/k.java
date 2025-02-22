package t6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.i0;
import androidx.fragment.app.n;
import u6.q;

public class k extends n {
    public Dialog L0;
    public DialogInterface.OnCancelListener M0;
    public AlertDialog N0;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.M0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog p0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            return dialog;
        }
        this.C0 = false;
        if (this.N0 == null) {
            Context q10 = q();
            q.i(q10);
            this.N0 = new AlertDialog.Builder(q10).create();
        }
        return this.N0;
    }

    public final void s0(i0 i0Var, String str) {
        super.s0(i0Var, str);
    }
}
