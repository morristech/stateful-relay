package com.brainasaservice.statefulrelay;

/**
 * Created by Damian on 06.05.2017.
 */

public interface Invalidatable {
    boolean isInvalidated();
    void invalidate();
}
