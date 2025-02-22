package wg;

import d2.f1;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class h0 extends a {

    /* renamed from: k  reason: collision with root package name */
    public final Socket f16759k;

    public h0(Socket socket) {
        this.f16759k = socket;
    }

    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        Socket socket = this.f16759k;
        try {
            socket.close();
        } catch (Exception e10) {
            Logger logger = w.f16803a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, e10);
        } catch (AssertionError e11) {
            if (f1.A(e11)) {
                Logger logger2 = w.f16803a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + socket, e11);
                return;
            }
            throw e11;
        }
    }
}
