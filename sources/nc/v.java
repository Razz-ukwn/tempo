package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;

public abstract class v extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final TextView S;
    public final ImageView T;
    public final MaterialButton U;
    public final EditText V;
    public EmailViewModel W;

    public v(View view, EditText editText, ImageView imageView, TextView textView, MaterialButton materialButton, Object obj) {
        super(1, view, obj);
        this.S = textView;
        this.T = imageView;
        this.U = materialButton;
        this.V = editText;
    }

    public abstract void w(EmailViewModel emailViewModel);
}
