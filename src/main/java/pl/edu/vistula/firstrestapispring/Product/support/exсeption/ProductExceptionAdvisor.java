package pl.edu.vistula.firstrestapispring.Product.support.exсeption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.edu.vistula.firstrestapispring.Product.shared.api.response.ErrorMessageResponse;



@ControllerAdvice
public class ProductExceptionAdvisor {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(ProductExceptionAdvisor.class);
    @ExceptionHandler(ProductNotFoundExeption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound(Exception e){
        LOG.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
