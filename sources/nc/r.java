package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;

public abstract class r extends ViewDataBinding {
    public static final /* synthetic */ int Z = 0;
    public final TextView S;
    public final ImageView T;
    public final MaterialButton U;
    public final MaterialButton V;
    public final ImageView W;
    public final EditText X;
    public CodeViewModel Y;

    public r(Object obj, View view, TextView textView, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView2, EditText editText) {
        super(1, view, obj);
        this.S = textView;
        this.T = imageView;
        this.U = materialButton;
        this.V = materialButton2;
        this.W = imageView2;
        this.X = editText;
    }

    public abstract void w(CodeViewModel codeViewModel);
}
