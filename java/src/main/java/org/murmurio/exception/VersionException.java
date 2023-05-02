package org.murmurio.exception;

/**
 * In the case an older version of Whisper API is deprecated, the client should
 * throw an exception and provide a warning.
 *
 * author: peter lin
 */
public class VersionException extends Exception {
    public VersionException() {}
}
