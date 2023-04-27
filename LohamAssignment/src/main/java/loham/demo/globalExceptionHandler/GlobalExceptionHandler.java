package loham.demo.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import loham.demo.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({NoHandlerFoundException.class  , Exception.class , ApiException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String apiExceptionHandler(NoHandlerFoundException ex){
		String message  = "Path Does Not Exist. Try path :  '/get'  "; 
		return message;
	
	}
	
}
