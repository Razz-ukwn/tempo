package nc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.quickkonnect.silencio.models.response.tabs.FriendListModel;

public abstract class m1 extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final ImageView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public FriendListModel W;

    public m1(Object obj, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(0, view, obj);
        this.S = imageView;
        this.T = textView;
        this.U = textView2;
        this.V = textView3;
    }

    public abstract void w(FriendListModel friendListModel);
}
