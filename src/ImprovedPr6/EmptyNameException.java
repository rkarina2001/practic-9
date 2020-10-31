package ImprovedPr6;

import java.io.IOException;

class EmptyNameException extends IOException {
    public EmptyNameException(String errorMessage) {
        super(errorMessage);
    }
}
