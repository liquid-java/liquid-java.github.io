// Violation: initCause() called on a Throwable that already has a cause.
Throwable t = new Throwable("oops", cause);
t.initCause(cause2);   // INVALID: initCause() requires noThrowable(t),
                       //          but t is in state withThrowable
