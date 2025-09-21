// package OnlineShoppingApplication.handler;

// import OnlineShoppingApplication.dto.ApiResponse;
// import java.util.Collections;

// import OnlineShoppingApplication.exception.ItemNotFoundException;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.converter.HttpMessageNotReadableException;
// import org.springframework.web.bind.annotation.ExceptionHandler;

// public class GlobalExceptionHandler {
    

//     @ExceptionHandler(HttpMessageNotReadableException.class)
//     public ResponseEntity<ApiResponse<Object>> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
//         String message = ex.getMostSpecificCause() != null ? ex.getMostSpecificCause().getMessage() : ex.getMessage();
//         ApiResponse<Object> response = new ApiResponse<>(false, null, Collections.singletonList(message));
//         return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//     }

//     @ExceptionHandler(ItemNotFoundException.class)
//     public ResponseEntity<ApiResponse<Object>> handleGenericException(ItemNotFoundException ex) {   
//         ApiResponse<Object> response = new ApiResponse<>(false, null, 
//         Collections.singletonList(ex.getMessage()));
//         return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//     }

//     @ExceptionHandler(Exception.class)
//     public ResponseEntity<ApiResponse<Object>> handleGenericException(IllegalArgumentException ex) {   
//         ApiResponse<Object> response = new ApiResponse<>(false, null, 
//         Collections.singletonList(ex.getMessage()));
//         return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//     }   

// }
