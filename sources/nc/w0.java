package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;

public abstract class w0 extends ViewDataBinding {
    public static final /* synthetic */ int Y = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final EditText U;
    public final TextView V;
    public final TextView W;
    public VerificationViewModel X;

    public w0(View view, EditText editText, ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, Object obj) {
        super(1, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = editText;
        this.V = textView;
        this.W = textView2;
    }

    public abstract void w(VerificationViewModel verificationViewModel);
}
