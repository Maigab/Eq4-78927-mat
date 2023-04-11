package mx.uv.crudUV;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;




@Endpoint
public class EndPoint{
    
    @Autowired
    private ISaludador iSaludador;
    protected String[] myArray = new String[10];

    


}