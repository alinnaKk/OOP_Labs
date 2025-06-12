package Lab12.version3.errors;

public class ItemNotFoundException extends RuntimeException {
  public ItemNotFoundException(String message) {
    super(message);
  }
}
