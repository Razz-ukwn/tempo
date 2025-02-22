package h;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class h implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f9061a;

    public static class a {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i8) {
            return callback.onWindowStartingActionMode(callback2, i8);
        }
    }

    public static class b {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            callback.onProvideKeyboardShortcuts(list, menu, i8);
        }
    }

    public static class c {
        public static void a(Window.Callback callback, boolean z10) {
            callback.onPointerCaptureChanged(z10);
        }
    }

    public h(Window.Callback callback) {
        if (callback != null) {
            this.f9061a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9061a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f9061a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f9061a.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9061a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9061a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9061a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f9061a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f9061a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f9061a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i8, Menu menu) {
        return this.f9061a.onCreatePanelMenu(i8, menu);
    }

    public View onCreatePanelView(int i8) {
        return this.f9061a.onCreatePanelView(i8);
    }

    public final void onDetachedFromWindow() {
        this.f9061a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        return this.f9061a.onMenuItemSelected(i8, menuItem);
    }

    public boolean onMenuOpened(int i8, Menu menu) {
        return this.f9061a.onMenuOpened(i8, menu);
    }

    public void onPanelClosed(int i8, Menu menu) {
        this.f9061a.onPanelClosed(i8, menu);
    }

    public final void onPointerCaptureChanged(boolean z10) {
        c.a(this.f9061a, z10);
    }

    public boolean onPreparePanel(int i8, View view, Menu menu) {
        return this.f9061a.onPreparePanel(i8, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
        b.a(this.f9061a, list, menu, i8);
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f9061a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9061a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z10) {
        this.f9061a.onWindowFocusChanged(z10);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
        return a.b(this.f9061a, callback, i8);
    }

    public final boolean onSearchRequested() {
        return this.f9061a.onSearchRequested();
    }
}
