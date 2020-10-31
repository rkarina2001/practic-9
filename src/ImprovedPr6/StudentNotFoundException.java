package ImprovedPr6;

import java.io.IOException;

class StudentNotFoundException extends IOException {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
