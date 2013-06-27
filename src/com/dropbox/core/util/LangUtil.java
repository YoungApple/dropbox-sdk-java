package com.dropbox.core.util;

public class LangUtil
{
    public static RuntimeException mkAssert(String messagePrefix, Throwable cause)
    {
        RuntimeException ae = new RuntimeException(messagePrefix + ": " + cause.getMessage());
        ae.initCause(cause);
        return ae;
        // XXX: Using AssertionError doesn't work for some reason (maybe Android bug).  Trying
        // to call initCause results in "cause already initialized" exception.  Switching to
        // RuntimeException worked.
    }
}
