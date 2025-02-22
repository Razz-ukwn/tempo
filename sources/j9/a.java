package j9;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import i9.c;
import i9.h;

public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i10)) {
            return true;
        }
        f fVar = (f) this;
        if (i8 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = b.f9868a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            h hVar = (h) fVar;
            p pVar = hVar.f9627c.f9629a;
            if (pVar != null) {
                TaskCompletionSource taskCompletionSource = hVar.f9626b;
                synchronized (pVar.f9887f) {
                    pVar.f9886e.remove(taskCompletionSource);
                }
                synchronized (pVar.f9887f) {
                    if (pVar.f9892k.get() <= 0 || pVar.f9892k.decrementAndGet() <= 0) {
                        pVar.a().post(new k(pVar));
                    } else {
                        pVar.f9883b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                }
            }
            hVar.f9625a.a("onGetLaunchReviewFlowInfo", new Object[0]);
            hVar.f9626b.trySetResult(new c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
            return true;
        }
        throw new BadParcelableException(q.a("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
