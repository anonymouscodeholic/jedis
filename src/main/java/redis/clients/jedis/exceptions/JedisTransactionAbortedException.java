package redis.clients.jedis.exceptions;

public class JedisTransactionAbortedException extends JedisException {
    private static final long serialVersionUID = 2346947236421236744L;
    
    public JedisTransactionAbortedException(String message) {
        super(message);
    }

    public JedisTransactionAbortedException(Throwable cause) {
        super(cause);
    }

    public JedisTransactionAbortedException(String message, Throwable cause) {
        super(message, cause);
    }
}