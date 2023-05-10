package org.murmurio.exception;

/**
 * The free account has limits. This means the client should stop trying to send
 * requests to the endpoints once the limit has been reached. The HTTP code 429
 * too many requests in a given amount of time.
 *
 * author: peter lin
 */
public class LimitException extends Exception {
    public LimitException() {}
}
