package cg;

import java.util.NoSuchElementException;

public final class k extends NoSuchElementException {
    public k() {
        super("Channel was closed");
    }
}
